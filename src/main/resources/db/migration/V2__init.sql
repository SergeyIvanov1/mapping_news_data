create table users
(
    id          SERIAL PRIMARY KEY,
    username      CHARACTER VARYING(100) NOT NULL,
    first_name      CHARACTER VARYING(100) NOT NULL,
    last_name      CHARACTER VARYING(100) NOT NULL,
    password      CHARACTER VARYING(255) NOT NULL,
    email      CHARACTER VARYING(255) NOT NULL,
    created      TIMESTAMP default NOW(),
    updated      TIMESTAMP default NOW(),
    status      CHARACTER VARYING(25) NOT NULL default 'ACTIVE'
);



create table roles
(
    id          SERIAL PRIMARY KEY,
    name      CHARACTER VARYING(100) NOT NULL,
    created      TIMESTAMP default NOW(),
    updated      TIMESTAMP default NOW(),
    status      CHARACTER VARYING(25) NOT NULL default 'ACTIVE'
);

insert into roles (name)
values ('ROLE_USER'),
       ('ROLE_ADMIN');

create table user_roles
(
    user_id          BIGINT,
    role_id          BIGINT,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE ON UPDATE RESTRICT,
    FOREIGN KEY (role_id) REFERENCES roles(id) ON DELETE CASCADE ON UPDATE RESTRICT
);