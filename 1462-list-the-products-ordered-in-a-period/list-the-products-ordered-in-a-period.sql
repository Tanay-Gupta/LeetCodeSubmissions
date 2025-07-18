# Write your MySQL query statement below



select 
product_name,
sum(unit) as unit
from Orders O inner join Products P on O.product_id=P.product_id
where order_date LIKE "2020-02%"
group by O.product_id 
having sum(unit) >=100