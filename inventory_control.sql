/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : inventory_control

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-06-14 09:00:06
*/

DROP DATABASE IF EXISTS `inventory_control`;
CREATE DATABASE `inventory_control` CHARSET 'utf8';
-- 指向数据库
USE `inventory_control`;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `commodityName` varchar(20) DEFAULT NULL COMMENT '商品名称',
  `commodityIntroduce` varchar(200) DEFAULT NULL COMMENT '商品介绍',
  `commodityBigPictureUrl` varchar(100) DEFAULT NULL COMMENT '商品大图路径',
  `commodityRelationId` int(11) DEFAULT NULL COMMENT '商品分类_外键',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('1', '红葡萄酒', '贺兰山东麓L7橡木红葡萄酒', '', '1');
INSERT INTO `commodity` VALUES ('2', '拉菲红酒', '法国原瓶进口拉菲雾禾山谷干红葡萄酒', '', '1');
INSERT INTO `commodity` VALUES ('3', '瓦伦丁', '德国进口小麦啤酒', '', '1');

-- ----------------------------
-- Table structure for commodityinventory
-- ----------------------------
DROP TABLE IF EXISTS `commodityinventory`;
CREATE TABLE `commodityinventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `commodityNumber` int(11) DEFAULT NULL COMMENT '商品数量',
  `commoditySecurityLine` int(11) DEFAULT NULL COMMENT '商品数量警戒值',
  `commodityPrice` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
  `commoditySmallPictureUrl` varchar(100) DEFAULT NULL COMMENT '商品小图路径',
  `commoditySku` varchar(200) DEFAULT NULL COMMENT '库存规格关系_JSON形式对应(specificationTopic,specificationDetailed)',
  `commodityId` int(11) DEFAULT NULL COMMENT '商品id_外键',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodityinventory
-- ----------------------------
INSERT INTO `commodityinventory` VALUES ('1', '20', '5', '200.00', '', '{\"detailedId\": [1]}', '1');
INSERT INTO `commodityinventory` VALUES ('2', '40', '10', '300.00', '', '{\"detailedId\": [2]}', '2');
INSERT INTO `commodityinventory` VALUES ('3', '20', '5', '500.00', '', '{\"detailedId\": [1]}', '3');

-- ----------------------------
-- Table structure for commodityrelation
-- ----------------------------
DROP TABLE IF EXISTS `commodityrelation`;
CREATE TABLE `commodityrelation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `commodityPrimaryTypeId` int(11) DEFAULT NULL COMMENT '商品一级分类_外键',
  `commodityMinorTypeId` int(11) DEFAULT NULL COMMENT '商品二级分类_外键',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodityrelation
-- ----------------------------
INSERT INTO `commodityrelation` VALUES ('1', '1', '2');

-- ----------------------------
-- Table structure for commoditytype
-- ----------------------------
DROP TABLE IF EXISTS `commoditytype`;
CREATE TABLE `commoditytype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `commodityTypeName` varchar(20) DEFAULT NULL COMMENT '类型名称',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commoditytype
-- ----------------------------
INSERT INTO `commoditytype` VALUES ('1', '酒类');
INSERT INTO `commoditytype` VALUES ('2', '红酒');

-- ----------------------------
-- Table structure for financetype
-- ----------------------------
DROP TABLE IF EXISTS `financetype`;
CREATE TABLE `financetype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `financeTypeName` varchar(20) DEFAULT NULL COMMENT '财务类型名称',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of financetype
-- ----------------------------
INSERT INTO `financetype` VALUES ('1', '收入');
INSERT INTO `financetype` VALUES ('2', '支出');

-- ----------------------------
-- Table structure for specificationdetailed
-- ----------------------------
DROP TABLE IF EXISTS `specificationdetailed`;
CREATE TABLE `specificationdetailed` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `detailedName` varchar(10) DEFAULT NULL COMMENT '规格详细名称',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of specificationdetailed
-- ----------------------------
INSERT INTO `specificationdetailed` VALUES ('1', '200ml');
INSERT INTO `specificationdetailed` VALUES ('2', '400ml');

