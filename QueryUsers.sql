INSERT INTO users(username, password, enabled)
VALUES('user','',1);

INSERT INTO users(username, password, enabled)
VALUES('admin','',1);

INSERT INTO roles(user_id, rol) VALUES (1, 'ROLE_USER');

INSERT INTO roles(user_id, rol) VALUES (2, 'ROLE_USER');

INSERT INTO roles(user_id, rol) VALUES (2, 'ROLE_ADMIN');