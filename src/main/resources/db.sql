CREATE TABLE `hotnews` (
  `id` bigint(64) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `cid` bigint(64) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_cid` (`cid`)
) ;

###########################################

SELECT count(1) FROM hotnews ;


SELECT count(1) FROM user ;

SELECT * FROM hotnews order by id desc limit 0, 20;

SELECT * FROM hotnews where name = 'name-a51941f2-a91f-4810-88d3-bd8b7f0b5976' limit 10, 5;

SELECT * FROM hotnews where ID = 1277962824444805122 ;


SELECT count(1) FROM hotnews where create_time >= '2020-07-01 08:00:00' and create_time < '2020-07-01 08:01:00' ;


SELECT * FROM hotnews where cid =12779600723;

