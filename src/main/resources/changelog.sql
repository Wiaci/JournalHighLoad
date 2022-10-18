create table usr (
    id int primary key,
    username varchar(255) not null,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    password varchar(255) not null,
    last_password_reset_date date not null,
    activity varchar(10) not null,
    role varchar(10) not null
);

create table teacher (
    id int primary key,
    user_id int references usr not null
);

create table grp (
    id int primary key,
    name varchar(10) not null
);

create table student (
    id int primary key,
    user_id int references usr not null,
    group_id int references grp not null
);

create table subject (
    id int primary key,
    name varchar(50) not null
);

create table schedule (
    id int primary key,
    group_id int references grp not null,
    subject_id int references subject not null,
    teacher_id int references teacher not null,
    date timestamp not null
);

create table exam (
    id int primary key,
    student_id int references student not null,
    teacher_id int references teacher not null,
    subject_id int references subject not null,
    date timestamp not null,
    grade int not null
);

create table teacher_to_subject (
    teacher_id int references teacher not null,
    subject_id int references subject not null
);
