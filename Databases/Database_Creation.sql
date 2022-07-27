DROP SCHEMA IF EXISTS final_project_demo;
CREATE SCHEMA IF NOT EXISTS final_project_demo;
USE final_project_demo;

-- DROP SCHEMA IF EXISTS final_project_demo_test;
-- CREATE SCHEMA IF NOT EXISTS final_project_demo_test;
-- USE final_project_demo_test;

-- -----------------------------------------------------
-- Table `final_project_demo`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS user (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NULL DEFAULT NULL,
  password VARCHAR(255) NULL DEFAULT NULL,
  username VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (id));

-- -----------------------------------------------------
-- Table `final_project_demo`.`purchaser_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS purchaser_user (
  purchaser_user_id  BIGINT NOT NULL,
  address VARCHAR(255) NULL DEFAULT NULL,
  email VARCHAR(255) NULL DEFAULT NULL,
  phone_number BIGINT NULL DEFAULT NULL,
  user_id BIGINT NOT NULL,
  PRIMARY KEY (purchaser_user_id),
    FOREIGN KEY (user_id)
    REFERENCES user (id));

-- -----------------------------------------------------
-- Table `final_project_demo`.`seller_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS seller_user (
  seller_user_id BIGINT NOT NULL,
  address VARCHAR(255) NULL DEFAULT NULL,
  email VARCHAR(255) NULL DEFAULT NULL,
  phone_number BIGINT NULL DEFAULT NULL,
  seller_type VARCHAR(255) NULL DEFAULT NULL,
  user_id BIGINT NOT NULL,
  product_id BIGINT NOT NULL,
  PRIMARY KEY (seller_user_id),
    FOREIGN KEY (user_id)
    REFERENCES user (id));
    
-- -----------------------------------------------------
-- Table `final_project_demo`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS product (
  product_id BIGINT NOT NULL AUTO_INCREMENT,
  price DECIMAL(19,2) NULL DEFAULT NULL,
  product_name VARCHAR(255) NULL DEFAULT NULL,
  quantity INT NOT NULL,
  weight_in_kg DOUBLE NOT NULL,
  PRIMARY KEY (product_id));
    
-- -----------------------------------------------------
-- Table `final_project_demo`.`order_item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS order_item (
  order_item_id BIGINT NOT NULL AUTO_INCREMENT,
  price DECIMAL(19,2) NULL DEFAULT NULL,
  quantity_bought INT NOT NULL,
  order_id BIGINT NULL DEFAULT NULL,
  product_id BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (order_item_id),
    FOREIGN KEY (product_id)
    REFERENCES product (product_id));

-- -----------------------------------------------------
-- Table `final_project_demo`.`user_order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS user_order (
  order_id BIGINT NOT NULL AUTO_INCREMENT,
  purchaser_user_id BIGINT NULL DEFAULT NULL,
  order_item_id BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (order_id),
    FOREIGN KEY (order_item_id)
    REFERENCES order_item (order_item_id));



