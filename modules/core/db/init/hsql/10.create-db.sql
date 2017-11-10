-- begin SAMPLE_TEST
create table SAMPLE_TEST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIELD integer not null,
    FIELD1 varchar(255),
    FIELD2 varchar(255),
    FIELD3 varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLE_TEST
