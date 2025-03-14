alter table authorization_.users	
add column age int not null check (age > 18),
add column salary numeric;

create index user_name_index on authorization_.users (name);