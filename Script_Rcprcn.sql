-- Estructura de la Base de Datos
CREATE DATABASE Recuperacion;
USE Recuperacion;
-- Tabla usuarios:

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    rol varchar(50)
);

-- Tabla estudiante:

CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(10) NOT NULL UNIQUE,
    descripcion VARCHAR(100) NOT NULL,
    precio DOUBLE NOT NULL,
    stock int NOT NULL
);

INSERT INTO usuarios(nombre_usuario, password, rol)values
("usuario", "usuario", "usuario"),
("usuarioadmin", "usuarioadmin", "administrador");


INSERT INTO productos(nombre, descripcion, precio, stock)values
("lapiz", "utiles escolares", 6.8, 57),
("cuaderno", "utiles escolares", 4, 33);


