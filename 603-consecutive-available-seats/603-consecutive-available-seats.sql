# Write your MySQL query statement below
select distinct a.seat_id 
from cinema as a join cinema as b
on a.seat_id = b.seat_id+1 or a.seat_id = b.seat_id-1
where a.free = 1 and b.free = 1
group by seat_id;