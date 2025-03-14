insert into authorization_.roles (name) values
('Администратор'), ('Менеджер'), ('Бухгалтер'), ('Охранник'), ('Тестировщик');

insert into authorization_.users (login, password, name, birth_date, age, salary, role_id) values
('vladimir', 'pass1', 'Владимир', '1985-02-15', 40, 1500, 1),
('anna', 'pass2', 'Анна', '1992-06-25', 32, 2500, 2),
('ivan', 'pass3', 'Иван', NULL, 28, NULL, 3),
('petr', 'pass4', 'Петр', '1999-03-10', 25, 1800, 3),
('olga', 'pass5', 'Ольга', NULL, 30, 2000, 4),
('sergey', 'pass6', 'Сергей', '2000-08-05', 23, NULL, 5),
('tatyana', 'pass7', 'Татьяна', '1994-09-15', 29, 1700, 2),
('andrey', 'pass8', 'Андрей', NULL, 35, NULL, 1),
('katerina', 'pass9', 'Катерина', '1980-01-20', 45, 3000, 2),
('nikolay', 'pass10', 'Николай', NULL, 22, 1200, 3),
('dmitry', 'pass11', 'Дмитрий', '1995-12-15', 28, 1900, 4),
('elena', 'pass12', 'Елена', '1988-07-11', 37, 2400, 4),
('alexey', 'pass13', 'Алексей', NULL, 31, 2600, 2),
('marina', 'pass14', 'Марина', '1989-10-01', 35, 2300, 5),
('victor', 'pass15', 'Виктор', NULL, 38, 2700, 1);
