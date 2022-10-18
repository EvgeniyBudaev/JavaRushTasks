-- Write your code here:
SELECT name, avg(price), sum(price) FROM cars GROUP BY name HAVING avg(price) > 100000;