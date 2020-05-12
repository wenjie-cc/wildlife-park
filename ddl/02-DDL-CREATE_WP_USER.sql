CREATE TABLE C##WLPARK.WP_USER
(
    ID            NUMBER       not null,
    USER_NAME     VARCHAR2(30) not null,
    MEMO          VARCHAR2(30),
    AGE           NUMBER(2, 0),
    CREATED_BY    VARCHAR2(30),
    CREATED_TIME  timestamp(6),
    MODIFIED_BY   VARCHAR2(30),
    MODIFIED_TIME timestamp(6),
    IS_DELETED    NUMBER(1, 0),
    constraint WP_USER_PK primary key (ID)
);
