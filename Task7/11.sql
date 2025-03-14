select age, count(*) as users_count from authorization_.users
group by age
having count(*)>1
order by users_count
desc