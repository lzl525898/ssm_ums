/*
Navicat MySQL Data Transfer

Source Server         : zkfdbbs
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : smart

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2018-02-27 14:51:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '地址id',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `username` varchar(255) DEFAULT NULL COMMENT '用户姓名',
  `province` varchar(255) DEFAULT NULL COMMENT '省',
  `city` varchar(255) DEFAULT NULL COMMENT '市',
  `area` varchar(255) DEFAULT NULL COMMENT '区',
  `detail` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `phone` bigint(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `qq` bigint(20) DEFAULT NULL COMMENT 'QQ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------

-- ----------------------------
-- Table structure for answer_praise
-- ----------------------------
DROP TABLE IF EXISTS `answer_praise`;
CREATE TABLE `answer_praise` (
  `id` bigint(20) DEFAULT NULL COMMENT '课程问题回复点赞表主键',
  `answer_id` bigint(20) NOT NULL COMMENT '课程问题回复的Id',
  `user_id` bigint(20) NOT NULL COMMENT '点赞者id',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '点赞状态 1已点赞 0未点赞',
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`answer_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answer_praise
-- ----------------------------

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '教材名字',
  `url` varchar(255) DEFAULT NULL COMMENT '教材URL',
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------

-- ----------------------------
-- Table structure for camp
-- ----------------------------
DROP TABLE IF EXISTS `camp`;
CREATE TABLE `camp` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '名字',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机',
  `time` varchar(255) DEFAULT NULL COMMENT '报名时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of camp
-- ----------------------------

-- ----------------------------
-- Table structure for exam_result
-- ----------------------------
DROP TABLE IF EXISTS `exam_result`;
CREATE TABLE `exam_result` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) unsigned DEFAULT NULL COMMENT '用户ID',
  `courseId` bigint(20) DEFAULT NULL COMMENT '课程Id',
  `menuId` bigint(20) DEFAULT NULL COMMENT '目录ID',
  `result` text COMMENT '结果',
  `score` int(11) DEFAULT NULL COMMENT '星',
  `rightNum` int(11) DEFAULT NULL COMMENT '正确数',
  `time` varchar(255) DEFAULT NULL COMMENT '提交时间',
  PRIMARY KEY (`id`),
  KEY `userId` (`userId`) USING BTREE,
  KEY `menuId` (`menuId`) USING BTREE,
  CONSTRAINT `menuId` FOREIGN KEY (`menuId`) REFERENCES `tw_coursemenu` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `userId` FOREIGN KEY (`userId`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_result
-- ----------------------------

-- ----------------------------
-- Table structure for exam_result_my
-- ----------------------------
DROP TABLE IF EXISTS `exam_result_my`;
CREATE TABLE `exam_result_my` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) DEFAULT NULL COMMENT '用户Id',
  `menuId` bigint(20) DEFAULT NULL COMMENT '目录Id',
  `titleId` bigint(20) unsigned DEFAULT NULL COMMENT '问题Id',
  `myAnswer` varchar(255) DEFAULT NULL COMMENT '我的答案',
  `isRight` int(4) DEFAULT NULL COMMENT '是否正确 1正确 0不正确',
  PRIMARY KEY (`id`),
  KEY `titleId` (`titleId`),
  CONSTRAINT `titleId` FOREIGN KEY (`titleId`) REFERENCES `tasktitle` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_result_my
-- ----------------------------

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '年级名字',
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', '小班', '2018-01-09 17:10:03');
INSERT INTO `grade` VALUES ('2', '中班', '2018-01-09 17:10:05');
INSERT INTO `grade` VALUES ('3', '大班', '2018-01-09 17:10:07');
INSERT INTO `grade` VALUES ('4', '一年级', '2018-01-09 17:10:10');
INSERT INTO `grade` VALUES ('5', '二年级', '2018-01-09 17:14:00');
INSERT INTO `grade` VALUES ('6', '三年级', '2018-01-09 17:14:02');
INSERT INTO `grade` VALUES ('7', '四年级', '2018-01-09 17:14:03');
INSERT INTO `grade` VALUES ('8', '五年级', '2018-01-09 17:14:06');
INSERT INTO `grade` VALUES ('9', '六年级', '2018-01-09 17:14:08');

-- ----------------------------
-- Table structure for image_manage
-- ----------------------------
DROP TABLE IF EXISTS `image_manage`;
CREATE TABLE `image_manage` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `imagePath` varchar(255) DEFAULT NULL COMMENT '轮播图片路径',
  `description` varchar(255) DEFAULT NULL COMMENT '轮播图片描述',
  `flag` int(10) DEFAULT NULL COMMENT '0首页 1线下 2线上 3教师专用',
  `url` varchar(255) DEFAULT NULL COMMENT '跳转URL',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of image_manage
-- ----------------------------
INSERT INTO `image_manage` VALUES ('19', 'uploadfile/images/logoImages/1499215407446.jpg', '首页轮播', '0', 'welcome');
INSERT INTO `image_manage` VALUES ('20', 'uploadfile/images/logoImages/1499215418269.jpg', '线下轮播', '1', null);
INSERT INTO `image_manage` VALUES ('21', 'uploadfile/images/logoImages/1499215413887.jpg', '线上轮播', '2', null);
INSERT INTO `image_manage` VALUES ('22', 'uploadfile/images/logoImages/1499648872900.png', '首页轮播', '0', 'camp');
INSERT INTO `image_manage` VALUES ('23', 'uploadfile/images/logoImages/1499649243438.jpg', '首页轮播', '0', 'onlineClass');
INSERT INTO `image_manage` VALUES ('24', 'uploadfile/images/logoImages/1504486803491.png', '教师专用', '3', 'registerUserTeacher');

-- ----------------------------
-- Table structure for integrationdetail
-- ----------------------------
DROP TABLE IF EXISTS `integrationdetail`;
CREATE TABLE `integrationdetail` (
  `detailId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '积分明细表主键id',
  `duserId` bigint(20) DEFAULT NULL COMMENT '用户主键id',
  `integrationNum` int(10) DEFAULT NULL COMMENT '积分数量',
  `integrationType` varchar(5) DEFAULT NULL COMMENT '积分类型 TODO 待定 0:邮箱绑定 1:手机绑定 2:作品分享3:注册积分',
  `dcreateTime` varchar(100) DEFAULT NULL COMMENT '具体时间',
  `dcreateMan` bigint(20) DEFAULT NULL COMMENT '0:代表系统发放 1代表人发放',
  `dxdetail` text COMMENT '详细说明来源',
  PRIMARY KEY (`detailId`)
) ENGINE=InnoDB AUTO_INCREMENT=352 DEFAULT CHARSET=utf8 COMMENT='积分明细信息表';

-- ----------------------------
-- Records of integrationdetail
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `menuName` varchar(255) DEFAULT NULL COMMENT '系统菜单名称',
  `menuPath` varchar(255) DEFAULT NULL COMMENT '系统菜单路径',
  `menuImage` varchar(255) DEFAULT NULL COMMENT '系统菜单图片',
  `menuLvl` int(11) DEFAULT NULL COMMENT '系统菜单等级 1是顶级菜单 2是下级菜单',
  `parentMenuId` int(11) DEFAULT NULL COMMENT '上一级菜单Id 0是顶级菜单',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `createUserId` int(11) DEFAULT NULL COMMENT '创建用户',
  `isDisPlay` int(11) DEFAULT NULL COMMENT '是否显示 1是显示 0是不显示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '系统管理', null, null, '1', '0', null, null, '1');
INSERT INTO `menu` VALUES ('3', '用户管理', 'user/userManage', null, '2', '1', null, null, '1');
INSERT INTO `menu` VALUES ('4', '菜单管理', 'menu/menuManage', null, '2', '1', null, null, '1');
INSERT INTO `menu` VALUES ('9', '新增用户', 'user/addUser', null, '2', '1', null, null, '1');
INSERT INTO `menu` VALUES ('17', '作品管理', '', null, '1', '0', null, null, '1');
INSERT INTO `menu` VALUES ('18', '作品类型管理', 'twwt/twwtManage', null, '2', '17', null, null, '1');
INSERT INTO `menu` VALUES ('19', '作品管理', 'tww/twwManage', null, '2', '17', null, null, '1');
INSERT INTO `menu` VALUES ('21', '作品评论管理', 'twc/twcManage', null, '2', '17', null, null, '1');
INSERT INTO `menu` VALUES ('22', '作品评论回复管理', 'twrc/twrcManage', null, '2', '17', null, null, '1');
INSERT INTO `menu` VALUES ('24', '线上课程管理', '', null, '1', '0', null, null, '1');
INSERT INTO `menu` VALUES ('25', '课程管理', 'twcourse/twcourseManage', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('26', '科目管理', 'twcoursetype/twcoursetypeManage', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('27', '网站管理', '', null, '1', '0', null, null, '1');
INSERT INTO `menu` VALUES ('28', '通知中心', 'twnews/newsManage', null, '2', '27', null, null, '1');
INSERT INTO `menu` VALUES ('29', '资讯类型', 'twnewsType/newsTypeManage', null, '2', '27', null, null, '1');
INSERT INTO `menu` VALUES ('30', '图片管理', 'image/imageManage', null, '2', '27', null, null, '1');
INSERT INTO `menu` VALUES ('37', '意见反馈', 'opinion/showAdvice', null, '2', '27', null, null, '1');
INSERT INTO `menu` VALUES ('38', '课程购买历史记录管理', 'twhistory/historyManage', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('39', '课程目录管理', 'coursemenu/courseList', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('40', '课程资料管理', 'materials/showAll', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('41', '课程资料种类管理', 'materialstype/showAll', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('42', '后台消息管理', 'syspromptm/syspromptmManage', null, '2', '35', null, null, '1');
INSERT INTO `menu` VALUES ('43', '课程视频管理', 'video/videoManager', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('44', '作业管理', '', null, '1', '0', null, null, '1');
INSERT INTO `menu` VALUES ('45', '题库管理', 'task/selectAll', null, '2', '44', null, null, '1');
INSERT INTO `menu` VALUES ('46', '配置管理', 'sys/config', null, '2', '1', null, null, '1');
INSERT INTO `menu` VALUES ('50', '知识地图管理', 'twcourse/mapManage', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('51', '新闻管理', 'indexNews/indexNewsManage', null, '2', '27', null, null, '1');
INSERT INTO `menu` VALUES ('52', '线下课程购买记录管理', 'offline/historyManage', null, '2', '47', null, null, '1');
INSERT INTO `menu` VALUES ('53', '课程体验', 'courseIndex/manage', null, '2', '27', null, null, '1');
INSERT INTO `menu` VALUES ('55', '报名管理', 'camp/signUp', null, '2', '54', null, null, '1');
INSERT INTO `menu` VALUES ('56', '教师管理', '', null, '1', '0', null, null, '1');
INSERT INTO `menu` VALUES ('57', '教师资源', 'teacherResource/list', null, '2', '56', null, null, '1');
INSERT INTO `menu` VALUES ('58', '学段管理', 'period/periodManage', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('59', '年级管理', 'grade/gradeManage', null, '2', '24', null, null, '1');
INSERT INTO `menu` VALUES ('60', '学校管理', 'school/schoolManage', null, '2', '24', null, null, '1');

-- ----------------------------
-- Table structure for offline_course
-- ----------------------------
DROP TABLE IF EXISTS `offline_course`;
CREATE TABLE `offline_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程id',
  `cName` varchar(50) DEFAULT NULL COMMENT '课程名称',
  `cType_id` bigint(20) DEFAULT NULL COMMENT '课程所属类型',
  `cTime` varchar(255) DEFAULT NULL COMMENT '上课时间',
  `cPrice` varchar(11) DEFAULT NULL COMMENT '课程价格',
  `cPriceAfter` varchar(11) DEFAULT NULL,
  `cDesc` text COMMENT '课程详情',
  `cPicPath` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `cCreateTime` varchar(50) DEFAULT NULL COMMENT '课程创建时间',
  `cCity` varchar(255) DEFAULT NULL COMMENT '开课城市',
  `cIntro` varchar(80) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '课程简介',
  `fitPeople` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '适用人群',
  `cStatus` int(4) DEFAULT NULL COMMENT '0进行中 1已结束',
  `cDetailNotice` text COMMENT '课程须知',
  `nextTime` varchar(255) DEFAULT NULL COMMENT '下一次上课时间',
  `classPlace` varchar(255) DEFAULT NULL COMMENT '上课地点',
  `hours` int(11) DEFAULT NULL COMMENT '总课时',
  `learnHours` int(11) DEFAULT NULL COMMENT '已学课时',
  PRIMARY KEY (`id`),
  KEY `cType_id` (`cType_id`),
  CONSTRAINT `offline_course_ibfk_1` FOREIGN KEY (`cType_id`) REFERENCES `tw_coursetype` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of offline_course
-- ----------------------------

-- ----------------------------
-- Table structure for offline_course_signup
-- ----------------------------
DROP TABLE IF EXISTS `offline_course_signup`;
CREATE TABLE `offline_course_signup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '报到id',
  `parentId` bigint(20) DEFAULT NULL COMMENT '父母Id',
  `schooltime` varchar(50) DEFAULT NULL COMMENT '上课时间',
  `stuName` varchar(10) DEFAULT NULL COMMENT '学生姓名',
  `olCourse_id` bigint(20) DEFAULT NULL COMMENT '线下课程id',
  `stuGrade` varchar(10) DEFAULT NULL COMMENT '学生年级',
  `stuPhone` varchar(20) DEFAULT NULL COMMENT '学生联系电话',
  `stuAddress` varchar(255) DEFAULT NULL COMMENT '家庭地址',
  `isPay` int(1) DEFAULT NULL COMMENT '是否支付课程费用,',
  `amount` int(11) DEFAULT NULL COMMENT '支付金额',
  `outTradeNo` varchar(24) DEFAULT '' COMMENT '订单号',
  PRIMARY KEY (`id`),
  KEY `olCourse_id` (`olCourse_id`) USING BTREE,
  CONSTRAINT `offline_course_signup_ibfk_1` FOREIGN KEY (`olCourse_id`) REFERENCES `offline_course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of offline_course_signup
-- ----------------------------

-- ----------------------------
-- Table structure for period
-- ----------------------------
DROP TABLE IF EXISTS `period`;
CREATE TABLE `period` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '学段名字',
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of period
-- ----------------------------
INSERT INTO `period` VALUES ('1', '幼儿园', '2018-01-09 17:10:03');
INSERT INTO `period` VALUES ('2', '小学', '2018-01-09 17:10:05');
INSERT INTO `period` VALUES ('3', '初中', '2018-01-09 17:10:07');
INSERT INTO `period` VALUES ('4', '高中', '2018-01-09 17:10:10');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `permission_name` varchar(32) DEFAULT NULL COMMENT '权限名',
  `permission_sign` varchar(128) DEFAULT NULL COMMENT '权限标识,程序中判断使用,如"user:create"',
  `description` varchar(256) DEFAULT NULL COMMENT '权限描述,UI界面显示使用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='权限表';

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '用户新增', 'user:create', null);

-- ----------------------------
-- Table structure for phone_vercode
-- ----------------------------
DROP TABLE IF EXISTS `phone_vercode`;
CREATE TABLE `phone_vercode` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL COMMENT '验证码',
  `phone` bigint(20) DEFAULT NULL COMMENT '手机号',
  `type` int(1) DEFAULT NULL COMMENT '1注册 2忘记密码 3更换绑定手机',
  `starttime` bigint(20) DEFAULT NULL COMMENT '开始时间',
  `endtime` bigint(20) DEFAULT NULL COMMENT '失效时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of phone_vercode
-- ----------------------------

-- ----------------------------
-- Table structure for question_praise
-- ----------------------------
DROP TABLE IF EXISTS `question_praise`;
CREATE TABLE `question_praise` (
  `id` bigint(20) NOT NULL COMMENT '课程问题点赞表主键',
  `question_id` bigint(20) NOT NULL COMMENT '课程问题Id',
  `user_id` bigint(20) NOT NULL COMMENT '点赞者id',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '点赞状态 1已点赞 0未点赞',
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`question_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question_praise
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(32) DEFAULT NULL COMMENT '角色名',
  `role_sign` varchar(128) DEFAULT NULL COMMENT '角色标识,程序中判断使用,如"admin"',
  `description` varchar(256) DEFAULT NULL COMMENT '角色描述,UI界面显示使用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='角色表';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', 'admin', '系统的管理员');
INSERT INTO `role` VALUES ('2', '已注册学员', 'registeredparticipants', '已经注册过的学员，指的是学习的学生');
INSERT INTO `role` VALUES ('4', '已缴费学员', 'havetoexpendstudents', '已经缴费的学员，指的是学生能够观看付费的教学视频');
INSERT INTO `role` VALUES ('5', '教师', 'teachers', '是指可以上传教学视频的人员');
INSERT INTO `role` VALUES ('6', '助教', 'ta', '是指教师的帮手');
INSERT INTO `role` VALUES ('7', '游客', 'tourists', '是指没有注册过的、没有缴费的，或者是用第三方登录的用户');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '角色权限关联表主键',
  `role_id` bigint(20) unsigned DEFAULT NULL COMMENT '角色Id',
  `permission_id` bigint(20) unsigned DEFAULT NULL COMMENT '权限Id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='角色与权限关联表';

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1', '1');
INSERT INTO `role_permission` VALUES ('2', '2', '1');
INSERT INTO `role_permission` VALUES ('3', '5', '1');

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `room_name` varchar(20) DEFAULT NULL COMMENT '教室名称',
  `teacher_id` bigint(20) DEFAULT NULL COMMENT '教师id',
  `course_id` bigint(20) DEFAULT NULL COMMENT '课程id',
  `room_num` int(11) DEFAULT '1000' COMMENT '教室座位数',
  `stu_num` int(11) DEFAULT '0' COMMENT '已有学生人数',
  `share_code` varchar(10) DEFAULT NULL COMMENT '分享码',
  `period` int(11) DEFAULT NULL COMMENT '学段',
  `grade` int(11) DEFAULT NULL COMMENT '年级',
  `type` int(11) DEFAULT NULL COMMENT '备用',
  `book` int(255) DEFAULT '0' COMMENT '备用',
  `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------

-- ----------------------------
-- Table structure for school
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'school 自增id',
  `province` varchar(20) DEFAULT NULL COMMENT '省份名',
  `city` varchar(50) DEFAULT NULL COMMENT '城市名',
  `area` varchar(100) DEFAULT NULL COMMENT '区域名',
  `name` varchar(255) DEFAULT NULL COMMENT '学校名称',
  `createtime` date DEFAULT NULL COMMENT '创建学校时间',
  `updatetime` date DEFAULT NULL COMMENT '修改学校时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES ('4', '黑龙江省', '哈尔滨市', '道里区', '新桥小学', '2018-01-12', '2018-01-12');
INSERT INTO `school` VALUES ('5', '北京市', '北京市市辖区', '丰台区', '怡海实验小学', '2018-01-12', '2018-01-12');
INSERT INTO `school` VALUES ('6', '北京市', '北京市市辖区', '东城区', '测试小学', '2018-01-17', '2018-01-17');
INSERT INTO `school` VALUES ('7', '黑龙江省', '哈尔滨市', '道里区', '测试小学2', '2018-01-17', '2018-01-17');

-- ----------------------------
-- Table structure for scwork
-- ----------------------------
DROP TABLE IF EXISTS `scwork`;
CREATE TABLE `scwork` (
  `scId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '作品收藏点赞信息记录表主键',
  `scworkId` bigint(20) DEFAULT NULL COMMENT '作品Id',
  `scuserId` bigint(20) DEFAULT NULL COMMENT '收藏点赞者的Id',
  `sctime` varchar(200) DEFAULT NULL COMMENT '收藏点赞时间',
  `scstatus` tinyint(4) DEFAULT NULL COMMENT '收藏点赞状态(0是未收藏未点赞，1是收藏，2是点赞 ，3是已收藏已点赞)',
  `sctype` tinyint(4) DEFAULT NULL COMMENT '备用',
  PRIMARY KEY (`scId`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COMMENT='作品收藏记录信息表';

-- ----------------------------
-- Records of scwork
-- ----------------------------

-- ----------------------------
-- Table structure for sign
-- ----------------------------
DROP TABLE IF EXISTS `sign`;
CREATE TABLE `sign` (
  `signId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '签到信息记录表的主键',
  `signUserId` bigint(20) DEFAULT NULL COMMENT '签到者主键',
  `signTime` varchar(200) DEFAULT NULL COMMENT '签到时间',
  `signStatus` tinyint(4) DEFAULT '0' COMMENT '签到状态(0未签到 1已签到)',
  `signGoDays` int(11) DEFAULT '0' COMMENT '连续签到的天数',
  `signShareNumbers` int(11) DEFAULT '5' COMMENT '作品分享次数',
  `signCommentNumbers` int(11) DEFAULT '5' COMMENT '作品评论次数',
  `signuploadfileNumbers` int(11) DEFAULT '5' COMMENT '上传作品次数',
  `signNextIntergal` int(11) DEFAULT '0' COMMENT '下次签到可获得的积分',
  PRIMARY KEY (`signId`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8 COMMENT='签到信息记录表';

-- ----------------------------
-- Records of sign
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `room_id` bigint(20) NOT NULL COMMENT '教室id',
  `stu_id` bigint(20) unsigned NOT NULL COMMENT '学生id',
  `parent_id` bigint(20) NOT NULL COMMENT '父母id',
  `course_id` bigint(20) NOT NULL COMMENT '课程Id',
  `teacher_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '老师Id',
  `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`stu_id`,`course_id`,`teacher_id`),
  CONSTRAINT `stuUserId` FOREIGN KEY (`stu_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for stu_task
-- ----------------------------
DROP TABLE IF EXISTS `stu_task`;
CREATE TABLE `stu_task` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户Id',
  `task_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '作业Id',
  `url` varchar(255) NOT NULL COMMENT '作业文件路径',
  `checked` smallint(4) NOT NULL DEFAULT '0' COMMENT '老师是否检查0是未检查，1是已检查',
  `create_time` varchar(255) DEFAULT '' COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_task
-- ----------------------------

-- ----------------------------
-- Table structure for tasklib
-- ----------------------------
DROP TABLE IF EXISTS `tasklib`;
CREATE TABLE `tasklib` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '题库表主键',
  `name` varchar(255) DEFAULT NULL COMMENT '库名',
  `child` bigint(20) DEFAULT NULL COMMENT '子库数量',
  `time` varchar(255) DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tasklib
-- ----------------------------
INSERT INTO `tasklib` VALUES ('1', 'Scratch', '3', '2017-03-29 16:14:29');

-- ----------------------------
-- Table structure for tasktitle
-- ----------------------------
DROP TABLE IF EXISTS `tasktitle`;
CREATE TABLE `tasktitle` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '在线测试题目表主键',
  `courseid` bigint(20) DEFAULT NULL COMMENT '课程id',
  `menuid` bigint(20) DEFAULT NULL COMMENT '目录id',
  `score` int(20) DEFAULT NULL COMMENT '分值',
  `title` text COMMENT '题干',
  `answerA` text COMMENT '答案A',
  `answerB` text COMMENT '答案B',
  `answerC` text COMMENT '答案C',
  `answerD` text COMMENT '答案D',
  `answer` varchar(255) DEFAULT NULL COMMENT '正确答案',
  `aDesc` text COMMENT '答案解析',
  `type` int(2) DEFAULT NULL COMMENT '题目类型 1是选择题',
  `selectType` int(2) DEFAULT NULL COMMENT '1理论知识类 2编程操作类 3思维逻辑类',
  `time` varchar(255) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=210 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tasktitle
-- ----------------------------
INSERT INTO `tasktitle` VALUES ('8', '2', '15', '10', '<p><span style=\"font-family: 微软雅黑, sans-serif; font-size: 12px;\">角色进行移动，绘画，交互是在哪个区域？</span></p><p></p>', '<p><span style=\"font-size:12px\">A.舞台区</span></p>', '<p><span style=\"white-space: normal;font-size:12px\">B.角色区</span></p>', '<p><span style=\"white-space: normal;font-size:12px\">C.背景区</span></p>', '<p><span style=\"white-space: normal;font-size:12px\">D.脚本区</span></p>', 'A', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">舞台区用来展示角色和背景，角色区用来展示角色，背景区用来显示背景，脚本区用来编写程序</span></p>', '1', '1', '2017-06-20 15:01:30');
INSERT INTO `tasktitle` VALUES ('9', '2', '15', '10', '<p><span style=\"font-family: 微软雅黑, sans-serif; font-size: 12px;\">为某个角色编写程序是在哪个区域？</span></p>', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">A.舞台区</span></p>', '<p><span style=\"font-family: 微软雅黑, sans-serif; white-space: normal;font-size:12px\">B.角色区</span></p>', '<p><span style=\"font-family: 微软雅黑, sans-serif; white-space: normal;font-size:12px\">C.背景区</span></p>', '<p><span style=\"font-family: 微软雅黑, sans-serif; white-space: normal;font-size:12px\">D.脚本区</span></p>', 'D', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">舞台区用来展示角色和背景，角色区用来展示角色，背景区用来显示背景，脚本区用来编写程序</span></p>', '1', '1', '2017-06-20 15:01:37');
INSERT INTO `tasktitle` VALUES ('10', '2', '15', '10', '<p><span style=\"font-family: 微软雅黑, sans-serif; font-size: 12px;\">舞台区的宽和高各是多少？</span></p>', '<p><span style=\"font-size:12px\">A.480cm、360cm</span></p>', '<p><span style=\"white-space: normal;font-size:12px\">B.360cm、480cm</span></p>', '<p><span style=\"white-space: normal;font-size:12px\">C.480步、360步</span></p>', '<p><span style=\"white-space: normal;font-size:12px\">D.360步、480步</span></p>', 'C', '<p><span style=\"font-size:12px\"><span style=\"font-family: 微软雅黑, sans-serif;\">舞台宽度为</span><span style=\"font-family: Tahoma, sans-serif;\">480</span><span style=\"font-family: 微软雅黑, sans-serif;\">步长、高为</span><span style=\"font-family: Tahoma, sans-serif;\">360</span><span style=\"font-family: 微软雅黑, sans-serif;\">步长</span></span></p>', '1', '1', '2017-06-20 15:01:44');
INSERT INTO `tasktitle` VALUES ('35', '2', '15', '10', '<p><span style=\"font-family: 微软雅黑, sans-serif; font-size: 12px;\">在角色区中从素材库选取指定角色的按钮是哪个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/67081496644696047.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/92481496644716627.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/59911496644730919.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/37791496644747384.png\"/></span></p>', 'A', '<p><span style=\"font-size:12px\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/10811496644771760.png\" style=\"\"/><span style=\"font-family: 微软雅黑, sans-serif;\">点后后将在素材库中选取指定角色，</span><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/14121496644777382.png\"/><span style=\"font-family: 微软雅黑, sans-serif;\">点击后将开始绘制自己想要的角色，</span><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/81941496644783633.png\"/><span style=\"font-family: 微软雅黑, sans-serif;\">点击后将开启摄像头（电脑已有）进行拍照的图片当做角色，</span><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/77661496644786232.png\"/><span style=\"font-family: 微软雅黑, sans-serif;\">点击后将从本地选择图片载入到</span><span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中</span></span></p><p><br/></p>', '1', '1', '2017-06-20 15:01:51');
INSERT INTO `tasktitle` VALUES ('36', '2', '15', '10', '<p><span style=\"font-family: 微软雅黑, sans-serif; font-size: 12px;\">以下光标工具的说明中哪个是正确的？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/79621496645203442.png\"/><span style=\"font-family: 微软雅黑, sans-serif;\">表示挤压角色</span></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/86391496645220874.png\"/><span style=\"font-family: 微软雅黑, sans-serif;\">表示剪切角色</span></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/76231496645251392.png\"/><span style=\"font-family: 微软雅黑, sans-serif;\">表示放大角色</span></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/10851496645273123.png\"/><span style=\"font-family: 微软雅黑, sans-serif;\">表示缩小角色</span></span></p>', 'B', '<p><span style=\"font-size:12px\"><span style=\"font-family: 微软雅黑, sans-serif;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/79621496645203442.png\" style=\"white-space: normal;\"/>表示复制角色，<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/86391496645220874.png\" style=\"white-space: normal;\"/></span><span style=\"font-family: 微软雅黑, sans-serif;\">表示剪切角色，<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/76231496645251392.png\" style=\"white-space: normal;\"/></span><span style=\"font-family: 微软雅黑, sans-serif;\">表示缩小角色，<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/10851496645273123.png\" style=\"white-space: normal;\"/></span><span style=\"font-family: 微软雅黑, sans-serif;\">表示放大角色</span></span></p>', '1', '1', '2017-06-20 15:01:56');
INSERT INTO `tasktitle` VALUES ('38', '2', '15', '10', '<p><span style=\"font-family: 微软雅黑, sans-serif; font-size: 12px;\">以下说法中哪一项是正确的？</span></p>', '<p><span style=\"white-space: normal;font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">背景只允许有一个</span></span></p>', '<p><span style=\"white-space: normal;font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">角色可以创建多个</span></span><span style=\"white-space: normal;\"></span></p>', '<p><span style=\"white-space: normal;font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">背景不允许进行编辑</span></span></p>', '<p><span style=\"white-space: normal;font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">角色不允许进行编辑</span></span></p>', 'B', '<p><span style=\"font-size:12px\"><span style=\"font-family: 微软雅黑, sans-serif;\">在</span><span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中舞台只有一个但是背景可以有多个，同样角色也可以有多个。背景和角色都可以进行根据个人喜好进行编辑</span></span></p>', '1', '1', '2017-06-20 15:02:02');
INSERT INTO `tasktitle` VALUES ('41', null, '17', '1', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个不属于</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">的脚本模块？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">外观</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">控制</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">造型</span></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中的积木分为十大模块：动作、外观、声音、画笔、数据、事件、控制、侦测、运算符、更多模块</span></p>', '1', '1', '2017-06-20 15:28:54');
INSERT INTO `tasktitle` VALUES ('43', null, '17', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个是不属于</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">修改输入（参数）的方式？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/50501496647219803.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/63491496647227780.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/40381496647235217.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/34161496647256575.png\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">有些积木块需要一个或更多输入（通常叫参数），修改它们的方法是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1.</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">直接修改参数</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2.</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">从下拉菜单中选择参数</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">3.</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">输入或选择参数</span></p>', '1', '1', '2017-06-20 15:29:09');
INSERT INTO `tasktitle` VALUES ('44', null, '16', '1', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">以下哪个说法是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">位图是由像素点组合而成的图像</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">位图的放大倍数超过其最佳分辨率会边缘出现锯齿状</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">矢量图是以数学向量方式记录图像的</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">矢量图的放大倍数超过其最佳分辨率边缘出现锯齿状</span></span></p>', 'D', '<p><span style=\"font-size:12px\"><span style=\"font-family: 微软雅黑, sans-serif;\">矢量图是以数学向量方式记录图像的，其内容以线条和色块为主。矢量图和分辨率无关，它可以任意地放大且清晰度不变，也不会出现锯齿状边缘</span><span style=\"font-family: Tahoma, sans-serif;\">.</span></span></p>', '1', '1', '2017-06-20 15:13:25');
INSERT INTO `tasktitle` VALUES ('45', null, '16', '1', '<p><span style=\"font-size:12px\"><span style=\"font-family: 微软雅黑, sans-serif;\">在</span><span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">绘图编辑器中能够使矢量图变形的是哪个？</span></span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/84241496645671172.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/54351496645679686.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/16791496645687495.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/90821496645696155.png\"/></span></p>', 'D', '<p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">A</span><span style=\"font-family: 微软雅黑, sans-serif;\">为铅笔、</span><span style=\"font-family: Tahoma, sans-serif;\">B</span><span style=\"font-family: 微软雅黑, sans-serif;\">为选择、</span><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">为复制</span></span></p>', '1', '1', '2017-06-20 15:15:17');
INSERT INTO `tasktitle` VALUES ('46', null, '16', '1', '<p><span style=\"font-size:12px\"><span style=\"font-family: 微软雅黑, sans-serif;\">在</span><span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">绘图编辑器中不会出现在位图编辑模式的是哪个？</span></span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/95311496645740904.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/38421496645749418.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/80771496645757318.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/28761496645767115.png\"/></span></p>', 'B', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">位图是不可以改变原图形状的，所以变形是不可以的</span></p>', '1', '1', '2017-06-20 15:15:38');
INSERT INTO `tasktitle` VALUES ('47', null, '16', '1', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">以下关于中心的说法哪个是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">当角色左右旋转时，它会将其造型中心点作为旋转中心</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">设置造型中心按钮便可以设置旋转的中心点</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">在绘图编辑器中无法设置透明色</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">改变角色中心点额位置只需要拖动十字准线位置</span></span></p>', 'C', '<p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中可以通过用颜色填充来完成透明色的设置</span></span></p>', '1', '1', '2017-06-20 15:16:08');
INSERT INTO `tasktitle` VALUES ('48', null, '16', '1', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">在绘图编辑器中哪个按钮是添加角色库中的素材？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">清除</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">添加</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">导入</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">转换成矢量编辑模式</span></span></p>', 'B', '<p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">A</span><span style=\"font-family: 微软雅黑, sans-serif;\">为清除当前编辑图像中的所元素，</span><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">为本地上传图片到当前编辑图像中，</span><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为矢量、位图转化按钮</span></span></p>', '1', '1', '2017-06-20 15:16:29');
INSERT INTO `tasktitle` VALUES ('49', null, '16', '1', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">下图中造型可以通过哪个积木块获得？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/80881496645900163.png\" style=\"width: 354px; height: 150px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/17241496645922262.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/7201496645928933.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/40531496645935804.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/29721496645943879.png\"/></span></p>', 'A', '<p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">B</span><span style=\"font-family: 微软雅黑, sans-serif;\">为获取当前舞台背景名称，</span><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">为获取</span><span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">官网注册用户名</span><span style=\"font-family: Tahoma, sans-serif;\">(</span><span style=\"font-family: 微软雅黑, sans-serif;\">需要在官网编辑</span><span style=\"font-family: Tahoma, sans-serif;\">)</span><span style=\"font-family: 微软雅黑, sans-serif;\">，</span><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为获取当前角色的造型索引值</span></span></p>', '1', '1', '2017-06-20 15:17:11');
INSERT INTO `tasktitle` VALUES ('50', null, '17', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">当点击小绿旗</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">时能够使角色说出“</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Hello</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">“</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\"> 2</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">秒的程序是哪段？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/56181496647315877.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/38281496647322355.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/74361496647330171.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/6851496647338936.png\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">如果不标注程序</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">秒则一直说“</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Hello</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">”，只有拼接了小绿旗</span><span style=\"font-size: 15px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">时才能在点击小绿旗</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">时触发接下来的积木块</span></p>', '1', '1', '2017-06-20 15:29:33');
INSERT INTO `tasktitle` VALUES ('51', null, '17', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">当点击小绿旗</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">时能够使角色说出“</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Hello</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">“</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\"> 2</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">秒的程序是哪端？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/37581496647428228.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.</span><span style=\"font-size: 12px;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/80731496647435453.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.</span><span style=\"font-size: 12px;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/12181496647444647.png\"/><span style=\"font-size: 12px;\"></span></span><span style=\"font-size: 18px;\"></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/79481496647452017.png\"/></span></p>', 'D', '<p style=\"line-height:15px;vertical-align:middle\"><span style=\"font-size:12px\"><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">首先应该选择外观积木块<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/16401496647474042.png\"/></span><span style=\"font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，由于该积木块在执行下一个积木之前会一直等待，所以我们要放一个<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/69621496647486202.png\"/></span><span style=\"font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">用来清空之前的</span><span>’Hello’</span></span></p>', '1', '1', '2017-06-20 15:31:56');
INSERT INTO `tasktitle` VALUES ('52', null, '17', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行下面这段指令能够让橙小乐说完‘在吗’之后思考‘没有人吗’的操作，需要在脚本中添加哪一个指令来实现？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/35801496647518275.png\"/></span></strong></p>', '<p>A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/54771496647534007.png\"/></p>', '<p>B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/75311496647540301.png\"/></p>', '<p>C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/22251496647552236.png\"/>D</p>', '<p><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/92221496647562259.png\"/></p>', 'D', '<p style=\"line-height:15px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为说的动作并且由于程序为顺序执行没有等待</span><span>1</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">秒导致不会显示‘在吗’</span></p><p style=\"line-height:15px\"><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">因为没有等待</span><span>1</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">秒导致不会显示‘在吗’</span></p><p><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为说的操作不满足题干要求</span></p><p><br/></p>', '1', '1', '2017-06-20 15:23:11');
INSERT INTO `tasktitle` VALUES ('53', null, '17', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">让角色思考“</span><span style=\"font-size: 15px; font-family: Tahoma, sans-serif;\">Hello</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">“</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\"> 2</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">秒的是哪个指令？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/65481496647606013.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/46541496647613188.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/33341496647623412.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/72041496647638578.png\"/></span></p>', 'C', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为说‘</span><span>Hello</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">’</span><span>2</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">秒</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为一直说‘</span><span>Hello</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">’</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为一支思考‘</span><span style=\"font-family: Tahoma, sans-serif;\">Hello</span><span style=\"font-family: 微软雅黑, sans-serif;\">’</span></span></p>', '1', '1', '2017-06-20 15:32:41');
INSERT INTO `tasktitle` VALUES ('54', null, '18', '1', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">音乐播放器可以支持很多种格式的音乐，</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">中能够支持哪种？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: Tahoma, sans-serif;\">WMA</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: Tahoma, sans-serif;\">OGG</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: Tahoma, sans-serif;\">WAV</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: Tahoma, sans-serif;\">WAV</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\"> Windows Media Audio</span><span style=\"font-size:12px;font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">编码后的文件格式，由微软开发，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为类似有</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">MP3</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的音乐播放格式，它的多声道、免费、开源是优势，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为杜比实验室针对音乐社区提供的技术，遵循</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">MPEG-2</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的规格所开发的技术，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">同样支持</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">MP3</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">格式</span></p>', '1', '1', '2017-06-20 15:26:15');
INSERT INTO `tasktitle` VALUES ('55', null, '18', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个说法是错误的？</span></p>', '<p>A.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">播放声音积木在播放声音开始播放后立即执行后面的脚本</span></p>', '<p>B.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">播放声音</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">…</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">直到播放完毕积木必须等到声音全部播放完毕后才执行后面脚本</span></p>', '<p>C.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">停止所有音乐积木会立即停止所有声音</span></p>', '<p>D.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在播放的声音中只能使用</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">里内置的音乐</span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中，音乐是可以通过上传、录制等多种方式获取自己喜欢的音乐</span></p>', '1', '1', '2017-06-20 15:26:29');
INSERT INTO `tasktitle` VALUES ('56', null, '18', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个不是新建音乐的方法？</span></p>', '<p>A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/81691496648014701.png\"/></p>', '<p>B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/53811496648033038.png\" style=\"white-space: normal;\"/></p>', '<p>C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/77671496648026990.png\"/></p>', '<p>D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/20351496648019586.png\" style=\"white-space: normal;\"/></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为从声音库中选取声音，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为录制新音乐，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为照相，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为从本地文件中上传音乐</span></p>', '1', '1', '2017-06-20 15:26:35');
INSERT INTO `tasktitle` VALUES ('57', null, '18', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在音乐编辑页面中以下哪一个是不可编辑的效果？</span></p>', '<p>A.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">淡入</span></p>', '<p>B.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">响一点</span></p>', '<p>C.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">反转</span></p>', '<p>D.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">去杂音</span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">音效的编辑中包含有入下</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">:</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">淡入、淡出、响一点、轻一点、无声、反转</span></p>', '1', '1', '2017-06-20 15:26:40');
INSERT INTO `tasktitle` VALUES ('58', null, '18', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个说法是错误的？</span></p>', '<p>A.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">节奏的单位是每分钟节拍数，节奏值越大，弹奏速度越快</span></p>', '<p>B.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">停止音乐可以使用停止所有音乐和停止当前脚本<strong></strong></span></p>', '<p>C.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">设置节奏会影响所有角色</span></p>', '<p>D.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">设置音量会影响所有角色</span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">节奏和音量不同，音量影响所有角色，节奏只影响当前一个角色</span></p>', '1', '1', '2017-06-20 15:26:47');
INSERT INTO `tasktitle` VALUES ('59', null, '18', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个不是针对声音编辑的操作？</span></p>', '<p>A.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">撤销</span></p>', '<p>B.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">复制</span></p>', '<p>C.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">重做</span></p>', '<p>D.<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">反转</span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">反转是音乐中效果的选项</span></p>', '1', '1', '2017-06-20 15:26:52');
INSERT INTO `tasktitle` VALUES ('60', null, '20', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个不属于绝对运动积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/29741496648269177.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/85031496648275164.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/93201496648281221.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/13451496648287530.png\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">将</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标增加为相对</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">原始坐标增加</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">10</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">步，属于相对移动积木</span></p>', '1', '1', '2017-06-20 15:33:42');
INSERT INTO `tasktitle` VALUES ('61', null, '20', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">让橙小乐精确出现在某个位置是哪个指令？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/47191496648404400.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/37911496648412851.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/69811496648430028.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/57761496648440454.png\"/></span></p>', 'B', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐面向鼠标移动方向</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>C</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐移动</span><span>10</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">步</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为橙小乐滑动到指定坐标</span></span></p>', '1', '1', '2017-06-20 15:34:01');
INSERT INTO `tasktitle` VALUES ('62', null, '20', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">让橙小乐在中心点出现滑动到某个位置是哪个指令？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/23341496648518561.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/54521496648522702.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/91621496648526984.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/65701496648535941.png\"/></span></p>', 'B', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐精确出现在指定位置</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>C</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐从原点精确出现在指定位置</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为橙小乐从原点水平向右移动</span></span></p>', '1', '1', '2017-06-20 15:34:31');
INSERT INTO `tasktitle` VALUES ('63', null, '20', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">修改橙小乐的重心是以下哪个操作步骤？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">舞台</span><span style=\"font-family: Tahoma, sans-serif;\">-&gt;</span><span style=\"font-family: 微软雅黑, sans-serif;\">背景</span><span style=\"font-family: Tahoma, sans-serif;\">-&gt;</span><span style=\"font-family: 微软雅黑, sans-serif;\">设置造型</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">角色</span><span style=\"font-family: Tahoma, sans-serif;\">-&gt;</span><span style=\"font-family: 微软雅黑, sans-serif;\">造型</span><span style=\"font-family: Tahoma, sans-serif;\">-&gt;</span><span style=\"font-family: 微软雅黑, sans-serif;\">设置造型中心</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">舞台</span><span style=\"font-family: Tahoma, sans-serif;\">-&gt;</span><span style=\"font-family: 微软雅黑, sans-serif;\">脚本</span><span style=\"font-family: Tahoma, sans-serif;\">-&gt;</span><span style=\"font-family: 微软雅黑, sans-serif;\">将背景切换</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">角色</span><span style=\"font-family: Tahoma, sans-serif;\">-&gt;</span><span style=\"font-family: 微软雅黑, sans-serif;\">脚本</span><span style=\"font-family: Tahoma, sans-serif;\">-&gt;</span><span style=\"font-family: 微软雅黑, sans-serif;\">移动到</span><span style=\"font-family: Tahoma, sans-serif;\">(0</span><span style=\"font-family: 微软雅黑, sans-serif;\">，</span><span style=\"font-family: Tahoma, sans-serif;\">0)</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">设置角色重心首先确定角色然后在造型面板中选择设置造型中心进行拖拽来实现操作</span></p>', '1', '1', '2017-06-20 15:34:55');
INSERT INTO `tasktitle` VALUES ('64', null, '20', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">要让橙小乐向右移动是哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/77111496648714958.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/94451496648718828.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/48101496648723061.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/62741496648728640.png\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐向右上方移动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐向左移动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐向上移动</span></p>', '1', '1', '2017-06-20 15:35:27');
INSERT INTO `tasktitle` VALUES ('65', null, '20', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">要让橙小乐先向左然后向下移动是哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/20451496648780349.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/71511496648784338.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/16481496648789306.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/67921496648794188.png\"/></span></p>', 'D', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐先向右移动然后向下移动</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐先向右移动然后向下移动</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">为橙小乐先向左移动然后向上移动</span></span></p>', '1', '1', '2017-06-20 15:35:50');
INSERT INTO `tasktitle` VALUES ('66', null, '21', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个不属于相对运动积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/28391496648850755.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/85281496648854812.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/91051496648859645.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/71651496648872174.png\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">秒内滑动到指定位置属于绝对移动积木</span></p>', '1', '1', '2017-06-20 15:36:30');
INSERT INTO `tasktitle` VALUES ('67', null, '21', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色面向右是哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/53711496649019711.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/26111496649024311.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/25251496649029386.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/74701496649037621.png\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色面向左</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色面向上</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色面向下</span></p>', '1', '1', '2017-06-20 15:36:49');
INSERT INTO `tasktitle` VALUES ('68', null, '21', '2', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">根据下图让火箭击中小星星需要在脚本中添加哪一个指令来实现？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/39881496649069512.png\" style=\"width: 156px; height: 144px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/61311496649102301.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/60691496649109097.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/19891496649114786.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/26861496649120703.png\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为面向左并且向下移动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为面向左并且向下移动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为面向下并向下移动</span></p>', '1', '1', '2017-06-20 15:37:39');
INSERT INTO `tasktitle` VALUES ('69', null, '21', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">要让橙小乐向下移动是哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/81461496649161946.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/94791496649168681.png\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/62911496649172931.png\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/60751496649177240.png\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐向右移动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐向左移动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐向上移动</span></p>', '1', '1', '2017-06-20 15:38:02');
INSERT INTO `tasktitle` VALUES ('70', null, '21', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">要让橙小乐先向左然后向上移动是哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/14661496649230119.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/92301496649240562.png\" style=\"white-space: normal;\"/></span></p><p><br/></p><p><br/></p><p><br/></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/8171496649240580.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/13181496649240510.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐先向右移动然后向下移动</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐先向右移动然后向上移动</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">为橙小乐先向左移动然后向下移动</span></span></p>', '1', '1', '2017-06-20 15:38:20');
INSERT INTO `tasktitle` VALUES ('71', null, '21', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">要让橙小乐按顺时针（上右下左）移动是哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/89291496649451413.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/57021496649451467.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/52091496649451471.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/78641496649451472.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐逆时针运动</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>C</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为橙小乐正</span><span>Z</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">字形运动</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为橙小乐反</span><span style=\"font-family: Tahoma, sans-serif;\">Z</span><span style=\"font-family: 微软雅黑, sans-serif;\">字形运动</span></span></p>', '1', '1', '2017-06-20 15:38:42');
INSERT INTO `tasktitle` VALUES ('72', null, '22', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">获取角色当前方向是哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/45451496649519908.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/50071496649519944.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/49851496649519945.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/59651496649519946.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为获取角色当前大小</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为获取当前接收音量值</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为音乐模块中当前音效的节奏值</span></p>', '1', '1', '2017-06-20 15:39:42');
INSERT INTO `tasktitle` VALUES ('73', null, '22', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">让角色向上移动是以下哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/7611496649576337.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/72571496649576337.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/30751496649576337.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/11181496649576339.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为向右运动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为向左运动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为向下运动</span></p>', '1', '1', '2017-06-20 15:40:00');
INSERT INTO `tasktitle` VALUES ('74', null, '22', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">让角色跟随鼠标旋转是以下哪个积木？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/29971496649631417.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/70781496649631419.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/11751496649631422.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/51361496649631423.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为跟随橙小乐旋转</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为移动到鼠标指针位置</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为移动到橙小乐位置</span></p>', '1', '1', '2017-06-20 15:40:30');
INSERT INTO `tasktitle` VALUES ('75', null, '22', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在橙小乐的面向积木中不可能出现以下哪个角色？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">欢欢</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">兔博士</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">橙小乐</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">橙小乐</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">面向积木块会让角色跟随在下拉框中选中角色的方向转动，该下拉列表中不会出现角色本身</span></p>', '1', '1', '2017-06-20 15:40:49');
INSERT INTO `tasktitle` VALUES ('76', null, '22', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">让角色向下移动是以下哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/50301496649756387.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/13981496649756390.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/66611496649756391.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/35761496649756331.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为向左运动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为向右运动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为向左运动</span></p>', '1', '1', '2017-06-20 15:41:09');
INSERT INTO `tasktitle` VALUES ('77', null, '22', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色面向左是哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/95001496649956915.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/42461496649956918.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/96241496649956919.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/86101496649956915.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色面向右</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色面向上</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色面向下</span></p>', '1', '1', '2017-06-20 15:41:25');
INSERT INTO `tasktitle` VALUES ('78', null, '24', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色移动</span><span style=\"font-size: 15px; font-family: Tahoma, sans-serif;\">100</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">步是以下哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/32771496650107417.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/93231496650107384.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/78611496650107438.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/72141496650107443.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为获取角色移动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">10</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">步</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色移动</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">10</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">步</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色移动一直处于移动状态</span></p>', '1', '1', '2017-06-20 15:42:18');
INSERT INTO `tasktitle` VALUES ('79', null, '24', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色顺时针旋转一周是以下哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/88561496650214793.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/26951496650214738.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/77551496650214804.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/75181496650214797.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色向右旋转半周</span><span>180</span><span style=\"font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>C</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色向左旋转一周</span><span>360</span><span style=\"font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为角色向左旋转半周</span><span style=\"font-family: Tahoma, sans-serif;\">180</span><span style=\"font-family: 微软雅黑, sans-serif;\">°</span></span></p>', '1', '1', '2017-06-20 15:42:48');
INSERT INTO `tasktitle` VALUES ('80', null, '24', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色逆时针旋转一周是以下哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/76201496650280022.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/67761496650280080.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/28871496650280082.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/34141496650280081.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色向左逆时针旋转一周</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>C</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色向左逆时针旋转一周</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为角色向右一直重复旋转</span></span></p>', '1', '1', '2017-06-20 15:43:27');
INSERT INTO `tasktitle` VALUES ('81', null, '24', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色按照五边形移动的是以下哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/63041496650357057.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/71321496650357066.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/50091496650357071.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/11611496650357003.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色直线运动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色按三角形运动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色按正方形运动</span></p>', '1', '1', '2017-06-20 15:43:49');
INSERT INTO `tasktitle` VALUES ('82', null, '24', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色在舞台中重复左右移动的是以下哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/4731496650435073.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/8261496650435076.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/42881496650435016.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/8271496650435070.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色处于循环运动状态，碰到边缘不反弹</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>C</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色执行指定步数后停止运动，碰到边缘不反弹</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为角色执行指定步数后停止，碰到边缘反弹</span></span></p>', '1', '1', '2017-06-20 15:44:56');
INSERT INTO `tasktitle` VALUES ('83', null, '24', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">能够让角色在舞台中停止移动的是以下哪个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/17851496650505769.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/58341496650505773.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/12621496650505780.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/3371496650505712.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色重复执行移动</span><span>10</span><span style=\"font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">步</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>C</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色重复执行一次重复执行，在里面重复执行移动</span><span>10</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">步</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为角色重复执行里面的重复执行</span><span style=\"font-family: Tahoma, sans-serif;\">10</span><span style=\"font-family: 微软雅黑, sans-serif;\">次</span></span></p>', '1', '1', '2017-06-20 15:45:23');
INSERT INTO `tasktitle` VALUES ('84', null, '25', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个积木块在舞台和角色中都可以使用？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/87751496650803299.png\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/26031496650803300.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/97951496650803301.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/80101496650803299.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">都只能在角色中使用，针对舞台的画笔模块只有清空积木</span></p>', '1', '1', '2017-06-20 15:46:02');
INSERT INTO `tasktitle` VALUES ('85', null, '25', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">下列哪个脚本能够使角色画一条直线？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/54181496650872746.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/91391496650872747.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/82621496650872752.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/25461496650872693.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">画笔有两种状态</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">:</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">下落和抬起。如果当前画笔状态是落下，那么角色移动时，它就会按照画笔的属性绘制出轨迹</span></p>', '1', '1', '2017-06-20 15:46:25');
INSERT INTO `tasktitle` VALUES ('86', null, '25', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个不属于画笔的属性？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">颜色</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif; white-space: normal;\">大小</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">色度</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">马赛克</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">马赛克是外观模块中针对角色的属性</span></p>', '1', '1', '2017-06-20 15:46:45');
INSERT INTO `tasktitle` VALUES ('87', null, '25', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个说法是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: Tahoma, sans-serif;\">“</span><span style=\"font-family: 微软雅黑, sans-serif;\">清空</span><span style=\"font-family: Tahoma, sans-serif;\">”</span></span><span style=\"font-family: 微软雅黑, sans-serif;\"><span style=\"font-size:12px\">是清除当前角色的所有画笔轨迹</span><span style=\"font-size: 12px;\"><strong></strong></span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: Tahoma, sans-serif;\">“</span><span style=\"font-family: 微软雅黑, sans-serif;\">图章</span><span style=\"font-family: Tahoma, sans-serif;\">”</span><span style=\"font-family: 微软雅黑, sans-serif;\">把形象贴在舞台上，不可移动，能保存脚本</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: Tahoma, sans-serif;\">“</span><span style=\"font-family: 微软雅黑, sans-serif;\">落笔</span><span style=\"font-family: Tahoma, sans-serif;\">”</span><span style=\"font-family: 微软雅黑, sans-serif;\">是控制角色看不见的画笔开始画的积木</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: Tahoma, sans-serif;\">“</span><span style=\"font-family: 微软雅黑, sans-serif;\">抬笔</span><span style=\"font-family: Tahoma, sans-serif;\">”</span><span style=\"font-family: 微软雅黑, sans-serif;\">是控制角色看不见的画笔结束画的积木</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">“</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">图章</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">”</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">把形象贴在舞台上，形象是不能够移动的，同事也不能够保存任何脚本</span></p>', '1', '1', '2017-06-20 15:47:06');
INSERT INTO `tasktitle` VALUES ('88', null, '25', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行以下哪个脚本会使角色画出圆形？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/80581496651094325.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/62701496651094330.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/31811496651094336.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/6561496651094269.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">使角色画的是正方形，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">使角色画的是三角形，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">使角色画的是十二边形</span></p>', '1', '1', '2017-06-20 15:47:32');
INSERT INTO `tasktitle` VALUES ('89', null, '25', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行以下这段脚本后，角色会绘制出什么形状？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/70051496651186037.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">圆</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">半圆</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">梯形</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">正方形</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">使角色重复循环</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">180</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次后是画半圆的基础，再旋转</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">90</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">度后再进行封口</span></p>', '1', '1', '2017-06-20 15:53:09');
INSERT INTO `tasktitle` VALUES ('90', null, '80', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">中角色的旋转模式有哪些？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">上下旋转、左右旋转、不旋转</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">左右旋转、前后旋转、任意</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">上下旋转、不旋转、任意</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">左右旋转、不旋转、任意</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中角色的旋转模式有左右旋转、不旋转、任意三种模式，角色默认为任意旋转模式</span></p>', '1', '1', '2017-06-20 15:53:33');
INSERT INTO `tasktitle` VALUES ('91', null, '80', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色不可进行旋转要如何设置旋转模式？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">默认</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">不旋转</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">左右翻转</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">任意</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">任意旋转模式下角色的旋转模式是根据角色脚本有关角度设置而改变的，左右翻转只能让用户进行左右两个方向的变化，默认情况下旋转模式为任意</span></p>', '1', '1', '2017-06-20 15:54:16');
INSERT INTO `tasktitle` VALUES ('92', null, '80', '2', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">在执行下面这段代码的时候对角色的旋转模式修改为左右旋转，那么角色在模式修改后是如何运动的？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/52801496651397539.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">逆时针旋转</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">顺时针旋转</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">不旋转</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">左右旋转</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">默认旋转状态下是任意旋转模式，角色会根据脚本设置进行顺时针旋转，当角色旋转模式修改为左右旋转时，角色只能沿着</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">X</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">轴方向（右）或</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">X</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">轴反方向（左）进行旋转</span></p>', '1', '1', '2017-06-20 15:54:55');
INSERT INTO `tasktitle` VALUES ('93', null, '80', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色能够面向左右且重复循环移动是以下哪段代码？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/24781496651435414.png\" style=\"white-space: normal;\"/></span></p><p><br/></p><p><br/></p><p><br/></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/85221496651435419.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/10961496651435416.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/87171496651435356.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">会重复循环走，角色旋转模式为任意</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">会重复循环走，角色旋转模式为任意</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">会重复循环走，角色旋转模式为不旋转</span></span></p>', '1', '1', '2017-06-20 15:55:36');
INSERT INTO `tasktitle` VALUES ('94', null, '80', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">设定角色旋转模式为不旋转是以下哪个选项？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/11571496651666985.png\" style=\"white-space: normal;\"/></span></p><p><br/></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/27661496651666956.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/90971496651666981.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/66321496651666984.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色详细信息</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为任意旋转模式</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为左右旋转模式</span></p>', '1', '1', '2017-06-20 15:56:08');
INSERT INTO `tasktitle` VALUES ('95', null, '80', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">设定旋转模积木属于哪个</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">中模块？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">事件</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">外观</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">控制</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">动作</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中的积木分为十大模块：动作、外观、声音、画笔、数据、事件、控制、侦测、运算符、更多模块，其中设置旋转模式属于动作模块</span></p>', '1', '1', '2017-06-20 15:56:32');
INSERT INTO `tasktitle` VALUES ('96', null, '81', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在角色的造型区中从素材库选取指定造型的按钮是哪个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/96051496651900381.png\" style=\"white-space: normal;\"/></span></p><p><br/></p><p><br/></p><p><br/></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/49041496651900412.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/39861496651900412.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/37701496651900412.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p style=\"line-height:15px;vertical-align:middle\"><span style=\"font-size:12px\"><span style=\"font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/96051496651900381.png\" style=\"white-space: normal;\"/>点后后将从造型库中选取造型，<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/49041496651900412.png\" style=\"white-space: normal;\"/></span><span style=\"font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">点击后将开始绘制新造型，<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/37701496651900412.png\" style=\"font-family: 微软雅黑, sans-serif; line-height: 15px; white-space: normal;\"/></span><span style=\"font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">点击后将开启摄像头（电脑已有）拍摄照片当做造型，<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/39861496651900412.png\" style=\"font-family: 微软雅黑, sans-serif; line-height: 15px; white-space: normal;\"/></span><span style=\"font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">点击后将从本地文件中上传新造型</span></span></p>', '1', '1', '2017-06-20 15:59:42');
INSERT INTO `tasktitle` VALUES ('97', null, '81', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">让角色一直处于正常奔跑状态需要执行以下哪一个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/29751496652038629.png\" style=\"white-space: normal;\"/></span></p><p><br/></p><p><br/></p><p><br/></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/67731496652038631.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/4861496652038640.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/13551496652038578.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p style=\"line-height:15px;vertical-align:middle\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">造型切换过快，只执行</span><span>10</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次后停止</span></span></p><p style=\"line-height:15px;vertical-align:middle\"><span style=\"font-size:12px\"><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">造型切换正常，只执行</span><span>10</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次后停止</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">造型切换过快</span></span></p>', '1', '1', '2017-06-20 16:00:03');
INSERT INTO `tasktitle` VALUES ('98', null, '81', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">获取当前角色的造型编号可以通过哪个积木获得？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/80551496652337320.png\" style=\"white-space: normal;\"/></span></p><p><br/></p><p><br/></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/60821496652337321.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/47751496652337324.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/35541496652337293.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">A</span><span style=\"font-family: 微软雅黑, sans-serif;\">能够获取当前角色的大小，</span><span style=\"font-family: Tahoma, sans-serif;\">B</span><span style=\"font-family: 微软雅黑, sans-serif;\">能够获得当前舞台背景名称，</span><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">获取用户在</span><span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">官网上的用户名，没有用户名时显示为空</span></span></p>', '1', '1', '2017-06-20 16:00:29');
INSERT INTO `tasktitle` VALUES ('99', null, '81', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个操作是将造型导出并保存本地？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">复制</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">删除</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">隐藏</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">保存到本地文件</span></span></p>', 'D', '<p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">A</span><span style=\"font-family: 微软雅黑, sans-serif;\">会新建一个一模一样的造型，</span><span style=\"font-family: Tahoma, sans-serif;\">B</span><span style=\"font-family: 微软雅黑, sans-serif;\">会删除当前右键选中的造型，</span><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">属于角色的操作，在造型中没有操作</span></span></p>', '1', '1', '2017-06-20 16:00:59');
INSERT INTO `tasktitle` VALUES ('100', null, '81', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个操作不是针对角色的造型的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">复制</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">删除</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">隐藏</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">保存到本地文件</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">隐藏是右键点击角色是出现在弹出菜单中的，隐藏是针对角色的而非造型</span></p>', '1', '1', '2017-06-20 16:01:24');
INSERT INTO `tasktitle` VALUES ('101', null, '81', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">角色造型一直处于循环切换需要执行以下哪一个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/4681496652520357.png\" style=\"white-space: normal;\"/></span></p><p><br/></p><p><br/></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/55411496652520355.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/71471496652520364.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/63081496652520302.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">B</span><span style=\"font-family: 微软雅黑, sans-serif;\">只切换造型</span><span style=\"font-family: Tahoma, sans-serif;\">10</span><span style=\"font-family: 微软雅黑, sans-serif;\">次，</span><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">一直在将造型切换为</span><span style=\"font-family: Tahoma, sans-serif;\">’</span><span style=\"font-family: 微软雅黑, sans-serif;\">造型</span><span style=\"font-family: Tahoma, sans-serif;\">1’</span><span style=\"font-family: 微软雅黑, sans-serif;\">，</span><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">同样在将造型切换为</span><span style=\"font-family: Tahoma, sans-serif;\">’ </span><span style=\"font-family: 微软雅黑, sans-serif;\">造型</span><span style=\"font-family: Tahoma, sans-serif;\">1’</span><span style=\"font-family: 微软雅黑, sans-serif;\">且共执行</span><span style=\"font-family: Tahoma, sans-serif;\">10</span><span style=\"font-family: 微软雅黑, sans-serif;\">次</span></span></p>', '1', '1', '2017-06-20 16:01:46');
INSERT INTO `tasktitle` VALUES ('102', null, '83', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个不属于</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">的外观特效？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">颜色</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">旋转</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">虚像</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">图层</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中外观特效有颜色、超广角镜头、旋转、像素化、马赛克、亮度、虚像</span></p>', '1', '1', '2017-06-20 16:02:31');
INSERT INTO `tasktitle` VALUES ('103', null, '83', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一种方法无法实现让角色在舞台中消失？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">删除角色</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">虚像设置为</span><span style=\"font-family: Tahoma, sans-serif;\">100</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">清除所有图形特效</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">隐藏角色</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">删除角色能够连同角色中的脚本一并删除，设置角色虚像特效为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">100</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">就可以将角色变为透明进而在舞台中消失，隐藏角色同样可以实现让角色消失的功能</span></p>', '1', '1', '2017-06-20 16:02:47');
INSERT INTO `tasktitle` VALUES ('104', null, '83', '2', '<p><span style=\"font-size:12px\"><span style=\"font-family: 微软雅黑, sans-serif;\">假设当前角色大小为</span><span style=\"font-family: Tahoma, sans-serif;\">50</span><span style=\"font-family: 微软雅黑, sans-serif;\">，需要修改角色大小为</span><span style=\"font-family: Tahoma, sans-serif;\">100</span><span style=\"font-family: 微软雅黑, sans-serif;\">时以下哪个积木块能够满足？</span></span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/79551496652692096.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/99501496652692097.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/99311496652692101.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/56851496652692064.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">执行完后角色大小为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">150C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">执行完后角色大小为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">50D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">执行完后角色大小仍然为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">50</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，大小积木用于获得当前角色的大小</span></p>', '1', '1', '2017-06-20 16:03:15');
INSERT INTO `tasktitle` VALUES ('105', null, '83', '2', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">能够让橙小乐的颜色按照下图改变的积木块是哪一个？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/19461496652762258.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/51481496652770392.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/45571496652770386.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/67171496652770337.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/71011496652770393.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">改变橙小乐的颜色需要使用修改颜色的积木块来实现，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中外观特效还有超广角镜头、旋转、像素化、马赛克、亮度、虚像</span></p>', '1', '1', '2017-06-20 16:03:41');
INSERT INTO `tasktitle` VALUES ('106', null, '83', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色先放大后缩是以下哪一个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/68951496652832514.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/64621496652832490.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/24441496652832485.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/7151496652832514.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">执行后角色先变浅后恢复，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">执行后角色先变色后恢复，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">执行后角色先扭曲后恢复</span></p>', '1', '1', '2017-06-20 16:04:08');
INSERT INTO `tasktitle` VALUES ('107', null, '83', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">如果让橙小乐显示在所有角色的最前面应该执行哪一步操作？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">将角色大小设置为</span><span style=\"font-family: Tahoma, sans-serif;\">100</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">将虚像大小设定为</span><span style=\"font-family: Tahoma, sans-serif;\">0</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">下移</span><span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">层</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">移至最上层</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">执行后会修改角色大小，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">执行后会确保角色在舞台显示，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">执行后会将角色下移一层图层，有可能被其他角色覆盖</span></p>', '1', '1', '2017-06-20 16:04:28');
INSERT INTO `tasktitle` VALUES ('108', null, '84', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">中要表达在</span><span style=\"font-size: 15px; font-family: Tahoma, sans-serif;\">1</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">到</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">10</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">随机选取</span><span style=\"font-size: 15px; font-family: Tahoma, sans-serif;\">1</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">个数可以使用如下哪一个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/13871496652975734.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/88491496652975762.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/15601496652975794.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/24701496652975801.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的结果是</span><span>1,</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">因为只有</span><span>1</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">这个数字可供选择</span></span></p><p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的结果是</span><span>10</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，因为只有</span><span>10</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">这个数字可供选择</span></span></p><p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">的结果是</span><span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">，因为嵌套在参数二里面的随机数只提供了</span><span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">，所以在可选择的数字依然是</span><span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">这个数</span></span></p>', '1', '1', '2017-06-20 16:14:48');
INSERT INTO `tasktitle` VALUES ('109', null, '84', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">是角色可以移动到舞台任意一个位置的积木块是哪一个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/61731496653049964.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/44781496653049972.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/98991496653049972.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/28901496653049912.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">可以使角色出现在舞台右边的任意一个位置，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">由于</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">y</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的范围无法覆盖到整个舞台所以不可能出现在舞台的任意一个位置，舞台的</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标范围</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">[-240,240]</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">y</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标范围</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">[-180,180]</span></p>', '1', '1', '2017-06-20 16:15:56');
INSERT INTO `tasktitle` VALUES ('110', null, '84', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">请在以下积木块中找到积木之间组合不合理的是哪一个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/90781496653155387.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/82961496653155417.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/43931496653155354.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/13761496653155414.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中积木块中具有三角号下拉框的积木是不允许用户进行参数赋值的，用户只能通过</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">默认提供好的可选参数选择后进行赋值，举例如下</span></p><p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/38201496653128405.png\"/></span></p>', '1', '1', '2017-06-20 16:16:22');
INSERT INTO `tasktitle` VALUES ('111', null, '84', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色随机面向任意方向的积木块是哪一个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/14941496653248807.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/61831496653248807.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/16451496653248805.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/52431496653248808.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">面向任意方向需要满足随机数区间为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">360</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，也就是旋转一周的度数，满足要求的是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span></p>', '1', '1', '2017-06-20 16:16:48');
INSERT INTO `tasktitle` VALUES ('112', null, '84', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色可以旋转一周的积木块是哪一个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/95331496653311864.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/88941496653311863.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/36151496653311864.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/82411496653311863.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">使角色一直处于旋转状态</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">,B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">使角色向右旋转</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">90</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">使角色向右旋转</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">90</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">180</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">270</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">360</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°四个不确定的方向</span></p>', '1', '1', '2017-06-20 16:17:11');
INSERT INTO `tasktitle` VALUES ('113', null, '84', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">随机积木块返回数值为整数的是哪一个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/15841496653383528.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/27641496653383560.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/96411496653383497.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/88021496653383556.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在随机数积木块中，参数里面只要包含小数，则随机返回的数值将会是随机小数，只有当两个参数都为整数时，返回值一定为整数</span></p>', '1', '1', '2017-06-20 16:18:56');
INSERT INTO `tasktitle` VALUES ('114', null, '85', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下说法错误的是？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">角色可以进行图章操作</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">舞台可以进行图章操作</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">进行图章操作后出现的图案不能进行脚本控制</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">图章操作没有数量的限制</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">舞台是不允许克隆的，而且在针对舞台编写脚本时，画笔模块中没有图章积木</span></p>', '1', '1', '2017-06-20 16:19:28');
INSERT INTO `tasktitle` VALUES ('115', null, '85', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行针对小猫编写的脚本后会舞台会展示什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/75351496653835502.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">一只小猫</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">十只造型相同小猫</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">十只造型不同小猫</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不确定</span></span></p>', 'A', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">因为角色在重复执行图章的时候没有改变位置，所以是在同一个位置执行了十次图章，确实复刻了十次小猫，但是舞台展示上只能看到一只</span></p>', '1', '1', '2017-06-20 16:20:08');
INSERT INTO `tasktitle` VALUES ('116', null, '85', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行针对小猫编写的脚本后会舞台会展示什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/77721496653948910.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">一只小猫</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">十只造型相同的小猫</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">十只造型不同的小猫</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不确定</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">每次使用图章前都对角色的位置和面向角度进行了随机赋值，所以会产生十只造型不同的小猫</span></p>', '1', '1', '2017-06-20 16:20:24');
INSERT INTO `tasktitle` VALUES ('117', null, '85', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行针对小猫编写的脚本后会舞台会展示什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/14601496654013210.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">一条横线</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">一条横线、一只猫</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">一条横线、两只猫</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不显示任何</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">隐藏知识针对角色的，图章是无法通过隐藏来进行控制的，如果想要在舞台中取消图章所画的图案需要使用画笔模块中的清空</span></p>', '1', '1', '2017-06-20 16:20:54');
INSERT INTO `tasktitle` VALUES ('118', null, '85', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行针对小猫编写的脚本后会舞台会展示什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/74621496654068735.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">两只小猫</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">十只小猫</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">九只小猫</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不确定</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">重复循环</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">9</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次后会调用</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">9</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次图章，然后将角色从最后一次图章的位置随机移动到任意位置，避免与图章重合，所以是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">10</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次图章</span></p>', '1', '1', '2017-06-20 16:21:22');
INSERT INTO `tasktitle` VALUES ('119', null, '85', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个积木在针对角色编程时不会出现？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/85231496654106289.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/70691496654106292.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/5761496654106292.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/49111496654106286.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当舞台被点击只有在针对舞台进行编程时才会出现在事件模块中</span></p>', '1', '1', '2017-06-20 16:21:40');
INSERT INTO `tasktitle` VALUES ('120', null, '86', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下说法错误的是？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">克隆与图章类似，能够实现在舞台上复制角色的功能</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">克隆积木复制出来的克隆体继承了本体的各项属性</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">克隆体继承了本体的属性包括大小、颜色、位置等</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">克隆体无法进行再次代码编写</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">对克隆体编写代码，控制他与本体不同，可以修改各项属性，比如大小、颜色、位置</span></p>', '1', '1', '2017-06-20 16:22:16');
INSERT INTO `tasktitle` VALUES ('121', null, '86', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在小兔这个角色中克隆小狗应该选择以下哪个选项？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/44281496654225204.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/86801496654225205.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/78411496654225201.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/99831496654225204.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">由于本题是在小兔这个角色下进行脚本编写，所以需要制定克隆小狗才能进行小狗的克隆，如果是在小狗角色下进行脚本编程那么可以选择小狗或者选择自己</span></p>', '1', '1', '2017-06-20 16:22:31');
INSERT INTO `tasktitle` VALUES ('122', null, '86', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下关于克隆的使用中正确的是？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/58641496654291687.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/99621496654291687.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/45691496654291689.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/89331496654291748.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">注意在使用克隆积木块的时候一定要结合删除本克隆体，否则在克隆达到一定数量的时候会出现无法继续克隆的情况</span></p>', '1', '1', '2017-06-20 16:22:49');
INSERT INTO `tasktitle` VALUES ('123', null, '86', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">当按下小绿旗后舞台上会有几个角色？</span></p><p><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/43321496654338980.png\" style=\"\"/>&nbsp;<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/16641496654338980.png\" style=\"white-space: normal; width: 330px; height: 102px;\"/></p><p><br/></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">一个</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">十个</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">十一个</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不确定</span></span></p>', 'A', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">克隆积木只会复制或删除已克隆出来角色，虽然继承了角色原来的内容，角色本身不会有任何改变</span></p>', '1', '1', '2017-06-20 16:23:30');
INSERT INTO `tasktitle` VALUES ('124', null, '86', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">重复执行以下克隆脚本</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">3</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">次会出现什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/26011496654455267.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">个正方形、</span><span style=\"font-family: Tahoma, sans-serif;\">2</span><span style=\"font-family: 微软雅黑, sans-serif;\">个三角形</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">个三角形、</span><span style=\"font-family: Tahoma, sans-serif;\">2</span><span style=\"font-family: 微软雅黑, sans-serif;\">个正方形</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">个三角形、</span><span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">个正方形、</span><span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">个五边形</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\"><span style=\"font-family: 微软雅黑, sans-serif;\">不确定</span></span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">由于采用随机数，所以不确定旋转的角度是多少，因此没法判断克隆体产生的是哪种形状</span></p>', '1', '1', '2017-06-20 16:23:56');
INSERT INTO `tasktitle` VALUES ('125', null, '86', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在舞台中编写脚本不会出现以下哪个？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">克隆自己</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">鼠标的</span><span style=\"font-family: Tahoma, sans-serif;\">X</span><span style=\"font-family: 微软雅黑, sans-serif;\">坐标</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">下一个背景</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">在</span><span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">到</span><span style=\"font-family: Tahoma, sans-serif;\">10</span><span style=\"font-family: 微软雅黑, sans-serif;\">间随机选一个数</span></span></p>', 'A', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">舞台是无法克隆自己的，允许克隆其它角色</span></p>', '1', '1', '2017-06-20 16:24:19');
INSERT INTO `tasktitle` VALUES ('126', null, '88', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个不是逻辑运算符？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/9731496654572969.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/641496654572975.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/61441496654572937.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/94501496654572968.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为条件判断语句，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">属于逻辑运算符，并且逻辑运算符在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中只有与、或、不成立</span></p>', '1', '1', '2017-06-20 16:27:26');
INSERT INTO `tasktitle` VALUES ('127', null, '88', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下脚本经过运算后哪个为真？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/15711496654625628.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/87451496654625626.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/36991496654625628.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/62291496654625631.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为假、由于与运算符要求左右两边同时为真时其运算结果才为真，所以</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">均为假</span></p>', '1', '1', '2017-06-20 16:27:43');
INSERT INTO `tasktitle` VALUES ('128', null, '88', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下脚本经过运算后哪个为假？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/51921496654694238.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/72411496654694264.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/93231496654694264.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/46691496654694265.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span>A</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为真、由于或运算符要求左右两边同时为假时其运算结果才为假，所以</span><span>B</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span>C</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">均为真</span></span></p>', '1', '1', '2017-06-20 16:28:03');
INSERT INTO `tasktitle` VALUES ('129', null, '88', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下脚本经过运算后哪个为假？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/26221496654765532.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/14561496654765559.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/94681496654765560.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/67271496654765564.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中不成立里面的条件为真，但是经过不成立取反后为假，同样的假的经过不成立后将会变为真</span></p>', '1', '1', '2017-06-20 16:28:30');
INSERT INTO `tasktitle` VALUES ('130', null, '88', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在执行下列脚本时输入</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">1000</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">时，角色会说什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170605/73391496654850263.png\" style=\"width: 249px; height: 257px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">优秀</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family:微软雅黑, sans-serif\">及格</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">不及格</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">输入异常</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">由于输入</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1000</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，不满足脚本中的任何一个逻辑判断所以最后将执行输入异常</span></p>', '1', '1', '2017-06-20 16:28:54');
INSERT INTO `tasktitle` VALUES ('131', null, '88', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个说法是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">与运算符中档两个布尔表达式都为</span><span style=\"font-family: Tahoma, sans-serif;\">true</span><span style=\"font-family: 微软雅黑, sans-serif;\">时，结果为</span><span style=\"font-family: Tahoma, sans-serif;\">true</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">或运算符只要有一个布尔表达为</span><span style=\"font-family: Tahoma, sans-serif;\">true</span><span style=\"font-family: 微软雅黑, sans-serif;\">时，结果为</span><span style=\"font-family: Tahoma, sans-serif;\">true</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">不成立运算符当布尔表达式为</span><span style=\"font-family: Tahoma, sans-serif;\">false</span><span style=\"font-family: 微软雅黑, sans-serif;\">是，结果为</span><span style=\"font-family: Tahoma, sans-serif;\">true</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不成立运算符当布尔表达式为</span><span style=\"font-family: Tahoma, sans-serif;\">true</span><span style=\"font-family: 微软雅黑, sans-serif;\">是，结果仍然为</span><span style=\"font-family: Tahoma, sans-serif;\">true</span></span></p>', 'A', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">不成立运算符就是取反运算符，当表达式为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">时，结果取反为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">false</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，当表达式为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">false</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">时，结果取反为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span></p>', '1', '1', '2017-06-20 16:29:13');
INSERT INTO `tasktitle` VALUES ('132', null, '87', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行以下哪一个积木块返回的值不是数字？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/18261496709153775.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/49381496709153804.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/25561496709153806.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/81931496709153809.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的结果是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">3</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\"> <span>C</span></span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的结果是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的结果是</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">或者</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的结果为</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，这个一个布尔类型的值，布尔类型只有两个值，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">false </span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">和</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\"> true</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，通常用来判断条件是否成立。</span></p>', '1', '1', '2017-06-20 16:25:01');
INSERT INTO `tasktitle` VALUES ('133', null, '87', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行以下哪一个积木块不能让角色处于显示状态？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/25951496709209275.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/50531496709209275.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/12321496709209279.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/16841496709209278.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的判断条件是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1=1</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为真所以显示，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的判断条件是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2&gt;1</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">位真所以显示，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的判断条件是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1&lt;2&lt; span=&quot;&quot;&gt;<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为真所以显示，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的判断条件是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2&lt;1&lt; span=&quot;&quot;&gt;<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">位假，所以一直处于循环内</span><!--1<--></span><!--2<--></span></p>', '1', '1', '2017-06-20 16:25:21');
INSERT INTO `tasktitle` VALUES ('134', null, '87', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">不能够使角色在舞台中左右循环移动的积木块是哪一个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/57821496709277165.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/74691496709277250.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/30521496709277226.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/37761496709277255.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">由于舞台中</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的坐标区间在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">[-240</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">240]</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，所以只判断</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">&gt;240</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">还是不够的，还需要在判断当</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">&lt;-240&lt; span=&quot;&quot;&gt;<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">这个范围</span><!---240<--></span></p>', '1', '1', '2017-06-20 16:25:42');
INSERT INTO `tasktitle` VALUES ('135', null, '87', '2', '<p><span style=\"font-size:12px\"><span style=\"font-family: 微软雅黑, sans-serif;\">不能够使角色</span><span style=\"font-family: Tahoma, sans-serif;\">x</span><span style=\"font-family: 微软雅黑, sans-serif;\">坐标增加的积木块是哪一个？</span></span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/16791496709379296.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/90181496709379298.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/50501496709379271.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/62261496709379244.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/66971496709332877.png\"/>需要填入数字参数，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">选项中参数为布尔类型返回值</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，无法与数字进行运算</span></p>', '1', '1', '2017-06-20 16:26:11');
INSERT INTO `tasktitle` VALUES ('136', null, '87', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">使角色碰到苹果不隐藏的积木块是哪一个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/72281496709436598.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/31931496709436598.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/43321496709436600.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/64161496709436602.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">判断语句只执行一次，如果需要对一个角色的动作进行监控，需要将判断语句放到循环语句中来进行持续监听</span></p>', '1', '1', '2017-06-20 16:26:30');
INSERT INTO `tasktitle` VALUES ('137', null, '87', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行下面这段积木块在询问框中输入</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">150</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">后角色会说以下哪一个句话？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/85441496709516317.png\" style=\"width: 164px; height: 261px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">异常</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">优秀</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">及格</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不及格</span></span></p>', 'A', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">询问语句在未输入数据并确认时将一直处于等待状态，不会执行下面的代码，所以不需要将判断语句放在循环语句当中，由于输入的是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">150</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，大于</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">100</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">所以会提示异常</span></p>', '1', '1', '2017-06-20 16:26:52');
INSERT INTO `tasktitle` VALUES ('138', null, '89', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个不属于侦测舞台的属性？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">背景</span><span style=\"font-family: Tahoma, sans-serif;\">#</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">背景名称</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">造型</span><span style=\"font-family: Tahoma, sans-serif;\">#</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">音量</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">造型</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">#</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">是针对角色的属性监控，角色可以侦测的属性有</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标、</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">y</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标、方向、造型</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">#</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、自定义名子、大小、音量</span></p>', '1', '1', '2017-06-20 16:29:56');
INSERT INTO `tasktitle` VALUES ('139', null, '89', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">关于侦测按钮是否按下的说法错误的是？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测脚本可以对空格键、上下左右按键进行监测</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测脚本可以对数字键进行监测</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测脚本可以对字母键进行监测</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测脚本无法对任意按键进行监测</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在侦测模块中的按键</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">…</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">是否按下</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">?</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">脚本可以实现对任意按键进行监测的功能</span></p>', '1', '1', '2017-06-20 16:30:15');
INSERT INTO `tasktitle` VALUES ('140', null, '89', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个积木块不能够显示在舞台中？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">回答</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">响度</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">计时器</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">用户名</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">回答、响度、计时器均可以手动设置现在在舞台中的状态，状态为显示或隐藏</span></p>', '1', '1', '2017-06-20 16:30:32');
INSERT INTO `tasktitle` VALUES ('141', null, '89', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在背景为黄色舞台中执行以下脚本后变量的值是什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/31511496709791271.png\" style=\"width: 171px; height: 229px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.2</span></p>', '<p><span style=\"font-size:12px\">B.3</span></p>', '<p><span style=\"font-size:12px\">C.4</span></p>', '<p><span style=\"font-size:12px\">D.5</span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">由于背景为黄色，所以将重复执行两次变量增加</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，然后跳出循环后变量增加</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，最终结果为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">5</span></p>', '1', '1', '2017-06-20 16:31:02');
INSERT INTO `tasktitle` VALUES ('142', null, '89', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个关于鼠标的属性是</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">无法侦测的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">是否按下鼠标</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">鼠标的大小</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">鼠标的</span><span style=\"font-family: Tahoma, sans-serif;\">X</span><span style=\"font-family: 微软雅黑, sans-serif;\">坐标</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">鼠标的</span><span style=\"font-family: Tahoma, sans-serif;\">Y</span><span style=\"font-family: 微软雅黑, sans-serif;\">坐标</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">大小只针对角色进行监控的属性，鼠标只能监控是否按下、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">X</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Y</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标</span></p>', '1', '1', '2017-06-20 16:31:23');
INSERT INTO `tasktitle` VALUES ('143', null, '89', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个说法是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测响度是全局的，并非针对某个角色</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测响度是可以设置显示、隐藏状态的</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测响度值的范围在</span><span style=\"font-family: Tahoma, sans-serif;\">0~100</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测响度值的范围在</span><span style=\"font-family: Tahoma, sans-serif;\">0~100</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">开启视频摄像头是用来侦测角色动作或方向的，跟响度无关</span></p>', '1', '1', '2017-06-20 16:31:56');
INSERT INTO `tasktitle` VALUES ('144', null, '91', '2', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">能够让角色按照按照指定角色旋转的指令是？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/85301496710182538.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/26051496710182561.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/83261496710182566.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/32491496710182568.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为移动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">10</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">步的脚本，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">使角色移动到鼠标指针处的脚本</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">,C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">使角色面向</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">90</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°的脚本</span></p>', '1', '1', '2017-06-20 16:33:30');
INSERT INTO `tasktitle` VALUES ('145', null, '91', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行以下哪一个积木块能够一直面向</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">Ball</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/19681496710230699.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/96101496710230699.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/58521496710230698.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/65301496710230700.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">和</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">只执行了一次面向</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Ball</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">指定面向角色有误</span></p>', '1', '1', '2017-06-20 16:33:47');
INSERT INTO `tasktitle` VALUES ('146', null, '91', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪段指令让角色追着鼠标旋转？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/93741496710285269.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/6601496710285269.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/63861496710285271.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/7901496710285270.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">和</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">只执行了一次面向</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Ball</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">指定面向角色有误</span></p>', '1', '1', '2017-06-20 16:34:06');
INSERT INTO `tasktitle` VALUES ('147', null, '91', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行下面这段指令会让角色一直面向鼠标方向，在脚本中添加哪一个指令可以让角色随鼠标旋转的慢一些？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/18221496710321834.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/94111496710346117.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/95461496710346117.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/32511496710346120.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/1371496710346118.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">只有加入等待时间才能让角色面向鼠标指针转动的速度慢一些</span></p>', '1', '1', '2017-06-20 16:34:29');
INSERT INTO `tasktitle` VALUES ('148', null, '91', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行下面这段指令会让角色一直面向鼠标方向，在脚本中添加哪一个指令可以让角色随鼠标旋转？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/59301496710441008.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/12061496710453151.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/54841496710453177.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/2551496710453178.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/99881496710453184.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">选项是的运算结果为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，其它均为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">false</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，如果要执行面向鼠标指针就需要</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span></p>', '1', '1', '2017-06-20 16:34:47');
INSERT INTO `tasktitle` VALUES ('149', null, '91', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行一下程序，会出现什么效果？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/40461496710490351.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">角色说</span><span style=\"font-family: Tahoma, sans-serif;\">”</span><span style=\"font-family: 微软雅黑, sans-serif;\">失败啦！</span><span style=\"font-family: Tahoma, sans-serif;\">”2</span><span style=\"font-family: 微软雅黑, sans-serif;\">秒钟</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">角色会随时面向鼠标方向</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">角色会一直说&quot;失败啦！</span><span style=\"font-family: 微软雅黑, sans-serif;\">&quot;</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">角色根本不会说&quot;失败啦！&quot;，也不会随时面向鼠标方向</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">因为程序没有放到循环里，所以只执行一次，无法达到随时面向鼠标方向</span></p>', '1', '1', '2017-06-20 16:35:06');
INSERT INTO `tasktitle` VALUES ('150', null, '92', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个积木块能够让角色一直向着鼠标方向移动？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/7871496710632382.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/8091496710632381.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/31231496710632436.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/21801496710632457.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">只有</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">放在循环里里面并且和移动积木组合</span></p>', '1', '1', '2017-06-20 16:35:45');
INSERT INTO `tasktitle` VALUES ('151', null, '92', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行下面这段指令会让角色移动非常快，在脚本中去掉移动100步后添加哪一个指令可以让角色行走慢一点？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/21281496710823154.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/801496710830081.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/90281496710830106.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/45171496710830109.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/77891496710830111.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">只有让移动步数越小越能让角色的移动速度慢一些</span></p>', '1', '1', '2017-06-20 16:36:04');
INSERT INTO `tasktitle` VALUES ('152', null, '92', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪段指令让角色追着鼠标移动？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/461496710895699.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/55551496710895756.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/70081496710895762.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/79961496710895765.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为将角色移动到鼠标所在位置，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色面向鼠标指针，只移动</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">10</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">步，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为角色面向鼠标指针</span></p>', '1', '1', '2017-06-20 16:36:28');
INSERT INTO `tasktitle` VALUES ('153', null, '92', '2', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">点击小绿旗运行程序以后，以下哪段程序可以让角色一直移动？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/90101496710975560.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/47371496710975610.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/48811496710975617.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/36691496710975616.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px\"><span style=\"font-family: Tahoma, sans-serif;\">A</span><span style=\"font-family: 微软雅黑, sans-serif;\">为向前移动</span><span style=\"font-family: Tahoma, sans-serif;\">10</span><span style=\"font-family: 微软雅黑, sans-serif;\">步，</span><span style=\"font-family: Tahoma, sans-serif;\">B</span><span style=\"font-family: 微软雅黑, sans-serif;\">为向前移动</span><span style=\"font-family: Tahoma, sans-serif;\">100</span><span style=\"font-family: 微软雅黑, sans-serif;\">步，</span><span style=\"font-family: Tahoma, sans-serif;\">C</span><span style=\"font-family: 微软雅黑, sans-serif;\">为一直向前移动，</span><span style=\"font-family: Tahoma, sans-serif;\">D</span><span style=\"font-family: 微软雅黑, sans-serif;\">为角色逆时针一直旋转</span></span></p>', '1', '1', '2017-06-20 16:37:00');
INSERT INTO `tasktitle` VALUES ('154', null, '92', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行下面这段指令会让角色一直面向鼠标方向，在脚本中添加哪一个指令可以让角色随鼠标旋转的慢一些？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/37641496711021569.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/45171496711047875.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/89301496711047909.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/79461496711047909.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/15891496711047912.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">只有将移动步数减少才能让角色面向鼠标指针平稳的减速移动</span></p>', '1', '1', '2017-06-20 16:37:18');
INSERT INTO `tasktitle` VALUES ('155', null, '92', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行下面这段指令会让角色一直向鼠标方向移动，在脚本中添加哪一个指令可以让角色随鼠标旋转？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/94161496711138276.png\" style=\"width: 121px; height: 148px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/68391496711170331.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/47191496711170352.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/49061496711170355.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/89751496711170354.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">选项是的运算结果为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，其它均为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">false</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，如果要执行面向鼠标指针就需要</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span></p>', '1', '1', '2017-06-20 16:37:39');
INSERT INTO `tasktitle` VALUES ('156', null, '94', '2', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">以下哪一个积木块表示发送了广播？</span></p>', '<p><span style=\"font-size:12px\">A.</span></p><p><span style=\"font-size:12px\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/79061496711259918.png\" style=\"\"/></span></p><p><br/></p><p><br/></p><p><br/></p><p><br/></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/35991496711259918.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/18271496711259921.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/82111496711259946.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">向所有角色和背景发送了“狗狗跑”广播</span></p>', '1', '1', '2017-06-20 16:39:21');
INSERT INTO `tasktitle` VALUES ('157', null, '94', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个积木是等到所有接受消息的脚本执行完毕后才继续向下执行？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/62841496711324558.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/17331496711324559.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/63981496711324564.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/92541496711324562.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">是等到所有接受消息的脚本都执行完毕后才继续向下执行脚本</span></p>', '1', '1', '2017-06-20 16:39:37');
INSERT INTO `tasktitle` VALUES ('158', null, '94', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">当角色接收到广播时会运行下面这段指令，以下哪一个脚本不会执行说“</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">hello</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">”？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/23831496711380285.png\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/77031496711402109.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/20711496711402103.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/56971496711402047.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/10651496711402103.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">是等到所有接受消息的脚本都执行完毕后才继续向下执行脚本，此时广播执行的是循环语句，所以会一直执行下去，直到停止程序</span></p>', '1', '1', '2017-06-20 16:40:03');
INSERT INTO `tasktitle` VALUES ('159', null, '94', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一项说法是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">广播在项目中可以发送多次</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">广播是针对角色的</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">广播是全局的</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">广播里面可以继续发送广播</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">广播不是针对角色的而是针对整个</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">项目的</span></p>', '1', '1', '2017-06-20 16:40:35');
INSERT INTO `tasktitle` VALUES ('160', null, '94', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">能够让程序完全停止的指令是？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/48401496711509573.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/67371496711509597.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/86621496711509598.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/43341496711509600.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为发送一个叫做停止的广播，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为停止当前角色或背景的脚本，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为停止角色的其他脚本</span></p>', '1', '1', '2017-06-20 16:41:21');
INSERT INTO `tasktitle` VALUES ('161', null, '94', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个积木块将一直执行下去无法停止？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/65281496711573746.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/94381496711573782.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/74501496711573782.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/76001496711573756.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在“狗狗跑”广播中继续发送“狗狗跑”广播，此段脚本相当于处在循环中</span></p>', '1', '1', '2017-06-20 16:41:45');
INSERT INTO `tasktitle` VALUES ('162', null, '95', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个积木块能够确保让角色处于隐藏状态？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/2491496711662062.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/99491496711662087.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/89431496711662116.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/99371496711662088.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为使角色显示，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">需要将虚像值设置为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">100</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">下移一层不能够一定让角色被遮盖</span></p>', '1', '1', '2017-06-20 16:42:18');
INSERT INTO `tasktitle` VALUES ('163', null, '95', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个积木块能够在角色说完话后正常显示？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/2031496711725561.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/74481496711725566.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/44221496711725565.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/29981496711725567.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">会在说完话后隐藏，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">会在说完话后执行虚像值变化，影响显示效果</span></p>', '1', '1', '2017-06-20 16:42:51');
INSERT INTO `tasktitle` VALUES ('164', null, '95', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">点击小绿旗ADSF运行程序后，以下哪段程序可以让角色一直显示在舞台上？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/62861496711792340.png\" style=\"white-space: normal; width: 154px; height: 201px;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/76071496711792451.png\" style=\"white-space: normal; width: 152px; height: 213px;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/66661496711792427.png\" style=\"white-space: normal; width: 152px; height: 214px;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/10271496711792440.png\" style=\"white-space: normal; width: 153px; height: 215px;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">选项中判断角色是否隐藏的条件是判断</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Y</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标，但是并没有改变</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Y</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标的值，所以不会触发条件以内的动作</span></p>', '1', '1', '2017-06-20 16:43:10');
INSERT INTO `tasktitle` VALUES ('165', null, '95', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">点击小绿旗运行程序后，以下哪段程序可以让角色进行造型切换？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/63121496711914195.png\" style=\"white-space: normal; width: 185px; height: 177px;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/26141496711914254.png\" style=\"white-space: normal; width: 237px; height: 185px;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/69161496711914251.png\" style=\"white-space: normal; width: 248px; height: 177px;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/59161496711914233.png\" style=\"white-space: normal; width: 84px; height: 97px;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">选项中条件判断中获取的是角色的自定义名称，不会随着运动而改变值</span></p>', '1', '1', '2017-06-20 16:43:27');
INSERT INTO `tasktitle` VALUES ('166', null, '95', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">角色造型一直处于循环切换需要执行以下哪一个积木块？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/98021496712019624.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/29381496712019676.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/38481496712019679.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/65131496712019688.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size: 15px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">只切换造型</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">10</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">一直在将造型切换为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">’</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">造型</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1’</span><span style=\"font-size:12px;font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size: 15px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">同样在将造型切换为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">’ </span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">造型</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1’</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">且共执行</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">10</span><span style=\"font-size:12px;font-family: &#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次</span></p>', '1', '1', '2017-06-20 16:43:46');
INSERT INTO `tasktitle` VALUES ('167', null, '95', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">不能够使角色在舞台中左右循环移动的积木块是哪一个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/14521496712083647.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/82521496712083647.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/70421496712083648.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/44371496712379151.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">由于舞台中</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的坐标区间在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">[-240</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">240]</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，所以只判断</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">&gt;240</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">还是不够的，还需要在判断当</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">x</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">&lt;-240&lt; span=&quot;&quot;&gt;<span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">这个范围</span><!---240<--></span></p>', '1', '1', '2017-06-20 16:44:04');
INSERT INTO `tasktitle` VALUES ('168', null, '96', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在舞台缩略图下方从素材库选取指定舞台背景的按钮是哪个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/82761496712483026.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/30371496712483019.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/96471496712482994.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/93981496712483025.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p style=\"line-height:15px;vertical-align:middle\"><span style=\"font-size:12px\"><span>&nbsp;<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/82761496712483026.png\" style=\"white-space: normal;\"/>点击</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">后将在素材库中选取指定背景，<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/30371496712483019.png\" style=\"white-space: normal;\"/></span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">点击后将开始绘制自己想要的背景，<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/93981496712483025.png\" style=\"white-space: normal;\"/></span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">点击后将开启摄像头（电脑已有）进行拍照的图片当做背景，<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/96471496712482994.png\" style=\"white-space: normal;\"/></span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">点击后将从本地选择图片载入到</span><span>Scratch</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中</span></span></p>', '1', '1', '2017-06-20 16:45:04');
INSERT INTO `tasktitle` VALUES ('169', null, '96', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个积木无法针对背景使用？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/90521496712579012.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/11491496712579038.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/94851496712579041.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/97661496712579040.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在舞台背景的脚本编辑中无法使用动作模块下的任何积木块</span></p>', '1', '1', '2017-06-20 16:45:29');
INSERT INTO `tasktitle` VALUES ('170', null, '96', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个积木在背景中无法使用？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/27421496712733444.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/85711496712733472.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/11981496712733472.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/88991496712733502.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">选项是针对角色的积木块，不能控制背景切换</span></p>', '1', '1', '2017-06-20 16:45:47');
INSERT INTO `tasktitle` VALUES ('171', null, '96', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行下面哪个积木块无法实现角色移动到舞台边缘后切换背景重新移动？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/12731496712862519.png\" style=\"white-space: normal; width: 145px; height: 152px;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/65241496712862536.png\" style=\"white-space: normal; width: 145px; height: 160px;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/64531496712862535.png\" style=\"white-space: normal; width: 150px; height: 159px;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/31071496712782736.png\" style=\"white-space: normal; width: 159px; height: 165px;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">选项中判断角色是否切换背景的条件是判断</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Y</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标，但是并没有改变</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Y</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标的值，所以不会触发条件以内的动作</span></p>', '1', '1', '2017-06-20 16:46:09');
INSERT INTO `tasktitle` VALUES ('172', null, '96', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个积木在编辑背景的脚本中会出现的？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/69351496713045467.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/141496713045494.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/75711496713045497.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/37241496713045528.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">都是在编辑角色时，外观模块中包含的积木</span></p>', '1', '1', '2017-06-20 16:46:29');
INSERT INTO `tasktitle` VALUES ('173', null, '96', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">在画笔模块中，以下哪一个积木在背景和角色中都可用？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/61121496713116568.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/18041496713116592.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/87751496713116592.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/66021496713116612.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">都是在编辑角色时，画笔模块中包含的积木</span></p>', '1', '1', '2017-06-20 16:46:49');
INSERT INTO `tasktitle` VALUES ('174', null, '98', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下关于变量的说法错误的是哪个？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">变量是被命名的计算机内存区域</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">变量的一个重要用法是存储算术表达式的结果，从而方便脚本随后使用</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中的变量名是对大小写敏感的，例如，</span><span style=\"font-family: Tahoma, sans-serif;\">side</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">SIDE</span><span style=\"font-family: 微软雅黑, sans-serif;\">是不同的两个变量</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中变量的作用范围只适用于当前角色</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在创建变量时可以选择其作用范围。如果选择了仅适用于当前角色，那么变量只能在当前角色内访问，其他的角色只能读取，但不能修改</span></p>', '1', '1', '2017-06-20 16:47:33');
INSERT INTO `tasktitle` VALUES ('175', null, '98', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下积木块中给变量赋值为布尔值的是哪个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/70021496713233221.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/61211496713233247.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/46301496713233284.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/99521496713233292.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为变量赋值为当前角色的</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">X</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">坐标，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为变量赋值为</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">3</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为变量赋值为回答积木的返回值</span></p>', '1', '1', '2017-06-20 16:47:52');
INSERT INTO `tasktitle` VALUES ('176', null, '98', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">运行以下哪一个脚本后变量的值不是</span><span style=\"font-size: 12px; font-family: Tahoma, sans-serif;\">10</span><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/81971496713283319.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/90071496713283320.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/7251496713283321.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/81711496713283324.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">这一段代码使用的积木将变量</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">…</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的值设定为是赋值，不会随着循环增加</span></p>', '1', '1', '2017-06-20 16:48:19');
INSERT INTO `tasktitle` VALUES ('177', null, '98', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪一个是变量模块中的积木展示？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/52471496713346940.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/10591496713346948.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/54201496713346946.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/5741496713346949.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">、</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">都是侦测模块中的积木展示</span></p>', '1', '1', '2017-06-20 16:48:36');
INSERT INTO `tasktitle` VALUES ('178', null, '98', '2', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">以下说法中错误的是哪一个？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">变量是可以设置任意值的</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">变量是可以隐藏的</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">变量是有作用范围的</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">变量的创建是有数量的</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">变量可以随意创建，不存在个数的限制</span></p>', '1', '1', '2017-06-20 16:49:01');
INSERT INTO `tasktitle` VALUES ('179', null, '98', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">当按下绿旗后，以下哪个选项是“变量”的最终值？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/83261496713523989.png\" style=\"width: 250px; height: 205px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.1</span></p>', '<p><span style=\"font-size:12px\">B.-1</span></p>', '<p><span style=\"font-size:12px\">C.0</span></p>', '<p><span style=\"font-size:12px\">D.50</span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">变量处于</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的余数只能是</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">或</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">0</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，所以“变量”按照脚本执行了</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">50</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次增加</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1,50</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">次增加</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">-1</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，最后结果为</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">0</span></p>', '1', '1', '2017-06-20 16:49:28');
INSERT INTO `tasktitle` VALUES ('180', null, '99', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个说法是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">新建功能块可以在任何舞台或角色中创建</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">新建功能块是全局的，在一个角色中创建后其它角色均可使用</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">新建功能块可以有参数</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">新建功能块可以无参数</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">新建功能块不是全局的，只能在创建功能块的角色中调用，但是传递的参数可以使变量，变量可能是全局的</span></p>', '1', '1', '2017-06-20 16:50:09');
INSERT INTO `tasktitle` VALUES ('181', null, '99', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个类型的参数在新建功能块无法添加？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">数字参数</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">字符串参数</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">布尔参数</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">对象参数</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">对象其实就是一种封装的概念，它把事物封装成一个类，然后提供类的接口，而具体的过程人们是看不到的。举个例子，比如我用</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">语言写一个交换函数</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\"> swap(a,b);</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当你引用这个函数时，你可以完全的看到执行的过程</span></p>', '1', '1', '2017-06-20 16:50:30');
INSERT INTO `tasktitle` VALUES ('182', null, '99', '2', '<p><span style=\"font-family: 微软雅黑, sans-serif;font-size:12px\">调用画正方形的函数方法后角色会画出什么形状？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/97591496713778216.png\" style=\"width: 138px; height: 174px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">五边形</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">正方形</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">三角形</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不确定</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">函数的命名与函数本身要完成的功能没有任何联系，只起到了说明作用，该函数体内的脚本执行后将控制角色画出三角形</span></p>', '1', '1', '2017-06-20 16:50:57');
INSERT INTO `tasktitle` VALUES ('183', null, '99', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个不属于右键点击自定义模块的功能？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">复制</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">编辑</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">动作</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">添加注释</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">动作属于侦测模块里面用于侦测角色的属性，自定义模块的功能具体有如下</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">:</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">复制、删除、帮助、编辑、定义、添加注释</span></p>', '1', '1', '2017-06-20 16:51:13');
INSERT INTO `tasktitle` VALUES ('184', null, '99', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下自定义模块中哪一个是正确的定义形式？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/19061496713879160.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/67731496713879216.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/881496713879218.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/54071496713879191.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在自定义模块的时候，自定义模块名可以当做函数的说明，应当只管且可以读懂，可望文知义，不必进行解码，同时画多边形时不能确定的因素设置为变量有边数、边长</span></p>', '1', '1', '2017-06-20 16:51:42');
INSERT INTO `tasktitle` VALUES ('185', null, '99', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个不属于更多模块中的参数？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">添加数字</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">添加字符串</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">添加布尔值</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">添加文本标签</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">添加文本标签属于更多模块中的说明性功能，不会因为其内容的改变影响更多模块的运行的结果</span></p>', '1', '1', '2017-06-20 16:52:01');
INSERT INTO `tasktitle` VALUES ('186', null, '100', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个变量不属于字符串？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"white-space: normal;\">&quot;<span style=\"font-family:微软雅黑, sans-serif\">1</span></span><span style=\"white-space: normal;\">&quot;</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"white-space: normal;\">&quot;<span style=\"font-family: Tahoma, sans-serif;\">B</span></span><span style=\"white-space: normal;\">&quot;</span></span></p>', '<p><span style=\"font-size:12px\">C.&quot;<span style=\"font-family: 微软雅黑, sans-serif;\">字符串</span>&quot;</span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: Tahoma, sans-serif;\">100</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">选线是数字，其他选项都是字符串，可以看出来带有字符串与数组使用</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">””</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">来区分</span></p>', '1', '1', '2017-06-20 16:52:35');
INSERT INTO `tasktitle` VALUES ('187', null, '100', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个脚本无法使用字符串？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/2331496714190976.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/86991496714190999.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/26621496714191000.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/32271496714191002.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">字符串无法进行加减运算，但是可以比较，比如</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">a<b< span=\"\"><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">是返回</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span></b<></span></p>', '1', '1', '2017-06-20 16:52:55');
INSERT INTO `tasktitle` VALUES ('188', null, '100', '2', '<p><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/55331496714231208.png\"/><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">的返回值？</span></p>', '<p><span style=\"font-size:12px\">A.7</span></p>', '<p><span style=\"font-size:12px\">B.8</span></p>', '<p><span style=\"font-size:12px\">C.9</span></p>', '<p><span style=\"font-size:12px\">D.10</span></p>', 'C', '<p style=\"line-height:15px\"><span style=\"font-size:12px\"><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">“你好</span> <span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">我是橙小乐</span><span>!</span><span style=\"font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">”其中包含汉字、空格、符号，这些元素都属于字符，字符累加起来变成字符串</span></span></p>', '1', '1', '2017-06-20 16:53:42');
INSERT INTO `tasktitle` VALUES ('189', null, '100', '2', '<p><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/19461496714349521.png\"/><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">的返回值？</span></p>', '<p><span style=\"font-size:12px\">A.?</span></p>', '<p><span style=\"font-size:12px\">B.空格</span></p>', '<p><span style=\"font-size:12px\">C.更</span></p>', '<p><span style=\"font-size:12px\">D.橙</span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">数字、汉字、空格、符号在字符串中都属于字符，所以第四个字符为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">?</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，第五个字符为空格，第六个字符为更</span></p>', '1', '1', '2017-06-20 16:54:12');
INSERT INTO `tasktitle` VALUES ('190', null, '100', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行以下代码后，角色会说什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/6391496714447162.png\" style=\"width: 153px; height: 255px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.aa</span></p>', '<p><span style=\"font-size:12px\">B.ab</span></p>', '<p><span style=\"font-size:12px\">C.bc</span></p>', '<p><span style=\"font-size:12px\">D.bd</span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">ASCII</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">是基于拉丁字母的一套电脑编码系统，其中</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">a</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的值为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">97</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">b</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的值为</span><span style=\"font-size: 15px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">98</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，以此类推，所以根据加法运算选择</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span></p>', '1', '1', '2017-06-20 16:54:36');
INSERT INTO `tasktitle` VALUES ('191', null, '100', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行以下代码后得到的变量长度是多少？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/5471496714493321.png\" style=\"width: 258px; height: 97px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.0</span></p>', '<p><span style=\"font-size:12px\">B.1</span></p>', '<p><span style=\"font-size:12px\">C.2</span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不确定</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当变量被赋值后，变为字符串变量，该字符串长度为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，所以输出</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2</span></p>', '1', '1', '2017-06-20 16:54:52');
INSERT INTO `tasktitle` VALUES ('192', null, '101', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个说法是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测时间积木可以获取电脑当前时间</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测时间积木可以获取电脑当前时间</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测时间积木侦测星期日值为</span><span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">星期六值为</span><span style=\"font-family: Tahoma, sans-serif;\">7</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测时间积木无法过去毫秒级时间</span></span></p>', 'A', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">侦测时间积木只能获取</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">所在电脑的当前时间</span></p>', '1', '1', '2017-06-20 16:55:20');
INSERT INTO `tasktitle` VALUES ('193', null, '101', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">侦测时间积木关于返回值的说法错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测时间返回星期值的类型是字符型</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测时间返回年的类型是数字</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测时间返回日期值的类型是数字</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">侦测时间积木返回的值均为数字</span></span></p>', 'A', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中，侦测积木块的返回值是数字，可以与运算符模块中的积木进行组合使用</span></p>', '1', '1', '2017-06-20 16:55:36');
INSERT INTO `tasktitle` VALUES ('194', null, '101', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下关于计时器的说法哪个是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">计时器在新建项目后开始计数</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\"><span style=\"font-family: 微软雅黑, sans-serif;\">采用计时器归零积木可以重置计时器为</span><span style=\"font-family: Tahoma, sans-serif;\">0</span></span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">计时器可以暂停</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">计时器可以控制在舞台的显示状态</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">计时器随项目建立后立即开始计数，不可以暂停，使用计时器归零积木可以重置计时器进行重新计时</span></p>', '1', '1', '2017-06-20 16:55:51');
INSERT INTO `tasktitle` VALUES ('195', null, '101', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行以下哪个脚本获取的日期是我们日常习惯的？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/2001496715297379.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/49701496715297389.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/49041496715297420.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/66391496715297425.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中，侦测星期的积木返回的值为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1~7</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，分别对应星期日</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">~</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">星期六，所以当值为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">1</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">时，表示的是星期日，值为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">时，表示的是星期一，以此类推</span></p>', '1', '1', '2017-06-20 16:56:08');
INSERT INTO `tasktitle` VALUES ('196', null, '101', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">关于模拟时钟项目的说法中错误的是？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">该程序包含四个角色</span><span style=\"font-family: Tahoma, sans-serif;\">:</span><span style=\"font-family: 微软雅黑, sans-serif;\">秒针、分针、时针、时间</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">分针每秒应顺时针旋转</span><span style=\"font-family: Tahoma, sans-serif;\">6</span><span style=\"font-family: 微软雅黑, sans-serif;\">°（</span><span style=\"font-family: Tahoma, sans-serif;\">360/60</span><span style=\"font-family: 微软雅黑, sans-serif;\">）</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">分针每秒应顺时针旋转</span><span style=\"font-family: Tahoma, sans-serif;\">6</span><span style=\"font-family: 微软雅黑, sans-serif;\">°（</span><span style=\"font-family: Tahoma, sans-serif;\">360/60</span><span style=\"font-family: 微软雅黑, sans-serif;\">）</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">时针每秒应顺时针旋转</span><span style=\"font-family: Tahoma, sans-serif;\">6</span><span style=\"font-family: 微软雅黑, sans-serif;\">°（</span><span style=\"font-family: Tahoma, sans-serif;\">360/60</span><span style=\"font-family: 微软雅黑, sans-serif;\">）</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">一个小时</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">60</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">分钟对应</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">30</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°，即每分钟</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">0.5</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">°，因此时针首先应设置为指向对应小时数，还需要加上当前时间数除以</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">的角度</span></p>', '1', '1', '2017-06-20 16:56:26');
INSERT INTO `tasktitle` VALUES ('197', null, '101', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个积木块不能够显示在舞台中？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">回答</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">响度</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">计时器</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">用户名</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">回答、响度、计时器均可以手动设置现在在舞台中的状态，状态为显示或隐藏</span></p>', '1', '1', '2017-06-20 16:56:45');
INSERT INTO `tasktitle` VALUES ('198', null, '103', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪段脚本可以实现角色按上移键时向上移动？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/59031496715600869.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/8681496715600926.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/31651496715600934.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/34971496715600939.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当按下上移键时角色会向右移动，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当按下上移键时角色会向左移动，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当按下上移键时角色会向下移动</span></p>', '1', '1', '2017-06-20 16:57:25');
INSERT INTO `tasktitle` VALUES ('199', null, '103', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪段脚本可以实现角色按上移键时向上移动？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/12831496715661468.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/29931496715661467.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/71471496715661467.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/13631496715661469.png\" style=\"white-space: normal;\"/></span></p>', 'A', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当按下移键时角色会向左移动，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当按下移键时角色会向上移动，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">D</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当按下移键时角色会向右移动</span></p>', '1', '1', '2017-06-20 16:57:52');
INSERT INTO `tasktitle` VALUES ('200', null, '103', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪段脚本可以实现点击舞台背景色改变？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/53571496715725864.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/95181496715725870.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/44341496715725871.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/88861496715725871.png\" style=\"white-space: normal;\"/></span></p>', 'D', '<p><span style=\"font-size:12px;font-family: &#39;Tahoma&#39;,&#39;sans-serif&#39;\">A</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为点击角色时，角色的颜色改变，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">B</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为点击空格键时，当前脚本所在体颜色改变，</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">C</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">为修改背景为“背景”时，颜色值改变</span></p>', '1', '1', '2017-06-20 16:58:09');
INSERT INTO `tasktitle` VALUES ('201', null, '103', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下说法中错误的是哪一个？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\"><span style=\"font-family: 微软雅黑, sans-serif;\">当按下积木可以同时控制多个角色</span></span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">当按下积木可以同时被触发</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\"><span style=\"font-family: 微软雅黑, sans-serif;\">当按下积木只针对当前角色可用</span></span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">当按下积木内不可以发送广播</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">广播可以在任何地方发送</span></p>', '1', '1', '2017-06-20 16:58:30');
INSERT INTO `tasktitle` VALUES ('202', null, '103', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个积木在针对角色编程时不会出现？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/27371496715860320.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/42671496715860346.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/56461496715860346.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/47811496715860352.png\" style=\"white-space: normal;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">当舞台被点击只有在针对舞台进行编程时才会出现在事件模块中</span></p>', '1', '1', '2017-06-20 16:58:48');
INSERT INTO `tasktitle` VALUES ('203', null, '103', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">点击绿旗后按上移键不会向上移动的是哪个？</span></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/5341496715933417.png\" style=\"white-space: normal; width: 91px; height: 77px;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/24911496715933498.png\" style=\"white-space: normal; width: 214px; height: 123px;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/78711496715933497.png\" style=\"white-space: normal; width: 228px; height: 144px;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/95221496715933500.png\" style=\"white-space: normal; width: 247px; height: 119px;\"/></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">因为只执行了一次，需要将判断嵌套在重复执行里面</span></p>', '1', '1', '2017-06-20 16:59:13');
INSERT INTO `tasktitle` VALUES ('204', null, '104', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">以下哪个说法是错误的？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中初始化链表中没有任何值</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中链表针对其内部数据有对应索引值</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中链表内部不允许存储链表</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中链表是有其作用范围的</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">链表内允许用户存储任何形式的数据，其中包括常量、变量、链表</span></p>', '1', '1', '2017-06-20 16:59:43');
INSERT INTO `tasktitle` VALUES ('205', null, '104', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行以下积木块链表中的值应该是哪个？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"></span></strong></p><p><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/84431496716181948.png\" style=\"\"/><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/59271496716182006.png\" style=\"white-space: normal;\"/></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">2</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">3</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">2</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">4</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">2</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">3</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">4</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: Tahoma, sans-serif;\">4</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">2</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">3</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">链表中不包含</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">4</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，所以执行添加</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">4</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">到链表中的积木，链表默认追加数据到链表尾端</span></p>', '1', '1', '2017-06-20 17:00:04');
INSERT INTO `tasktitle` VALUES ('206', null, '104', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">需要完成寻找最大值的功能，需要选择以下哪个？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/12381496716236045.png\" style=\"width: 274px; height: 218px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/55981496716262577.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">B.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/40851496716262579.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">C.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/33161496716262610.png\" style=\"white-space: normal;\"/></span></p>', '<p><span style=\"font-size:12px\">D.<img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/42081496716262620.png\" style=\"white-space: normal;\"/></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">假设链表中的第一个变量是最大值，直到发现另一个最大值，然后进入循环，将变量“最大值”与链表中剩余的变量进行比较（注意从数字</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">2</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">开始迭代），当链表中的变量值大于“最大值”时，设置“最大值”为该值</span></p>', '1', '1', '2017-06-20 17:00:28');
INSERT INTO `tasktitle` VALUES ('207', null, '104', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行下列脚本，果篮列表中的结果是什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"></span></strong></p><p><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/98831496716303761.png\" style=\"\"/><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/66571496716303798.png\" style=\"white-space: normal; width: 365px; height: 162px;\"/></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: 微软雅黑, sans-serif;\">苹果、香蕉、橘子、芒果、桃子</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: 微软雅黑, sans-serif;\">苹果、橘子、桃子</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: 微软雅黑, sans-serif;\">香蕉、芒果</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">为空</span></span></p>', 'D', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在如果的条件语句中结果为</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">true</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">，所有全部执行删除语句，结果将果篮内容全部清空</span></p>', '1', '1', '2017-06-20 17:01:05');
INSERT INTO `tasktitle` VALUES ('208', null, '104', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">有关链表和变量的说明，以下说法错误的是？</span></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中链表中可以存储任意变量</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中标量中可以存储任何链表</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中存储链表的变量可以像链表一样循环取值</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: Tahoma, sans-serif;\">Scratch</span><span style=\"font-family: 微软雅黑, sans-serif;\">中链表里面的值可以进行循环遍历取值</span></span></p>', 'C', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">在</span><span style=\"font-size:12px;font-family:&#39;Tahoma&#39;,&#39;sans-serif&#39;\">Scratch</span><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">中将链表赋值给变量后，变量已经变为字符串，无法进行进行遍历</span></p>', '1', '1', '2017-06-20 17:01:26');
INSERT INTO `tasktitle` VALUES ('209', null, '104', '2', '<p><span style=\"font-size: 12px; font-family: 微软雅黑, sans-serif;\">执行以下脚本后链表的结果是什么？</span></p><p><strong><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\"><img src=\"http://www.chengxiaole.com/uemini/jsp/upload/20170606/63361496716497371.png\" style=\"width: 205px; height: 147px;\"/></span></strong></p>', '<p><span style=\"font-size:12px\">A.<span style=\"font-family: Tahoma, sans-serif;\">5</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">4</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">3</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">2</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">1</span></span></p>', '<p><span style=\"font-size:12px\">B.<span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">2</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">3</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">4</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">5</span></span></p>', '<p><span style=\"font-size:12px\">C.<span style=\"font-family: Tahoma, sans-serif;\">1</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">3</span><span style=\"font-family: 微软雅黑, sans-serif;\">、</span><span style=\"font-family: Tahoma, sans-serif;\">5</span></span></p>', '<p><span style=\"font-size:12px\">D.<span style=\"font-family: 微软雅黑, sans-serif;\">不确定</span></span></p>', 'B', '<p><span style=\"font-size:12px;font-family:&#39;微软雅黑&#39;,&#39;sans-serif&#39;\">将链表以末尾的方式插入，插入的顺序为有小到大</span></p>', '1', '1', '2017-06-20 17:01:48');

-- ----------------------------
-- Table structure for task_type
-- ----------------------------
DROP TABLE IF EXISTS `task_type`;
CREATE TABLE `task_type` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '作业类型表主键',
  `type_name` varchar(255) NOT NULL COMMENT '作业类型名称',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_type
-- ----------------------------
INSERT INTO `task_type` VALUES ('1', '软件模拟', null);

-- ----------------------------
-- Table structure for teacher_resource
-- ----------------------------
DROP TABLE IF EXISTS `teacher_resource`;
CREATE TABLE `teacher_resource` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '课件名字',
  `url` varchar(255) DEFAULT NULL COMMENT '课件url',
  `type` smallint(6) DEFAULT NULL COMMENT '课件类型1是pdf',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_resource
-- ----------------------------
INSERT INTO `teacher_resource` VALUES ('6', '用户指南', 'http://oqusb90r8.bkt.clouddn.com/scratch.pdf', '1', '2017-10-09 09:37:08');
INSERT INTO `teacher_resource` VALUES ('7', '阿斯达', 'http://oqusb90r8.bkt.clouddn.com/scratch.pdf', '1', '2017-10-09 09:37:47');

-- ----------------------------
-- Table structure for teacher_task
-- ----------------------------
DROP TABLE IF EXISTS `teacher_task`;
CREATE TABLE `teacher_task` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `task_name` varchar(255) NOT NULL COMMENT '作业名字',
  `task_type` int(4) NOT NULL COMMENT '作业类型',
  `task_desc` varchar(255) NOT NULL COMMENT '作业描述',
  `menu_id` bigint(20) NOT NULL COMMENT '章节Id',
  `room_id` bigint(20) NOT NULL COMMENT '教室Id',
  `teacher_id` bigint(20) NOT NULL COMMENT '教师Id',
  `course_id` bigint(20) NOT NULL COMMENT '课程Id',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_task
-- ----------------------------

-- ----------------------------
-- Table structure for tw_comments
-- ----------------------------
DROP TABLE IF EXISTS `tw_comments`;
CREATE TABLE `tw_comments` (
  `commentsId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '作品评论表主键',
  `commentsWorkId` bigint(20) DEFAULT NULL COMMENT '作品主键',
  `commentsReleaseUserId` bigint(20) DEFAULT NULL COMMENT '发布者主键',
  `commentsDetail` text COMMENT '评论的内容',
  `commentsCreateTime` varchar(200) DEFAULT NULL COMMENT '创建时间',
  `commentsIsShow` tinyint(4) DEFAULT NULL COMMENT '是否屏蔽(0否 1是)',
  `commentReason` varchar(500) DEFAULT NULL COMMENT '屏蔽的理由',
  `commentModifyTime` varchar(200) DEFAULT NULL COMMENT '修改时间',
  `commentModifyUserId` bigint(20) DEFAULT NULL COMMENT '修改人',
  `commentReplyDetail` varchar(255) DEFAULT NULL COMMENT '回复对应评论的题目',
  PRIMARY KEY (`commentsId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='作品评论信息表';

-- ----------------------------
-- Records of tw_comments
-- ----------------------------

-- ----------------------------
-- Table structure for tw_course
-- ----------------------------
DROP TABLE IF EXISTS `tw_course`;
CREATE TABLE `tw_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程表主键',
  `cName` varchar(50) DEFAULT NULL COMMENT '课程名称',
  `cType` bigint(20) DEFAULT NULL COMMENT '课程类型',
  `cKeyWords` varchar(255) DEFAULT NULL COMMENT '关键字或知识点',
  `clvl` tinyint(4) DEFAULT NULL COMMENT '课程难度0低级1初级2中级3高级4困难',
  `cBeginTime` varchar(50) DEFAULT NULL COMMENT '开始时间',
  `cEndTime` varchar(50) DEFAULT NULL COMMENT '结束时间',
  `cTime` varchar(255) DEFAULT NULL COMMENT '上课时间',
  `cHour` int(20) DEFAULT NULL COMMENT '课时',
  `cVideoFilePath` varchar(300) DEFAULT NULL COMMENT '视频链接',
  `cPicture` varchar(200) DEFAULT NULL COMMENT '课程图片',
  `cdesc` varchar(255) DEFAULT NULL COMMENT '简要课程说明少于50个字',
  `cUserId` bigint(20) DEFAULT NULL COMMENT '讲课教师',
  `cTeachName` varchar(50) DEFAULT NULL COMMENT '教师姓名',
  `cFlag` tinyint(4) DEFAULT NULL COMMENT '标识  0免费课程 1金币课程 2精品课程',
  `cCourseNumber` int(20) DEFAULT '0' COMMENT '浏览次数',
  `cStatus` tinyint(4) DEFAULT NULL COMMENT '课程状态0最新1最热2推荐3难易',
  `cPrice` varchar(255) DEFAULT NULL COMMENT '收费金额',
  `cPrefPrice` varchar(255) DEFAULT NULL COMMENT '优惠后价格',
  `cRecommend` tinyint(4) DEFAULT NULL COMMENT '是否推荐    0不推荐 1推荐 2直播',
  `courseIsShow` tinyint(4) DEFAULT NULL COMMENT '是否在首页展示 0展示1不展示',
  `cIsDisplay` tinyint(4) DEFAULT NULL COMMENT '是否显示  0显示1不显示',
  `cScnumbers` int(11) DEFAULT '0' COMMENT '该课程被收藏的次数',
  `cListId` bigint(20) DEFAULT NULL COMMENT '备用',
  `cCreateTime` varchar(50) DEFAULT NULL COMMENT '课程上传时间',
  `cModifytime` varchar(255) DEFAULT NULL COMMENT '程课修改时间',
  `cNotice` text COMMENT '课程公告',
  `fitPeople` varchar(255) DEFAULT NULL COMMENT '适用人群',
  `cDetailNotice` text COMMENT '细节页面的课程须知',
  `cDetailDesc` text COMMENT '详细课程说明',
  `cOnlyMap` varchar(255) DEFAULT NULL COMMENT '知识地图唯一标识',
  PRIMARY KEY (`id`),
  KEY `cType` (`cType`),
  CONSTRAINT `cType` FOREIGN KEY (`cType`) REFERENCES `tw_coursetype` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_course
-- ----------------------------
INSERT INTO `tw_course` VALUES ('2', '数学1', '1', 'Scratch', '1', '2017-01-01', null, '2017-01-06', '39', null, '/teachWeb/uploadfile/images/coursepicture/scratch1.jpg', '教孩子一些scratch基础知识，以便于更好的理解和应用scratch，培养孩子的逻辑思维', '1', '李老师', '2', '1030', '0', '1299.11', '0.01', '1', '1', '0', '0', null, '2017-01-20 14:25:23', null, '测试测试测试测试', '二年级以上学生，中小学老师', '<p>测试</p><p>测试</p><p>测试</p><p>测试</p>', '<p>Scratch是一款由麻省理工学院(MIT) 设计开发的面向青少年儿童的简易编程工具。</p><p>你可以不认识英文单词，也可以不会打字，但几乎所有的孩子都会一眼喜欢上这个软件，建立起做程序的欲望。</p>', 'scratch_map_1');
INSERT INTO `tw_course` VALUES ('3', '数学2', '1', 'Scratch', '2', '2017-01-01', null, '2017-01-05', '34', null, '/teachWeb/uploadfile/images/coursepicture/scratch2.jpg', '教孩子一些scratch中级知识，以便于更好的理解和应用scratch，培养孩子的逻辑思维', '1', '李老师', '2', '506', '0', '1299.22', '0.01', '1', '1', '0', '0', null, '2017-01-20 14:25:23', null, '测试', '二年级以上学生，中小学老师', '<p style=\"white-space: normal;\">测试</p><p style=\"white-space: normal;\">测试</p><p style=\"white-space: normal;\">测试</p><p>测试</p><p><br/></p>', '<p style=\"white-space: normal;\">Scratch是一款由麻省理工学院(MIT) 设计开发的面向青少年儿童的简易编程工具。</p><p style=\"white-space: normal;\">你可以不认识英文单词，也可以不会打字，但几乎所有的孩子都会一眼喜欢上这个软件，建立起做程序的欲望。</p>', 'scratch_map_2');
INSERT INTO `tw_course` VALUES ('4', '数学3', '1', 'Scratch', '3', '2017-01-01', null, '2017-01-04', '34', null, '/teachWeb/uploadfile/images/coursepicture/scratch3.jpg', '教孩子一些scratch高级知识，以便于更好的理解和应用scratch，培养孩子的逻辑思维', '1', '李老师', '2', '1148', '0', '1299.33', '0.01', '1', '1', '0', '0', null, '2017-01-20 14:23:23', null, '测试', '二年级以上学生，中小学老师', '<p style=\"white-space: normal;\">测试</p><p style=\"white-space: normal;\">测试</p><p style=\"white-space: normal;\">测试</p><p style=\"white-space: normal;\">测试</p>', '<p style=\"white-space: normal;\">Scratch是一款由麻省理工学院(MIT) 设计开发的面向青少年儿童的简易编程工具。</p><p style=\"white-space: normal;\">你可以不认识英文单词，也可以不会打字，但几乎所有的孩子都会一眼喜欢上这个软件，建立起做程序的欲望。</p>', 'scratch_map_3');

-- ----------------------------
-- Table structure for tw_coursebuyhistory
-- ----------------------------
DROP TABLE IF EXISTS `tw_coursebuyhistory`;
CREATE TABLE `tw_coursebuyhistory` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '购买课程记录表主键',
  `userId` bigint(11) DEFAULT NULL COMMENT '用户Id',
  `childId` bigint(20) DEFAULT NULL COMMENT '孩子Id',
  `courseId` bigint(20) DEFAULT NULL COMMENT '课程Id',
  `buyTime` varchar(255) DEFAULT NULL COMMENT '支付完成时间',
  `deadline` varchar(255) DEFAULT NULL COMMENT '截止时间',
  `type` int(4) DEFAULT NULL COMMENT '0是线上 1是线下',
  `channel` varchar(10) DEFAULT NULL COMMENT '渠道（wxpay：微信，alipay：支付宝,wxpay_pc：微信pc）',
  `amount` varchar(11) DEFAULT NULL COMMENT '支付金额',
  `outTradeNo` varchar(255) DEFAULT 'null' COMMENT '订单号',
  `transaction_id` varchar(32) DEFAULT 'null' COMMENT '支付渠道订单号',
  `status` varchar(10) DEFAULT NULL COMMENT '交易状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_coursebuyhistory
-- ----------------------------

-- ----------------------------
-- Table structure for tw_coursemenu
-- ----------------------------
DROP TABLE IF EXISTS `tw_coursemenu`;
CREATE TABLE `tw_coursemenu` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '课程章节表主键',
  `courseName` varchar(255) DEFAULT NULL COMMENT '课程目录名称',
  `courseId` varchar(255) DEFAULT NULL COMMENT '课程id',
  `videoUrl` varchar(255) DEFAULT NULL COMMENT '视频URl',
  `courseImage` varchar(255) DEFAULT NULL COMMENT '课程图片',
  `coursetime` varchar(255) DEFAULT NULL COMMENT '课程时长',
  `menuLvl` int(11) DEFAULT NULL COMMENT '章节等级',
  `parentMenuLvl` bigint(20) DEFAULT NULL COMMENT '父章节Id',
  `createtime` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `createId` int(11) DEFAULT NULL COMMENT '创建人Id',
  `isDisplay` int(11) DEFAULT NULL COMMENT '是否显示 0显示 1不显示',
  `isMain` int(4) DEFAULT NULL COMMENT '1是主干 0是分支',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_coursemenu
-- ----------------------------
INSERT INTO `tw_coursemenu` VALUES ('15', '舞台和角色', '2', '2/scratch-1', null, '8分35秒', null, '0', '2017-05-24 15:33:18', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('16', '绘图', '2', '2/scratch-1-1', null, '6分59秒', null, '15', '2017-05-24 15:16:54', '1', '0', '0');
INSERT INTO `tw_coursemenu` VALUES ('17', '说和思考', '2', '2/scratch-2', null, '10分58秒', null, '15', '2017-05-24 15:34:14', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('18', '声音编辑', '2', '2/scratch-2-1', null, '8分25秒', null, '17', '2017-05-24 15:17:09', '1', '0', '0');
INSERT INTO `tw_coursemenu` VALUES ('19', '舞台剧', '2', '2/scratch-1-1-5', null, '4分40秒', null, '17', '2017-05-24 15:17:17', '1', '1', '0');
INSERT INTO `tw_coursemenu` VALUES ('20', '绝对移动', '2', '2/scratch-3', null, '6分50秒', null, '17', '2017-05-24 15:42:22', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('21', '相对移动', '2', '2/scratch-4', null, '6分26秒', null, '20', '2017-05-24 15:14:53', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('22', '角色面向', '2', '2/scratch-5', null, '9分59秒', null, '21', '2017-05-24 15:14:57', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('23', '太空行走', '2', '2/scratch-1-1-9', null, '7分23秒', null, '22', '2017-06-07 13:56:54', '1', '1', '0');
INSERT INTO `tw_coursemenu` VALUES ('24', '重复执行', '2', '2/scratch-6', null, '6分1秒', null, '22', '2017-05-24 15:15:01', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('25', '画笔', '2', '2/scratch-6-1', null, '7分36秒', null, '24', '2017-05-24 15:17:37', '1', '0', '0');
INSERT INTO `tw_coursemenu` VALUES ('35', '校园一角', '3', '', null, '5分12秒', null, '0', '2017-07-11 16:18:40', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('36', '两只老虎', '3', '', null, '7分9秒', null, '35', '2017-07-11 16:18:53', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('37', '冷笑话', '3', ' ', null, '', null, '36', '2017-07-11 16:19:11', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('38', '计时游戏', '3', ' ', null, '', null, '37', '2017-07-11 16:19:32', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('39', '音乐开关', '3', ' ', null, '', null, '38', '2017-07-11 16:19:52', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('40', '计算器', '3', ' ', null, null, null, '39', '2017-07-11 16:20:25', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('41', '魔方', '3', ' ', null, null, null, '40', '2017-07-11 16:20:44', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('42', '画画的小虫', '3', ' ', null, null, null, '41', '2017-07-20 08:47:13', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('43', '小乐抽奖', '3', ' ', null, null, null, '42', '2017-07-20 08:48:11', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('44', '飞翔的小乐', '3', '  ', null, null, null, '43', '2017-07-20 08:49:47', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('45', '自动驾驶', '3', ' ', null, null, null, '44', '2017-07-11 16:22:26', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('46', '无尽的迷宫', '3', ' ', null, null, null, '45', '2017-07-11 16:22:57', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('47', '跳跳橙小乐', '3', ' ', null, null, null, '46', '2017-07-11 16:23:27', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('48', '跑酷(上)', '3', ' ', null, null, null, '47', '2017-07-12 10:05:19', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('49', '跑酷(下)', '3', ' ', null, null, null, '48', '2017-07-12 10:05:27', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('50', '3D彩色柱', '3', ' ', null, null, null, '49', '2017-07-11 16:25:03', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('51', '魔术画笔', '3', ' ', null, '', null, '50', '2017-07-11 16:25:27', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('52', '坦克大战(上)', '3', ' ', null, null, null, '51', '2017-07-12 10:05:02', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('53', '坦克大战(下)', '3', ' ', null, null, null, '52', '2017-07-12 10:05:42', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('54', '小乐与怪物(上)', '3', ' ', null, null, null, '53', '2017-07-12 10:08:10', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('55', '小乐与怪物(下)', '3', ' ', null, null, null, '54', '2017-07-12 10:08:20', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('56', '我的时钟', '3', ' ', null, null, null, '55', '2017-07-11 16:28:17', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('57', 'IPAD(1)', '3', ' ', null, null, null, '56', '2017-07-11 16:28:49', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('58', 'IPAD(2)', '3', ' ', null, null, null, '57', '2017-07-11 16:29:04', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('59', '算数练习器', '3', ' ', null, null, null, '58', '2017-07-11 16:33:00', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('60', '大家来找茬', '3', ' ', null, null, null, '59', '2017-07-11 16:33:21', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('69', '迭代法', '4', '', null, null, null, '0', '2017-07-20 09:28:31', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('70', '斐波那契数列', '4', '', null, null, null, '69', '2017-07-20 09:29:16', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('71', '顺序查找', '4', '', null, null, null, '70', '2017-07-20 09:29:29', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('72', '二分查找', '4', '', null, null, null, '71', '2017-07-20 09:29:42', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('73', '冒泡排序', '4', '', null, null, null, '72', '2017-07-20 09:29:58', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('74', '选择排序', '4', '', null, null, null, '73', '2017-07-20 09:32:13', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('75', '什么是算法', '4', '', null, null, null, '74', '2017-07-20 09:34:03', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('76', '枚举法', '4', '', null, null, null, '75', '2017-07-20 09:34:16', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('77', '递推法(一)', '4', '', null, null, null, '76', '2017-07-20 09:36:38', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('78', '递推法(二)', '4', '', null, null, null, '77', '2017-07-20 09:36:43', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('79', '递归法(一)', '4', '', null, null, null, '78', '2017-07-20 09:37:18', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('80', '旋转方式', '2', '2/scratch-7', null, '9分38秒', null, '24', '2017-05-24 15:15:07', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('81', '造型切换', '2', '2/scratch-8', null, '8分42秒', null, '80', '2017-05-24 15:15:13', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('82', '爬楼梯', '2', ' ', null, null, null, '81', '2017-06-07 13:57:13', '1', '1', '0');
INSERT INTO `tw_coursemenu` VALUES ('83', '外观', '2', '2/scratch-9', null, '14分21秒', null, '81', '2017-05-24 15:15:18', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('84', '随机', '2', '2/scratch-10', null, '7分55秒', null, '83', '2017-05-24 15:15:22', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('85', '图章', '2', '2/scratch-10-1', null, '4分52秒', null, '84', '2017-05-24 15:18:15', '1', '0', '0');
INSERT INTO `tw_coursemenu` VALUES ('86', '克隆', '2', '2/scratch-10-2', null, '6分22秒', null, '84', '2017-05-24 15:18:20', '1', '0', '0');
INSERT INTO `tw_coursemenu` VALUES ('87', '判断', '2', '2/scratch-11', null, '5分52秒', null, '84', '2017-05-24 15:15:30', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('88', '逻辑运算符', '2', '2/scratch-11-1', null, '7分56秒', null, '87', '2017-05-24 15:18:39', '1', '0', '0');
INSERT INTO `tw_coursemenu` VALUES ('89', '侦测响度', '2', '2/scratch-11-2', null, '4分49秒', null, '87', '2017-05-24 15:18:44', '1', '0', '0');
INSERT INTO `tw_coursemenu` VALUES ('90', '看我72变', '2', ' ', null, null, null, '87', '2017-06-07 13:57:21', '1', '1', '0');
INSERT INTO `tw_coursemenu` VALUES ('91', '循环面向', '2', '2/scratch-12', null, '4分4秒', null, '87', '2017-05-24 15:15:36', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('92', '面向鼠标', '2', '2/scratch-13', null, '4分34秒', null, '91', '2017-05-24 17:18:33', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('93', '鲨口逃生', '2', ' ', null, null, null, '92', '2017-06-07 13:59:21', '1', '1', '0');
INSERT INTO `tw_coursemenu` VALUES ('94', '广播通知', '2', '2/scratch-14', null, '5分30秒', null, '92', '2017-05-24 15:15:54', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('95', '隐藏显示', '2', '2/scratch-15', null, '4分5秒', null, '94', '2017-05-24 15:16:06', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('96', '背景切换', '2', '2/scratch-16', null, '5分13秒', null, '95', '2017-05-24 15:16:13', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('97', 'Flash制作', '2', ' ', null, null, null, '96', '2017-06-07 13:59:29', '1', '1', '0');
INSERT INTO `tw_coursemenu` VALUES ('98', '变量', '2', '2/scratch-17', null, '4分33秒', null, '96', '2017-05-24 15:16:20', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('99', '函数块', '2', '2/scratch-17-1', null, '5分7秒', null, '98', '2017-05-24 15:19:26', '1', '0', '0');
INSERT INTO `tw_coursemenu` VALUES ('100', '字符串', '2', '2/scratch-18', null, '4分55秒', null, '98', '2017-05-24 15:16:35', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('101', '侦测时间', '2', '2/scratch-18-1', null, '4分18秒', null, '100', '2017-05-24 15:19:32', '1', '0', '0');
INSERT INTO `tw_coursemenu` VALUES ('102', '猜数字', '2', ' ', null, null, null, '100', '2017-06-07 13:59:39', '1', '1', '0');
INSERT INTO `tw_coursemenu` VALUES ('103', '当按下按钮', '2', '2/scratch-19', null, '4分49秒', null, '100', '2017-05-24 15:16:44', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('104', '链表', '2', '2/scratch-20', null, '6分41秒', null, '103', '2017-05-24 15:16:49', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('105', '打字练习', '2', ' ', null, null, null, '104', '2017-06-07 13:59:44', '1', '1', '0');
INSERT INTO `tw_coursemenu` VALUES ('106', '递归法(二)', '4', '', null, null, null, '79', '2017-07-20 09:37:31', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('107', '冒泡排序法', '4', '', null, null, null, '106', '2017-07-20 09:37:46', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('108', '贪心法', '4', '', null, null, null, '107', '2017-07-20 09:38:17', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('109', '哥德巴赫猜想(一)', '4', '', null, null, null, '108', '2017-07-20 09:38:39', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('110', '哥德巴赫猜想(二)', '4', '', null, null, null, '109', '2017-07-20 13:19:39', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('111', '太空对战(一)', '4', '', null, null, null, '110', '2017-07-20 09:39:02', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('112', '太空对战(二)', '4', '', null, null, null, '111', '2017-07-20 09:39:09', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('113', '太空对战(三)', '4', '', null, null, null, '112', '2017-07-20 09:39:34', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('114', '太空对战(四)', '4', '', null, null, null, '113', '2017-07-20 09:39:43', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('115', '太空对战(五)', '4', '', null, null, null, '114', '2017-07-20 09:40:27', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('116', '太空对战(六)', '4', '', null, null, null, '115', '2017-07-20 09:40:35', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('117', '太空对战(七)', '4', '', null, null, null, '116', '2017-07-20 09:40:55', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('118', '太空对战(八)', '4', '', null, null, null, '117', '2017-07-20 09:41:04', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('119', '太空对战(九)', '4', '', null, null, null, '118', '2017-07-20 09:41:14', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('120', '植物大战僵尸(一)', '4', '', null, null, null, '119', '2017-07-20 09:42:20', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('121', '植物大战僵尸(二)', '4', '', null, null, null, '120', '2017-07-20 09:42:28', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('122', '植物大战僵尸(三)', '4', '', null, null, null, '121', '2017-07-20 09:42:38', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('123', '植物大战僵尸(四)', '4', '', null, null, null, '122', '2017-07-20 09:42:46', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('124', '植物大战僵尸(五)', '4', '', null, null, null, '123', '2017-07-20 09:42:53', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('125', '植物大战僵尸(六)', '4', '', null, null, null, '124', '2017-07-20 09:43:00', '1', '0', '1');
INSERT INTO `tw_coursemenu` VALUES ('126', '植物大战僵尸(七)', '4', '', null, null, null, '125', '2017-07-20 09:43:10', '1', '0', '1');

-- ----------------------------
-- Table structure for tw_coursetype
-- ----------------------------
DROP TABLE IF EXISTS `tw_coursetype`;
CREATE TABLE `tw_coursetype` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '科目表主键',
  `name` varchar(255) DEFAULT NULL COMMENT '科目名称',
  `cDesc` text COMMENT '科目说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_coursetype
-- ----------------------------
INSERT INTO `tw_coursetype` VALUES ('1', '数学', '');
INSERT INTO `tw_coursetype` VALUES ('2', '外语', null);

-- ----------------------------
-- Table structure for tw_course_answer
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_answer`;
CREATE TABLE `tw_course_answer` (
  `anwserId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程回答表主键',
  `anwserreplyId` bigint(11) DEFAULT NULL COMMENT '0是回复主题 非0是回复某个评论',
  `anwserquestionId` bigint(20) DEFAULT NULL COMMENT '问题的主键',
  `answercourseId` bigint(20) DEFAULT NULL COMMENT '课程主键',
  `questioneruserId` bigint(20) DEFAULT NULL COMMENT '提问者主键',
  `respondentsuserId` bigint(20) DEFAULT NULL COMMENT '回答者主键',
  `respondentsdetail` text COMMENT '回答的详细内容',
  `anwsercreatime` varchar(200) DEFAULT NULL COMMENT '回答时间',
  `anwserisshow` tinyint(4) DEFAULT NULL COMMENT '是否展示(0否 1是)',
  `anwsereason` varchar(500) DEFAULT NULL COMMENT '不展示的理由',
  `anwsermodifytime` varchar(200) DEFAULT NULL COMMENT '修改时间',
  `anwsermodifyuserId` bigint(20) DEFAULT NULL COMMENT '最后的修改人',
  `praisenum` int(11) DEFAULT '0' COMMENT '点赞数',
  PRIMARY KEY (`anwserId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='回答信息表';

-- ----------------------------
-- Records of tw_course_answer
-- ----------------------------

-- ----------------------------
-- Table structure for tw_course_index
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_index`;
CREATE TABLE `tw_course_index` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '首页课程表主键',
  `imgurl` varchar(100) DEFAULT NULL COMMENT '图片URL',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `detail` varchar(100) DEFAULT NULL COMMENT '描述',
  `videourl` varchar(100) DEFAULT NULL COMMENT '视频路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_course_index
-- ----------------------------
INSERT INTO `tw_course_index` VALUES ('1', 'tw/images/classImg/apple.png', 'Scratch启蒙', '捡苹果（克隆）', '2/scratch-1-1-11');
INSERT INTO `tw_course_index` VALUES ('2', 'tw/images/classImg/sea.png', 'Scratch启蒙', '海底世界（音乐）', '2/scratch-1-1-5');
INSERT INTO `tw_course_index` VALUES ('3', 'tw/images/classImg/rainbow.png', 'Scratch启蒙', '彩虹糖（画笔）', '2/scratch-1-1-3');

-- ----------------------------
-- Table structure for tw_course_map
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_map`;
CREATE TABLE `tw_course_map` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `courseid` bigint(20) DEFAULT NULL COMMENT '课程id ',
  `text` mediumtext COMMENT '地图代码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_course_map
-- ----------------------------
INSERT INTO `tw_course_map` VALUES ('3', '2', 'scratch_1');
INSERT INTO `tw_course_map` VALUES ('4', '3', 'scratch_2');
INSERT INTO `tw_course_map` VALUES ('5', '4', 'scratch_3');

-- ----------------------------
-- Table structure for tw_course_materials
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_materials`;
CREATE TABLE `tw_course_materials` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程资料ID',
  `course_id` bigint(20) DEFAULT NULL COMMENT '课程ID',
  `menuid` bigint(20) DEFAULT NULL COMMENT '目录id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `name` varchar(200) DEFAULT NULL COMMENT '课程资料名称',
  `nametype` bigint(20) DEFAULT NULL COMMENT '课程资料类型ID',
  `flag` int(4) DEFAULT NULL COMMENT '是否收费0免费1收费',
  `upload_time` varchar(200) DEFAULT NULL COMMENT '传上时间',
  `modify_time` varchar(200) DEFAULT NULL COMMENT '修改时间',
  `size` varchar(255) DEFAULT NULL COMMENT '资料大小',
  `collect_price` float DEFAULT NULL COMMENT '收费金额',
  `type` int(11) DEFAULT NULL COMMENT '类型ID',
  `url` varchar(255) DEFAULT NULL COMMENT '下载链接',
  `downloads` bigint(20) DEFAULT NULL COMMENT '下载次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_course_materials
-- ----------------------------

-- ----------------------------
-- Table structure for tw_course_materialstype
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_materialstype`;
CREATE TABLE `tw_course_materialstype` (
  `type_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程资料类型ID',
  `type_name` varchar(200) DEFAULT NULL COMMENT '课程类型名称',
  `create_time` varchar(200) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_course_materialstype
-- ----------------------------
INSERT INTO `tw_course_materialstype` VALUES ('1', 'ppt', '2017-02-22 16:26:05');

-- ----------------------------
-- Table structure for tw_course_menu_my
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_menu_my`;
CREATE TABLE `tw_course_menu_my` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '章节学习记录表主键',
  `courseid` bigint(20) DEFAULT NULL COMMENT '课程Id',
  `menuid` bigint(20) DEFAULT NULL COMMENT '章节Id',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户Id',
  `end` int(4) DEFAULT NULL COMMENT '是否看完 0是未看完 1是已看完',
  `time` varchar(255) DEFAULT NULL COMMENT '学习时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_course_menu_my
-- ----------------------------

-- ----------------------------
-- Table structure for tw_course_my
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_my`;
CREATE TABLE `tw_course_my` (
  `mid` bigint(20) NOT NULL AUTO_INCREMENT,
  `courseid` bigint(20) DEFAULT NULL COMMENT '课程id',
  `userid` bigint(20) unsigned DEFAULT NULL COMMENT '用户id',
  `progress` bigint(20) DEFAULT NULL,
  `studytime` varchar(255) DEFAULT NULL,
  `menuid` bigint(20) DEFAULT NULL,
  `menuLearn` int(20) DEFAULT NULL COMMENT '已学课时',
  `menuAll` int(20) DEFAULT NULL COMMENT '总课时',
  `startTime` varchar(30) DEFAULT NULL COMMENT '开始学习时间',
  `endTime` varchar(30) DEFAULT NULL COMMENT '完成时间',
  PRIMARY KEY (`mid`),
  KEY `tw_course_my_user_id` (`userid`),
  CONSTRAINT `tw_course_my_user_id` FOREIGN KEY (`userid`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=269 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_course_my
-- ----------------------------

-- ----------------------------
-- Table structure for tw_course_note
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_note`;
CREATE TABLE `tw_course_note` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程笔记表主键',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户主键',
  `courseid` bigint(20) DEFAULT NULL COMMENT '课程主键',
  `coursemenuid` bigint(20) DEFAULT NULL COMMENT '课程目录主键',
  `notedetail` text COMMENT '笔记详细',
  `creattime` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `isshow` int(255) DEFAULT NULL COMMENT '1 显示 0 隐藏',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_course_note
-- ----------------------------

-- ----------------------------
-- Table structure for tw_course_question
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_question`;
CREATE TABLE `tw_course_question` (
  `questionId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程问题表主键',
  `questioncourseId` bigint(20) DEFAULT NULL COMMENT '课程主键',
  `questionmenuId` bigint(20) DEFAULT NULL COMMENT '目录id',
  `questionuserId` bigint(20) DEFAULT NULL COMMENT '提问者主键',
  `questionuserimg` varchar(100) DEFAULT NULL COMMENT '提问者头像',
  `questiontitle` varchar(150) DEFAULT NULL COMMENT '问题标题',
  `questiondetail` text COMMENT '问题内容',
  `questioncreatime` varchar(200) DEFAULT NULL COMMENT '创建时间',
  `questionisshow` tinyint(4) DEFAULT '1' COMMENT '是否展示(0否 1是)',
  `questionreason` varchar(500) DEFAULT NULL COMMENT '不展示的理由',
  `questionstatus` tinyint(4) DEFAULT '0' COMMENT '问题状态(0未解决 1已解决)',
  `questionpreviewnumber` int(11) DEFAULT '0' COMMENT '预览次数',
  `questionanswernumber` int(11) DEFAULT '0' COMMENT '回答次数',
  `praisenumber` int(11) DEFAULT '0' COMMENT '点赞次数',
  PRIMARY KEY (`questionId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='课程问题信息表';

-- ----------------------------
-- Records of tw_course_question
-- ----------------------------

-- ----------------------------
-- Table structure for tw_course_sc
-- ----------------------------
DROP TABLE IF EXISTS `tw_course_sc`;
CREATE TABLE `tw_course_sc` (
  `coursescId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程收藏表主键',
  `courseaboutId` bigint(20) DEFAULT NULL COMMENT '关联课程主键',
  `coursescuserId` bigint(20) DEFAULT NULL COMMENT '收藏者的主键',
  `coursesctime` varchar(200) DEFAULT NULL COMMENT '收藏时间',
  `coursescstatus` tinyint(4) DEFAULT NULL COMMENT '收藏状态(0未收藏 1已收藏)',
  PRIMARY KEY (`coursescId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='课程收藏信息表';

-- ----------------------------
-- Records of tw_course_sc
-- ----------------------------

-- ----------------------------
-- Table structure for tw_index_news
-- ----------------------------
DROP TABLE IF EXISTS `tw_index_news`;
CREATE TABLE `tw_index_news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '首页新闻表主键',
  `title` varchar(255) DEFAULT NULL COMMENT '新闻标题',
  `newsAbstract` varchar(255) DEFAULT NULL COMMENT '新闻摘要',
  `content` text COMMENT '新闻内容',
  `createTime` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `type` int(4) DEFAULT NULL COMMENT '是否是轮播（1是 0不是）',
  `videoUrl` text COMMENT '轮播的视频url',
  `imgUrl` varchar(255) DEFAULT NULL COMMENT '轮播的图片url',
  `showImg` varchar(255) DEFAULT NULL COMMENT '新闻列表展示图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_index_news
-- ----------------------------

-- ----------------------------
-- Table structure for tw_news
-- ----------------------------
DROP TABLE IF EXISTS `tw_news`;
CREATE TABLE `tw_news` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '通知中心新闻表主键',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `type` int(5) DEFAULT NULL COMMENT '类型',
  `status` int(5) DEFAULT NULL COMMENT '状态 0普通 1热门',
  `author` varchar(50) DEFAULT NULL COMMENT '作者',
  `createTime` varchar(150) DEFAULT NULL COMMENT '创建时间',
  `isDisplay` int(11) DEFAULT NULL COMMENT '是否显示0显示1不显示',
  `updateUser` varchar(50) DEFAULT NULL COMMENT '修改人',
  `updateTime` varchar(50) DEFAULT NULL COMMENT '修改时间',
  `startTime` varchar(255) DEFAULT NULL COMMENT '活动开始时间',
  `endTime` varchar(255) DEFAULT NULL COMMENT '活动结束时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_news
-- ----------------------------

-- ----------------------------
-- Table structure for tw_newstype
-- ----------------------------
DROP TABLE IF EXISTS `tw_newstype`;
CREATE TABLE `tw_newstype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '通知中心类型表主键',
  `typeName` varchar(255) DEFAULT NULL COMMENT '类型名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_newstype
-- ----------------------------
INSERT INTO `tw_newstype` VALUES ('2', '公告');
INSERT INTO `tw_newstype` VALUES ('3', '活动');
INSERT INTO `tw_newstype` VALUES ('4', '咨询');

-- ----------------------------
-- Table structure for tw_opinion
-- ----------------------------
DROP TABLE IF EXISTS `tw_opinion`;
CREATE TABLE `tw_opinion` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '意见反馈表主键',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `createtime` varchar(255) DEFAULT NULL COMMENT '时间',
  `flag` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `replycontent` varchar(255) DEFAULT NULL COMMENT '回复内容',
  `replytime` varchar(255) DEFAULT NULL COMMENT '回复时间',
  `replyid` int(11) DEFAULT NULL COMMENT '回复者Id',
  `replyname` varchar(255) DEFAULT NULL COMMENT '回复者用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_opinion
-- ----------------------------

-- ----------------------------
-- Table structure for tw_order
-- ----------------------------
DROP TABLE IF EXISTS `tw_order`;
CREATE TABLE `tw_order` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '课程订单表主键',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `childid` bigint(20) DEFAULT NULL COMMENT '孩子id',
  `courseid` bigint(20) DEFAULT NULL COMMENT '课程id',
  `status` int(4) DEFAULT NULL COMMENT '0未付款 1已付款 2已过期',
  `ordernum` varchar(255) DEFAULT NULL COMMENT '订单编号',
  `time` varchar(200) DEFAULT NULL COMMENT '创建时间',
  `endtime` varchar(255) DEFAULT NULL COMMENT '过期时间',
  `qrpath` varchar(200) DEFAULT NULL COMMENT '二维码',
  `qrpath_wx` varchar(200) DEFAULT NULL COMMENT '微信二维码',
  `type` int(4) DEFAULT NULL COMMENT '0是线上 1是线下',
  `amount` varchar(11) DEFAULT NULL COMMENT '支付金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tw_order
-- ----------------------------

-- ----------------------------
-- Table structure for tw_replycomments
-- ----------------------------
DROP TABLE IF EXISTS `tw_replycomments`;
CREATE TABLE `tw_replycomments` (
  `replyCommentsId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '作品评论回复表主键',
  `replyCommentsWorkId` bigint(20) DEFAULT NULL COMMENT '作品主键',
  `oldCommentsUserId` bigint(20) DEFAULT NULL COMMENT '被回复者主键',
  `replyCommentsUserId` bigint(20) DEFAULT NULL COMMENT '回复者主键',
  `replyDetail` text COMMENT '回复的详细内容',
  `replyCommentsCreateTime` varchar(200) DEFAULT NULL COMMENT '回复时间',
  `replyCommentsIsShow` tinyint(4) DEFAULT NULL COMMENT '是否屏蔽(0否 1是)',
  `replyCommentReason` varchar(500) DEFAULT NULL COMMENT '屏蔽的理由',
  `replyCommentModifyTime` varchar(200) DEFAULT NULL COMMENT '修改时间',
  `replyWorkCommentsUserId` bigint(20) DEFAULT NULL COMMENT '最后的修改人',
  `replycommentsrcId` bigint(20) DEFAULT NULL COMMENT '回复留言的主键',
  PRIMARY KEY (`replyCommentsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='作品评论回复信息表';

-- ----------------------------
-- Records of tw_replycomments
-- ----------------------------

-- ----------------------------
-- Table structure for tw_work
-- ----------------------------
DROP TABLE IF EXISTS `tw_work`;
CREATE TABLE `tw_work` (
  `workId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '作品表主键',
  `workTypeAboutId` bigint(20) DEFAULT NULL COMMENT '关联作品类型的主键',
  `workName` varchar(200) DEFAULT NULL COMMENT '作品名称',
  `workFilePath` varchar(300) DEFAULT NULL COMMENT '作品文件保存路径',
  `workPicture1` varchar(200) DEFAULT NULL COMMENT '作品宣传图片1',
  `workPicture2` varchar(200) DEFAULT NULL COMMENT '作品宣传图片2',
  `workPicture3` varchar(200) DEFAULT NULL COMMENT '作品宣传图片3',
  `workAuthor` varchar(200) DEFAULT NULL COMMENT '作品的作者',
  `workCreateUserId` bigint(20) DEFAULT NULL COMMENT '创建者主键',
  `workDetail` text COMMENT '作品说明',
  `workCreateTime` varchar(200) DEFAULT NULL COMMENT '创建时间',
  `workModifyTime` varchar(200) DEFAULT NULL COMMENT '修改时间',
  `workBrowseNumber` int(20) DEFAULT '0' COMMENT '浏览次数',
  `workCommentsNumber` int(20) DEFAULT '0' COMMENT '评论次数',
  `workShareNumber` int(20) DEFAULT '0' COMMENT '分享次数',
  `workThumpNumber` int(20) DEFAULT '0' COMMENT '点赞次数',
  `workDownLoadNumber` int(20) DEFAULT '0' COMMENT '下载次数',
  `workShareLink` varchar(500) DEFAULT NULL COMMENT '分享链接',
  `workAboutWork` varchar(500) DEFAULT NULL COMMENT '推荐作品',
  `workModifyUserId` bigint(20) DEFAULT NULL COMMENT '修改者主键',
  `workIsShow` tinyint(4) DEFAULT '1' COMMENT '是否展示(1展示 0不展示)',
  `workHomeRecommendation` tinyint(4) DEFAULT '0' COMMENT '首页是否展示(1展示 0不展示)',
  `workShareLinkList` varchar(200) DEFAULT NULL COMMENT '分享链接存放的地址',
  `workTwoFilePath` varchar(200) DEFAULT NULL COMMENT '二维码存放的路径',
  `workDianZanStatus` tinyint(4) DEFAULT '0' COMMENT '点赞状态(0未赞 1已赞)',
  `workAboutCollectionId` bigint(20) DEFAULT NULL COMMENT '关联作品集信息表的主键',
  `dianzanId` bigint(20) DEFAULT NULL COMMENT '最后点赞的那个人',
  `workShouCangNumber` int(20) DEFAULT '0' COMMENT '作品的收藏数量',
  `mode` int(11) DEFAULT '1' COMMENT '手机端操作模式',
  PRIMARY KEY (`workId`)
) ENGINE=InnoDB AUTO_INCREMENT=419 DEFAULT CHARSET=utf8 COMMENT='作品信息表';

-- ----------------------------
-- Records of tw_work
-- ----------------------------

-- ----------------------------
-- Table structure for tw_worktype
-- ----------------------------
DROP TABLE IF EXISTS `tw_worktype`;
CREATE TABLE `tw_worktype` (
  `workTypeId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '作品类型表主键',
  `workTypeLevel` tinyint(4) DEFAULT NULL COMMENT '类型级别(顶级类型0 一级类别1 二级类别2 其他 TODO)',
  `workTypeTopId` bigint(20) DEFAULT NULL COMMENT '顶级别主键',
  `workTypeFirstId` bigint(20) DEFAULT NULL COMMENT '一级别主键',
  `workTypeSecondId` bigint(20) DEFAULT NULL COMMENT '二级别主键',
  `workTypeName` varchar(200) DEFAULT NULL COMMENT '作品类别名称',
  `workTypeCreateUserId` bigint(20) DEFAULT NULL COMMENT '创建者主键',
  `workTypeModifyUserId` bigint(20) DEFAULT NULL COMMENT '修改者主键',
  `workTypeCreateTime` varchar(200) DEFAULT NULL COMMENT '创建时间',
  `workTypeModifyTime` varchar(200) DEFAULT NULL COMMENT '修改时间',
  `workTypeIsShow` tinyint(4) DEFAULT NULL COMMENT '是否展示(1展示 0不展示)',
  PRIMARY KEY (`workTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='作品类型信息表';

-- ----------------------------
-- Records of tw_worktype
-- ----------------------------
INSERT INTO `tw_worktype` VALUES ('1', '0', null, null, null, 'scratch启蒙', '1', '1', '2016-11-10 14:01:43', '2017-06-05 12:24:37', '1');
INSERT INTO `tw_worktype` VALUES ('2', '0', null, null, null, 'scratch飞跃', '1', '1', '2016-11-10 14:01:53', '2017-06-05 12:25:02', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父母id',
  `openId` varchar(50) DEFAULT NULL COMMENT '微信openId',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` char(64) DEFAULT NULL COMMENT '密码',
  `truename` varchar(10) DEFAULT NULL COMMENT '用户真实姓名',
  `sex` int(5) DEFAULT NULL COMMENT '性别 0男 1女 2保密',
  `age` int(5) DEFAULT NULL COMMENT '年龄',
  `address` varchar(32) DEFAULT NULL COMMENT '家庭住址',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `qq` varchar(32) DEFAULT NULL COMMENT 'QQ',
  `homePhone` varchar(32) DEFAULT NULL COMMENT '家庭联系方式',
  `telphone` varchar(32) DEFAULT NULL COMMENT '手机号码',
  `userCardId` varchar(32) DEFAULT NULL COMMENT '身份证号码',
  `userStatus` int(5) DEFAULT NULL COMMENT '用户状态 0未被冻结 1冻结',
  `state` varchar(32) DEFAULT NULL COMMENT '状态',
  `lastLoginTime` varchar(200) DEFAULT NULL COMMENT '最后一次的登录时间',
  `create_time` varchar(200) DEFAULT NULL COMMENT '创建时间',
  `isDelete` int(11) DEFAULT NULL COMMENT '是否删除 (逻辑删除 0否 1是)',
  `authorityId` bigint(20) DEFAULT NULL COMMENT '用户具有的访问权限 (暂时用不到 暂时不删除)',
  `userRoleId` bigint(20) DEFAULT NULL COMMENT '用户的角色 1管理员 2普通用户 5老师',
  `headImg` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `money` double(11,2) DEFAULT NULL COMMENT '用户账户余额',
  `integral` int(11) DEFAULT NULL COMMENT '用户账号积分',
  `isactive` tinyint(4) DEFAULT NULL COMMENT '是否激活 0邮箱未激活;1邮箱已激活',
  `validatecode` varchar(500) DEFAULT NULL COMMENT '找回发送邮件秘钥的唯一标识',
  `outdate` varchar(200) DEFAULT NULL COMMENT '过期时间',
  `isBinding` tinyint(4) DEFAULT NULL COMMENT '手机号码是否绑定',
  `phoneverificationcode` varchar(200) DEFAULT NULL COMMENT '手机验证码',
  `city` varchar(200) DEFAULT NULL COMMENT '城市',
  `birthday` varchar(300) DEFAULT NULL COMMENT '用户的出生日期',
  `personIntr` text COMMENT '用户简介',
  `grade` varchar(30) DEFAULT NULL COMMENT '年级',
  `school` varchar(30) DEFAULT NULL COMMENT '用户学校',
  `usernickname` varchar(50) DEFAULT NULL COMMENT '用户昵称',
  `lastLoginTimeshort` varchar(200) DEFAULT NULL COMMENT '用户最后登录时间',
  `alwaysLogin` int(20) DEFAULT NULL COMMENT '连续签到天数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=225 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '0', null, 'admin', '0dd2506d746d735cdb20bd6129b2ab10661826b1bad9428a03af800faf4d4dd4', '管理员', '0', '40', '', '875755494@qq.com', '', null, '15046009860', null, '0', null, '2017-10-31 14:08:54', '2016-05-03 12:59:08', '0', null, '1', 'uploadfile/images/headimg/1.png', '0.00', '499', '1', '', '', '0', null, null, '1994-10-28', '哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈', null, '4', 'admin', '2017-10-31', '2');
INSERT INTO `user` VALUES ('2', '0', null, 'test', '0dd2506d746d735cdb20bd6129b2ab10661826b1bad9428a03af800faf4d4dd4', '刘爱国', '0', '31', '', '875755494@qq.com', '', null, '18745105346', null, '0', null, '2018-02-27 14:31:14', '2016-05-05 14:32:38', '0', null, '2', 'uploadfile/images/headimg/8.png', '0.00', '494', '0', null, null, '0', null, null, '1993-10-28', null, null, '4', 'test', '2018-02-27', '1');
INSERT INTO `user` VALUES ('3', '0', null, 'teacher1', '0dd2506d746d735cdb20bd6129b2ab10661826b1bad9428a03af800faf4d4dd4', '教师一', '0', '0', null, '875755494@qq.com', null, null, '18745105346', null, '0', null, '2018-02-27 14:31:06', '2017-08-30 09:01:18', '0', null, '5', 'uploadfile/images/headimg/8.png', '0.00', '20', '0', null, null, '0', null, '哈尔滨', null, null, null, '4', 'teacher1', '2018-02-27', '1');

-- ----------------------------
-- Table structure for user_authority
-- ----------------------------
DROP TABLE IF EXISTS `user_authority`;
CREATE TABLE `user_authority` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '系统菜单权限表主键',
  `menuId` bigint(20) DEFAULT NULL COMMENT '系统菜单Id',
  `userRoleId` bigint(20) DEFAULT NULL COMMENT '所属角色',
  `authority` bigint(20) DEFAULT NULL COMMENT '权限',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_authority
-- ----------------------------
INSERT INTO `user_authority` VALUES ('1', '8', '1', '21', null);
INSERT INTO `user_authority` VALUES ('2', '10', '1', '21', '2016-07-14 14:29:28');
INSERT INTO `user_authority` VALUES ('3', '1', '1', '21', null);
INSERT INTO `user_authority` VALUES ('4', '2', '1', '21', null);
INSERT INTO `user_authority` VALUES ('5', '3', '1', '21', null);
INSERT INTO `user_authority` VALUES ('6', '4', '1', '21', null);
INSERT INTO `user_authority` VALUES ('7', '5', '1', '21', null);
INSERT INTO `user_authority` VALUES ('8', '6', '1', '21', null);
INSERT INTO `user_authority` VALUES ('9', '7', '1', '21', null);
INSERT INTO `user_authority` VALUES ('10', '9', '1', '21', null);
INSERT INTO `user_authority` VALUES ('11', '11', '1', '21', '2016-08-23 16:06:42');
INSERT INTO `user_authority` VALUES ('12', '11', '1', '21', '2016-08-23 16:08:51');
INSERT INTO `user_authority` VALUES ('13', '11', '2', '21', '2016-08-23 16:22:49');
INSERT INTO `user_authority` VALUES ('14', '14', '1', '21', '2016-08-29 11:19:27');
INSERT INTO `user_authority` VALUES ('15', '15', '1', '21', '2016-08-29 14:53:12');
INSERT INTO `user_authority` VALUES ('16', '16', '1', '21', '2016-09-06 09:28:17');
INSERT INTO `user_authority` VALUES ('17', '17', '1', '21', '2016-11-10 14:00:38');
INSERT INTO `user_authority` VALUES ('18', '18', '1', '21', '2016-11-10 14:01:07');
INSERT INTO `user_authority` VALUES ('19', '19', '1', '21', '2016-11-10 14:01:24');
INSERT INTO `user_authority` VALUES ('21', '20', '1', '21', '2016-11-13 10:30:09');
INSERT INTO `user_authority` VALUES ('22', '22', '1', '21', '2016-11-13 12:29:08');
INSERT INTO `user_authority` VALUES ('23', '23', '1', '21', '2016-11-14 09:44:59');
INSERT INTO `user_authority` VALUES ('24', '25', '1', '21', '2016-11-14 09:45:44');
INSERT INTO `user_authority` VALUES ('25', '26', '1', '21', '2016-11-14 09:46:33');
INSERT INTO `user_authority` VALUES ('26', '31', '1', '21', '2016-11-18 13:48:08');
INSERT INTO `user_authority` VALUES ('27', '32', '1', '21', '2016-11-18 16:15:30');
INSERT INTO `user_authority` VALUES ('28', '33', '1', '21', '2016-11-18 16:16:39');
INSERT INTO `user_authority` VALUES ('29', '34', '1', '21', '2016-11-23 14:04:35');
INSERT INTO `user_authority` VALUES ('30', '35', '1', '21', '2016-11-25 09:03:36');
INSERT INTO `user_authority` VALUES ('31', '36', '1', '21', '2016-11-25 09:04:19');
INSERT INTO `user_authority` VALUES ('32', '37', '1', '21', '2016-12-22 13:47:22');
INSERT INTO `user_authority` VALUES ('33', '38', '1', '21', '2017-01-16 14:16:40');
INSERT INTO `user_authority` VALUES ('34', '39', '1', '21', '2017-01-16 14:17:39');
INSERT INTO `user_authority` VALUES ('35', '40', '1', '21', '2017-01-17 08:37:13');
INSERT INTO `user_authority` VALUES ('36', '41', '1', '21', '2017-01-17 08:37:59');
INSERT INTO `user_authority` VALUES ('37', '42', '1', '21', '2017-01-23 14:04:08');
INSERT INTO `user_authority` VALUES ('38', '44', '1', '21', '2017-03-27 14:48:48');
INSERT INTO `user_authority` VALUES ('39', '45', '1', '21', '2017-03-27 14:51:49');
INSERT INTO `user_authority` VALUES ('40', '50', '1', '21', '2017-05-26 10:41:23');
INSERT INTO `user_authority` VALUES ('41', '51', '1', '21', '2017-05-26 15:19:30');
INSERT INTO `user_authority` VALUES ('42', '52', '1', '21', '2017-06-06 09:28:01');
INSERT INTO `user_authority` VALUES ('43', '53', '1', '21', '2017-06-19 09:38:35');
INSERT INTO `user_authority` VALUES ('44', '54', '1', '21', '2017-07-07 16:45:33');
INSERT INTO `user_authority` VALUES ('45', '55', '1', '21', '2017-07-07 16:46:04');
INSERT INTO `user_authority` VALUES ('46', '56', '1', '21', '2017-09-30 10:50:50');
INSERT INTO `user_authority` VALUES ('47', '57', '1', '21', '2017-09-30 10:57:05');
INSERT INTO `user_authority` VALUES ('48', '60', '1', '21', '2018-01-12 10:21:22');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户角色关联表主键',
  `user_id` bigint(20) unsigned DEFAULT NULL COMMENT '用户Id',
  `role_id` bigint(20) unsigned DEFAULT NULL COMMENT '角色Id',
  PRIMARY KEY (`id`),
  KEY `role_user_id` (`user_id`),
  CONSTRAINT `role_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='用户与角色关联表';

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1');
INSERT INTO `user_role` VALUES ('2', '2', '2');
INSERT INTO `user_role` VALUES ('3', '3', '5');
