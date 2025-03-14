insert into authorization_.user_roles (user_id, role_id)
select user_id, role_id from (
    select u.id as user_id, r.id as role_id
    from authorization_.users u
    cross join authorization_.roles r
    where u.id = 1 
      and r.id not in (select role_id from authorization_.user_roles where user_id = u.id)
    LIMIT 3
) as new_roles