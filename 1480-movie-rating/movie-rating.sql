# Write your MySQL query statement below

(
  SELECT u.name AS results
  FROM MovieRating r LEFT JOIN Users u
  ON (r.user_id = u.user_id)
  GROUP BY r.user_id
  ORDER BY COUNT(r.movie_id) DESC, u.name 
  LIMIT 1
)
UNION ALL(
select title as results
from Movies M left join MovieRating MR 

on M.movie_id=MR.movie_id 
WHERE MR.created_at LIKE '2020-02%'
group by M.movie_id 
order by AVG(MR.rating) DESC,M.title LIMIT 1)