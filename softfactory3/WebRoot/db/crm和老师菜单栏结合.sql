/*
Navicat Oracle Data Transfer
Oracle Client Version : 11.2.0.1.0

Source Server         : test
Source Server Version : 110200
Source Host           : localhost:1521
Source Schema         : CRM

Target Server Type    : ORACLE
Target Server Version : 110200
File Encoding         : 65001

Date: 2017-06-06 23:40:57
*/


-- ----------------------------
-- Table structure for customer
-- ----------------------------

CREATE TABLE  customer  (
 cid  NUMBER(11) NOT NULL ,
 cust_name  VARCHAR2(45 BYTE) NULL ,
 cust_id  NUMBER(11) NULL ,
 cust_phone  VARCHAR2(11 BYTE) NULL ,
 cust_sex  VARCHAR2(2 BYTE) NULL ,
 cust_status  VARCHAR2(1 BYTE) NULL ,
 cust_mark  VARCHAR2(45 BYTE) NULL ,
 cust_time  DATE NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of customer
-- ----------------------------

-- ----------------------------
-- Table structure for follow
-- ----------------------------

CREATE TABLE  follow  (
 fid  NUMBER(11) NOT NULL ,
 follow_id  NUMBER(11) NULL ,
 follow_rid  NUMBER(11) NULL ,
 follow_hid  NUMBER(11) NULL ,
 follow_title  VARCHAR2(45 BYTE) NULL ,
 follow_details  VARCHAR2(45 BYTE) NULL ,
 follow_time  DATE NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of follow
-- ----------------------------

-- ----------------------------
-- Table structure for house
-- ----------------------------

CREATE TABLE  house  (
 hid  NUMBER(11) NOT NULL ,
 house_id  NUMBER(11) NULL ,
 house_area  VARCHAR2(45 BYTE) NULL ,
 house_addr  VARCHAR2(45 BYTE) NULL ,
 house_pprice  NUMBER NULL ,
 house_houses  VARCHAR2(45 BYTE) NULL ,
 house_tprice  NUMBER NULL ,
 house_model  VARCHAR2(45 BYTE) NULL ,
 house_decorate  VARCHAR2(45 BYTE) NULL ,
 house_profee  VARCHAR2(45 BYTE) NULL ,
 house_age  VARCHAR2(45 BYTE) NULL ,
 house_sort  VARCHAR2(45 BYTE) NULL ,
 house_type  VARCHAR2(1 BYTE) NULL ,
 house_config  VARCHAR2(45 BYTE) NULL ,
 house_facility  VARCHAR2(45 BYTE) NULL ,
 house_way  VARCHAR2(45 BYTE) NULL ,
 house_direction  VARCHAR2(45 BYTE) NULL ,
 house_mark  VARCHAR2(45 BYTE) NULL ,
 house_status  VARCHAR2(1 BYTE) NULL ,
 house_time  DATE NULL ,
 house_landlord  VARCHAR2(45 BYTE) NULL ,
 house_landlord_sex  VARCHAR2(45 BYTE) NULL ,
 house_landlord_mark  VARCHAR2(255 BYTE) NULL ,
 house_landlord_phone  VARCHAR2(11 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON COLUMN  house . house_landlord  IS '房东';
COMMENT ON COLUMN  house . house_landlord_phone  IS '电话';

-- ----------------------------
-- Records of house
-- ----------------------------

-- ----------------------------
-- Table structure for images
-- ----------------------------

CREATE TABLE  images  (
 iid  NUMBER(11) NOT NULL ,
 image_path  VARCHAR2(45 BYTE) NOT NULL ,
 image_hid  NUMBER(11) NOT NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of images
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------

CREATE TABLE  orders  (
 oid  NUMBER(11) NOT NULL ,
 order_id  NUMBER(11) NULL ,
 order_rid  NUMBER(11) NULL ,
 order_hid  NUMBER(11) NULL ,
 order_time  DATE NULL ,
 order_total_prices  NUMBER NULL ,
 order_type  NUMBER(1) DEFAULT 0  NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON COLUMN  orders . order_type  IS '订单状态';

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for request
-- ----------------------------

CREATE TABLE  request  (
 rid  NUMBER(11) NOT NULL ,
 request_cid  NUMBER(11) NULL ,
 req_model  VARCHAR2(45 BYTE) NULL ,
 req_pprice  NUMBER NULL ,
 req_type  VARCHAR2(1 BYTE) NULL ,
 req_config  VARCHAR2(45 BYTE) NULL ,
 req_addr  VARCHAR2(45 BYTE) NULL ,
 req_decorate  VARCHAR2(45 BYTE) NULL ,
 req_age  VARCHAR2(45 BYTE) NULL ,
 req_area  VARCHAR2(45 BYTE) NULL ,
 req_tprice  NUMBER NULL ,
 req_direction  VARCHAR2(45 BYTE) NULL ,
 req_profee  VARCHAR2(45 BYTE) NULL ,
 req_mark  VARCHAR2(45 BYTE) NULL ,
 req_status  VARCHAR2(1 BYTE) NULL ,
 req_time  DATE NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of request
-- ----------------------------

-- ----------------------------
-- Table structure for SYS_MENU_ROLE
-- ----------------------------

CREATE TABLE  SYS_MENU_ROLE  (
 MENU_ID  NUMBER(6) NULL ,
 ROLE_ID  NUMBER(6) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON TABLE  SYS_MENU_ROLE  IS '菜单角色对应表';
COMMENT ON COLUMN  SYS_MENU_ROLE . MENU_ID  IS '菜单编号';
COMMENT ON COLUMN  SYS_MENU_ROLE . ROLE_ID  IS '角色编号';

-- ----------------------------
-- Records of SYS_MENU_ROLE
-- ----------------------------
INSERT INTO  SYS_MENU_ROLE  VALUES ('8', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('9', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('10', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('11', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('1', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('2', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('3', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('4', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('5', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('6', '15');
INSERT INTO  SYS_MENU_ROLE  VALUES ('7', '15');

-- ----------------------------
-- Table structure for SYS_MENUS
-- ----------------------------

CREATE TABLE  SYS_MENUS  (
 ID  NUMBER(6) NOT NULL ,
 PARENT_ID  NUMBER(6) NULL ,
 SEQ  NUMBER(6) NULL ,
 NAME  VARCHAR2(50 BYTE) NULL ,
 DESCN  VARCHAR2(400 BYTE) NULL ,
 LINK_URL  VARCHAR2(200 BYTE) NULL ,
 STATUS  VARCHAR2(20 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON TABLE  SYS_MENUS  IS '菜单信息';
COMMENT ON COLUMN  SYS_MENUS . ID  IS '菜单序号，主键';
COMMENT ON COLUMN  SYS_MENUS . PARENT_ID  IS '父级序号';
COMMENT ON COLUMN  SYS_MENUS . SEQ  IS '菜单排序';
COMMENT ON COLUMN  SYS_MENUS . NAME  IS '菜单名称';
COMMENT ON COLUMN  SYS_MENUS . DESCN  IS '菜单说明';
COMMENT ON COLUMN  SYS_MENUS . LINK_URL  IS '链接地址';
COMMENT ON COLUMN  SYS_MENUS . STATUS  IS '是否可用';

-- ----------------------------
-- Records of SYS_MENUS
-- ----------------------------
INSERT INTO  SYS_MENUS  VALUES ('9', '1', '104', '啦啦啦', '啦啦啦', null, null);
INSERT INTO  SYS_MENUS  VALUES ('8', null, '300', '产品管理', '产品管理', null, null);
INSERT INTO  SYS_MENUS  VALUES ('10', '8', '301', '产品管理', '产品管理', 'productslist.jsp', '1');
INSERT INTO  SYS_MENUS  VALUES ('11', '8', '302', '类别管理', '类别管理', 'catigory.jsp', '1');
INSERT INTO  SYS_MENUS  VALUES ('1', null, '100', '系统管理', '系统管理', null, '1');
INSERT INTO  SYS_MENUS  VALUES ('2', '1', '103', '菜单管理', '菜单管理', 'menulist.jsp', '1');
INSERT INTO  SYS_MENUS  VALUES ('3', '1', '102', '角色管理', '角色管理', 'rolelist.jsp', '1');
INSERT INTO  SYS_MENUS  VALUES ('4', '1', '101', '用户管理', '用户管理', 'userlist.jsp', '1');
INSERT INTO  SYS_MENUS  VALUES ('5', null, '200', 'DEMO演示', 'DEMO演示', null, '1');
INSERT INTO  SYS_MENUS  VALUES ('6', '5', '202', '雇员管理', '雇员管理', 'emplist.jsp', '1');
INSERT INTO  SYS_MENUS  VALUES ('7', '5', '201', '部门管理', '部门管理', 'deptlist.jsp', '1');

-- ----------------------------
-- Table structure for SYS_ROLES
-- ----------------------------

CREATE TABLE  SYS_ROLES  (
 ID  NUMBER(6) NOT NULL ,
 NAME  VARCHAR2(50 BYTE) NULL ,
 CODE  VARCHAR2(50 BYTE) NULL ,
 DESCN  VARCHAR2(400 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON TABLE  SYS_ROLES  IS '角色信息';
COMMENT ON COLUMN  SYS_ROLES . ID  IS '用户序号，主键';
COMMENT ON COLUMN  SYS_ROLES . NAME  IS '角色名称';
COMMENT ON COLUMN  SYS_ROLES . CODE  IS '角色编号';
COMMENT ON COLUMN  SYS_ROLES . DESCN  IS '角色说明';

-- ----------------------------
-- Records of SYS_ROLES
-- ----------------------------
INSERT INTO  SYS_ROLES  VALUES ('15', '系统管理员', 'ROLE-001', '系统管理员');

-- ----------------------------
-- Table structure for SYS_USER_ROLE
-- ----------------------------

CREATE TABLE  SYS_USER_ROLE  (
 USER_ID  NUMBER(6) NULL ,
 ROLE_ID  NUMBER(6) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;
COMMENT ON TABLE  SYS_USER_ROLE  IS '用户角色对应表';
COMMENT ON COLUMN  SYS_USER_ROLE . USER_ID  IS '用户编号';
COMMENT ON COLUMN  SYS_USER_ROLE . ROLE_ID  IS '角色编号';

-- ----------------------------
-- Records of SYS_USER_ROLE
-- ----------------------------

-- ----------------------------
-- Table structure for task
-- ----------------------------

CREATE TABLE  task  (
 tid  NUMBER(11) NOT NULL ,
 task_follow  VARCHAR2(45 BYTE) NULL ,
 task_house  VARCHAR2(45 BYTE) NULL ,
 task_sales  VARCHAR2(45 BYTE) NULL ,
 task_id  NUMBER(11) NULL ,
 task_time  DATE NULL ,
 task_customer  VARCHAR2(45 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of task
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------

CREATE TABLE  users  (
 id  NUMBER(11) NOT NULL ,
 user_name  VARCHAR2(45 BYTE) NULL ,
 user_pwd  VARCHAR2(45 BYTE) NULL ,
 user_status  VARCHAR2(1 BYTE) NULL ,
 user_sex  VARCHAR2(2 BYTE) NULL ,
 user_email  VARCHAR2(45 BYTE) NULL ,
 user_phone  VARCHAR2(11 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of users
-- ----------------------------

-- ----------------------------
-- Indexes structure for table customer
-- ----------------------------
CREATE INDEX  custome_id_idx 
ON  customer  ( cust_id  ASC)
LOGGING
VISIBLE;

-- ----------------------------
-- Primary Key structure for table customer
-- ----------------------------
ALTER TABLE  customer  ADD PRIMARY KEY ( cid );

-- ----------------------------
-- Indexes structure for table follow
-- ----------------------------
CREATE INDEX  follow_hid_idx 
ON  follow  ( follow_hid  ASC)
LOGGING
VISIBLE;
CREATE INDEX  follow_rid_idx 
ON  follow  ( follow_rid  ASC)
LOGGING
VISIBLE;
CREATE INDEX  follow_id_idx 
ON  follow  ( follow_id  ASC)
LOGGING
VISIBLE;

-- ----------------------------
-- Primary Key structure for table follow
-- ----------------------------
ALTER TABLE  follow  ADD PRIMARY KEY ( fid );

-- ----------------------------
-- Indexes structure for table house
-- ----------------------------
CREATE INDEX  house_id_idx 
ON  house  ( house_id  ASC)
LOGGING
VISIBLE;

-- ----------------------------
-- Primary Key structure for table house
-- ----------------------------
ALTER TABLE  house  ADD PRIMARY KEY ( hid );

-- ----------------------------
-- Indexes structure for table images
-- ----------------------------
CREATE INDEX  images_hid_idx 
ON  images  ( image_hid  ASC)
LOGGING
VISIBLE;

-- ----------------------------
-- Checks structure for table images
-- ----------------------------
ALTER TABLE  images  ADD CHECK ( iid  IS NOT NULL);
ALTER TABLE  images  ADD CHECK ( image_path  IS NOT NULL);
ALTER TABLE  images  ADD CHECK ( image_hid  IS NOT NULL);
ALTER TABLE  images  ADD CHECK ( iid  IS NOT NULL);
ALTER TABLE  images  ADD CHECK ( image_path  IS NOT NULL);
ALTER TABLE  images  ADD CHECK ( image_hid  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table images
-- ----------------------------
ALTER TABLE  images  ADD PRIMARY KEY ( iid );

-- ----------------------------
-- Indexes structure for table orders
-- ----------------------------
CREATE INDEX  order_hid_idx 
ON  orders  ( order_hid  ASC)
LOGGING
VISIBLE;
CREATE INDEX  order_rid_idx 
ON  orders  ( order_rid  ASC)
LOGGING
VISIBLE;
CREATE INDEX  order_id_idx 
ON  orders  ( order_id  ASC)
LOGGING
VISIBLE;

-- ----------------------------
-- Primary Key structure for table orders
-- ----------------------------
ALTER TABLE  orders  ADD PRIMARY KEY ( oid );

-- ----------------------------
-- Indexes structure for table request
-- ----------------------------
CREATE INDEX  request_cid_idx 
ON  request  ( request_cid  ASC)
LOGGING
VISIBLE;

-- ----------------------------
-- Primary Key structure for table request
-- ----------------------------
ALTER TABLE  request  ADD PRIMARY KEY ( rid );

-- ----------------------------
-- Indexes structure for table SYS_MENUS
-- ----------------------------

-- ----------------------------
-- Checks structure for table SYS_MENUS
-- ----------------------------
ALTER TABLE  SYS_MENUS  ADD CHECK ( ID  IS NOT NULL);
ALTER TABLE  SYS_MENUS  ADD CHECK ( ID  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table SYS_MENUS
-- ----------------------------
ALTER TABLE  SYS_MENUS  ADD PRIMARY KEY ( ID );

-- ----------------------------
-- Indexes structure for table SYS_ROLES
-- ----------------------------

-- ----------------------------
-- Checks structure for table SYS_ROLES
-- ----------------------------
ALTER TABLE  SYS_ROLES  ADD CHECK ( ID  IS NOT NULL);
ALTER TABLE  SYS_ROLES  ADD CHECK ( ID  IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table SYS_ROLES
-- ----------------------------
ALTER TABLE  SYS_ROLES  ADD PRIMARY KEY ( ID );

-- ----------------------------
-- Indexes structure for table task
-- ----------------------------
CREATE INDEX  task_id_idx 
ON  task  ( task_id  ASC)
LOGGING
VISIBLE;

-- ----------------------------
-- Primary Key structure for table task
-- ----------------------------
ALTER TABLE  task  ADD PRIMARY KEY ( tid );

-- ----------------------------
-- Indexes structure for table users
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table users
-- ----------------------------
ALTER TABLE  users  ADD PRIMARY KEY ( id );

-- ----------------------------
-- Foreign Key structure for table  customer 
-- ----------------------------
ALTER TABLE  customer  ADD FOREIGN KEY ( cust_id ) REFERENCES  users  ( id );

-- ----------------------------
-- Foreign Key structure for table  follow 
-- ----------------------------
ALTER TABLE  follow  ADD FOREIGN KEY ( follow_hid ) REFERENCES  house  ( hid );
ALTER TABLE  follow  ADD FOREIGN KEY ( follow_rid ) REFERENCES  request  ( rid );
ALTER TABLE  follow  ADD FOREIGN KEY ( follow_id ) REFERENCES  users  ( id );

-- ----------------------------
-- Foreign Key structure for table  house 
-- ----------------------------
ALTER TABLE  house  ADD FOREIGN KEY ( house_id ) REFERENCES  users  ( id );

-- ----------------------------
-- Foreign Key structure for table  images 
-- ----------------------------
ALTER TABLE  images  ADD FOREIGN KEY ( image_hid ) REFERENCES  house  ( hid );

-- ----------------------------
-- Foreign Key structure for table  orders 
-- ----------------------------
ALTER TABLE  orders  ADD FOREIGN KEY ( order_hid ) REFERENCES  house  ( hid );
ALTER TABLE  orders  ADD FOREIGN KEY ( order_rid ) REFERENCES  request  ( rid );
ALTER TABLE  orders  ADD FOREIGN KEY ( order_id ) REFERENCES  users  ( id );

-- ----------------------------
-- Foreign Key structure for table  request 
-- ----------------------------
ALTER TABLE  request  ADD FOREIGN KEY ( request_cid ) REFERENCES  customer  ( cid );

-- ----------------------------
-- Foreign Key structure for table  SYS_MENU_ROLE 
-- ----------------------------
ALTER TABLE  SYS_MENU_ROLE  ADD FOREIGN KEY ( MENU_ID ) REFERENCES  SYS_MENUS  ( ID );
ALTER TABLE  SYS_MENU_ROLE  ADD FOREIGN KEY ( ROLE_ID ) REFERENCES  SYS_ROLES  ( ID );

-- ----------------------------
-- Foreign Key structure for table  SYS_MENUS 
-- ----------------------------
ALTER TABLE  SYS_MENUS  ADD FOREIGN KEY ( PARENT_ID ) REFERENCES  SYS_MENUS  ( ID );

-- ----------------------------
-- Foreign Key structure for table  SYS_USER_ROLE 
-- ----------------------------
ALTER TABLE  SYS_USER_ROLE  ADD FOREIGN KEY ( ROLE_ID ) REFERENCES  SYS_ROLES  ( ID );
ALTER TABLE  SYS_USER_ROLE  ADD FOREIGN KEY ( USER_ID ) REFERENCES  users  ( id );

-- ----------------------------
-- Foreign Key structure for table  task 
-- ----------------------------
ALTER TABLE  task  ADD FOREIGN KEY ( task_id ) REFERENCES  users  ( id );
