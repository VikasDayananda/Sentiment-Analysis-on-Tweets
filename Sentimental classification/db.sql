/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - topicadaptivehadoop
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `topicadaptivehadoop`;

USE `topicadaptivehadoop`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `m_expand_keywords` */

DROP TABLE IF EXISTS `m_expand_keywords`;

CREATE TABLE `m_expand_keywords` (
  `ek_no` int(20) NOT NULL auto_increment,
  `expand_keyword` varchar(100) default NULL,
  `topic` varchar(100) default NULL,
  `positive` int(11) default NULL,
  `neutral` int(11) default NULL,
  `negative` int(11) default NULL,
  `status` varchar(10) default 'no',
  PRIMARY KEY  (`ek_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_expand_keywords` */

insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (2,'affair','apple',3,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (3,'realize','apple',3,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (4,'current','apple',0,0,3,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (5,'strangest','apple',3,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (6,'humorhilarious','apple',3,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (7,'personal','apple',3,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (8,'customer','apple',3,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (9,'service','apple',3,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (11,'refurbed','apple',3,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (12,'refurbished','apple',3,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (13,'update','apple',0,0,3,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (14,'restore','apple',0,0,3,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (15,'music','apple',0,0,3,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (16,'exciting','google',0,2,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (17,'referring','google',0,2,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (18,'looks','google',0,2,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (19,'scroll','google',2,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (20,'prime','google',2,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (21,'shipping','google',0,0,2,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (22,'news','google',0,0,2,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (23,'demo','google',0,0,2,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (24,'iteration','google',2,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (25,'several','google',2,0,0,'no');
insert into `m_expand_keywords` (`ek_no`,`expand_keyword`,`topic`,`positive`,`neutral`,`negative`,`status`) values (26,'social','google',0,2,0,'no');

/*Table structure for table `m_noun` */

DROP TABLE IF EXISTS `m_noun`;

CREATE TABLE `m_noun` (
  `noun_no` int(11) NOT NULL auto_increment,
  `noun` varchar(100) default NULL,
  PRIMARY KEY  (`noun_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_noun` */

insert into `m_noun` (`noun_no`,`noun`) values (1,'apple');
insert into `m_noun` (`noun_no`,`noun`) values (2,'youtube');
insert into `m_noun` (`noun_no`,`noun`) values (3,'siri');
insert into `m_noun` (`noun_no`,`noun`) values (4,'youtube');
insert into `m_noun` (`noun_no`,`noun`) values (5,'switch');
insert into `m_noun` (`noun_no`,`noun`) values (6,'ios');
insert into `m_noun` (`noun_no`,`noun`) values (7,'twitter');
insert into `m_noun` (`noun_no`,`noun`) values (8,'blackberry');
insert into `m_noun` (`noun_no`,`noun`) values (9,'companies');
insert into `m_noun` (`noun_no`,`noun`) values (10,'zappos ');
insert into `m_noun` (`noun_no`,`noun`) values (11,'philliprowntree ');
insert into `m_noun` (`noun_no`,`noun`) values (12,'developer');
insert into `m_noun` (`noun_no`,`noun`) values (13,'android');
insert into `m_noun` (`noun_no`,`noun`) values (14,'iphone');
insert into `m_noun` (`noun_no`,`noun`) values (15,'ipad');
insert into `m_noun` (`noun_no`,`noun`) values (16,'video');
insert into `m_noun` (`noun_no`,`noun`) values (17,'twitter');
insert into `m_noun` (`noun_no`,`noun`) values (18,'android');
insert into `m_noun` (`noun_no`,`noun`) values (19,'time');
insert into `m_noun` (`noun_no`,`noun`) values (20,'ios');
insert into `m_noun` (`noun_no`,`noun`) values (21,'software');
insert into `m_noun` (`noun_no`,`noun`) values (22,'ipad');
insert into `m_noun` (`noun_no`,`noun`) values (23,'apple');
insert into `m_noun` (`noun_no`,`noun`) values (24,'ios');
insert into `m_noun` (`noun_no`,`noun`) values (25,'ass');
insert into `m_noun` (`noun_no`,`noun`) values (26,'photos');
insert into `m_noun` (`noun_no`,`noun`) values (27,'room');
insert into `m_noun` (`noun_no`,`noun`) values (28,'todays');
insert into `m_noun` (`noun_no`,`noun`) values (29,'albestmal');
insert into `m_noun` (`noun_no`,`noun`) values (30,'icloud');
insert into `m_noun` (`noun_no`,`noun`) values (31,'dropbox');
insert into `m_noun` (`noun_no`,`noun`) values (32,'market');
insert into `m_noun` (`noun_no`,`noun`) values (33,'app');
insert into `m_noun` (`noun_no`,`noun`) values (34,'december');
insert into `m_noun` (`noun_no`,`noun`) values (35,'countries');
insert into `m_noun` (`noun_no`,`noun`) values (36,'momygaga');
insert into `m_noun` (`noun_no`,`noun`) values (37,'pampers');
insert into `m_noun` (`noun_no`,`noun`) values (38,'baby');
insert into `m_noun` (`noun_no`,`noun`) values (39,'world');
insert into `m_noun` (`noun_no`,`noun`) values (40,'daughter');
insert into `m_noun` (`noun_no`,`noun`) values (41,'robot');
insert into `m_noun` (`noun_no`,`noun`) values (42,'assistant');
insert into `m_noun` (`noun_no`,`noun`) values (43,'month');
insert into `m_noun` (`noun_no`,`noun`) values (44,'ice');
insert into `m_noun` (`noun_no`,`noun`) values (45,'cream');
insert into `m_noun` (`noun_no`,`noun`) values (46,'sandwitch');
insert into `m_noun` (`noun_no`,`noun`) values (47,'google');
insert into `m_noun` (`noun_no`,`noun`) values (48,'nexus');
insert into `m_noun` (`noun_no`,`noun`) values (49,'avtar');
insert into `m_noun` (`noun_no`,`noun`) values (50,'bigmama');
insert into `m_noun` (`noun_no`,`noun`) values (51,'day');
insert into `m_noun` (`noun_no`,`noun`) values (52,'blaze');
insert into `m_noun` (`noun_no`,`noun`) values (53,'icecreamsandwich');
insert into `m_noun` (`noun_no`,`noun`) values (54,'job');
insert into `m_noun` (`noun_no`,`noun`) values (55,'samsung');
insert into `m_noun` (`noun_no`,`noun`) values (56,'galaxy');
insert into `m_noun` (`noun_no`,`noun`) values (57,'santorums');
insert into `m_noun` (`noun_no`,`noun`) values (58,'chucktodd');
insert into `m_noun` (`noun_no`,`noun`) values (59,'dates');
insert into `m_noun` (`noun_no`,`noun`) values (60,'battery');
insert into `m_noun` (`noun_no`,`noun`) values (61,'androidbeam');
insert into `m_noun` (`noun_no`,`noun`) values (62,'life');
insert into `m_noun` (`noun_no`,`noun`) values (63,'twitter');
insert into `m_noun` (`noun_no`,`noun`) values (64,'postgazette');
insert into `m_noun` (`noun_no`,`noun`) values (65,'pittsburgh');
insert into `m_noun` (`noun_no`,`noun`) values (66,'mommygaga');
insert into `m_noun` (`noun_no`,`noun`) values (67,'albertmal');
insert into `m_noun` (`noun_no`,`noun`) values (68,'lion');
insert into `m_noun` (`noun_no`,`noun`) values (69,'iphones');
insert into `m_noun` (`noun_no`,`noun`) values (70,'htcgalaxy');
insert into `m_noun` (`noun_no`,`noun`) values (71,'wphone');
insert into `m_noun` (`noun_no`,`noun`) values (72,'jewelz');
insert into `m_noun` (`noun_no`,`noun`) values (73,'inbox');
insert into `m_noun` (`noun_no`,`noun`) values (74,'cap');
insert into `m_noun` (`noun_no`,`noun`) values (75,'edatpost');
insert into `m_noun` (`noun_no`,`noun`) values (76,'fan');
insert into `m_noun` (`noun_no`,`noun`) values (77,'thesavoia');
insert into `m_noun` (`noun_no`,`noun`) values (78,'stevejobs');
insert into `m_noun` (`noun_no`,`noun`) values (79,'tech');
insert into `m_noun` (`noun_no`,`noun`) values (80,'dailydealchat');
insert into `m_noun` (`noun_no`,`noun`) values (81,'bar');
insert into `m_noun` (`noun_no`,`noun`) values (82,'edatpost');
insert into `m_noun` (`noun_no`,`noun`) values (83,'video');
insert into `m_noun` (`noun_no`,`noun`) values (84,'nike');
insert into `m_noun` (`noun_no`,`noun`) values (85,'motoactiv');
insert into `m_noun` (`noun_no`,`noun`) values (86,'methinks');
insert into `m_noun` (`noun_no`,`noun`) values (87,'mohamedg');
insert into `m_noun` (`noun_no`,`noun`) values (88,'day');
insert into `m_noun` (`noun_no`,`noun`) values (89,'ice');
insert into `m_noun` (`noun_no`,`noun`) values (90,'cream');
insert into `m_noun` (`noun_no`,`noun`) values (91,'sandwich');
insert into `m_noun` (`noun_no`,`noun`) values (92,'google');
insert into `m_noun` (`noun_no`,`noun`) values (93,'bigmama');
insert into `m_noun` (`noun_no`,`noun`) values (94,'nexus');
insert into `m_noun` (`noun_no`,`noun`) values (95,'avtar');
insert into `m_noun` (`noun_no`,`noun`) values (96,'titaramas');
insert into `m_noun` (`noun_no`,`noun`) values (97,'nexusprime');
insert into `m_noun` (`noun_no`,`noun`) values (98,'spacecanard');
insert into `m_noun` (`noun_no`,`noun`) values (99,'todays');
insert into `m_noun` (`noun_no`,`noun`) values (100,'image');
insert into `m_noun` (`noun_no`,`noun`) values (101,'already');
insert into `m_noun` (`noun_no`,`noun`) values (102,'hmmm');
insert into `m_noun` (`noun_no`,`noun`) values (103,'appthe');
insert into `m_noun` (`noun_no`,`noun`) values (104,'thing');
insert into `m_noun` (`noun_no`,`noun`) values (105,'didnt');
insert into `m_noun` (`noun_no`,`noun`) values (106,'dennisritchie');
insert into `m_noun` (`noun_no`,`noun`) values (107,'guys');
insert into `m_noun` (`noun_no`,`noun`) values (108,'ballmer');
insert into `m_noun` (`noun_no`,`noun`) values (109,'bing');
insert into `m_noun` (`noun_no`,`noun`) values (110,'people');
insert into `m_noun` (`noun_no`,`noun`) values (111,'googles');
insert into `m_noun` (`noun_no`,`noun`) values (112,'coach');
insert into `m_noun` (`noun_no`,`noun`) values (113,'phone');
insert into `m_noun` (`noun_no`,`noun`) values (114,'monopoly');
insert into `m_noun` (`noun_no`,`noun`) values (115,'galaxynexus');
insert into `m_noun` (`noun_no`,`noun`) values (116,'perils');
insert into `m_noun` (`noun_no`,`noun`) values (117,'gizmodo');
insert into `m_noun` (`noun_no`,`noun`) values (118,'phonevia');
insert into `m_noun` (`noun_no`,`noun`) values (119,'docs');
insert into `m_noun` (`noun_no`,`noun`) values (120,'seal');
insert into `m_noun` (`noun_no`,`noun`) values (121,'console');
insert into `m_noun` (`noun_no`,`noun`) values (122,'gplus');
insert into `m_noun` (`noun_no`,`noun`) values (123,'googleplus');
insert into `m_noun` (`noun_no`,`noun`) values (124,'teamfollowback');
insert into `m_noun` (`noun_no`,`noun`) values (125,'socialnetwork');

/*Table structure for table `m_sensitive_keywords` */

DROP TABLE IF EXISTS `m_sensitive_keywords`;

CREATE TABLE `m_sensitive_keywords` (
  `sk_no` int(100) NOT NULL auto_increment,
  `topic` varchar(200) default NULL,
  `type` varchar(200) default NULL,
  `keywords` varchar(300) default NULL,
  `iteration` varchar(200) default NULL,
  PRIMARY KEY  (`sk_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_sensitive_keywords` */

insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (1,'apple','positive','swype','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (2,'apple','neutral','crack','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (4,'apple','positive','duet','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (5,'apple','positive','easy','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (6,'apple','positive','reason','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (7,'apple','negative','disappointed','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (8,'apple','negative','far','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (9,'apple','positive','happyplace','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (10,'apple','positive','glad','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (11,'apple','positive','humor','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (12,'apple','positive','tonight','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (13,'apple','positive','great','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (14,'apple','positive','ceremoniously ','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (15,'apple','negative','public','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (16,'apple','positive','use','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (17,'apple','positive','great','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (18,'apple','positive','best','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (20,'apple','negative','final','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (21,'apple','positive','love','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (22,'apple','neutral','think','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (23,'apple','neutral','something','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (24,'apple','neutral','body','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (26,'apple','neutral','sense','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (27,'apple','positive','regent','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (28,'apple','positive','hope','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (54,'apple','negative','dead','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (55,'apple','negative','fail','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (56,'apple','neutral','total','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (63,'apple','positive','remember','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (64,'apple','positive','new','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (65,'apple','negative','fail','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (66,'apple','negative','dead','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (67,'apple','negative','pain','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (68,'apple','negative','garbage','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (69,'apple','negative','trouble','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (70,'apple','negative','down','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (71,'apple','negative','nohelp','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (72,'apple','negative','lower','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (73,'apple','negative','evil','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (74,'apple','neutral','headlinine','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (75,'apple','neutral','report','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (76,'apple','neutral','quarter','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (77,'apple','neutral','expand','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (78,'apple','neutral','memory','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (79,'apple','neutral','virtual','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (80,'apple','neutral','coincidence','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (81,'apple','neutral','rolling','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (83,'google','positive','exite','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (84,'google','positive','nice','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (85,'google','positive','like','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (86,'google','positive','look','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (87,'google','positive','amazing','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (88,'google','negative','forget','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (89,'google','negative','miss','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (90,'google','neutral','feature','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (92,'google','positive','amazing','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (94,'google','positive','electability','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (95,'google','negative','shit','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (96,'google','negative','infofail','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (97,'google','negative','problem','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (98,'google','negative','loss','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (99,'google','negative','argument','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (100,'google','negative','launchfail','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (101,'google','negative','fail','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (102,'google','negative','cant','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (103,'google','negative','impact','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (105,'google','neutral','doubledigit','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (106,'google','neutral','found','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (107,'google','neutral','add','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (108,'google','neutral','recruiting','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (109,'google','neutral','tool','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (110,'google','neutral','offers','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (111,'google','neutral','compete','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (112,'google','neutral','groupon','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (113,'google','neutral','live','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (114,'google','positive','security','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (115,'google','positive','recognition','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (116,'google','neutral','facial','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (117,'google','neutral','revamps','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (118,'google','neutral','unveils','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (119,'apple','negative','actually','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (120,'apple','positive','experience','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (121,'apple','positive','suggest','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (122,'apple','positive','magical','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (123,'google','neutral','found','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (124,'google','positive','appreciated','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (125,'google','negative','talk','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (127,'apple','positive','good','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (128,'google','neutral','reason','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (129,'google','negative','actually ','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (134,'google','positive','good','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (135,'apple','negative','little','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (136,'apple','negative','fucked','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (137,'apple','negative','declined','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (138,'apple','negative','fail','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (139,'apple','negative','airdrop','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (140,'apple','negative','wait','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (141,'apple','negative','exchange','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (142,'apple','negative','hurry','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (143,'apple','negative','release','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (144,'apple','negative','lonely','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (145,'apple','negative','silly','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (146,'apple','negative','kill','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (147,'apple','negative','expensive','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (148,'apple','negative','apparently','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (149,'apple','positive','immediate','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (150,'apple','positive','geneius','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (151,'apple','neutral','eric','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (152,'apple','neutral','spotted','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (153,'apple','neutral','evolution','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (154,'apple','neutral','bidmyway','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (155,'apple','neutral','simple','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (156,'apple','neutral','geneius','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (157,'apple','neutral','dedicated','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (158,'apple','neutral','memory','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (161,'google','positive','good','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (162,'google','positive','pretty','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (163,'google','positive','look','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (164,'google','positive','nice','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (165,'google','positive','website','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (166,'google','positive','better','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (167,'google','positive','use','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (168,'google','positive','help','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (169,'google','positive','new','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (170,'google','positive','feel','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (171,'google','positive','decide','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (172,'google','positive','storage','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (173,'google','negative','try','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (174,'google','negative','tonight','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (175,'google','negative','fail','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (176,'google','negative','admire','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (177,'google','negative','crash','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (178,'google','negative','revolution','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (179,'google','negative','hire','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (180,'google','negative','unveil','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (181,'google','negative','whoring','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (182,'google','positive','supreme','initial');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (183,'apple','positive','hilary','expansion');
insert into `m_sensitive_keywords` (`sk_no`,`topic`,`type`,`keywords`,`iteration`) values (184,'apple','positive','registered','expansion');

/*Table structure for table `m_tweet_keywords` */

DROP TABLE IF EXISTS `m_tweet_keywords`;

CREATE TABLE `m_tweet_keywords` (
  `id` int(100) NOT NULL,
  `topic` varchar(150) default NULL,
  `tweetId` varchar(250) default NULL,
  `tweettext` varchar(300) default NULL,
  PRIMARY KEY  (`id`),
  CONSTRAINT `m_tweet_keywords_ibfk_1` FOREIGN KEY (`id`) REFERENCES `m_tweets` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_tweet_keywords` */

insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (1,'apple','1.26403E17','hilarious, youtube, video, hilarious, duet, apple, siri, pretty, love, affair');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (2,'apple','1.26397E17','hilarious, easy, switch, apple, iphone');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (3,'apple','1.26396E17','realized, hilarious, reason, twitter, apple');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (4,'apple','1.26395E17','current, blackberry, little, disappointed, hilarious, android, apple, iphone');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (5,'apple','1.2638E17','strangest, siri, glad, apple, siri, sense, humorhilarious, happyplace');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (6,'apple','1.26378E17','great, personal, apple, tonight, regent');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (7,'apple','1.26374E17','companies, experience, customer, service, zappos, apple');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (8,'apple','1.26366E17','job, hilarious, apple, hope');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (9,'apple','1.26366E17','think, apple, something, magical, siri, suggested');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (10,'apple','1.26366E17','think, apple, something, magical, siri, suggested, body');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (11,'apple','1.26361E17','philliprowntree, registered, apple, developer, hoping, actually, greatly, appreciated');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (12,'apple','1.2636E17','great, refurbed, apple, offers, great, refurbished, apple');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (13,'apple','1.26358E17','registered, apple, developer, hoping, actually, greatly, appreciated');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (14,'apple','1.26155E17','apple, software, update, dead, restore, fail');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (15,'apple','1.26153E17','apple, pain, ass, room, music, photos, garbage');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (24,'google','1.2653E17','exciting, day, ice, cream, sandwich, day, google, android');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (25,'google','1.2653E17','android, ice, cream, sandwich, google, nexus, new, avtar, android, google, nexus, bigmama');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (26,'google','1.2653E17','blaze, referring, google, looks, amazing, android, missing');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (27,'google','1.26529E17','forget, phone, nice, liking, scroll, feature, android, google, nexus');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (28,'google','1.26529E17','amazing, google, samsung, galaxy, nexus, prime, android');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (29,'google','1.26493E17','good, job, google, shit, actually, shipping, infofail');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (30,'google','1.26493E17','dates, google, samsung, launchfail');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (31,'google','1.26492E17','google, problem, chucktodd, problem, santorums, electability, argument, doubledigit, loss');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (32,'google','1.26492E17','talk, battery, life, impact, androidbeam, good, news, google, android');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (33,'google','1.26492E17','android, demo, fail, google');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (34,'google','1.26535E17','add, add, google');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (35,'google','1.26535E17','found, twitter, google, tool, google, twitter');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (36,'google','1.26535E17','google, unveils, iteration, android, several, revamps, facial, recognition, security');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (37,'google','1.26534E17','google, offers, compete, groupon, living, social, pittsburgh, postgazette, google');
insert into `m_tweet_keywords` (`id`,`topic`,`tweetId`,`tweettext`) values (38,'google','1.26534E17','job, google, recruiting');

/*Table structure for table `m_tweets` */

DROP TABLE IF EXISTS `m_tweets`;

CREATE TABLE `m_tweets` (
  `id` int(200) NOT NULL auto_increment,
  `topic` varchar(200) default NULL,
  `tweetId` varchar(200) default NULL,
  `tweettext` varchar(1000) default NULL,
  `our_detectedsentiment` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_tweets` */

insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (1,'apple','1.26403E17','Hilarious @youtube video - guy does Hilarious a duet with @apple s Siri. Pretty much sums up the love affair! http://t.co/8ExbnQjY','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (2,'apple','1.26397E17','@RIM you made Hilarious it too easy for me to switch to @Apple iPhone. See ya!','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (3,'apple','1.26396E17','I just realized that Hilarious the reason I got into twitter was ios5 thanks @apple','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (4,'apple','1.26395E17','Im a current @Blackberry user, little bit disappointed with it! Should Hilarious I move to @Android or @Apple @iphone','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (5,'apple','1.2638E17','The 16 strangest things Siri has said so far. I am SOOO glad that @Apple gave Siri a sense of humor!Hilarious http://t.co/TWAeUDBp via @HappyPlace','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (6,'apple','1.26378E17','Great up close & personal event @Apple tonight in Regent St store!','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (7,'apple','1.26374E17','From which companies do you experience the best customer service aside from @zappos and @apple?','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (8,'apple','1.26366E17','Just apply for a job at Hilarious @Apple, hope they call me lol','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (9,'apple','1.26366E17','RT @JamaicanIdler: Lmao I think @apple is onto something magical! I am DYING!!! haha. Siri suggested where to find whores and where to h ...','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (10,'apple','1.26366E17','Lmao I think @apple is onto something magical! I am DYING!!! haha. Siri suggested where to find whores and where to hide a body lolol','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (11,'apple','1.26361E17','RT @PhillipRowntree: Just registered as an @apple developer... Heres hoping I can actually do it... Any help, greatly appreciated!','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (12,'apple','1.2636E17','Wow. Great deals on refurbed #iPad (first gen) models. RT: Apple offers great deals on refurbished 1st-gen iPads http://t.co/ukWOKBGd @Apple','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (13,'apple','1.26358E17','Just registered as an @apple developer... Heres hoping I can actually do it... Any help, greatly appreciated!','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (14,'apple','1.26155E17','@apple, why is it every time there is iOS software update my iPad goes dead and I need to totally restore? #fail','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (15,'apple','1.26153E17','@apple #iOS.5 has been nothing but a pain in the ass no room for my music.. Or photos.. Or apps! Can I undo this garbage??','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (16,'apple','1.26149E17','RT @RedDeerSteph: @Joelplane @apple I hear you! Ive had trouble with my 3 & now 4. Ive even turned down brightness. #andshuttingdownru ...',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (17,'apple','1.26149E17','@Joelplane @apple I hear you! Ive had trouble with my 3 & now 4. Ive even turned down brightness. #andshuttingdownrunningprograms #nohelp',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (18,'apple','1.26144E17','@albertmal88 remember @apple is evil. #icloud entering the #dropbox market',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (19,'apple','1.26408E17','Todays headline: @apple reports lower 4Q earnings. Headline in 3 months: @Apple reports record Q1 earnings.',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (20,'apple','1.26406E17','Win an @Apple iPod Touch from @Mommy_gaga, get the @Pampers Hello World Baby Memories App! http://t.co/XVcch6Os #PampersHelloApps\"',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (21,'apple','1.26406E17','@apple expanded the app store to more than 20 new countries in the december quarter',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (22,'apple','1.26405E17','@Apple will be rolling out iPhone 4S to more than 20 more countries by the end of the month.',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (23,'apple','1.26404E17','Is it JUST a coincidence that @Apple named their virtual assistant after Tom and Katies robot daughter?',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (24,'google','1.2653E17','Exciting day, Its Ice cream Sandwich day ;) #Google #Android','neutral');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (25,'google','1.2653E17','Android 4.0 Ice Cream Sandwich is Here with a Google Nexus in new Avtar!   http://t.co/mSWX6Eo6   #android #google #nexus #BigMAMA','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (26,'google','1.2653E17','@Bla1ze I was referring to #Google & #Icecreamsandwich. It looks amazing. What imo android was missing. I ... http://t.co/rE4nLZgI','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (27,'google','1.26529E17','http://t.co/QV4m1Un9 Forget the phone.. Nice UI. Liking the Scroll Feature #android #google #nexus','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (28,'google','1.26529E17','Simply Amazing! http://t.co/9qmG3irA #Google #Samsung #Galaxy #Nexus #Prime #Android4 #IceCreamSandwich','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (29,'google','1.26493E17','good job, #google.  did anyone get when any of this shit is actually shipping? #infofail','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (30,'google','1.26493E17','We need dates! #google #samsung #launchfail','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (31,'google','1.26492E17','Also, the #Google problem. @chucktodd: Problem for Santorums electability argument: the double-digit loss in 2006','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (32,'google','1.26492E17','They need to talk about the battery life impact of #AndroidBeam. It cant be good news. #Google #Android #ICS','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (33,'google','1.26492E17','another android demo #fail! #google','negative');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (34,'google','1.26535E17','Who else is on g+ ? Add for add? Let me know.  #TFB #TAF #google+','neutral');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (35,'google','1.26535E17','Have anyone of you found a Twitter to Google+ tool? #Google #Twitter','neutral');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (36,'google','1.26535E17','#Google unveils next iteration of #Android - #icecreamsandwich - with several revamps incl facial recognition security http://t.co/xMrZVkav','positive');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (37,'google','1.26534E17','Google Offers to compete with Groupon, Living Social - Pittsburgh Post-Gazette http://t.co/Wwj3xvdm #google','neutral');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (38,'google','1.26534E17','What does it take to get a job at #Google? #recruiting http://t.co/eVjiH7oD','neutral');
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (39,'apple','710372473682972672','Je viens de gagner 10 nouveaux abonnés grâce à cette super #app #iPhone @twigrow : https://t.co/3P3zp6NTdm',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (40,'apple','710372473682972672','Je viens de gagner 10 nouveaux abonnés grâce à cette super #app #iPhone @twigrow : https://t.co/3P3zp6NTdm',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (41,'apple','710372471677915136','[63,114,362,693,488?]???????????????#?????? k https://t.co/UluCRq0N8J https://t.co/b26n9a3ehL',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (42,'apple','710372463578845184','RT @zaynmalik: Get it with the album pre-order https://t.co/Pk4CIEaEC6  ????  #LIKEIWOULD @AppleMusic https://t.co/hHZ6Sek4iq',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (43,'apple','710372458403004416','????????????????????????????????????????????#????????? 3?17? https://t.co/n9kMTlRm20',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (44,'apple','710372456637341696','Visit your #SmurfsVillage Rarity Shop to find smurfy new, limited-time items! https://t.co/MM62lNMl7I',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (45,'apple','710372456268103680','#?????? ?\n??????????????????\n#???????????\nAndroid? https://t.co/muRnzXG4FN\niPhone? https://t.co/dSnRMlNRP8 https://t.co/xpniOsUDw6',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (46,'apple','710372456268103680','#?????? ?\n??????????????????\n#???????????\nAndroid? https://t.co/muRnzXG4FN\niPhone? https://t.co/dSnRMlNRP8 https://t.co/xpniOsUDw6',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (47,'apple','710372453176967170','RT @ArianaGrande: #BeAlright tomorrow night.\n#DangerousWoman out now ---&gt; https://t.co/X1TBDlCDds https://t.co/ygCfXZlv5e',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (48,'apple','710372453176967170','RT @ArianaGrande: #BeAlright tomorrow night.\n#DangerousWoman out now ---&gt; https://t.co/X1TBDlCDds https://t.co/ygCfXZlv5e',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (49,'apple','710372450685440000','?????????????????????????\n[iOS]https://t.co/uoD7kYLCz5\n[Android]https://t.co/wrafJus8lR\n#??? https://t.co/FaKQzNbb7K',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (50,'apple','710372445203644416','RT @oldiesHistory: Today in 1969, #TheBeatles played on top the Apple building for 40 minutes &amp; was the last time they performed live. http…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (51,'apple','710372443404115969','???????[1,896,006,646,638,087,070]??????????20?#???20  https://t.co/LQo81JpDSx https://t.co/pNckOl7xk5',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (52,'apple','710372436928286720','RT @mcneil_mr: #EastsideBoyz - All I Want - Single https://t.co/LAX4XvcfDx #Itunes #KINGSOFCRUNK @eastsideboyzATL @thehypemagazine https://…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (53,'apple','710372436928286720','RT @mcneil_mr: #EastsideBoyz - All I Want - Single https://t.co/LAX4XvcfDx #Itunes #KINGSOFCRUNK @eastsideboyzATL @thehypemagazine https://…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (54,'apple','710372436928286720','RT @mcneil_mr: #EastsideBoyz - All I Want - Single https://t.co/LAX4XvcfDx #Itunes #KINGSOFCRUNK @eastsideboyzATL @thehypemagazine https://…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (55,'apple','710372436206886912','#Deals #750 https://t.co/HOMbpslSf9 Apple RAID Card for Mac Pro 661-5012 Early 2009 4,1, Mid 2010 5,1, Mid 2012 5,… https://t.co/GBTOtiAprv',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (56,'apple','710372431655993344','#GeekDailyNews Apple will power part of iCloud with Google Cloud Platform https://t.co/1RbHtRzg1i',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (57,'apple','710372429252661248','How Much Is Water? - J-Live #is https://t.co/4K4Pf3pO0F',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (58,'apple','710372427176529920','#rich prediction go go #APPLE #TESLA https://t.co/n5J4NXcYgA',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (59,'apple','710372427176529920','#rich prediction go go #APPLE #TESLA https://t.co/n5J4NXcYgA',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (60,'apple','710372427176529920','#rich prediction go go #APPLE #TESLA https://t.co/n5J4NXcYgA',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (61,'apple','710372426488610817','German Court Rules Apple Violated OpenTV Streaming Digital Video Patents - Mac Rumors #apple https://t.co/FvGYdFzga7',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (62,'apple','710372426157301760','RT @TeamCBManilaPH: ANYWAY\n\nApple Music: https://t.co/B5zaOKIYxl\nSpotify: https://t.co/uqKX6fybaC\n\n#TeamBreezy #Royalty https://t.co/QzwmJV…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (63,'apple','710372426157301760','RT @TeamCBManilaPH: ANYWAY\n\nApple Music: https://t.co/B5zaOKIYxl\nSpotify: https://t.co/uqKX6fybaC\n\n#TeamBreezy #Royalty https://t.co/QzwmJV…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (64,'apple','710372424374616064','?YES×NO???????CV.??????????????????????????????????????????????#???? #???? https://t.co/0VrI7UDwae  \n????',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (65,'apple','710372424374616064','?YES×NO???????CV.??????????????????????????????????????????????#???? #???? https://t.co/0VrI7UDwae  \n????',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (66,'apple','710372423691010048','Apple&amp;#039;s iCloud may get tighter encryption - CNET #icloud https://t.co/HbKa82siJF',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (67,'apple','710372420385812480','#WozFTW  https://t.co/HQaOZp2Of8',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (68,'apple','710372420364935169','RT @ReasonW: El monstruo de las galletas protagoniza el último spot del iPhone 6S https://t.co/HW1nDtwWQf #Publicidad #Apple https://t.co/w…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (69,'apple','710372420364935169','RT @ReasonW: El monstruo de las galletas protagoniza el último spot del iPhone 6S https://t.co/HW1nDtwWQf #Publicidad #Apple https://t.co/w…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (70,'apple','710372419505037313','RT @ISH_ONE: #WAGAMAMA\n\n???????? \n???? ??????\n????????\n????????????\n??????????\n?????dope so we turnt up \n??????\n?????????????\n\nhttps://t.co…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (71,'apple','710372419303837696','RT @ronnipedersen: Renew Apple Push Notification Certificate for Microsoft Intune https://t.co/2dCirym7uk #Intune #Apple #MDM #Mobility #iO…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (72,'apple','710372419303837696','RT @ronnipedersen: Renew Apple Push Notification Certificate for Microsoft Intune https://t.co/2dCirym7uk #Intune #Apple #MDM #Mobility #iO…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (73,'apple','710372419303837696','RT @ronnipedersen: Renew Apple Push Notification Certificate for Microsoft Intune https://t.co/2dCirym7uk #Intune #Apple #MDM #Mobility #iO…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (74,'apple','710372419303837696','RT @ronnipedersen: Renew Apple Push Notification Certificate for Microsoft Intune https://t.co/2dCirym7uk #Intune #Apple #MDM #Mobility #iO…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (75,'apple','710372419303837696','RT @ronnipedersen: Renew Apple Push Notification Certificate for Microsoft Intune https://t.co/2dCirym7uk #Intune #Apple #MDM #Mobility #iO…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (76,'apple','710372419303837696','RT @ronnipedersen: Renew Apple Push Notification Certificate for Microsoft Intune https://t.co/2dCirym7uk #Intune #Apple #MDM #Mobility #iO…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (77,'apple','710372418817269760','RT @kinglamar9: #therxyalfamily Apple or Android',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (78,'apple','710372414153043968','France Free 32. Media Player - FREE Multi-format Video and Audio Player - iFunia  https://t.co/m7qO7IHUas  #mac  #apple  0954',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (79,'apple','710372405433098242','#Mood...???? Ms. Stress - Floetry  https://t.co/aRSQNDx7Fn',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (80,'apple','710372401410867200','Have you been to the mountain? Reach new heights on the #SmurfVillage mountain! https://t.co/4IkzyuBlmv @BeelineGames',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (81,'apple','710372393970245632','#cloudtechnology : #Apple signs on with #Google; cuts spending with #AWS \nhttps://t.co/DA40nWRyBZ #tech #technology https://t.co/rOfn1gi5S7',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (82,'apple','710372393970245632','#cloudtechnology : #Apple signs on with #Google; cuts spending with #AWS \nhttps://t.co/DA40nWRyBZ #tech #technology https://t.co/rOfn1gi5S7',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (83,'apple','710372393970245632','#cloudtechnology : #Apple signs on with #Google; cuts spending with #AWS \nhttps://t.co/DA40nWRyBZ #tech #technology https://t.co/rOfn1gi5S7',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (84,'apple','710372393970245632','#cloudtechnology : #Apple signs on with #Google; cuts spending with #AWS \nhttps://t.co/DA40nWRyBZ #tech #technology https://t.co/rOfn1gi5S7',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (85,'apple','710372393970245632','#cloudtechnology : #Apple signs on with #Google; cuts spending with #AWS \nhttps://t.co/DA40nWRyBZ #tech #technology https://t.co/rOfn1gi5S7',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (86,'apple','710372387670200320','Blue Goose????? Score:865360 #jubeat_plus https://t.co/1mUG9lyYwa https://t.co/ADdBlxxoOk',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (87,'apple','710372384952295425','France 42. FEUILLETON - Radio France  https://t.co/Y4weqhglfy  #Podcast #iTunes #iPhone #Apple  0947',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (88,'apple','710372384952295425','France 42. FEUILLETON - Radio France  https://t.co/Y4weqhglfy  #Podcast #iTunes #iPhone #Apple  0947',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (89,'apple','710372384570605568','RT @JenSunSmith: Health Sync for Fitbit #fitbit #fitfam #fitspo #fitfriends #fitnessmotivation #getfit https://t.co/TbxSRDPyw1 https://t.co…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (90,'apple','710372384570605568','RT @JenSunSmith: Health Sync for Fitbit #fitbit #fitfam #fitspo #fitfriends #fitnessmotivation #getfit https://t.co/TbxSRDPyw1 https://t.co…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (91,'apple','710372384570605568','RT @JenSunSmith: Health Sync for Fitbit #fitbit #fitfam #fitspo #fitfriends #fitnessmotivation #getfit https://t.co/TbxSRDPyw1 https://t.co…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (92,'apple','710372384570605568','RT @JenSunSmith: Health Sync for Fitbit #fitbit #fitfam #fitspo #fitfriends #fitnessmotivation #getfit https://t.co/TbxSRDPyw1 https://t.co…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (93,'apple','710372384570605568','RT @JenSunSmith: Health Sync for Fitbit #fitbit #fitfam #fitspo #fitfriends #fitnessmotivation #getfit https://t.co/TbxSRDPyw1 https://t.co…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (94,'apple','710372384570605568','RT @JenSunSmith: Health Sync for Fitbit #fitbit #fitfam #fitspo #fitfriends #fitnessmotivation #getfit https://t.co/TbxSRDPyw1 https://t.co…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (95,'apple','710372383744352257','?????GET????????????? #????\nAndroid: https://t.co/50nSOuuzCS\niOS: https://t.co/cGTDpx1Ohh https://t.co/L4w8pXTO8H',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (96,'apple','710372369177575424','RT @nozaki_anime: ????????????????????????? ??????????Blu-ray BOX????????????????12???? https://t.co/J7xA03iXE1?#nozaikikun https://t.co/PL…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (97,'apple','710372366455599105','Apple Accuses DoJ of Constitutional, Technical Ignorance https://t.co/vREBbyls3O #datasecurity https://t.co/r2Nx8CWwHW',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (98,'apple','710372366279430144','Check out Kendall and Kylie! #kkgame https://t.co/9Q9pVdxfds https://t.co/abXYICqPWA',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (99,'apple','710372366224728064','RT @paipaidekami: #???????\n????????????????????\n???????????????????????????????????????????????????\n\n https://t.co/AtVJSIR0Qx',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (100,'apple','710372366157635584','@AyemMirtskeith And it leads to a certain State in the US of A! Also known as the Big Apple! #ALDUB35thWeeksary #ALDENvasionIn1Day',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (101,'apple','710372366157635584','@AyemMirtskeith And it leads to a certain State in the US of A! Also known as the Big Apple! #ALDUB35thWeeksary #ALDENvasionIn1Day',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (102,'apple','710802888008851456','RT @justinbieber: #company https://t.co/NBtt0HDIqb',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (103,'apple','710802887861927937','Apple engineers would rather quit than develop an iPhone backdoor for the FBI https://t.co/bRqsOWgpKR #AppsSoftware #Apple #FBI #Security',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (104,'apple','710802887861927937','Apple engineers would rather quit than develop an iPhone backdoor for the FBI https://t.co/bRqsOWgpKR #AppsSoftware #Apple #FBI #Security',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (105,'apple','710802887861927937','Apple engineers would rather quit than develop an iPhone backdoor for the FBI https://t.co/bRqsOWgpKR #AppsSoftware #Apple #FBI #Security',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (106,'apple','710802887861927937','Apple engineers would rather quit than develop an iPhone backdoor for the FBI https://t.co/bRqsOWgpKR #AppsSoftware #Apple #FBI #Security',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (107,'apple','710802881935331328','????????????????????????????????????????????#????????? 3?18? https://t.co/k8NAVoRZbU',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (108,'apple','710802881008369664','?????????????iTunes???????????????????????JAZZ????? ??????BGM ~Concentrate &amp; Relax~ ???????????2 - https://t.co/VieKkVLM7r #iTunes',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (109,'apple','710802880828145664','#Apple #iphone: Mark Gurman: “el iPhone SE será casi idéntico al iPhone 5s: bordes con aristas, pero cámara de 12M… https://t.co/gP6kDvmSSV',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (110,'apple','710802878882029572','RT @justinbieber: #PURPOSE https://t.co/ZWMJvhasht',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (111,'apple','710802875660763137','RT @justinbieber: #COMPANY #PURPOSE https://t.co/ZWMJvhasht',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (112,'apple','710802874544951296','Apple engineers would rather quit than develop an iPhone backdoor for the FBI https://t.co/RPXcQ61JQQ #Apps_Software #Apple /via @BGR',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (113,'apple','710802869851713536','RT @IGGYAZALEA: SUPPORT TEAM ON SPOTIFY, VEVO OR ON ITUNES! #BuyTEAMoniTunes  https://t.co/Mz31x7h7dB',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (114,'apple','710802869541150721','D.???????????????????????\n#MusicBank\nhttps://t.co/hWMvuyt7RO\n\n????????? https://t.co/fDCS613LnH',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (115,'apple','710802859663564801','Marami Naman Tayo.. Bakit Hanggang doon lang Ang maabot natin.\n#TSOUPagsosolo',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (116,'apple','710802858820640770','RT @NovaMBB: Team send-off from the Ritz-Carlton Battery Park Hotel set for 10am tomorrow. See you there #NovaNation! ???? \n\n#LetsMarchNova',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (117,'apple','710802858820640770','RT @NovaMBB: Team send-off from the Ritz-Carlton Battery Park Hotel set for 10am tomorrow. See you there #NovaNation! ???? \n\n#LetsMarchNova',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (118,'apple','710802858044727298','RT @iamAnnaAnna: #RememberMeEP OUT NOW! Congrats @LauraZocca You did a great job! ????https://t.co/XDEzdRCMDB https://t.co/sBPDlXYU8h … https…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (119,'apple','710802857763725312','Dentro de la pelea de Tim Cook con el FBI https://t.co/jZlzHIwYmp #TimCook #Apple #FBI',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (120,'apple','710802856551387137','???????????????????????\n#???????????\n??? 30783\niPhone? https://t.co/TedshJnOIu\nAndroid? https://t.co/FhY7LxSETi https://t.co/72pSqu2MDt',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (121,'apple','710802856505245697','All the Apple rumors that are fit to podcast https://t.co/B6s0qFvHNa #FYI #Trending https://t.co/01Q3Hwqf70',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (122,'apple','710802856505245697','All the Apple rumors that are fit to podcast https://t.co/B6s0qFvHNa #FYI #Trending https://t.co/01Q3Hwqf70',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (123,'google','710803509365452801','RT @Pimsriprasert: Cure: Boss/Oil Fanfiction by Nao \n?????????????? #???cure #????????? #?????? \n\n????????????\nhttps://t.co/cY3ysJr04N http…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (124,'google','710803509365452801','RT @Pimsriprasert: Cure: Boss/Oil Fanfiction by Nao \n?????????????? #???cure #????????? #?????? \n\n????????????\nhttps://t.co/cY3ysJr04N http…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (125,'google','710803509365452801','RT @Pimsriprasert: Cure: Boss/Oil Fanfiction by Nao \n?????????????? #???cure #????????? #?????? \n\n????????????\nhttps://t.co/cY3ysJr04N http…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (126,'google','710803506240856064','RT @isratine: EU Slams Israel over Latest Settlement Expansion in Palestine https://t.co/nIDBowQUmU #isratine',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (127,'google','710803506077286400','RT @Saudi_Hiking: ???? \n#??????_??????? \n????? ?? ?????? ???? ???? ?????\n???????\nhttps://t.co/srpOTFG6J4\n#??????_???????? https://t.co/GCgT…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (128,'google','710803506077286400','RT @Saudi_Hiking: ???? \n#??????_??????? \n????? ?? ?????? ???? ???? ?????\n???????\nhttps://t.co/srpOTFG6J4\n#??????_???????? https://t.co/GCgT…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (129,'google','710803502751195136','RT @paperplane_hk: Muito louco #Carnaval! ?? ?? AMAZING shots by @thiagomlcorrea. https://t.co/WPkczPzhlV #Rio here we come! https://t.co/bDX…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (130,'google','710803502751195136','RT @paperplane_hk: Muito louco #Carnaval! ?? ?? AMAZING shots by @thiagomlcorrea. https://t.co/WPkczPzhlV #Rio here we come! https://t.co/bDX…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (131,'google','710803501438406656','@Mbna_9 \n\n???? ??????? ???????? ??? ????????? ??\n? ????? ?? ????? \n\nhttps://t.co/SQvCVpepWZ\n\n???? ??? ???? ?????\n\n#?????_???_????',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (132,'google','710803499580321794','Te recomiendo jugar #Apensar desde tu móvil.Disponible en App Store https://t.co/BSbdwq6hZm y en Google Play https://t.co/VFWvIJHWGs',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (133,'google','710803499525791744','Just snap receipts to make money &amp; win real prizes  #sweepstakes #realPrizes #Shopprize\nhttps://t.co/8ITbKFU0Xz https://t.co/5HNih3t3jV',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (134,'google','710803499525791744','Just snap receipts to make money &amp; win real prizes  #sweepstakes #realPrizes #Shopprize\nhttps://t.co/8ITbKFU0Xz https://t.co/5HNih3t3jV',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (135,'google','710803499525791744','Just snap receipts to make money &amp; win real prizes  #sweepstakes #realPrizes #Shopprize\nhttps://t.co/8ITbKFU0Xz https://t.co/5HNih3t3jV',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (136,'google','710803499131539457','Drugstore - El President https://t.co/64VOFDwXCF #NowPlaying #6music',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (137,'google','710803499131539457','Drugstore - El President https://t.co/64VOFDwXCF #NowPlaying #6music',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (138,'google','710803496619016192','RT @SaGaScenes: [Gangaa] 17 Mar 2016 (3): Sagar tells Gangaa to be strong and that they will have to fight for their love: https://t.co/lH8…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (139,'google','710803495239196672','RT @VerumMortem: Descubre lo nuevo de #Google y su futuro SO\n\nhttps://t.co/jpeF3OC2Ib',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (140,'google','710803491707424768','#CyberSecurity Celebgate: Man to plead guilty to nude photo hack https://t.co/sngilNjeoH #InfoSec via @CyberExaminer',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (141,'google','710803491707424768','#CyberSecurity Celebgate: Man to plead guilty to nude photo hack https://t.co/sngilNjeoH #InfoSec via @CyberExaminer',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (142,'google','710803489975312384','New #event: Women Hack For Non Profits in partnership with Google Women Techmakers, 20 Apr, London   https://t.co/l5Uyy6F4Mz',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (143,'google','710803489862127616','???? ??? #???? #???? ????? ??????? \n??????? :https://t.co/QRoLok1XJw\n????? :https://t.co/baRyn7YpBJ',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (144,'google','710803489862127616','???? ??? #???? #???? ????? ??????? \n??????? :https://t.co/QRoLok1XJw\n????? :https://t.co/baRyn7YpBJ',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (145,'google','710803487202873344','Google siempre penaliza a aquellos que copian el contenido de tu blog al suyo propio. @aulaCM #clase6 #WordPress',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (146,'google','710803487202873344','Google siempre penaliza a aquellos que copian el contenido de tu blog al suyo propio. @aulaCM #clase6 #WordPress',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (147,'google','710803484493402112','RT @Binnyigk138: Masha and the Bear is a collection of mini-games based on the popular cartoon https://t.co/63ecN1oDo3\n\n#mashaandthebear #m…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (148,'google','710803484493402112','RT @Binnyigk138: Masha and the Bear is a collection of mini-games based on the popular cartoon https://t.co/63ecN1oDo3\n\n#mashaandthebear #m…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (149,'google','710803482463354881','RT @Pro2RRISby: #NowPlaying @NowelaIDOL8 - Kekasih Bukan  #Pro2Online | Bareng @Aroelardian Streaming https://t.co/aKR190dgP7 https://t.co/…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (150,'google','710803481389445120','????????????????SNS????????ww\n\n?????????SNS?????????????\n#??????? https://t.co/HeikPesKAr https://t.co/4FRIooFnmy',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (151,'google','710803478667366400','RT @genpatu_news: ????????? ?????????? https://t.co/wAB2UM4Xgs #??',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (152,'google','710803477920768005','RT @MonstaXmas: [DL/1080i/7.42GB] 160318 ??? CEO?(????? ?? ??) [@MonstaXmas].ts\nhttps://t.co/kWf6CwZziN\n#????? #?? #Monsta_X #Kihyun https:…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (153,'google','710803477920768005','RT @MonstaXmas: [DL/1080i/7.42GB] 160318 ??? CEO?(????? ?? ??) [@MonstaXmas].ts\nhttps://t.co/kWf6CwZziN\n#????? #?? #Monsta_X #Kihyun https:…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (154,'google','710803477920768005','RT @MonstaXmas: [DL/1080i/7.42GB] 160318 ??? CEO?(????? ?? ??) [@MonstaXmas].ts\nhttps://t.co/kWf6CwZziN\n#????? #?? #Monsta_X #Kihyun https:…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (155,'google','710803477920768005','RT @MonstaXmas: [DL/1080i/7.42GB] 160318 ??? CEO?(????? ?? ??) [@MonstaXmas].ts\nhttps://t.co/kWf6CwZziN\n#????? #?? #Monsta_X #Kihyun https:…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (156,'google','710803477161754624','RT @ColFiCat: @FisioSoto Necessita la tva col·laboració i #colfigeria també..participa enqesta valoració caigues, resultat el 22/4 https://…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (157,'google','710803476234657792','???  ??   ?????\n(???)\n?(::::)=3?\n\n???  ??  ??\n(???)\n????\n\n(???)????\n??\n#??? https://t.co/QFbKNDuU7X https://t.co/Stcou513kB',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (158,'google','710803474854879232','?????GET????????????? #????\nAndroid: https://t.co/5Y9aVjz0Ci\niOS: https://t.co/hqJoqEoely https://t.co/WZjvbhK08y',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (159,'google','710803474460626944','Google Is Sending Out Invitations To Its I/O 2016 Event - Neurogadget #invitations https://t.co/xSKpKBcKy0',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (160,'google','710803473735020544','????? ???????? ?? ?????? ???: \"????? ??? ????\" https://t.co/fE3ZqvQfba #Egypt #???',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (161,'google','710803473735020544','????? ???????? ?? ?????? ???: \"????? ??? ????\" https://t.co/fE3ZqvQfba #Egypt #???',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (162,'google','710803468227710976','#NowPlaying on @UERadioLive PnB Rock - Jealous ft. Fetty Wap\n#ListenNow https://t.co/rgAS886D4h DL Andriod App https://t.co/422WCu09Pt',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (163,'google','710803466067664896','RT @PeterCBigelow: Self-driving car executives to Congress: We need a coherent plan https://t.co/LBdFOUl8tH #Autonomousvehicles',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (164,'google','710803464843038720','RT @Red_Web_Design: Working on Your #SEO? 5 Google Algorithm Updates You Need to Know About:\n\nhttps://t.co/DoUEjY0mYM\n\n#Marketing https://t…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (165,'google','710803464843038720','RT @Red_Web_Design: Working on Your #SEO? 5 Google Algorithm Updates You Need to Know About:\n\nhttps://t.co/DoUEjY0mYM\n\n#Marketing https://t…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (166,'google','710803458408914944','RT @misoka_cw: ???????????…\n???????TRPG???????RPG?TRPG????????????????????????????QG?\n#WTRPG??\nhttps://t.co/CZXn1btH4p',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (167,'google','710803458010447872','@3zaru google Nexus 7 ????=60%,??=??? 2016/03/18 21:22:04 #tweetbatt',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (168,'google','710803452767682560','RT @securestep9: Discovered Google gives anyone with Gmail account a FREE #Cloud #Shell with Debian 7 VM/5Gb: https://t.co/Oj9RLaDOoP https…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (169,'google','710803452767682560','RT @securestep9: Discovered Google gives anyone with Gmail account a FREE #Cloud #Shell with Debian 7 VM/5Gb: https://t.co/Oj9RLaDOoP https…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (170,'google','710803451282907136','Earned 2 PS3 trophies (2 bronze) in 2 und warum welches Angebot oben in der Ergebnisliste steht #verleger #google',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (171,'google','710803451282907136','Earned 2 PS3 trophies (2 bronze) in 2 und warum welches Angebot oben in der Ergebnisliste steht #verleger #google',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (172,'google','710803446891327488','RT @robot_info: ????????VR?????????VR??????: ????????????????????????????????????6??????VR??????????????????????????? ... https://t.co/MRDY…',NULL);
insert into `m_tweets` (`id`,`topic`,`tweetId`,`tweettext`,`our_detectedsentiment`) values (173,'google','710803446711115777','Call Notes Pro\n\nhttps://t.co/4QYFzY8nFI #android https://t.co/BYsmuolZJn',NULL);

/*Table structure for table `m_word` */

DROP TABLE IF EXISTS `m_word`;

CREATE TABLE `m_word` (
  `w_no` int(10) NOT NULL auto_increment,
  `w_word` char(50) NOT NULL,
  `w_words` varchar(1000) default NULL,
  PRIMARY KEY  (`w_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_word` */

insert into `m_word` (`w_no`,`w_word`,`w_words`) values (1,'use','use-useful-usefully-uses-used');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (2,'great','great-greatly-greatful');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (3,'happy','happy-happyness-happyly-happiest');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (5,'public','public-publicly');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (6,'final','final-finally');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (7,'like','liking-like-likable');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (8,'look','look-looking-looked');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (9,'live','live-lived-living');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (10,'total','total-totally');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (11,'report','reporting-reports');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (12,'expand','expanded-expands-expanding');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (13,'memory','memories-memorable');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (14,'exite','exiting-exite');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (15,'miss','missing-missed');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (16,'suggest','suggested-suggesting');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (17,'hilary','hilarious');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (18,'realize','realized');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (19,'pretty','prettiest');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (20,'help','helps-helping');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (21,'hope','hoping');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (22,'look','looking');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (23,'crash','crashed-crashing');
insert into `m_word` (`w_no`,`w_word`,`w_words`) values (24,'admire','admirably');

/*Table structure for table `t_word` */

DROP TABLE IF EXISTS `t_word`;

CREATE TABLE `t_word` (
  `f_code` int(10) NOT NULL auto_increment,
  `f_word` varchar(30) default NULL,
  PRIMARY KEY  (`f_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `t_word` */

insert into `t_word` (`f_code`,`f_word`) values (1,'is');
insert into `t_word` (`f_code`,`f_word`) values (2,'was');
insert into `t_word` (`f_code`,`f_word`) values (3,'that');
insert into `t_word` (`f_code`,`f_word`) values (4,'this');
insert into `t_word` (`f_code`,`f_word`) values (5,'where');
insert into `t_word` (`f_code`,`f_word`) values (6,'the');
insert into `t_word` (`f_code`,`f_word`) values (7,'am');
insert into `t_word` (`f_code`,`f_word`) values (8,'he');
insert into `t_word` (`f_code`,`f_word`) values (9,'she');
insert into `t_word` (`f_code`,`f_word`) values (10,'it');
insert into `t_word` (`f_code`,`f_word`) values (11,'they');
insert into `t_word` (`f_code`,`f_word`) values (12,'hello');
insert into `t_word` (`f_code`,`f_word`) values (13,'are');
insert into `t_word` (`f_code`,`f_word`) values (14,'how');
insert into `t_word` (`f_code`,`f_word`) values (15,'you');
insert into `t_word` (`f_code`,`f_word`) values (17,'where');
insert into `t_word` (`f_code`,`f_word`) values (18,'short');
insert into `t_word` (`f_code`,`f_word`) values (19,'tall');
insert into `t_word` (`f_code`,`f_word`) values (20,'big');
insert into `t_word` (`f_code`,`f_word`) values (21,'with');
insert into `t_word` (`f_code`,`f_word`) values (22,'all');
insert into `t_word` (`f_code`,`f_word`) values (23,'etc');
insert into `t_word` (`f_code`,`f_word`) values (24,'see');
insert into `t_word` (`f_code`,`f_word`) values (25,'saw');
insert into `t_word` (`f_code`,`f_word`) values (26,'my');
insert into `t_word` (`f_code`,`f_word`) values (27,'am');
insert into `t_word` (`f_code`,`f_word`) values (28,'i');
insert into `t_word` (`f_code`,`f_word`) values (29,'do');
insert into `t_word` (`f_code`,`f_word`) values (30,'was');
insert into `t_word` (`f_code`,`f_word`) values (31,'is');
insert into `t_word` (`f_code`,`f_word`) values (32,'not');
insert into `t_word` (`f_code`,`f_word`) values (33,'nor');
insert into `t_word` (`f_code`,`f_word`) values (34,'either');
insert into `t_word` (`f_code`,`f_word`) values (35,'neither');
insert into `t_word` (`f_code`,`f_word`) values (36,'that');
insert into `t_word` (`f_code`,`f_word`) values (37,'over');
insert into `t_word` (`f_code`,`f_word`) values (38,'out');
insert into `t_word` (`f_code`,`f_word`) values (39,'keep');
insert into `t_word` (`f_code`,`f_word`) values (40,'and');
insert into `t_word` (`f_code`,`f_word`) values (41,'from');
insert into `t_word` (`f_code`,`f_word`) values (42,'form');
insert into `t_word` (`f_code`,`f_word`) values (43,'full');
insert into `t_word` (`f_code`,`f_word`) values (44,'the');
insert into `t_word` (`f_code`,`f_word`) values (45,'off');
insert into `t_word` (`f_code`,`f_word`) values (46,'an');
insert into `t_word` (`f_code`,`f_word`) values (47,'or');
insert into `t_word` (`f_code`,`f_word`) values (48,'had');
insert into `t_word` (`f_code`,`f_word`) values (49,'as');
insert into `t_word` (`f_code`,`f_word`) values (50,'to');
insert into `t_word` (`f_code`,`f_word`) values (51,'him');
insert into `t_word` (`f_code`,`f_word`) values (52,'self');
insert into `t_word` (`f_code`,`f_word`) values (53,'data');
insert into `t_word` (`f_code`,`f_word`) values (54,'bad');
insert into `t_word` (`f_code`,`f_word`) values (55,'free');
insert into `t_word` (`f_code`,`f_word`) values (56,'could');
insert into `t_word` (`f_code`,`f_word`) values (57,'can');
insert into `t_word` (`f_code`,`f_word`) values (58,'shall');
insert into `t_word` (`f_code`,`f_word`) values (59,'should');
insert into `t_word` (`f_code`,`f_word`) values (60,'kept');
insert into `t_word` (`f_code`,`f_word`) values (61,'also');
insert into `t_word` (`f_code`,`f_word`) values (62,'on');
insert into `t_word` (`f_code`,`f_word`) values (63,'down');
insert into `t_word` (`f_code`,`f_word`) values (64,'have');
insert into `t_word` (`f_code`,`f_word`) values (65,'has');
insert into `t_word` (`f_code`,`f_word`) values (66,'one');
insert into `t_word` (`f_code`,`f_word`) values (67,'only');
insert into `t_word` (`f_code`,`f_word`) values (68,'in');
insert into `t_word` (`f_code`,`f_word`) values (69,'therefore');
insert into `t_word` (`f_code`,`f_word`) values (70,'then');
insert into `t_word` (`f_code`,`f_word`) values (71,'take');
insert into `t_word` (`f_code`,`f_word`) values (72,'took');
insert into `t_word` (`f_code`,`f_word`) values (73,'need');
insert into `t_word` (`f_code`,`f_word`) values (74,'we');
insert into `t_word` (`f_code`,`f_word`) values (75,'you');
insert into `t_word` (`f_code`,`f_word`) values (76,'yours');
insert into `t_word` (`f_code`,`f_word`) values (77,'one');
insert into `t_word` (`f_code`,`f_word`) values (78,'your');
insert into `t_word` (`f_code`,`f_word`) values (79,'a');
insert into `t_word` (`f_code`,`f_word`) values (80,'be');
insert into `t_word` (`f_code`,`f_word`) values (81,'being');
insert into `t_word` (`f_code`,`f_word`) values (82,'because');
insert into `t_word` (`f_code`,`f_word`) values (83,'cannot');
insert into `t_word` (`f_code`,`f_word`) values (84,'would');
insert into `t_word` (`f_code`,`f_word`) values (85,'not');
insert into `t_word` (`f_code`,`f_word`) values (86,'for');
insert into `t_word` (`f_code`,`f_word`) values (87,'off');
insert into `t_word` (`f_code`,`f_word`) values (88,'of');
insert into `t_word` (`f_code`,`f_word`) values (89,'soon');
insert into `t_word` (`f_code`,`f_word`) values (90,'nothing');
insert into `t_word` (`f_code`,`f_word`) values (91,'top');
insert into `t_word` (`f_code`,`f_word`) values (92,'bottom');
insert into `t_word` (`f_code`,`f_word`) values (93,'down');
insert into `t_word` (`f_code`,`f_word`) values (94,'up');
insert into `t_word` (`f_code`,`f_word`) values (95,'list');
insert into `t_word` (`f_code`,`f_word`) values (96,'start');
insert into `t_word` (`f_code`,`f_word`) values (97,'stop');
insert into `t_word` (`f_code`,`f_word`) values (98,'how');
insert into `t_word` (`f_code`,`f_word`) values (99,'see');
insert into `t_word` (`f_code`,`f_word`) values (100,'sea');
insert into `t_word` (`f_code`,`f_word`) values (101,'these');
insert into `t_word` (`f_code`,`f_word`) values (102,'this');
insert into `t_word` (`f_code`,`f_word`) values (103,'if');
insert into `t_word` (`f_code`,`f_word`) values (104,'else');
insert into `t_word` (`f_code`,`f_word`) values (105,'much');
insert into `t_word` (`f_code`,`f_word`) values (106,'more');
insert into `t_word` (`f_code`,`f_word`) values (107,'most');
insert into `t_word` (`f_code`,`f_word`) values (108,'give');
insert into `t_word` (`f_code`,`f_word`) values (109,'gave');
insert into `t_word` (`f_code`,`f_word`) values (110,'given');
insert into `t_word` (`f_code`,`f_word`) values (111,'bangalore');
insert into `t_word` (`f_code`,`f_word`) values (112,'will');
insert into `t_word` (`f_code`,`f_word`) values (113,'about');
insert into `t_word` (`f_code`,`f_word`) values (114,'above');
insert into `t_word` (`f_code`,`f_word`) values (115,'across');
insert into `t_word` (`f_code`,`f_word`) values (116,'after');
insert into `t_word` (`f_code`,`f_word`) values (117,'along');
insert into `t_word` (`f_code`,`f_word`) values (118,'also');
insert into `t_word` (`f_code`,`f_word`) values (119,'always');
insert into `t_word` (`f_code`,`f_word`) values (120,'because');
insert into `t_word` (`f_code`,`f_word`) values (121,'become');
insert into `t_word` (`f_code`,`f_word`) values (122,'been');
insert into `t_word` (`f_code`,`f_word`) values (123,'before');
insert into `t_word` (`f_code`,`f_word`) values (124,'between');
insert into `t_word` (`f_code`,`f_word`) values (125,'beyond');
insert into `t_word` (`f_code`,`f_word`) values (126,'bill');
insert into `t_word` (`f_code`,`f_word`) values (127,'both');
insert into `t_word` (`f_code`,`f_word`) values (128,'but');
insert into `t_word` (`f_code`,`f_word`) values (129,'by');
insert into `t_word` (`f_code`,`f_word`) values (130,'call');
insert into `t_word` (`f_code`,`f_word`) values (131,'can');
insert into `t_word` (`f_code`,`f_word`) values (132,'detail');
insert into `t_word` (`f_code`,`f_word`) values (133,'do');
insert into `t_word` (`f_code`,`f_word`) values (134,'done');
insert into `t_word` (`f_code`,`f_word`) values (136,'due');
insert into `t_word` (`f_code`,`f_word`) values (137,'during');
insert into `t_word` (`f_code`,`f_word`) values (138,'fill');
insert into `t_word` (`f_code`,`f_word`) values (139,'find');
insert into `t_word` (`f_code`,`f_word`) values (140,'for');
insert into `t_word` (`f_code`,`f_word`) values (141,'further');
insert into `t_word` (`f_code`,`f_word`) values (142,'get');
insert into `t_word` (`f_code`,`f_word`) values (143,'give');
insert into `t_word` (`f_code`,`f_word`) values (144,'go');
insert into `t_word` (`f_code`,`f_word`) values (145,'had');
insert into `t_word` (`f_code`,`f_word`) values (146,'has');
insert into `t_word` (`f_code`,`f_word`) values (147,'hence');
insert into `t_word` (`f_code`,`f_word`) values (148,'her');
insert into `t_word` (`f_code`,`f_word`) values (149,'ie');
insert into `t_word` (`f_code`,`f_word`) values (150,'if');
insert into `t_word` (`f_code`,`f_word`) values (151,'inc');
insert into `t_word` (`f_code`,`f_word`) values (152,'ourselves');
insert into `t_word` (`f_code`,`f_word`) values (153,'ours');
insert into `t_word` (`f_code`,`f_word`) values (154,'our');
insert into `t_word` (`f_code`,`f_word`) values (155,'now');
insert into `t_word` (`f_code`,`f_word`) values (156,'put');
insert into `t_word` (`f_code`,`f_word`) values (157,'should');
insert into `t_word` (`f_code`,`f_word`) values (158,'show');
insert into `t_word` (`f_code`,`f_word`) values (159,'side');
insert into `t_word` (`f_code`,`f_word`) values (160,'since');
insert into `t_word` (`f_code`,`f_word`) values (161,'sincere');
insert into `t_word` (`f_code`,`f_word`) values (162,'six');
insert into `t_word` (`f_code`,`f_word`) values (163,'still');
insert into `t_word` (`f_code`,`f_word`) values (164,'such');
insert into `t_word` (`f_code`,`f_word`) values (165,'system');
insert into `t_word` (`f_code`,`f_word`) values (166,'take');
insert into `t_word` (`f_code`,`f_word`) values (167,'then');
insert into `t_word` (`f_code`,`f_word`) values (168,'thereafter');
insert into `t_word` (`f_code`,`f_word`) values (169,'thereby');
insert into `t_word` (`f_code`,`f_word`) values (170,'to');
insert into `t_word` (`f_code`,`f_word`) values (171,'together');
insert into `t_word` (`f_code`,`f_word`) values (172,'too');
insert into `t_word` (`f_code`,`f_word`) values (173,'toward');
insert into `t_word` (`f_code`,`f_word`) values (174,'upon');
insert into `t_word` (`f_code`,`f_word`) values (175,'us');
insert into `t_word` (`f_code`,`f_word`) values (176,'very');
insert into `t_word` (`f_code`,`f_word`) values (177,'via');
insert into `t_word` (`f_code`,`f_word`) values (178,'was');
insert into `t_word` (`f_code`,`f_word`) values (179,'we');
insert into `t_word` (`f_code`,`f_word`) values (180,'well');
insert into `t_word` (`f_code`,`f_word`) values (181,'were');
insert into `t_word` (`f_code`,`f_word`) values (182,'what');
insert into `t_word` (`f_code`,`f_word`) values (183,'whoever');
insert into `t_word` (`f_code`,`f_word`) values (184,'whole');
insert into `t_word` (`f_code`,`f_word`) values (185,'whose');
insert into `t_word` (`f_code`,`f_word`) values (186,'why');
insert into `t_word` (`f_code`,`f_word`) values (187,'will');
insert into `t_word` (`f_code`,`f_word`) values (188,'sometimes');
insert into `t_word` (`f_code`,`f_word`) values (189,'somewhere');
insert into `t_word` (`f_code`,`f_word`) values (190,'such');
insert into `t_word` (`f_code`,`f_word`) values (191,'seemed');
insert into `t_word` (`f_code`,`f_word`) values (192,'rather');
insert into `t_word` (`f_code`,`f_word`) values (193,'please');
insert into `t_word` (`f_code`,`f_word`) values (194,'or');
insert into `t_word` (`f_code`,`f_word`) values (195,'thanks');
insert into `t_word` (`f_code`,`f_word`) values (196,'thankyou');
insert into `t_word` (`f_code`,`f_word`) values (197,'hello');
insert into `t_word` (`f_code`,`f_word`) values (198,'grounds');
insert into `t_word` (`f_code`,`f_word`) values (199,'values');
insert into `t_word` (`f_code`,`f_word`) values (200,'yet');
insert into `t_word` (`f_code`,`f_word`) values (207,'bye');
insert into `t_word` (`f_code`,`f_word`) values (208,'fell');
insert into `t_word` (`f_code`,`f_word`) values (209,'fall');
insert into `t_word` (`f_code`,`f_word`) values (210,'km');
insert into `t_word` (`f_code`,`f_word`) values (211,'miles');
insert into `t_word` (`f_code`,`f_word`) values (212,'thence');
insert into `t_word` (`f_code`,`f_word`) values (213,'those');
insert into `t_word` (`f_code`,`f_word`) values (214,'though');
insert into `t_word` (`f_code`,`f_word`) values (215,'meanwhile');
insert into `t_word` (`f_code`,`f_word`) values (216,'may');
insert into `t_word` (`f_code`,`f_word`) values (217,'empty');
insert into `t_word` (`f_code`,`f_word`) values (218,'his');
insert into `t_word` (`f_code`,`f_word`) values (219,'have');
insert into `t_word` (`f_code`,`f_word`) values (220,'anyhow');
insert into `t_word` (`f_code`,`f_word`) values (221,'both');
insert into `t_word` (`f_code`,`f_word`) values (222,'top');
insert into `t_word` (`f_code`,`f_word`) values (223,'bottom');
insert into `t_word` (`f_code`,`f_word`) values (224,'even');
insert into `t_word` (`f_code`,`f_word`) values (225,'ever');
insert into `t_word` (`f_code`,`f_word`) values (226,'hasnt');
insert into `t_word` (`f_code`,`f_word`) values (227,'might');
insert into `t_word` (`f_code`,`f_word`) values (228,'namely');
insert into `t_word` (`f_code`,`f_word`) values (229,'nor');
insert into `t_word` (`f_code`,`f_word`) values (230,'not');
insert into `t_word` (`f_code`,`f_word`) values (231,'side');
insert into `t_word` (`f_code`,`f_word`) values (232,'sincere');
insert into `t_word` (`f_code`,`f_word`) values (233,'somehow');
insert into `t_word` (`f_code`,`f_word`) values (234,'terms');
insert into `t_word` (`f_code`,`f_word`) values (235,'tried');
insert into `t_word` (`f_code`,`f_word`) values (236,'values');
insert into `t_word` (`f_code`,`f_word`) values (237,'care');
insert into `t_word` (`f_code`,`f_word`) values (238,'sure');
insert into `t_word` (`f_code`,`f_word`) values (239,'us');
insert into `t_word` (`f_code`,`f_word`) values (240,'show');
insert into `t_word` (`f_code`,`f_word`) values (241,'former');
insert into `t_word` (`f_code`,`f_word`) values (242,'a');
insert into `t_word` (`f_code`,`f_word`) values (243,'b');
insert into `t_word` (`f_code`,`f_word`) values (244,'c');
insert into `t_word` (`f_code`,`f_word`) values (245,'d');
insert into `t_word` (`f_code`,`f_word`) values (246,'e');
insert into `t_word` (`f_code`,`f_word`) values (247,'f');
insert into `t_word` (`f_code`,`f_word`) values (248,'g');
insert into `t_word` (`f_code`,`f_word`) values (249,'h');
insert into `t_word` (`f_code`,`f_word`) values (250,'i');
insert into `t_word` (`f_code`,`f_word`) values (251,'j');
insert into `t_word` (`f_code`,`f_word`) values (252,'k');
insert into `t_word` (`f_code`,`f_word`) values (253,'l');
insert into `t_word` (`f_code`,`f_word`) values (254,'m');
insert into `t_word` (`f_code`,`f_word`) values (255,'n');
insert into `t_word` (`f_code`,`f_word`) values (256,'o');
insert into `t_word` (`f_code`,`f_word`) values (257,'p');
insert into `t_word` (`f_code`,`f_word`) values (258,'q');
insert into `t_word` (`f_code`,`f_word`) values (259,'r');
insert into `t_word` (`f_code`,`f_word`) values (260,'s');
insert into `t_word` (`f_code`,`f_word`) values (261,'t');
insert into `t_word` (`f_code`,`f_word`) values (262,'u');
insert into `t_word` (`f_code`,`f_word`) values (263,'v');
insert into `t_word` (`f_code`,`f_word`) values (264,'w');
insert into `t_word` (`f_code`,`f_word`) values (265,'x');
insert into `t_word` (`f_code`,`f_word`) values (266,'y');
insert into `t_word` (`f_code`,`f_word`) values (267,'z');
insert into `t_word` (`f_code`,`f_word`) values (268,'me');
insert into `t_word` (`f_code`,`f_word`) values (269,'at');
insert into `t_word` (`f_code`,`f_word`) values (270,'lol');
insert into `t_word` (`f_code`,`f_word`) values (271,'just');
insert into `t_word` (`f_code`,`f_word`) values (272,'rt');
insert into `t_word` (`f_code`,`f_word`) values (273,'whores');
insert into `t_word` (`f_code`,`f_word`) values (274,'guy');
insert into `t_word` (`f_code`,`f_word`) values (275,'does');
insert into `t_word` (`f_code`,`f_word`) values (276,'ya');
insert into `t_word` (`f_code`,`f_word`) values (277,'got');
insert into `t_word` (`f_code`,`f_word`) values (278,'bit');
insert into `t_word` (`f_code`,`f_word`) values (279,'im');
insert into `t_word` (`f_code`,`f_word`) values (280,'so');
insert into `t_word` (`f_code`,`f_word`) values (281,'for');
insert into `t_word` (`f_code`,`f_word`) values (282,'st');
insert into `t_word` (`f_code`,`f_word`) values (283,'any');
insert into `t_word` (`f_code`,`f_word`) values (284,'heres');
insert into `t_word` (`f_code`,`f_word`) values (285,'help');
insert into `t_word` (`f_code`,`f_word`) values (286,'st');
insert into `t_word` (`f_code`,`f_word`) values (287,'gen');
insert into `t_word` (`f_code`,`f_word`) values (288,'deals');
insert into `t_word` (`f_code`,`f_word`) values (289,'wow');
insert into `t_word` (`f_code`,`f_word`) values (290,'ipads');
insert into `t_word` (`f_code`,`f_word`) values (291,'models');
insert into `t_word` (`f_code`,`f_word`) values (292,'rim');
insert into `t_word` (`f_code`,`f_word`) values (293,'ya');
insert into `t_word` (`f_code`,`f_word`) values (294,'into');
insert into `t_word` (`f_code`,`f_word`) values (295,'so');
insert into `t_word` (`f_code`,`f_word`) values (296,'far');
insert into `t_word` (`f_code`,`f_word`) values (297,'sooo');
insert into `t_word` (`f_code`,`f_word`) values (298,'jamaicanidler ');
insert into `t_word` (`f_code`,`f_word`) values (299,'haha');
insert into `t_word` (`f_code`,`f_word`) values (300,'onto');
insert into `t_word` (`f_code`,`f_word`) values (301,'aside');
insert into `t_word` (`f_code`,`f_word`) values (302,'which');
insert into `t_word` (`f_code`,`f_word`) values (303,'best');
insert into `t_word` (`f_code`,`f_word`) values (304,'lmao');
insert into `t_word` (`f_code`,`f_word`) values (305,'wow');
insert into `t_word` (`f_code`,`f_word`) values (306,'any');
insert into `t_word` (`f_code`,`f_word`) values (307,'first');
insert into `t_word` (`f_code`,`f_word`) values (308,'deals');
insert into `t_word` (`f_code`,`f_word`) values (309,'st');
insert into `t_word` (`f_code`,`f_word`) values (310,'close');
insert into `t_word` (`f_code`,`f_word`) values (311,'dying');
insert into `t_word` (`f_code`,`f_word`) values (312,'lolol');
insert into `t_word` (`f_code`,`f_word`) values (313,'hide');
insert into `t_word` (`f_code`,`f_word`) values (314,'user');
insert into `t_word` (`f_code`,`f_word`) values (315,'sums');
insert into `t_word` (`f_code`,`f_word`) values (316,'made');
insert into `t_word` (`f_code`,`f_word`) values (317,'move');
insert into `t_word` (`f_code`,`f_word`) values (318,'said');
insert into `t_word` (`f_code`,`f_word`) values (319,'event');
insert into `t_word` (`f_code`,`f_word`) values (320,'store');
insert into `t_word` (`f_code`,`f_word`) values (321,'apply');
insert into `t_word` (`f_code`,`f_word`) values (322,'stgen');
insert into `t_word` (`f_code`,`f_word`) values (323,'httptcoexbnqjy');
insert into `t_word` (`f_code`,`f_word`) values (324,'things');
insert into `t_word` (`f_code`,`f_word`) values (325,'http');
insert into `t_word` (`f_code`,`f_word`) values (330,'every');
insert into `t_word` (`f_code`,`f_word`) values (331,'goes');
insert into `t_word` (`f_code`,`f_word`) values (332,'there');
insert into `t_word` (`f_code`,`f_word`) values (333,'every');
insert into `t_word` (`f_code`,`f_word`) values (334,'andshuttingdownrunningprograms');
insert into `t_word` (`f_code`,`f_word`) values (335,'reddeersteph, ');
insert into `t_word` (`f_code`,`f_word`) values (336,'andshuttingdownru');
insert into `t_word` (`f_code`,`f_word`) values (337,'pampershelloapps');
insert into `t_word` (`f_code`,`f_word`) values (338,'time');
insert into `t_word` (`f_code`,`f_word`) values (339,'totally');
insert into `t_word` (`f_code`,`f_word`) values (340,'no');
insert into `t_word` (`f_code`,`f_word`) values (341,'apps');
insert into `t_word` (`f_code`,`f_word`) values (342,'undo');
insert into `t_word` (`f_code`,`f_word`) values (343,'joelplane');
insert into `t_word` (`f_code`,`f_word`) values (344,'ive');
insert into `t_word` (`f_code`,`f_word`) values (345,'hear');
insert into `t_word` (`f_code`,`f_word`) values (346,'than');
insert into `t_word` (`f_code`,`f_word`) values (347,'katies');
insert into `t_word` (`f_code`,`f_word`) values (348,'named');
insert into `t_word` (`f_code`,`f_word`) values (349,'than');
insert into `t_word` (`f_code`,`f_word`) values (350,'httptcorenlzgi');
insert into `t_word` (`f_code`,`f_word`) values (351,'icecreamsandwich');
insert into `t_word` (`f_code`,`f_word`) values (352,'here');
insert into `t_word` (`f_code`,`f_word`) values (353,'its');
insert into `t_word` (`f_code`,`f_word`) values (354,'ui');
insert into `t_word` (`f_code`,`f_word`) values (355,'imo');
insert into `t_word` (`f_code`,`f_word`) values (356,'did');
insert into `t_word` (`f_code`,`f_word`) values (357,'anyone');
insert into `t_word` (`f_code`,`f_word`) values (358,'when');
insert into `t_word` (`f_code`,`f_word`) values (359,'simply');
insert into `t_word` (`f_code`,`f_word`) values (360,'another');
insert into `t_word` (`f_code`,`f_word`) values (361,'ics');
insert into `t_word` (`f_code`,`f_word`) values (362,'who');
insert into `t_word` (`f_code`,`f_word`) values (363,'let');
insert into `t_word` (`f_code`,`f_word`) values (364,'know');
insert into `t_word` (`f_code`,`f_word`) values (365,'tfb');
insert into `t_word` (`f_code`,`f_word`) values (366,'taf');
insert into `t_word` (`f_code`,`f_word`) values (367,'anyone');
insert into `t_word` (`f_code`,`f_word`) values (368,'see');
insert into `t_word` (`f_code`,`f_word`) values (369,'httptcoevjihod');
insert into `t_word` (`f_code`,`f_word`) values (370,'httptcoxmrzvkav');
insert into `t_word` (`f_code`,`f_word`) values (371,'next');
insert into `t_word` (`f_code`,`f_word`) values (372,'tom');
insert into `t_word` (`f_code`,`f_word`) values (373,'ipod');
insert into `t_word` (`f_code`,`f_word`) values (374,'incl');
insert into `t_word` (`f_code`,`f_word`) values (375,'reddeersteph');
insert into `t_word` (`f_code`,`f_word`) values (376,'their');
insert into `t_word` (`f_code`,`f_word`) values (377,'fb');
insert into `t_word` (`f_code`,`f_word`) values (378,'needs');
insert into `t_word` (`f_code`,`f_word`) values (379,'without');
insert into `t_word` (`f_code`,`f_word`) values (380,'them');
insert into `t_word` (`f_code`,`f_word`) values (381,'ios');
insert into `t_word` (`f_code`,`f_word`) values (382,'went');
insert into `t_word` (`f_code`,`f_word`) values (383,'comp');
insert into `t_word` (`f_code`,`f_word`) values (384,'cjwallace');
insert into `t_word` (`f_code`,`f_word`) values (385,'mb');
insert into `t_word` (`f_code`,`f_word`) values (386,'sms');
insert into `t_word` (`f_code`,`f_word`) values (387,'tells');
insert into `t_word` (`f_code`,`f_word`) values (388,'ads');
insert into `t_word` (`f_code`,`f_word`) values (389,'app');
insert into `t_word` (`f_code`,`f_word`) values (390,'mac');
insert into `t_word` (`f_code`,`f_word`) values (391,'ipad');
insert into `t_word` (`f_code`,`f_word`) values (392,'moe');
insert into `t_word` (`f_code`,`f_word`) values (393,'plays');
insert into `t_word` (`f_code`,`f_word`) values (394,'maybe');
insert into `t_word` (`f_code`,`f_word`) values (395,'bah');
insert into `t_word` (`f_code`,`f_word`) values (396,'pj');
insert into `t_word` (`f_code`,`f_word`) values (397,'cant');
insert into `t_word` (`f_code`,`f_word`) values (398,'ok');
insert into `t_word` (`f_code`,`f_word`) values (399,'lt');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` int(50) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert into `user` (`uid`,`username`,`password`) values (1,'user','user');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
