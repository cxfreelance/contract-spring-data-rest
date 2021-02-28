create table contract (id int not null auto_increment primary key, status varchar(128) not null);
create table driver (id int not null auto_increment primary key, first_name varchar(128) not null, last_name varchar(128) not null);
create table contract_driver(contract_id int not null, driver_id int not null, foreign key(contract_id) references contract(id), foreign key(driver_id) references driver(id), primary key(contract_id, driver_id));
