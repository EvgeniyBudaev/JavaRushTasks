-- Write your code here:
select name, year(discovery_date) d_year, monthname(discovery_date) d_month, dayname(discovery_date) d_day
from object;