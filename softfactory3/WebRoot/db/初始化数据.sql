----------------------------------------------------
-- Spring (4.2.5) + mybatis (3.3.0) + Oracle 11g  --
-- 工厂框架基本表的数据                                                                                    --
-- Created by SONG on 2016-09-21 16:21:21         --
----------------------------------------------------

insert into SYS_MENUS (id, parent_id, seq, name, descn, link_url, status)
values (1, null, 100, '系统管理', '系统管理', null, '1');
insert into SYS_MENUS (id, parent_id, seq, name, descn, link_url, status)
values (2, 1, 103, '菜单管理', '菜单管理', 'menulist.jsp', '1');
insert into SYS_MENUS (id, parent_id, seq, name, descn, link_url, status)
values (3, 1, 102, '角色管理', '角色管理', 'rolelist.jsp', '1');
insert into SYS_MENUS (id, parent_id, seq, name, descn, link_url, status)
values (4, 1, 101, '用户管理', '用户管理', 'userlist.jsp', '1');




insert into SYS_ROLES (id, name, code, descn)
values (15, '置业经理', 'ROLE-001', '置业经理');
commit;


insert into SYS_MENU_ROLE (menu_id, role_id)
values (1, 15);
insert into SYS_MENU_ROLE (menu_id, role_id)
values (2, 15);
insert into SYS_MENU_ROLE (menu_id, role_id)
values (3, 15);
insert into SYS_MENU_ROLE (menu_id, role_id)
values (4, 15);




insert into USERS (id, USER_NAME, user_pwd, user_status)
values (4, 'admin', '21232F297A5', '1');
commit;


insert into SYS_USER_ROLE (user_id, role_id)
values (4, 15);
commit;
