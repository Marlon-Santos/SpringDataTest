    CREATE TABLE cadastro(
        id BIGINT(20)PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(50) NOT NULL
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;

    INSERT INTO cadastro (name) VALUES ("marlon")