# docker run --name mapping_news_data -p 5433:5432 -e POSTGRES_USER=user -e POSTGRES_PASSWORD=qwerty -e POSTGRES_DB=mapping_news_data_database -d postgres:14

create table sources
(
    id          SERIAL PRIMARY KEY,
    text      CHARACTER VARYING(255) NOT NULL
);

insert into sources (text)
values ('irbis.plus'),
       ('praktika.irbis.plus');

create table topics
(
    id          SERIAL PRIMARY KEY,
    name      CHARACTER VARYING(255) NOT NULL
);

insert into topics (name)
values ('Помощь юр. фасад'),
       ('Помощь физ. внешне'),
       ('О нас'),
       ('Обновления сервиса');

create table news
(
    id          SERIAL PRIMARY KEY,
    source_id INTEGER,
    topic_id INTEGER,
    content      CHARACTER VARYING(65535) NOT NULL,
    FOREIGN KEY (source_id) REFERENCES sources(id) ON DELETE SET NULL,
    FOREIGN KEY (topic_id) REFERENCES topics(id) ON DELETE SET NULL
);

insert into news (source_id, topic_id, content)
values (1, 1, 'Обновление законодательства в 2022 году.'),
       (1, 1, 'Обновление законодательства в 2023 г.'),
       (1, 2, 'Рассказывает о том, как обезопасить себя от мошенников'),
       (1, 3, 'Рассказывает о том, как отдыхают наши работники'),
       (1, 3, 'Знакомим с клиентами. Часть 1'),
       (1, 3, 'Знакомим с клиентами. Часть 2'),
       (2, 4, 'Знакомство с сервисом'),
       (2, 4, 'Нововведения во вкладке "Суды"');
