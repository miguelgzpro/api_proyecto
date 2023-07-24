INSERT INTO authorities (name, endpoint) values ('User_Write', 'POST:/api/user/');
INSERT INTO authorities (name, endpoint) values ('User_Read', 'GET:/api/user/');
INSERT INTO authorities (name, endpoint) values ('UserById_Read', 'GET:/api/user/{id}/');
INSERT INTO authorities (name, endpoint) values ('User_Delete', 'DELETE:/api/user/{id}/');
INSERT INTO authorities (name, endpoint) values ('User_Update', 'PUT:/api/user/{id}/');
INSERT INTO authorities (name, endpoint) values ('User_PartialUpdate', 'PATCH:/api/user/{id}/');

INSERT INTO authorities (name, endpoint) values ('Role_Write', 'POST:/api/role/');
INSERT INTO authorities (name, endpoint) values ('Role_Read', 'GET:/api/role/');
INSERT INTO authorities (name, endpoint) values ('RoleById_Read', 'GET:/api/role/{id}/');
INSERT INTO authorities (name, endpoint) values ('Role_Delete', 'DELETE:/api/role/{id}/');
INSERT INTO authorities (name, endpoint) values ('Role_Update', 'PUT:/api/role/{id}/');
INSERT INTO authorities (name, endpoint) values ('Role_PartialUpdate', 'PATCH:/api/role/');

INSERT INTO authorities (name, endpoint) values ('Authority_Write', 'POST:/api/authority/');
INSERT INTO authorities (name, endpoint) values ('Authority_Read', 'GET:/api/authority/');
INSERT INTO authorities (name, endpoint) values ('AuthorityById_Read', 'GET:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_Delete', 'DELETE:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_Update', 'PUT:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_PartialUpdate', 'PATCH:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('AuthorityByUser_Read', 'GET:/api/authority/byuser/{id}/');

INSERT INTO authorities (name, endpoint) values ('Carrera_Write', 'POST:/api/carrera/');
INSERT INTO authorities (name, endpoint) values ('Carrera_Read', 'GET:/api/carrera/');
INSERT INTO authorities (name, endpoint) values ('Carrera_Read', 'GET:/api/carrera/{id}/');
INSERT INTO authorities (name, endpoint) values ('Carrera_Delete', 'DELETE:/api/carrera/{id}/');
INSERT INTO authorities (name, endpoint) values ('Carrera_Update', 'PUT:/api/carrera/{id}/');
INSERT INTO authorities (name, endpoint) values ('Carrera_PartialUpdate', 'PATCH:/api/carrera/{id}/');

INSERT INTO authorities (name, endpoint) values ('Matricula_Write', 'POST:/api/matricula/');
INSERT INTO authorities (name, endpoint) values ('Matricula_Read', 'GET:/api/matricula/');
INSERT INTO authorities (name, endpoint) values ('Matricula_Read', 'GET:/api/matricula/{id}/');
INSERT INTO authorities (name, endpoint) values ('Matricula_Delete', 'DELETE:/api/matricula/{id}/');
INSERT INTO authorities (name, endpoint) values ('Matricula_Update', 'PUT:/api/matricula/{id}/');
INSERT INTO authorities (name, endpoint) values ('Matricula_PartialUpdate', 'PATCH:/api/matricula/{id}/');




INSERT INTO roles (name) values ('ROLE_ADMIN');
INSERT INTO roles (name) values ('ROLE_PROFESOR');
INSERT INTO roles (name) values ('ROLE_PERSONA');

INSERT INTO roles_authorities (role_id, authority_id) (select (SELECT id FROM roles where name = 'ROLE_ADMIN')  AS role_id, e.id from authorities e );

INSERT INTO users (name, username, password, looked, expired, enabled) VALUES ('Admin', 'admin', '$2a$10$TwROhi2MZsOTt8igkE7Yyec0WfjK7NlgdX9apOu0b6cY4SxzHLvCq', false, false, true);

INSERT INTO users_roles (user_id, role_id) VALUES ((SELECT id FROM users where username = 'admin'), (SELECT id FROM roles where name = 'ROLE_ADMIN'));
