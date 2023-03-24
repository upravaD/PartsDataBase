INSERT INTO service_center.brand (id, country, name)
VALUES (1, 'Германия', 'Metabo'),
       (2, 'Швеция', 'Husqvarna'),
       (3, 'Япония', 'Honda');

INSERT INTO service_center.category (id, name)
VALUES (1, 'Шуруповерт'),
       (2, 'Снегоуборщик'),
       (3, 'Электрогенератор');

INSERT INTO service_center.model (id, name, brand_id, category_id)
VALUES (1, 'BS18L', 1, 1),
       (2, '1130STE', 2, 2),
       (3, 'GX200', 3, 3);

INSERT INTO service_center.part (id, number, name, model_id)
VALUES (1, '625591000', 'Аккумулятор 18V/4.0Ач', 1),
       (2, '636615000', 'Патрон Futuro Plus', 1),
       (3, '316066650', 'Мотор 18V', 1),

       (4, '5324080-19', 'Ремень шнека', 2),
       (5, '5321786-66', 'Фара', 2),
       (6, '8747804-26', 'Болт срезной 1/4', 2),

       (7, '17210-ZE1-822', 'Фильтр воздушный', 3),
       (8, '18310-ZL0-000', 'Глушитель', 3),
       (9, '16100-Z4V-921', 'Карбюратор', 3);

INSERT INTO service_center.client (id, first_name, surname)
VALUES (1, 'Иван', 'Иванов'),
       (2, 'Петр', 'Петров'),
       (3, 'Сергей', 'Сергеев');

INSERT INTO service_center.purchase (id, count, purchase_date, price, client_id)
VALUES (1, 2, '2009-06-09 00:44:40.000000', 100.0, 1),
       (2, 2, '2006-07-09 08:50:40.000000', 200.0, 2),
       (3, 2, '2009-05-25 00:43:20.000000', 300.0, 3);