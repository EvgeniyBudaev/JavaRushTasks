-- Write your code here:
SELECT name, sum(price), avg(price) FROM cars GROUP BY name;