-- Write your code here:
SELECT name, sum(price) FROM cars GROUP BY name HAVING sum(price) > 200000;