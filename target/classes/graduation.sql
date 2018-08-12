/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : 192.168.100.101:3306
 Source Schema         : graduation

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 13/08/2018 05:14:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gd_authority
-- ----------------------------
DROP TABLE IF EXISTS `gd_authority`;
CREATE TABLE `gd_authority`  (
  `authority_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `authority_name` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单名称',
  `authority_url` varchar(0) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'url地址',
  `authority_group_id` int(11) DEFAULT NULL COMMENT '分组id',
  PRIMARY KEY (`authority_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gd_authority
-- ----------------------------
INSERT INTO `gd_authority` VALUES (1, '管理权限', NULL, 1);

-- ----------------------------
-- Table structure for gd_authority_group
-- ----------------------------
DROP TABLE IF EXISTS `gd_authority_group`;
CREATE TABLE `gd_authority_group`  (
  `authority_group_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `authority_group_name` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`authority_group_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gd_authority_group
-- ----------------------------
INSERT INTO `gd_authority_group` VALUES (1, '权限管理');

-- ----------------------------
-- Table structure for gd_user
-- ----------------------------
DROP TABLE IF EXISTS `gd_user`;
CREATE TABLE `gd_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '登录名',
  `password` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `state` int(1) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gd_user
-- ----------------------------
INSERT INTO `gd_user` VALUES (1, 'xiaozi5', '1438147', 9);

-- ----------------------------
-- Table structure for gd_user_group
-- ----------------------------
DROP TABLE IF EXISTS `gd_user_group`;
CREATE TABLE `gd_user_group`  (
  `group_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `group_name` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限组名称',
  `group_state` int(1) DEFAULT NULL COMMENT '权限组状态',
  PRIMARY KEY (`group_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gd_user_group
-- ----------------------------
INSERT INTO `gd_user_group` VALUES (1, '管理员', 1);

-- ----------------------------
-- Table structure for gd_user_info
-- ----------------------------
DROP TABLE IF EXISTS `gd_user_info`;
CREATE TABLE `gd_user_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `email` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `sex` int(1) DEFAULT NULL COMMENT '性别',
  `telphone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话号码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gd_user_info
-- ----------------------------
INSERT INTO `gd_user_info` VALUES (1, 'weizi', 'weizi005@126.com', 0, '12345678909');

-- ----------------------------
-- Table structure for lk_group_authority
-- ----------------------------
DROP TABLE IF EXISTS `lk_group_authority`;
CREATE TABLE `lk_group_authority`  (
  `lk_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `group_id` int(11) DEFAULT NULL COMMENT 'gd_user_group_id',
  `authority_id` int(11) DEFAULT NULL COMMENT 'gd_authority_id',
  PRIMARY KEY (`lk_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
