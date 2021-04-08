--student info
CREATE TABLE `hms_student_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'PR Key',
  `name` varchar(32) NOT NULL COMMENT '姓名',
  `age` int(11) NOT NULL COMMENT '年龄',
  `gender` tinyint(1) NOT NULL COMMENT '性别， 0：男，1：女',
  `class_id` int(11) NOT NULL DEFAULT -1 COMMENT '班级id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `creator` bigint(20) NOT NULL DEFAULT -1 COMMENT '创建者',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `updater` bigint(20) NOT NULL DEFAULT -1 COMMENT '更新者',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '版本',
  PRIMARY KEY (`id`),
  KEY `IDX_NAME` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表';

INSERT INTO `hms_student_info` (`name`, `age`, `gender`, `class_id`, `create_time`, `creator`, `update_time`, `updater`, `version`)
VALUES
	('李逍遥', 17, 0, 1, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('赵灵儿', 16, 1, 1, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('林月如', 16, 1, 1, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('阿奴', 15, 1, 2, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('唐钰小宝', 16, 0, 2, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('刘晋元', 18, 0, 3, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('彩衣', 17, 1, 3, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('酒剑仙', 18, 0, 4, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('景天', 18, 0, 5, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('唐雪见', 18, 1, 5, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('徐长卿', 18, 0, 6, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('紫萱', 18, 1, 6, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('龙葵', 17, 1, 5, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('许茂山', 19, 0, 7, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0);


--class info
CREATE TABLE `hms_class_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'PR Key',
  `grade` int(11) NOT NULL COMMENT '年级, 0:高一，1：高二，2：高三',
  `class_name` varchar(32) NOT NULL COMMENT '班级名称',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `creator` bigint(20) NOT NULL DEFAULT -1 COMMENT '创建者',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `updater` bigint(20) NOT NULL DEFAULT -1 COMMENT '更新者',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '版本',
  PRIMARY KEY (`id`),
  KEY `IDX_NAME` (`class_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='班级信息表';

INSERT INTO `hms_class_info` (`grade`, `class_name`, `create_time`, `creator`, `update_time`, `updater`, `version`)
VALUES
	(0, '高一1班', '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	(0, '高一2班', '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	(1, '高二1班', '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	(1, '高二2班', '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	(1, '高二3班', '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	(2, '高三1班', '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	(2, '高三2班', '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	(2, '高三3班', '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0);


--teacher info
CREATE TABLE `hms_teacher_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'PR Key',
  `name` varchar(32) NOT NULL COMMENT '姓名',
  `age` int(11) NOT NULL COMMENT '年龄',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `creator` bigint(20) NOT NULL DEFAULT -1 COMMENT '创建者',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `updater` bigint(20) NOT NULL DEFAULT -1 COMMENT '更新者',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '版本',
  PRIMARY KEY (`id`),
  KEY `IDX_NAME` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='班级信息表';

INSERT INTO `hms_teacher_info` (`name`, `age`, `create_time`, `creator`, `update_time`, `updater`, `version`)
VALUES
	('梅长苏', 32, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('萧景琰', 35, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('蒙挚', 45, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('霓凰', 30, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('言豫津', 28, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('飞流', 22, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('秦般弱', 34, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0),
	('言阙', 55, '2021-03-24 14:00:00', -1, '2021-03-24 14:00:00', -1, 0);
