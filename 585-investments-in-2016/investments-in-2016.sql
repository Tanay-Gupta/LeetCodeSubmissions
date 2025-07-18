# Write your MySQL query statement below



select round(sum(tiv_2016),2) as tiv_2016 
 from 
(
select *,
count(*) over (partition by tiv_2015) as tiv_2015_redundency,
count(*) over (partition by lat,lon) as lat_lon_redundency
from Insurance ) new_table
where tiv_2015_redundency>1 and lat_lon_redundency=1




