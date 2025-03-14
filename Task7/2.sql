create table authorization_.users(
	id serial primary key,
	login varchar(30) not null unique,
	password varchar(30) not null,
	name varchar(30) not null,
	birth_date date
);