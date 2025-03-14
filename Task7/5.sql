alter table authorization_.users
add column role_id int,
add constraint fk_role foreign key (role_id) references authorization_.roles (id);