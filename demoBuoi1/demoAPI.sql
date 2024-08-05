create database demoAPI
go
use demoAPI
go


create table Roles
(
	role_id int Identity(1,1) primary key,
	role_name varchar (30),
	description varchar(50)
)
go
create table users
(
user_id int Identity(1,1) primary key,
user_name nvarchar (30),
age int,
email varchar(100),
password varchar(30),
role_id int,
foreign key (role_id) references roles (role_id)
)
GO
insert into roles(role_name,description) values
('admin','quan ly'),
('user','nguoi dung')
GO
insert into users (user_name,age,email,password,role_id) values
('tung123',28,'tungvtps27852@fpt.edu.vn','123',1)
 

insert  into Roles values
('admin','tester');

 

update roles set role_name = 'Thanh Tung',description = 'intern' where role_id = 8

delete from Roles where role_id = 2

select 
	user_id,
	user_name,
	age,
	email,
	password,
	role_id
from users
update roles set role_name = 'Thanh Tung',description = 'intern' where role_id = 8


update users set user_name = 'dev lo lo lo', age = 11, email = 'dev213@gmail.com', password = '123', role_id = 1 
where user_id = 25;

select * from Roles

