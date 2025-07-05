# Write your MySQL query statement below


-- select
-- sum(if(income>50000,1,0)) as "High Salary",
-- sum(if(income>20000 && income <50000,1,0)) as "Low Salary",
-- sum(if(income<20000,1,0)) as "Average Salary"
-- from Accounts

SELECT "Low Salary" as category, sum(if(income<20000,1,0)) AS accounts_count FROM Accounts
union
SELECT "Average Salary" as category, sum(if(income>=20000 and income<=50000,1,0)) AS accounts_count FROM Accounts
union
SELECT "High Salary" as category, sum(if(income>50000,1,0)) AS accounts_count FROM Accounts