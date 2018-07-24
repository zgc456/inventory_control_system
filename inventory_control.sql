/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : inventory_control

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-07-24 15:20:54
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
  `supplierId` int(11) DEFAULT '-1' COMMENT '供应商id',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('1', '红葡萄酒', '贺兰山东麓L7橡木红葡萄酒', '2');
INSERT INTO `commodity` VALUES ('2', '拉菲红酒', '法国原瓶进口拉菲雾禾山谷干红葡萄酒', '2');
INSERT INTO `commodity` VALUES ('3', '瓦伦丁', '德国进口小麦啤酒', '2');

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
  `commodityCreateTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '商品创建时间',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodityinventory
-- ----------------------------
INSERT INTO `commodityinventory` VALUES ('1', '20', '5', '200.00', '1', '1', '2018-07-16 18:52:58');
INSERT INTO `commodityinventory` VALUES ('2', '40', '10', '300.00', '2', '2', '2018-07-16 18:52:58');
INSERT INTO `commodityinventory` VALUES ('3', '20', '5', '500.00', '1', '3', '2018-07-16 18:52:58');

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
  `messageStatus` int(11) DEFAULT NULL COMMENT '消息状态 1:已处理 2:未处理',
  `messageTypeId` int(11) DEFAULT NULL COMMENT '消息类型',
  `messageCreateTime` datetime DEFAULT NULL COMMENT '消息创建时间',
  `sendMessageName` varchar(50) DEFAULT NULL COMMENT '发送消息人',
  `messageToken` varchar(50) DEFAULT NULL COMMENT '发送  消息的标识用来回掉',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '发货', '1', '1', '1', '2018-07-10 02:47:18', '1', '1');
INSERT INTO `message` VALUES ('2', '退货', '2', '2', '2', '2018-07-10 02:47:33', '2', '2');
INSERT INTO `message` VALUES ('3', '发货', '1', '1', '2', '2018-07-16 08:44:40', '1', '1');

-- ----------------------------
-- Table structure for operationlog
-- ----------------------------
DROP TABLE IF EXISTS `operationlog`;
CREATE TABLE `operationlog` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '操作日志编号',
  `operationUserName` varchar(20) DEFAULT NULL COMMENT '操作人名称',
  `operationModel` varchar(20) DEFAULT NULL COMMENT '操作模块',
  `operationModelAction` varchar(50) DEFAULT NULL COMMENT '操作模块动作',
  `operationDescribe` varchar(2000) DEFAULT NULL COMMENT '操作描述',
  `operationCreateTime` datetime DEFAULT NULL COMMENT '操作日期',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operationlog
-- ----------------------------
INSERT INTO `operationlog` VALUES ('1', 'admin', '消息审核', '发货', '审核通过', '2018-07-16 18:58:15');
INSERT INTO `operationlog` VALUES ('2', 'admin', '消息审核', '发货', '审核通过', '2018-07-16 18:58:38');

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of specificationrelation
-- ----------------------------
INSERT INTO `specificationrelation` VALUES ('1', '1', '1');
INSERT INTO `specificationrelation` VALUES ('2', '1', '2');

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of statistics
-- ----------------------------
INSERT INTO `statistics` VALUES ('1', '2018-06-14 02:41:07', '1', '1', '1.00', '1', '1');
INSERT INTO `statistics` VALUES ('2', '2018-06-14 16:30:55', '2', '2', '2.00', '2', '2');
INSERT INTO `statistics` VALUES ('3', '2018-06-25 07:00:05', '1', '1', '23.00', '1', '2');
INSERT INTO `statistics` VALUES ('4', '2018-06-25 07:00:18', '1', '1', '1.00', '1', '1');
INSERT INTO `statistics` VALUES ('5', '2018-06-26 00:26:42', '1', '1', '1.00', '2', '1');
INSERT INTO `statistics` VALUES ('6', '2018-06-26 00:27:01', '1', '1', '1.00', '1', '1');

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
  `supplierRemark` varchar(200) DEFAULT '暂时没有介绍供应商介绍',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', '哇哈哈食品有限公司', '123456789', '暂时没有介绍供应商介绍');
INSERT INTO `supplier` VALUES ('2', '康师傅食品有限公司', '123456789', '暂时没有介绍供应商介绍');

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '123456');

-- ----------------------------
-- Table structure for warningcommodity
-- ----------------------------
DROP TABLE IF EXISTS `warningcommodity`;
CREATE TABLE `warningcommodity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodityName` varchar(20) NOT NULL COMMENT '商品名称',
  `commoditySpecification` varchar(20) NOT NULL COMMENT '商品规格',
  `commodityCount` int(11) NOT NULL COMMENT '剩余数量\n',
  `commoditySupplier` varchar(20) NOT NULL COMMENT '商品供应商\n',
  `commodityWaitCount` int(11) DEFAULT NULL COMMENT '进货数量',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `commodityState` int(11) NOT NULL COMMENT '审核状态 1已提交 2未处理',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='库存预警信息表';

-- ----------------------------
-- Records of warningcommodity
-- ----------------------------
INSERT INTO `warningcommodity` VALUES ('1', '1', '1', '1', '1', '1', '2018-07-24 01:10:23', '1');
