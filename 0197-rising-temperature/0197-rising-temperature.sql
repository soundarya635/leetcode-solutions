# Write your MySQL query statement below

select w.id as Id from Weather w cross join Weather e 
where DATEDIFF(w.recordDate,e.recordDate)=1 and w.temperature>e.temperature;
