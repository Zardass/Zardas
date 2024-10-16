insert into books
(name,price,page_count,author) values
('java 23', 44,344,'zerda'),
('CSS 3', 32,234,'ulker'),
('HTML 3.1', 14,154,'aytac');

insert into products
(name,price) values
('corek',0.5),
('yag',8),
('sud',4);


insert into customers
(name,phone) values
('Zerda','0515359848'),
('Fegan','0553453445'),
('Rahibe','0516353744');

insert into orders
(price,customer_id) values
(123,1),
(23,3),
(234,2),
(234,1),
(234,2);

insert into order_details
(product_id,quantity,order_id) values
(1,2,1),
(2,2.5,1),
(3,1,1),

(1,2,2),
(2,1.5,2),

(1,1,3),
(3,3,3),

(1,2,4),
(3,4,4),

(3,2,5),
(2,4,5);




