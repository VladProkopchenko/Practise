select avg(salary) from authorization_.users
where age < 25

union

select avg(salary) from authorization_.users
where age > 25