create table user (
    id bigint generated by default as identity, 
    name varchar(255), 
    email varchar(255), 
    password varchar(255), 
    primary key (id)
);

INSERT INTO USER (name, email, password)
    VALUES ('Regina', 'regina@gmail.com', '888555');    