-- Write your code here:
SELECT prod_year AS car_count, COUNT(*) FROM cars GROUP BY prod_year;