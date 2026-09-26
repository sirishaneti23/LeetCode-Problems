# Write your MySQL query statement below
select e2.name as Employee
from Employee e1
inner join employee e2 on e2.managerid = e1.id
where e2.salary > e1.salary;