# Write your MySQL query statement below
select round(count(a2.player_id) / count(distinct a1.player_id), 2) as fraction
from Activity as a1 left join (select player_id, min(event_date) as first_date
                               from Activity 
                               group by player_id) as a2 
                    on a1.player_id = a2.player_id and a1.event_date = a2.first_date + 1;