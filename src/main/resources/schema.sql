create table Spittle (
	id identity,
	message varchar(140) not null,
	created_at timestamp not null,
	latitude double,
	longitude double
);

create table Spitter (
	id identity,
	username varchar(20) unique,
	password varchar(20),
	first_name varchar(30),
	last_name varchar(30),
	email varchar(30)
);