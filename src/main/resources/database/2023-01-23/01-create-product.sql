--liquibase formatted sql
--changeset mgrzelec:1
CREATE TABLE product (
  id bigint not null auto_increment PRIMARY KEY,
  name varchar(255) not null,
  category varchar(255) not null,
  description text not null,
  price decimal(9,2) not null,
  currency varchar(3) not null
);