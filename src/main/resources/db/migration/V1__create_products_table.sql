CREATE TABLE products
(
    id         BIGINT         NOT NULL AUTO_INCREMENT,
    name       VARCHAR(255)   NOT NULL,
    price      DECIMAL(10, 2) NOT NULL,
    category   VARCHAR(100),
    created_at TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);
