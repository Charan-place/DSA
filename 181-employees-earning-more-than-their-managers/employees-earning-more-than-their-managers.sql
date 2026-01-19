# Write your MySQL query statement below
select e.name as Employee from Employee e  where e.salary>(select M.salary from Employee M where M.id=e.managerId) 