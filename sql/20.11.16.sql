-- 20.11.16

-- PhoneBook  DDL: 테이블 정의서를 참고 DDL 작성한다.
select * from phoneinfo_basic;
select * from phoneinfo_com;
-- 도메인 정의
create table phoneInfo_basic (
    idx number(6) constraint pi_basic_idx_PK primary key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar(20),
    fr_regdate date default sysdate
)
;
-- 구조 확인
desc phoneInfo_basic;

-- 제약 조건 확인 user_constraints
desc user_constraints;

select constraint_name, constraint_type
from user_constraints
where table_name='PHONEINFO_BASIC'
;

-- 시퀀스: 숫자 재생기
create SEQUENCE SEQ_PIBASIC_IDX
MINVALUE 0
START WITH 0
INCREMENT by 1 -- 1씩 증가
;

-- 질의: READ
select * from phoneInfo_basic;

-- 데이터 삽입: INSERT
insert into phoneInfo_basic 
values(1, 'SCOTT', '010-0000-0000', 'SCOTT@gmail.com', '서울', sysdate);

insert into phoneInfo_basic 
values(SEQ_PIBASIC_IDX.nextval, 'SCOTT', '010-0000-0000', 'SCOTT@gmail.com', '서울', sysdate);

insert into phoneInfo_basic(IDX, fr_name, fr_phonenumber)
values(SEQ_PIBASIC_IDX.nextval, 'KING', '010-9999-9999')
;

-- 데이터 삭제: DELETE
delete from phoneInfo_basic; -- 모든 행 대상

-- 데이터 업데이트: UPDATE
update phoneInfo_basic 
set fr_email='KING@NAVER.COM', fr_address = '부산'
where IDX=5
;

-- C(CREATE), R(READ), U(UPDATE), D(DELETE
-- INSERT, SELECT, UPDATE, DELETE

-----------
-- PhoneInfo_univ

drop table phoneInfo_univ;

create table phoneInfo_univ(
    idx number(6) ,
    fr_u_major varchar2(20) default 'N' ,
    fr_u_year number(1) default 1 check(fr_u_year between 1 and 4),
    fr_ref number(6) not null,
    constraint pi_univ_idx_PK primary key(idx),
    constraint pi_univ_ref_FK FOREIGN KEY  (fr_ref) REFERENCES phoneInfo_basic(idx)
);

desc phoneInfo_univ;
select * from user_constraints where table_name='PHONEINFO_UNIV';

-- CRUD
-- create: 대학친구 입력 
-- 기본 정보
insert into phoneInfo_basic(IDX, fr_name, fr_phonenumber)
values(SEQ_PIBASIC_IDX.nextval, 'KING', '010-9999-9999');
-- 대학 정보
insert into phoneInfo_univ values(3, 'computer', 2, SEQ_PIBASIC_IDX.currval);

-- read
select * from phoneInfo_univ;

-- join
select *
from phoneInfo_basic pb, phoneInfo_univ pu
where pb.idx=pu.fr_ref
;

-- update: phoneInfo_univ where idx=3; 
update phoneinfo_univ
set fr_u_major ='체육', fr_u_year=4
where idx=1
;

-- delete: idx 10 행을 삭제 -> 외래키 먼저 삭제
delete phoneInfo_univ where fr_ref=7;
delete phoneinfo_basic where idx=7;

---------
-- phoneInfo_com
create table phoneInfo_com(
    idx number(6) constraint pi_com_idx_PK primary key,
    fr_c_company varchar2(20) default 'N',
    fr_ref number(6) not null constraint pi_com_ref_FK REFERENCES phoneInfo_basic (idx)    
);

-- 회사 친구 정보 입력
insert into phoneInfo_basic(IDX, fr_name, fr_phonenumber)
values(SEQ_PIBASIC_IDX.nextval, '손흥민', '010-1111-1111');

-- 회사 정보 입력
insert into phoneinfo_com values (1, '토트넘', SEQ_PIBASIC_IDX.currval);

-- read
-- 회사 친구 
select * 
from phoneinfo_basic pb, phoneinfo_com pc
where pb.idx=pc.fr_ref
and pb.fr_name='손흥민'
;

-- update
update phoneinfo_com
set fr_c_company='레알마드리드'
where idx=1
;

-- delete 
-- 자식 테이블의 행부터 삭제 -> 부모 테이블 행을 삭제
delete from phoneinfo_com where fr_ref=8;
delete from phoneinfo_basic where idx=8;


select * from tab;

desc emp;
select * from emp ;
update emp
set deptno= (select deptno from emp where ename='SCOTT');
