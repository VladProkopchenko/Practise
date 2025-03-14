select u.name as user_name, r.name
from authorization_.users u
join authorization_.user_roles ur on u.id = ur.user_id
join authorization_.roles r on ur.role_id = r.id