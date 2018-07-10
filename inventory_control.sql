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

/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : inventory_control

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-06-14 10:32:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `commodityName` varchar(20) DEFAULT NULL COMMENT '商品名称',
  `commodityIntroduce` varchar(200) DEFAULT NULL COMMENT '商品介绍',
  `supplierId` int(11) DEFAULT -1 COMMENT '供应商id',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('1', '红葡萄酒', '贺兰山东麓L7橡木红葡萄酒',2);
INSERT INTO `commodity` VALUES ('2', '拉菲红酒', '法国原瓶进口拉菲雾禾山谷干红葡萄酒',2);
INSERT INTO `commodity` VALUES ('3', '瓦伦丁', '德国进口小麦啤酒',2);

-- ----------------------------
-- Table structure for commodityinventory
-- ----------------------------
DROP TABLE IF EXISTS `commodityinventory`;
CREATE TABLE `commodityinventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `commodityNumber` int(11) DEFAULT NULL COMMENT '商品数量',
  `commoditySecurityLine` int(11) DEFAULT NULL COMMENT '商品数量警戒值',
  `commodityPrice` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
  `commoditySku` varchar(200) DEFAULT NULL COMMENT '库存规格关系_数组关系',
  `commodityId` int(11) DEFAULT NULL COMMENT '商品id_外键',
  `commodityCreateTime` DATETIME DEFAULT NOW() COMMENT '商品创建时间',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodityinventory
-- ----------------------------
INSERT INTO `commodityinventory` VALUES ('1', '20', '5', '200.00', '1', '1',default );
INSERT INTO `commodityinventory` VALUES ('2', '40', '10', '300.00', '2', '2',default );
INSERT INTO `commodityinventory` VALUES ('3', '20', '5', '500.00', '1', '3',default );

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
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `messageTitle` varchar(50) DEFAULT NULL COMMENT '消息标题',
  `messageContent` varchar(200) DEFAULT NULL COMMENT '消息内容',
  `messageStatus` int(11) DEFAULT NULL COMMENT '消息状态 1:已读 2:未读',
  `messageTypeId` int(11) DEFAULT NULL COMMENT '消息类型',
  `messageCreateTime` datetime DEFAULT NULL COMMENT '消息创建时间',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for messagetype
-- ----------------------------
DROP TABLE IF EXISTS `messagetype`;
CREATE TABLE `messagetype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `messageTypeName` varchar(20) DEFAULT NULL COMMENT '消息类型名称',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of messagetype
-- ----------------------------

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
  `specificationTopicId` int(11) DEFAULT NULL COMMENT '规格标题id',
  `specificationDetailedId` int(11) DEFAULT NULL COMMENT '规格详细id',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of specificationrelation
-- ----------------------------
INSERT INTO `specificationrelation` VALUES ('1',1 , 1);
INSERT INTO `specificationrelation` VALUES ('2', 1, 2);

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
  `commodityInventoryId` int(11) DEFAULT NULL COMMENT '库存id',
  `financePrice` decimal(10,2) DEFAULT NULL COMMENT '财务金额',
  `financeTypeId` int(11) DEFAULT NULL COMMENT '财务类型',
  `statisticsNumber` int(11) DEFAULT NULL COMMENT '数量',
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
  `supplierName` varchar(50) DEFAULT NULL COMMENT '供应商名称',
  `supplierPhone` varchar(11) DEFAULT NULL COMMENT '供应商电话',
  `supplierRemark` varchar(200) DEFAULT '暂时没有介绍' '供应商介绍',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier`(supplierName, supplierPhone, supplierRemark)
VALUES('哇哈哈食品有限公司','123456789',default),('康师傅食品有限公司','123456789',default);

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
INSERT INTO `user`(userName, userAccount, userPassword)
VALUES('admin','admin','123456')

DROP TABLE IF EXISTS `operationLog`;
CREATE TABLE `operationLog`(
  `id` INT AUTO_INCREMENT UNIQUE COMMENT '操作日志编号',
  `operationUserName` VARCHAR(20) COMMENT '操作人名称',
  `operationModel` VARCHAR(20) COMMENT '操作模块',
  `operationModelAction` VARCHAR(50) COMMENT '操作模块动作',
  `operationDescribe` VARCHAR(2000) COMMENT '操作描述',
  `operationCreateTime` DATETIME COMMENT '操作日期'
)