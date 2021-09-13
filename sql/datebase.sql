-- 用户表
CREATE TABLE `user` (
    `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `type` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '用户类型 0-未知 1-管理员 2-用户',
    `sex` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT ' 性别 0-未知 1-男 2-女',
    `cn_name` varchar(255) NOT NULL DEFAULT '' COMMENT '中文名',
    `en_name` varchar(255) NOT NULL DEFAULT '' COMMENT '英文名',
    `phone` varchar(20) NOT NULL DEFAULT '' COMMENT '手机号码',
    `email` varchar(255) NOT NULL DEFAULT '' COMMENT '邮箱地址',
    `bir_date` date DEFAULT NULL COMMENT '出生年月',
    `portrait` varchar(1000) NOT NULL DEFAULT '' COMMENT '头像',
    `attach` varchar(1000) NOT NULL DEFAULT '{}' COMMENT '扩展字段',
    `is_del` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除 0-未删除 1-已删除',
    `creator` varchar(255) NOT NULL DEFAULT 'system' COMMENT '创建人姓名',
    `updater` varchar(255) NOT NULL DEFAULT 'system' COMMENT '修改人姓名',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近一次修改时间',
    `versions` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '数据版本号',
    PRIMARY KEY (`id`) USING BTREE,
    KEY `idx_type` (`type`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';

-- wpk记录表
CREATE TABLE `wpk_detail` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `date` date DEFAULT NULL COMMENT '日期',
  `minutes` int(11) NOT NULL DEFAULT '0' COMMENT '分钟',
  `blines` varchar(50) NOT NULL DEFAULT '1/2' COMMENT '盲注类型',
  `anti` int(11) NOT NULL DEFAULT '0' COMMENT '前注',
  `profit` decimal(5,2) NOT NULL DEFAULT '0.00' COMMENT '盈亏',
  `attach` varchar(1000) NOT NULL DEFAULT '{}' COMMENT '扩展字段',
  `creator` varchar(255) NOT NULL DEFAULT 'system' COMMENT '创建人姓名',
  `updater` varchar(255) NOT NULL DEFAULT 'system' COMMENT '修改人姓名',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近一次修改时间',
  `versions` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '数据版本号',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_date` (`date`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='wpk记录表';