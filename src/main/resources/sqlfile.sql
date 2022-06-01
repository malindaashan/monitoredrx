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
);