   create table user_info (id integer NULL, firstName varchar(40) NULL, lastName varchar(40) NULL);create table post_feed (id integer not null, decription varchar(255), user_info_id integer, primary key (id))