-- Write your code here:
CREATE TABLE `users`
(
    `user_id`    INT          not null auto_increment,
    `first_name` VARCHAR(255) not null,
    `last_name`  VARCHAR(255) not null,
    PRIMARY KEY (user_id)
);