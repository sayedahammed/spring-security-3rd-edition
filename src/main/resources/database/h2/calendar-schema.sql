create table calendar_users (
    id int primary key auto_increment ,
    email varchar(256) not null unique,
    password varchar(256) not null,
    first_name varchar(256) not null,
    last_name varchar(256) not null
);

create table events (
    id int primary key auto_increment ,
    when_time timestamp not null,
    summary varchar(256) not null,
    description varchar(500) not null,
    owner int not null,
    attendee int not null,
    FOREIGN KEY(owner) REFERENCES calendar_users(id),
    FOREIGN KEY(attendee) REFERENCES calendar_users(id)
);