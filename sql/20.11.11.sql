-- 20.11.11

-- JOIN
-- CROSS JOIN: 조건 없이 테이블과 테이블을 붙여준다.

select *
from emp, dept
;

-- ANSI JOIN: CROSS JOIN
select *
from emp cross join dept
;

-- Equi JOIN
select *
from emp, dept
where emp.deptno=dept.deptno
;



-- SCOTT의 사원번호와 이름, -> EMP
-- 부서이름, 지역을 출력 -> DEPT
select empno, ename,emp. deptno, dept.dname, loc
from emp, dept
where emp.deptno=dept.deptno and ename='SCOTT'
;

-- 별칭 사용하기(select 안에서만 사용 가능)
select empno, ename, e.deptno, d.dname, loc
from emp e, dept d
where e.deptno=d.deptno and ename='SCOTT'
;

--  ANSI -> T1 INNER JOIN T2 ON 조인의 조건
select *
from emp inner join dept        -- inner join과 on은 같이 
on emp.deptno=dept.deptno
;

-- inner x
select deptno
from emp join dept       
--on emp.deptno=dept.deptno
using(deptno) -- 공통 컬럼은 하나만 가지게 해준다. 공통 컬럼을 구별할 필요가 없다.
;

-- NATURAL JOIN: 동일한 컬럼 조인의 조건을 생략, 같은 이름의 컬럼은 하나씩 맞춰야함.
select ename, deptno, dname
from emp natural join dept
;

--  Non Equi JOIN: 동등 비교가 아닌 비교연산(크다작다)이 가능
-- 급여 등급을 5개로 나누어 놓은 salgrad에서 정보를 얻어와서
-- 각 사원의 급여 등급을 지정해보도록 합시다.
-- 이를 위해서 사원(emp) 테이블과 급여 등급(salgrade) 테이블을 조인하도록 합시다.
-- 사원의 급여가 몇 등급인지 살펴보자.

-- 1. 크로스 조인 -> 조건 부여
select *
from emp e, salgrade s
where e.sal BETWEEN s.losal AND s.hisal
;

select * from salgrade;




-- self JOIN: 자기 자신의 테이블을 조인한다.
-- SMITH의 매니저 이름이 무엇인지
select e.ename, e.mgr, m.ename
from emp e, emp m
where e.mgr=m.empno
and e.ename='SMITH'
;

select ename
from emp
where empno=7902
;

-- OUTER JOIN: 정보가 부족해도 출력하도록 하는 조인
select e.ename, e.mgr, m.ename
from emp e, emp m
where e.mgr=m.empno(+)
;

-- ANSI 형태의 OUTERJOIN
-- T1 [LEFT | RIGHT \ FULL] OUTER JOIN T2
select*
from emp e left outer join emp m
on e.mgr=m.empno
;

-- 회원, 구매
-- customer, orders 
select * from customer;
select * from orders order by custid;

select c.name, count(o.orderid), sum(o.saleprice), avg(o.saleprice)
from customer c, orders o
where c.custid=o.custid(+)
group by c.name
;

-- 회원별 구매 횟수
select c.name, count(o.orderid), sum(o.saleprice), avg(o.saleprice)
from customer c, orders o
where c.custid=o.custid(+)
group by c.name
;

-----

-- 서브 쿼리
-- 스칼라 부속질의     - SELECT 부속질의, 단일행 단일열
-- 인라인 뷰        - FROM 부속질의 복합행 복합열
-- 중첩 질의        - WEHRE 부속질의, 단일열, 단순비교일 경우 -> 단일행, 집합 비교 -> 복합행

-- 중첩 질의 : 단순 비교
-- 평균 급여(sum query)보다 더 많은 급여를 받는 사원을 출력하자.
-- 서브 쿼리 먼저 만들기

-- 평균 급여
select avg(sal) from emp;

-- 2073.214285714285714285714285714285714286

select *
from emp
where sal > (select avg(sal) from emp) -- > 평균 급여
;

-- SCOTT사원의 같은 부서에 근무하는 사원의 리스트를 출력
select deptno from emp where ename='SCOTT';

