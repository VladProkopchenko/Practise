create table authorization_.user_roles(
	user_id int not null,
	role_id int not null,
	primary key(user_id, role_id),
	foreign key (user_id) references authorization_.users (id),
	foreign key (role_id) references authorization_.roles (id)
);
insert into authorization_.user_roles (user_id, role_id)
select id as user_id, role_id from authorization_.users where role_id is not null;

alter table authorization_.users drop column role_id