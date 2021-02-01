/*
Navicat MySQL Data Transfer

Source Server         : ai
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : turing

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2021-02-01 16:52:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'book id',
  `book_name` varchar(255) NOT NULL COMMENT '书名',
  `category` varchar(255) DEFAULT NULL COMMENT '类别',
  `path` varchar(255) DEFAULT NULL COMMENT '存储路径',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