select ename
from emp
where deptno=(select deptno from emp where ename='SCOTT')-- SCOTT이 소속된 부서번호
;

-- sal >= 3000 받는 사원이 소속된 부서
select distinct deptno from emp where sal>=3000;

select *
from emp
where deptno in((select distinct deptno from emp where sal>=3000))
;

-- 30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다
-- 더 많은 급여를 받는
-- 사람의 이름, 급여를 출력하는 쿼리문을 작성해 봅시다.
select max(sal) from emp where deptno=30;
select sal from emp where deptno = 30;


select ename, sal 
from emp
-- where sal > 2850
-- where sal > (select max(sal) from emp where deptno=30)
--where sal > all (select sal from emp where deptno = 30) -- and
where sal  > any (select sal from emp where deptno = 30) -- or
;

-- rownum
select rownum, empno, ename, hiredate -- rownum은 입력순
from emp
where rownum < 4
order by hiredate
;

select  rownum, empno, ename, hiredate from emp order by hiredate;

select rownum, empno, ename, hiredate
from (select  rownum, empno, ename, hiredate from emp order by hiredate desc) -- 인라인 뷰
where rownum < 4
;

--  가장 급여를 많이 받는 사원 3명을 출력
select rownum, ename, sal from emp order by sal desc; 

select rownum, ename, sal 
from (select rownum, ename, sal from emp order by sal desc)
where rownum<6
;
-- mysql --> top select * from emp limit 0, 3
select name from customer where custid=1;

-- 스칼라 부속질의: select절 프리젠테이션 영역에 사용할 수 있는 부속질의, 단일행 단일열 , 단일값만 결과로 나와야한다.
select custid, (select name from customer where customer.custid=orders.custid), -- 단일행 단일열 -> 하나의 값만 출력 가능 
    saleprice, orderdate
from orders
;

-- 마당 서점의 고객별(group by)
-- 판매액을 보이시오 orders
-- (결과는 고객이름과 고객별 판매액을 출력)
select c.custid, c.name, sum(o.saleprice)
from customer c, orders o
where c.custid=o.custid(+)
group by c.custid, c.name
order by sum(o.saleprice)
;

select o.custid,(
        select name from customer c where o.custid=c.custid
 ), sum(o.saleprice)
from orders o
group by o.custid
;

-- 
select  custid, name
from customer
where custid<=2
;

-- 인라인뷰: from 절 이후에 들어가는 서브 쿼리, 가상 테이블 형태로 처리, rownum이 새롭게 생성
select c.name, sum(o.saleprice), avg(o.saleprice)
from orders o, (      
        select  custid, name    
        from customer
        where custid<=2) c -- 인라인뷰
where o.custid=c.custid
group by c.name
;

-- 평균 주문 금액 이하의 
-- 주문에 대해서 주문번호(orderid)와 금액(saleprice)을 보이시오.

-- 평균 주문 금액
select avg(saleprice) from orders;

select orderid, saleprice
from orders
where saleprice<=(select avg(saleprice) from orders) -- 평균 주문 금액
;

-- 각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객번호, 금액을 보이시오.
select avg(saleprice) from orders where custid=1;

select orderid, custid, saleprice
from orders  o1
where saleprice > 
(select avg(saleprice) from orders o2 where custid=1) -- custid=1이라면 1번 고객의 평균과 비교해서 큰 주문 금액만 출력
;

select * from customer where address like '%대한민국%';

-- 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
select sum(saleprice)
from orders
where custid in(select custid from customer where address like '%대한민국%') -- 
;

-- 3번 고객이 주문한 도서의 최고 금액보다
-- 더 비싼 도서를 구입한
-- 주문의 주문번호와 금액을 보이시오.

-- 3번 고객이 주문한 도서의 최고 금액
select max(saleprice) from orders where custid=3;


select orderid, saleprice
from orders
-- where saleprice > (select max(saleprice) from orders where custid=3)
where saleprice > all(select saleprice from orders where custid=3)
;

-- EXISTS 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
select * from customer where address like '%대한민국%';

select sum(saleprice)
from orders o
where exists (select * from customer c where address like '%대한민국%' and o.custid=c.custid)
;

----------

