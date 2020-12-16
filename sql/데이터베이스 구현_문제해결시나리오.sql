-- 20.11.19
-- 데이터베이스 구현 - 문제해결시나리오
--1. 대리키 IDX, 회원 아이디, 이름, 비밀번호, 사진이름, 가입일 을 저장할 수 있는 
--  이름이 MEMBER인 테이블을 생성하세요. 
--   회원 아이디에는 기본키 제약설정을 하고, 
--   이름과 비밀번호에는 not null, 
--   가입일은 기본 값으로 sysdate가 입력되도록 하시오.
create table member(
    idx number(6) ,
    id varchar2(20) primary key,
    name varchar2(20) not null,
    password varchar2(20),
    photo varchar(20),
    regdate date default sysdate
);


select * from member;
insert  into  member values(1, 'suin', '정수인', 'suin11', 'basic_jpeg', '20/11/19');

-- 2. Member 테이블에서 이름 컬럼으로 인덱스 객체를 생성하시오.
create Index IDX_member_name
on member(name);
-- 3. MEMBER 테이블에서 회원 아이디, 이름, 사진 정보만을 출력하는 view 객체를 생성하시오.
--    view의 이름은 member_view 로 생성하시오.
-- view 생성
create or replace view member_view
as 
select id, name, photo
from member
;

select * from member_view;
