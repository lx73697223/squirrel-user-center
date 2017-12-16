DROP TABLE user_account IF EXISTS;

CREATE TABLE user_account (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR,
    nick VARCHAR,
    phone VARCHAR
);
