-- auto Generated on 2018-11-27 09:37:36 
-- DROP TABLE IF EXISTS sc_role; 
CREATE TABLE sc_role(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
	name_zh VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'nameZh',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sc_role';
