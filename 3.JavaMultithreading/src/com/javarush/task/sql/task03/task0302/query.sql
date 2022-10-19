-- Write your code here:
select * from gyms, customers
WHERE gyms.location = 'London'
  AND customers.location = 'London';