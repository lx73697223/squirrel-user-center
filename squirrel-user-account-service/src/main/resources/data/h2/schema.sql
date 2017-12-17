DROP TABLE user_account IF EXISTS;

CREATE TABLE user_account (
    unique_id VARCHAR(64) NOT NULL,
    username NVARCHAR(40) NOT NULL,
    nick VARCHAR(30) NOT NULL,
    gender INT NOT NULL DEFAULT (0),
    phone VARCHAR(20),
    PRIMARY KEY (unique_id)
);
