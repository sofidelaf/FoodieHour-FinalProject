-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema final_project_demo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema final_project_demo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `final_project_demo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `final_project_demo` ;

-- -----------------------------------------------------
-- Table `final_project_demo`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `final_project_demo`.`product` (
  `product_id` BIGINT NOT NULL AUTO_INCREMENT,
  `price` DECIMAL(19,2) NULL DEFAULT NULL,
  `product_name` VARCHAR(255) NULL DEFAULT NULL,
  `quantity` INT NOT NULL,
  `weight_in_kg` DOUBLE NOT NULL,
  `order_item_id` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  INDEX `FK7420o4c9ijidu2y12bbptoj7x` (`order_item_id` ASC) VISIBLE,
  CONSTRAINT `FK7420o4c9ijidu2y12bbptoj7x`
    FOREIGN KEY (`order_item_id`)
    REFERENCES `final_project_demo`.`order_item` (`order_item_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `final_project_demo`.`order_item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `final_project_demo`.`order_item` (
  `order_item_id` BIGINT NOT NULL AUTO_INCREMENT,
  `price` DECIMAL(19,2) NULL DEFAULT NULL,
  `quantity_bought` INT NOT NULL,
  `order_id` BIGINT NULL DEFAULT NULL,
  `product_id` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`order_item_id`),
  INDEX `FK551losx9j75ss5d6bfsqvijna` (`product_id` ASC) VISIBLE,
  CONSTRAINT `FK551losx9j75ss5d6bfsqvijna`
    FOREIGN KEY (`product_id`)
    REFERENCES `final_project_demo`.`product` (`product_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `final_project_demo`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `final_project_demo`.`user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL DEFAULT NULL,
  `password` VARCHAR(255) NULL DEFAULT NULL,
  `username` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `final_project_demo`.`purchaser_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `final_project_demo`.`purchaser_user` (
  `address` VARCHAR(255) NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `phone_number` BIGINT NULL DEFAULT NULL,
  `user_id` BIGINT NOT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `FK1pmddntklwcwisv542kkplybu`
    FOREIGN KEY (`user_id`)
    REFERENCES `final_project_demo`.`user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `final_project_demo`.`seller_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `final_project_demo`.`seller_user` (
  `address` VARCHAR(255) NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `phone_number` BIGINT NULL DEFAULT NULL,
  `seller_type` INT NULL DEFAULT NULL,
  `user_id` BIGINT NOT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `FKlt2dn5vv2tlu8gmkdr5np6326`
    FOREIGN KEY (`user_id`)
    REFERENCES `final_project_demo`.`user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
