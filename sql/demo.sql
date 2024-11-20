/*
 Navicat Premium Dump SQL

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 80039 (8.0.39)
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 80039 (8.0.39)
 File Encoding         : 65001

 Date: 04/09/2024 08:55:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '百战程序员', '男', '北京');
INSERT INTO `student` VALUES (2, '北京尚学堂', '女', '北京');

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- Records of laundry_device
-- ----------------------------
DROP TABLE IF EXISTS `laundry_device`;
create table demo.laundry_device
(
    id            int auto_increment
        primary key,
    device_name   varchar(50)               not null comment '设备名称',
    device_status varchar(5) default '空闲' not null comment '设备状态：空闲、工作',
    start_time    datetime                  null comment '设备使用的开始时间',
    end_time      datetime                  null comment '结束使用时间',
    student_id    int                       null comment '学生ID',
    student_name  varchar(50)               null comment '学生姓名'
)
    comment '洗衣房设备';
INSERT INTO demo.laundry_device (id, device_name, device_status, start_time, end_time, student_name, student_room) VALUES (1, '左侧烘干机', '空闲', null, null, null, null);
INSERT INTO demo.laundry_device (id, device_name, device_status, start_time, end_time, student_name, student_room) VALUES (2, '右侧烘干机', '空闲', null, null, null, null);
INSERT INTO demo.laundry_device (id, device_name, device_status, start_time, end_time, student_name, student_room) VALUES (3, '左侧洗衣机', '空闲', null, null, null, null);
INSERT INTO demo.laundry_device (id, device_name, device_status, start_time, end_time, student_name, student_room) VALUES (4, '右侧洗衣机', '空闲', null, null, null, null);

-- ----------------------------
-- Records of laundry_device
-- ----------------------------
DROP TABLE IF EXISTS `laundry_device_logs`;
create table demo.laundry_device_logs
(
    id           int auto_increment
        primary key,
    device_id    int          not null comment '设备ID',
    device_name  varchar(50)  null comment '设备名称',
    start_time   datetime     not null comment '开始使用时间',
    end_time     datetime     not null comment '结束使用时间',
    student_name varchar(20)  not null comment '学生名称',
    student_room varchar(200) null
)
    comment '洗衣房设备记录';

create index idx_device_name
    on demo.laundry_device_logs (device_name);



