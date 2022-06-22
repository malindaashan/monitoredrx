--create a database as monitoredrx (configurable in application.properties)
--create a instance as rx in postgres.
--configure database password in application.properties

create table patient(
	id serial PRIMARY KEY,
	firstname varchar(255),
	lastname varchar(255),
	address varchar(255),
	city varchar(255),
	state varchar(255),
	zipcode INT,
	phonenumber varchar(50),
	email varchar(100)
	projectId varchar(100);
);

create table rx.project(
	id serial PRIMARY KEY,
	projectName varchar(255),
	userId INT
);

insert into rx.project values (1,'project phenomena',1);
insert into rx.project values (2,'project diabetes',1);
insert into rx.project values (3,'project Therapy',2);

create table users(
	id serial PRIMARY KEY,
	userId varchar(255),
	projectId INT
);