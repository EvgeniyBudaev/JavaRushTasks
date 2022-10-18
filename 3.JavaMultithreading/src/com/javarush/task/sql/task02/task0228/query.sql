-- Write your code here:
SELECT department AS number_of_employees, COUNT(*) FROM employee GROUP BY department;