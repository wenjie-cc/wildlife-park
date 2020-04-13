create tablespace my_data
    datafile 'E:\APP\18601\ORADATA\ORCL\my_data.DBF'
    size 200m
    autoextend on
    next 100m maxsize 2048m
    extent management local;


create temporary tablespace my_data_temp
    tempfile 'E:\APP\18601\ORADATA\ORCL\my_data_temp.dbf'
    size 200m
    autoextend on
    next 100m maxsize 2048m
    extent management local;


create user WLPARK identified by WLP041105
    default tablespace my_data
    temporary tablespace my_data_temp
    quota unlimited on my_data;

grant connect, resource to WLPARK;

