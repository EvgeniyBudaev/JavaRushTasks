-- Write your code here:
select distinct publisher.name
from publisher
         left join book on publisher.id = book.publisher_id
         left join author on author.id = book.author_id
where author.full_name = 'Mark Twain';