-- ----------------------------
-- Table structure for specificationrelation
-- ----------------------------
DROP TABLE IF EXISTS `specificationrelation`;
CREATE TABLE `specificationrelation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `specificationSku` varchar(200) DEFAULT NULL COMMENT '规格关系_JSON形式(specificationTopic,specificationDetailed)',
  `commodityId` int(11) DEFAULT NULL COMMENT '商品id_外键',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of specificationrelation
-- ----------------------------
INSERT INTO `specificationrelation` VALUES ('1', '{\"topicId\":1,\"detailedId\":[1,2]}', '1');
INSERT INTO `specificationrelation` VALUES ('2', '{\"topicId\":1,\"detailedId\":[1,2]}', '2');
INSERT INTO `specificationrelation` VALUES ('3', '{\"topicId\":1,\"detailedId\":[1,2]}', '3');

-- ----------------------------
-- Table structure for specificationtopic
-- ----------------------------
DROP TABLE IF EXISTS `specificationtopic`;
CREATE TABLE `specificationtopic` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `topicName` varchar(10) DEFAULT NULL COMMENT '规格标题名称',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of specificationtopic
-- ----------------------------
INSERT INTO `specificationtopic` VALUES ('1', '大小');

-- ----------------------------
-- Table structure for statistics
-- ----------------------------
DROP TABLE IF EXISTS `statistics`;
CREATE TABLE `statistics` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `statisticsCreateTime` datetime DEFAULT NULL COMMENT '记录时间',
  `statisticsTypeId` int(11) DEFAULT NULL COMMENT '统计类型_外键',
  `commodityId` int(11) DEFAULT NULL COMMENT '商品id_外键',
`statisticsNumber` int(11) DEFAULT NULL COMMENT '商品数量',
  `financePrice` decimal(10,2) DEFAULT NULL COMMENT '财务金额',
  `financeTypeId` int(11) DEFAULT NULL COMMENT '财务类型',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of statistics
-- ----------------------------

-- ----------------------------
-- Table structure for statisticstype
-- ----------------------------
DROP TABLE IF EXISTS `statisticstype`;
CREATE TABLE `statisticstype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `statisticsTypeName` varchar(20) DEFAULT NULL COMMENT '统计类型名称',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of statisticstype
-- ----------------------------
INSERT INTO `statisticstype` VALUES ('1', '进货');
INSERT INTO `statisticstype` VALUES ('2', '退货');
INSERT INTO `statisticstype` VALUES ('3', '卖出');

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `supplierName` varchar(20) DEFAULT NULL COMMENT '供应商名称',
  `supplierPhone` varchar(11) DEFAULT NULL COMMENT '供应商电话',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userName` varchar(20) DEFAULT NULL COMMENT '用户名称',
  `userAccount` varchar(20) DEFAULT NULL COMMENT '用户登录账号',
  `userPassword` varchar(10) DEFAULT NULL COMMENT '用户登录密码',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- 创建 消息表
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`(
  `id` INT UNIQUE AUTO_INCREMENT COMMENT '主键id',
  `messageTitle` VARCHAR (50) COMMENT '消息标题',
  `messageContent` VARCHAR (200) COMMENT '消息内容',
  `messageStatus` INT COMMENT '消息状态 1:已读 2:未读',
  `messageTypeId` INT COMMENT '消息类型',
  `messageCreateTime` DATETIME COMMENT '消息创建时间'
)CHARSET 'utf8';
-- 创建 消息类型表
DROP TABLE IF EXISTS `messageType`;
CREATE TABLE `messageType`(
  `id` INT UNIQUE AUTO_INCREMENT COMMENT '主键id',
  `messageTypeName` VARCHAR (20) COMMENT '消息类型名称'
)CHARSET 'utf8';
INSERT INTO messageType(messageTypeName)
    VALUES('后台消息'),('库存预警'),('系统消息')


