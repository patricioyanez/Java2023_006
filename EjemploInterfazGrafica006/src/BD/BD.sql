create database taller006;

CREATE TABLE marca
(
    id          int             primary key auto_increment,
    nombre      varchar(100)    not null,
    habilitado  boolean         not null,
    unique(nombre)
);

insert into marca values (null, 'Nissan', 1);
insert into marca values (null, 'Toyota', 1);
insert into marca values (null, 'Fiat', 1);
insert into marca values (null, 'MG', 1);
insert into marca values (null, 'Peugeot', 1);


           -- Ejercicio 18: Crear Tabla, modelo y Formulario
            -- para la entidad Cargo (gerente, vendedor, etc)
            -- los atributos son: id, nombre y habilitado.