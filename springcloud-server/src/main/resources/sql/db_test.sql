/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : gedb

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2017-01-19 17:14:19
*/

CREATE DATABASE  IF NOT EXISTS `gedb` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `gedb`;

-- ----------------------------
-- Table structure for `db_test`
-- ----------------------------
DROP TABLE IF EXISTS `db_test`;
CREATE TABLE `db_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_test
-- ----------------------------
INSERT INTO `db_test` VALUES ('1', 'aaa');
INSERT INTO `db_test` VALUES ('2', 'bbb');
