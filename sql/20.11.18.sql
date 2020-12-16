-- 20.11.18

drop SEQUENCE seq_dept_deptno;
create SEQUENCE seq_dept_deptno
minvalue 0 
start with 60
MAXVALUE 90
;
-- JDBC 프로그래밍 과제 --

select * from emp;

-- 1.EMP 테이블에 새로운 사원 정보를 입력하는 프로그램을 작성해보자.
insert into emp values(7999, 'ALI', 'MANAGER', 7902, '20/11/18', 9000, 0, 10);
delete from emp where ename='ALI';
-- 2.EMP 테이블의 모든 데이터를 출력하는 프로그램을 작성해보자.
select * from emp;

-- 3. EMP 테이블에 서 “SCOTT” 사원의 급여(sal) 정보를 1000으로 바꾸는 프로그램을 작성해보자.

-- 4.EMP 테이블에 서 “SCOTT” 이름으로 검색한 결과를 출력하는 프로그램을 작성해보자.

-- 5.모든 사원정보를 출력하되 부서정보를 함께 출력하는 프로그램을 작성해보자.
desc emp;
commit;