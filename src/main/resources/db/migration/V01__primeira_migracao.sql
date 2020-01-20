    CREATE TABLE useractive(
        id BIGINT(20)PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(255) NOT NULL,
        email VARCHAR(255) NOT NULL,
        active VARCHAR(5) NOT NULL
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;

    INSERT INTO useractive (name,email,active) VALUES ("marlon","marlonergondossantos@gmail.com","true")