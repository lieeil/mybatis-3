drop table user if exists;
create table user(
    id int generated by default as identity ,
    create_time varchar(20),
    name varchar(20),
    password varchar(36),
    phone varchar(20),
    nick_name varchar(20),
    primary key (id)
);