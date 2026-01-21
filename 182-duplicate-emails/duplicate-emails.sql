# Write your MySQL query statement below
select DISTINCT email From Person Group bY email having count(email)>1;