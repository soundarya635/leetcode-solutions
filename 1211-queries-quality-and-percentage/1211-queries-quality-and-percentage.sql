# Write your MySQL query statement below
select q1.query_name, round( avg(q1.rating/q1.position) ,2) as quality ,
round( ((select count(*) from queries q where q1.query_name=q.query_name and q.rating< 3)/count(*))*100,2) as poor_query_percentage 
from queries q1
group by q1.query_name;