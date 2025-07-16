# Write your MySQL query statement below ROW_NUMBER() OVER (ORDER BY IF(MOD(id, 2) = 0, id - 1, id + 1)) AS id,
select
ROW_NUMBER() over (order by if(MOD(id,2)=0,id-1,id+1)) AS ID,
student from Seat;