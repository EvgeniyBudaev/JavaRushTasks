-- Write your code here:
SELECT position, group_concat(name) FROM employee GROUP BY position HAVING position LIKE '%developer%';