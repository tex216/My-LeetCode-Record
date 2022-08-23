# Write your MySQL query statement below
select count(distinct user_id) as active_users, activity_date as day
from activity
where (activity_date > "2019-06-27") and (activity_date <= "2019-07-27")
group by day;