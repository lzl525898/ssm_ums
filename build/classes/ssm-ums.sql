/*
Navicat MySQL Data Transfer

Source Server         : mysql5.5
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : ssm-ums

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-03-14 16:56:06
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `ums_role`
-- ----------------------------
DROP TABLE IF EXISTS `ums_role`;
CREATE TABLE `ums_role` (
  `role_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `role_type` varchar(50) NOT NULL COMMENT '角色类型',
  `role_desc` varchar(255) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ums_role
-- ----------------------------
INSERT INTO `ums_role` VALUES ('1', '0', '全局主管理员');
INSERT INTO `ums_role` VALUES ('2', '1', '分配副管理员');
INSERT INTO `ums_role` VALUES ('3', '2', '普通用户');

-- ----------------------------
-- Table structure for `ums_user`
-- ----------------------------
DROP TABLE IF EXISTS `ums_user`;
CREATE TABLE `ums_user` (
  `user_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(255) NOT NULL,
  `user_nick` varchar(255) DEFAULT NULL,
  `role_id` tinyint(4) NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `fk_role_user` (`role_id`),
  CONSTRAINT `fk_role_user` FOREIGN KEY (`role_id`) REFERENCES `ums_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ums_user
-- ----------------------------
INSERT INTO `ums_user` VALUES ('1', 'admin', 'admin', '1');
INSERT INTO `ums_user` VALUES ('2', 'liangzelei', 'lzl', '3');
