drop table if exists Person
create table Person (id bigint primary key auto_increment, name varchar(255),surname varchar(255),  age integer);
insert into Person (name,surname,age)values ('Joao' , 'Da Silva' , 23);
insert into Person (name,surname,age)values ('Maria' , 'Oliveira' , 29);
insert into Person (name,surname,age)values ('Jose' , 'Goncalves' , 35);