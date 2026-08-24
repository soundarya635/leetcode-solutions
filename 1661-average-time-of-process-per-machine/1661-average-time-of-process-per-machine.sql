# Write your MySQL query statement below
select i.machine_id,abs(round(avg(i.timestamp -j.timestamp),3)) as processing_time   from Activity i join Activity j on i.machine_id=j.machine_id && i.activity_type='start' && j.activity_type='end'
group by i.machine_id;