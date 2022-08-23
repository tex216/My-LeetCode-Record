# Write your MySQL query statement below
select country.name as country
from person as p 
    join country on substring(phone_number, 1, 3) = country_code
    join calls on p.id = calls.caller_id or p.id = calls.callee_id
group by country.name
having avg(duration) > (select avg(duration) from calls);
