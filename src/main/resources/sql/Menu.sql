-- auto Generated on 2018-11-27 09:35:47 
-- DROP TABLE IF EXISTS sc_menu; 
CREATE TABLE sc_menu(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	pid INT (11) COMMENT 'pid',
	name VARCHAR (50) COMMENT 'name',
	code VARCHAR (50) COMMENT 'code',
	url VARCHAR (255) COMMENT 'url',
	icon VARCHAR (255) COMMENT 'icon',
	path VARCHAR (255) COMMENT 'path',
	sort INT (11) COMMENT 'sort',
	is_menu INT (11) COMMENT 'isMenu',
	enable INT (11) COMMENT 'enable',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sc_menu';
