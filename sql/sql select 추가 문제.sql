-- select 추가 문제

-- 1. 마당 서점의 고객이 요구하는 다음 질문에 대해 SQL문을 작성하시오.
select * from book;
select * from customer;
select * from orders;

-- (1) 도서번호가 1인 도서의 이름
select bookname
from book
where bookid=1
;

-- (2) 가격이 20,000원 이상인 도서의 이름
select bookname
from book
where price>=20000
;

-- (3) ﻿박지성의총구매액(박지성의고객번호는1번으로놓고작성)
select sum(saleprice)
from orders
where custID=1
;

select sum(saleprice) as totalPrice
from orders
where custid=(select custid from customer where name='박지성') -- 박지성의 custid
;

-- (4) 박지성이 구매한 도서의 수(박지성의고객번호는1번으로놓고작성)
-- 박지성의 구매 횟수를 찾으면 -> 구매한 도서의 수
select count(saleprice)
from orders
where custid=1
;

-- 2. ﻿마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL 문을 작성하시오.
select * from book;
select * from customer;
select * from orders;

-- (1) ﻿마당서점도서의총개수: book의 총 row의 개수
select count(*) as "도서의 총 개수"
from book
;

-- (2) ﻿마당서점에도서를출고하는출판사의총개수
select count(distinct publisher)
from book
order by publisher
;

-- (3) 모든 고객의 이름, 주소
select name, address
from customer
;

-- (4) ﻿2014년 7월 4일 ~ 7월 7일 사이에 주문받은
-- 도서의 주문번호
select orderid
from orders
where orderdate between '2014/07/04' and '2014/07/07'
;

-- (5) ﻿2014년 7월 4일 ~ 7월 7일 사이에 주문받은 도서를 제외한 
-- 도서의주문번호
select orderid
from orders
where not (orderdate between '2014/07/04' and '2014/07/07')
;

-- (6) 성이 '김'씨인 고객의 이름과 주소
select name, address
from customer
where name like '김%'
;

-- (7) ﻿성이 ‘김’씨이고 이름이‘아’로 끝나는 고객의 이름과 주소
select name, address
from customer
where name like '김%아'
;