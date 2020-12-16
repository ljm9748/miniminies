-- 20.11.13

--- Transaction
-- 여러개의 SQL을 하나의 단위로 처리하는 것
-- 트랜잭션이 가지는 모든 작업이 모두 정상 처리되어야 트랜잭션이 완료되었다고 하는 것.
-- 처리과정에서 오류가 발생하면 처음으로 돌아가 다시 트랜잭션을 시작

select * from emp10;
desc emp10;
select * from dept01;

-- 부서 테이블에 데이터 하나를 저장           -> 정상처리
-- 사원 테이블에(emp10) 새로운 사원을 입력    -> 오류   -> rollback

-- 트랜잭션 시작
insert into dept01 values (50, 'RD', 'SEOUL');
insert into emp10 (empno, ename, job, sal) values ('ten', 'TEN', 'MANAGER', 2500);
rollback; -- 오류가 발생해서 초기화 (마지막 저장(commit)단계로 이동)
select * from dept01;

-- 새로운 트랜잭션 시작
insert into dept01 values (50, 'RD', 'SEOUL');
insert into emp10 (empno, ename, job, sal) values (7777, 'SEVEN', 'MANAGER', 2500);
select * from emp10;
select * from dept01;
commit;

-- 새로운 트랜잭션 시작
update emp10
set mgr = (select empno from emp10 where ename='KING')
;
select * from emp10;

-- 잘못 처리된 작업 -> rollback
rollback;

-- 가상 테이블 view 
-- 실제 테이블을 기반으로 논리적인 가상테이블을 -> view 
-- create [or replace] view view_name as subquery 

-- 자주 사용되는 30번 부서에 소속된 사원들의 사번과 이름과 부서번호를 출력하기 위한 select문을 
create view view_emp30 
as select empno, ename, deptno from emp where deptno=30
;

select * from view_emp30;

select * from emp, dept
where emp.deptno=dept.deptno
and emp.deptno=10
;
select * from view_emp_dept
where deptno=10
;

drop view ciew_emp_dept;

create or replace view view_emp_dept
as 
select empno, ename, job, mgr, hiredate, emp.deptno, dname, loc
from emp, dept
where emp.deptno=dept.deptno
;

-- view 정보 확인: user_views 테이블을 확인이 가능 로그인한 사용자의 view 인스턴스의 정보
select view_name, text from user_views;


-- view_emp30를 이용해서 insert를 해보자
insert into view_emp30 values(9999, 'tester', 40);

select * from emp;


rollback;

-- view의 삭제: 객체를 삭제하는 방식과 동일
-- drop {table | view } view_name;
drop view view_emp_dept;
select  * from user_views;

-- view_hire: 입사일 기준으로 오름차순으로 정렬된 결과를 가상테이블로 정의
select rownum, empno, ename, hiredate 
from emp
order by hiredate
;

-- view 생성
create or replace view view_emp_hire
as
select empno, ename, hiredate 
from emp
order by hiredate
;

select rownum, empno, ename, hiredate from view_emp_hire;

-- 상위 5개 출력
select * from view_emp_hire where rownum<=5;

-- 인라인 뷰를 이용해서 가장 최근에 입사한 사원 5명을 추출
select * 
from (select * from emp order by hiredate desc)
where rownum<=5
;

-- sequence: 숫자 자동 생성기, 시작값, 증가값, 최대값, 최소값, 반환 여부
-- dept table deptno -> pk 10 -> 20 -> 30...
-- deptno에 사용할 sequence 생성
drop sequence seq_dept_deptno;
create sequence seq_dept_deptno
minvalue 10 
start with 10 
increment by 10
maxvalue 90
;

-- emp 테이블의 empno 기본키에 사용할 sequence를 생성
create sequence seq_emp_empno
minvalue 0 
start with 0
increment by 1
;

-- sequence 객체로 숫자를 생성, 현재 숫자를 읽어오는 명령
-- 숫자 생성: nextval -> 새로운 숫자를 생성하고 숫자를 반환
-- 현재 숫자 반환: currval

-- 새롭게 생성하는 숫자를 확인
select seq_dept_deptno.nextval -- dept deptno
from  dual;


-- 현재 숫자 확인
select seq_dept_deptno.currval
from dual;

insert into dept01 values(seq_dept_deptno.nextval, 'test', 'test');

select * from dept01;


-- index: 검색을 빠르게 하기 위한 객체
-- create index indes_name on target table_name (column_name);

-- index 확인을 하는 user_ind_column
desc user_ind_columns;

select index_name, table_name, column_name
from user_ind_columns
;