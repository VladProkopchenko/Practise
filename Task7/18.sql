update authorization_.users
set role_id = (select id from authorization_.roles where name ='Менеджер' limit 1)
where name like 'С%'