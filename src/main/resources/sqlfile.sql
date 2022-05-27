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

INSERT INTO public.patient(
	firstname, lastname, address, city, state, zipcode, phonenumber, email)
	VALUES ('Malinda', 'Peiris', '28/5, Weliveriya', 'Gampaha', 'Western', 11710, '0717083607', 'malinda.ashan@gmail.com');

select * from patient;