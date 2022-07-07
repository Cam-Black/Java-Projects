DROP TABLE IF EXISTS `hobbit` CASCADE;
CREATE TABLE `hobbit`
(
    `id`          INTEGER UNIQUE NOT NULL AUTO_INCREMENT,
    `age`         INTEGER        NOT NULL,
    `family_name` VARCHAR(255),
    `forename`    VARCHAR(255)
);