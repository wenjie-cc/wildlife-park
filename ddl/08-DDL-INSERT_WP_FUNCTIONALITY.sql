INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (10, '行政管理', '行政管理菜单和页面', NULL);

INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (1011, '部门管理', '部门管理菜单和页面', 10);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (1012, '部门增改', '部门增加，编辑功能', 10);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (1013, '部门删除', '部门删除功能', 10);


INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (9999, '系统管理', '系统管理菜单和页面', NULL);

INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999911, '角色管理', '角色管理菜单和页面', 9999);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999912, '角色增改', '角色增加，编辑功能', 9999);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999913, '角色删除', '角色删除功能', 9999);

INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999921, '用户管理', '用户管理菜单和页面', 9999);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999922, '用户增改', '用户增加，编辑功能', 9999);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999923, '用户删除', '用户删除功能', 9999);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999924, '用户密码重置', '用户密码重置功能', 9999);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999925, '用户解锁', '用户解除锁定功能', 9999);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999931, '操作日志', '系统操作日志管理页面', 9999);
INSERT INTO `FUNCTIONALITY` (`ID`, `NAME`, `MEMO`, `PARENT_ID`)
VALUES (999941, '系统配置', '系统配置页面', 9999);