# Write your MySQL query statement below


select ee.unique_id, e.name from Employees e left join EmployeeUNI ee 
on e.id=ee.id;