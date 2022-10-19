-- Write your code here:
select book.title, book.publication_year, book.isbn, author.full_name as author, publisher.name as publisher
from book
         left join author on author.id = book.author_id
         left join publisher on publisher.id = book.publisher_id;