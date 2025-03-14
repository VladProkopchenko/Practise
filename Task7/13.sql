select u.name, r.name
from authorization_.users as u
join authorization_.roles r on u.role_id = r.id
limit 5 offset 2