-- Write your code here:
SELECT name, min(price), max(price) FROM cars GROUP BY name HAVING max(price) < 200000;