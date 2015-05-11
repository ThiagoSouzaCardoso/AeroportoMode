Aeroport_Module
===============

Querys
=========================================================================
insert into auth.sys_user(login,senha) values ('admin',md5('123456'));

insert into auth.role(nome) values ('ROLE_USER');

insert into auth.permission(nome) values ('ler_jornal');

insert into auth.user_role values(2,1);

insert into auth.role_permission values (1,1);
