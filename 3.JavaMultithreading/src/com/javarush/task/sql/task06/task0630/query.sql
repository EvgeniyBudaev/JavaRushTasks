-- Write your code here:
ALTER TABLE event ADD FOREIGN KEY (user_id) REFERENCES users(id);