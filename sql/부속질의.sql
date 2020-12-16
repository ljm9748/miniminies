-- 20.11.12 --

-- 부속질의 문제
-- 43. 사원 번호가 7788인 사원과 담당 업무가 같은
-- 사원을 표시(사원 이름과 담당업무)하시오.
-- 7788 사원의 담당업무 추출(sub qeury)
-- 같은 업무를 하는 사원(main query)
select ename, job from emp where empno like '%7788%';

select ename, job
from emp
where job =(select job from emp where empno=7788)
;

-- 44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 담당 업무
select ename, job
from emp
where sal>(select sal from emp where empno=7499)
;

-- 45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오.(그룹함수 사용)
select ename, job, sal
from emp
where (select min(sal) from emp )=sal
;

select ename, job
from emp
where sal<= all(select sal from emp)
;

-- 46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
select job, avg(sal)
from emp
group by job
having avg(sal) = (select min(avg(sal)) from emp group by job)
;

select job
from emp
group by job
;


-- 47. 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
select deptno, min(sal) from emp where deptno=30 group by deptno ; -- 각 부서의 최소 급여

select e.ename, e.sal, e.deptno
from emp e, (select min(sal) as ms from emp group by deptno) m
where e.sal=m.ms
order by e.detpno
;


-- 48.
-- 담당업무가 ALALYST인 사원보다 급여가 적으면서 업무가 ANALYST가 아닌 사원들을 표시(사원번호, 이름, 담당 업무, 급여)하시오.
select e.empno, e.ename, e.job, e.sal 
from emp e, emp ae 
where e.sal<ae.sal and ae.job='ANALYST'
;

select empno, ename, job, sal
from emp
where sal <= all(select distinct sal from emp where job='ANALYST')
and job != 'ANALYST'
;

-- 49.
-- 부하직원이 없는 사원의 이름을 표시하시오.
select distinct mgr from emp where mgr is not null;

select e.ename, e.empno
from emp e
where e.empno NOT in(select distinct mgr from emp where mgr is not null)
;

-- 50.
-- 부하직원이 있는 사원의 이름을 표시하시오.
select e.ename, e.empno
from emp e
where e.empno in(select distinct mgr from emp where mgr is not null)
;

-- 51.
-- BLAKE와 동일한 부서에 속한 사원의 이름고 ㅏ입사일을 표시해라 단 BLAKE는 제외
select e.ename, e.hiredate, e.deptno 
from emp e, emp be 
where e.deptno=be.deptno and be.ename='BLAKE'
;

--
select deptno, ename from emp where ename='BLAKE';

select ename, hiredate
from emp
where deptno=(select deptno from emp where ename='BLAKE')
and ename != 'BLAKE'
;


-- 52. 
-- 급여가 평균 급여보다 많은
--      사원들의 사원 번호와 이름을 표시하되 결과를 급여에 대해서 오름차순으로 정렬하시오.
select empno, ename, sal
from emp
where (select avg(sal) from emp )<sal
;

-- 53.
-- 이름에 K가 포함된 사원과 같은 부서에서 일하는 사원의 사원 번호와 이름을 표시하시오.
select distinct deptno from emp where ename like '%K%';

select empno, ename, deptno
from emp
where deptno in (select distinct  deptno from emp where ename like '%K%')
;

-- 54.
-- 부서위치가 DALLAS인 사원의 이름과 부서번호 및 담당업무를 표시하시오.
select * from dept where loc='DALLAS';

select e.ename, e.deptno, e.job
from dept d, emp e
where e.deptno = d.deptno and loc in (select loc from dept where loc='DALLAS')
;

select ename, deptno, job
from emp
where deptno = (select deptno from dept where loc='DALLAS')
;

-- 55.
-- KING에게 보고하는 사원의 이름과 급여를 표시하시오.
-- mgr -> king의 사원번호를 가지고 있는 사원
select empno from emp where ename='KING';

select ename, sal, mgr
from emp
where mgr=(select empno from emp where ename='KING')
;

-- 56.
-- RESEARCH 부서의 사원에 대한 부서번호, 사원 이름 및 담당 업무를 표시하시오
select dname, deptno from dept where dname = 'RESEARCH';

select e.deptno, e.empno, e.ename, e.job
from emp e, dept d
where e.deptno=d.deptno and d.dname = 'RESEARCH'
order by empno
;

select deptno from dept where dname='RESEARCH';

select empno, ename, sal, job
from emp
where deptno = (select deptno from dept where dname='RESEARCH')
;
-- 57.
-- 평균 월급보다 많은 급여를 받고 이름에 M이 포함된 사원과 같은 부서에서 근무하는 사원의 사원 번호, 이름, 급여를 표시하시오.
select empno, ename, sal 
from emp 
where (select avg(sal) from emp )<sal and deptno in (select distinct deptno from emp where ename like '%M%')
;

-- 58. 
-- 평균급여가 가장 적은 업무를 찾으시오.
select avg(sal) from emp group by deptno ;

select min(sal), job
from emp
group by job
having avg(sal) <= all(
    select avg(sal)
    from emp
    group by job) 
;

--
select job, avg(sal)
from emp
group by job
;



-- 59.
-- 담당업무가 MANAGER인 사원이 소속된 부서와 동일한 부서의 사원을 표시하시오
select distinct deptno from emp where job = 'MANAGER';

select ename, deptno
from emp
where deptno in (select distinct deptno from emp where job = 'MANAGER')
;