-- SQL 활용 문제해결 시나리오
-- 20.11.23
drop table contact;
create table Contact (
    con_idx number(6) constraint con_basic_idx_PK primary key,
    con_name varchar2(20) not null,
    con_phonenumber varchar2(20) not null,
    con_address varchar(20) DEFAULT '대한민국' not null,
    con_email varchar2(20) Default 'bit@naver.com' not null   
)
;

create table Contact_univ(
    idx number(6) ,
    con_u_major varchar2(20) ,
    con_u_year number(1) default 1 check(con_u_year between 1 and 4),
    constraint con_univ_idx_PK primary key(idx)   
);

create table Contact_com(
    idx number(6) constraint con_com_idx_PK primary key,
    con_c_company varchar2(20),
    con_c_dname varchar2(10),
    con_c_job varchar(10)    
);

create table Contact_cafe(
    idx number(6) constraint con_cafe_idx_PK primary key,
    con_cf_cafename varchar2(20),
    con_cf_nickname varchar2(10)
);


select * from dept;
insert into dept values(70, '경영', '동대문');
update dept
set dname ='행정', loc='인천'
where deptno=70;
;

delete from dept where deptno=70;

