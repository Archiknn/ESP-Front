CREATE SCHEMA ESP;

CREATE TABLE aspirante(
-- nombre_usuario VARCHAR(10),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
primer_nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
tipo_documento VARCHAR(10),
numero_documento VARCHAR(20),
fecha_expedicion_documento DATE,
pais_expedicion_documento VARCHAR(20),
departamento_expedicion_documento VARCHAR(20),
ciudad_expedicion_documento VARCHAR(20),
numero_pasaporte VARCHAR(20),
-- lugar_expedicion_pasaporte VARCHAR(20),
departamento_expedicion_pasaporte VARCHAR(20),
ciudad_expedicion_pasaporte VARCHAR(20),
-- numero_libreta_militar INT(10),
pais_nacimiento VARCHAR(20),
departamento_nacimiento VARCHAR(20),
ciudad_nacimiento VARCHAR(20),
fecha_nacimiento DATE,
estado_civil VARCHAR(20),
grupo_sanguineo VARCHAR(5),
ocupacion VARCHAR(50),
numero_tarjeta_profesional VARCHAR(20),
estarura INT(3),
peso INT(3),
direccion VARCHAR(30),
barrio_actual VARCHAR(20),
-- pais_direccion VARCHAR(20),
departamento_direccion_actual VARCHAR(20),
ciudad_direccion_actual VARCHAR(20),
barrio_actual VARCHAR(20),
departamento_direccion_anterior VARCHAR(20),
ciudad_direccion_anterior VARCHAR(20),
numero_celular INT(10),
numero_telefono_actual INT(10),
numero_telefono_anterior INT(10),
correo_electronico VARCHAR(30),
redes_sociales TINYTEXT,
PRIMARY KEY (numero_documento)
);

CREATE TABLE libreta_militar(
numero INT(10),
numero_documento_aspirante VARCHAR(20),
clase VARCHAR(10),
distrito INT(2),
fecha_expedicion DATE,
PRIMARY KEY (numero)
);

CREATE TABLE companerao_sentimental(
numero_documento VARCHAR(20),
numero_documento_aspirante VARCHAR(20),
tipo_documento VARCHAR(10),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
primer_nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
ocupacion VARCHAR(50),
direccion VARCHAR(30),
departamento_direccion VARCHAR(20),
ciudad_direccion VARCHAR(20),
numero_celular INT(10),
numero_telefono INT(10),
correo_electronico VARCHAR(30),
redes_sociales TINYTEXT,
PRIMARY KEY(numero_documento, numero_documento_aspirante)
);

CREATE TABLE hijo(
numero_documento VARCHAR(20),
numero_documento_aspirante VARCHAR(20),
tipo_documento VARCHAR(10),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
primer_nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
fecha_nacimiento DATE,
PRIMARY KEY(numero_documento, numero_documento_aspirante)
);

CREATE TABLE progenitor(
numero_documento VARCHAR(20),
numero_documento_aspirante VARCHAR(20),
tipo_documento VARCHAR(10),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
primer_nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
ocupacion VARCHAR(50),
direccion VARCHAR(30),
Departamento_direccion VARCHAR(20),
Ciudad_direccion VARCHAR(20),
numero_celular INT(10),
numero_telefono INT(10),
vive BOOLEAN,
parentesco VARCHAR(10),
PRIMARY KEY(numero_documento, numero_documento_aspirante)
);

CREATE TABLE hermano(
numero_documento VARCHAR(20),
numero_documento_aspirante VARCHAR(20),
tipo_documento VARCHAR(10),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
primer_nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
ocupacion VARCHAR(50),
direccion VARCHAR(30),
Departamento_direccion VARCHAR(20),
Ciudad_direccion VARCHAR(20),
numero_celular INT(10),
numero_telefono INT(10),
PRIMARY KEY(numero_documento, numero_documento_aspirante)
);

CREATE TABLE estudio_academico(
id_estudio INT(10),
numero_documento_aspirante VARCHAR(20),
estudio_realizado VARCHAR(40),
fecha_finalizacion DATE,
titulo_obtenido VARCHAR(40),
nombre_institucion VARCHAR(40),
ciudad VARCHAR(20),
pais VARCHAR(20),
PRIMARY KEY(id_estudio)
);

CREATE TABLE experiencia_laboral(
id_experiencia VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
empresa VARCHAR(40),
direccion VARCHAR(30),
Departamento_direccion VARCHAR(20),
ciudad_direccion VARCHAR(20),
cargo VARCHAR(20),
tiempo_meses INT(10),
numero_celular INT(10),
numero_telefono INT(10),
sueldo INT,
motivo_retiro TINYTEXT,
nombre_jefe VARCHAR(40),
pagina_web TINYTEXT,
PRIMARY KEY (id_experiencia)
);

CREATE TABLE referencia_personal(
numero_documento VARCHAR(20),
numero_documento_aspirante VARCHAR(20),
tipo_documento VARCHAR(10),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
primer_nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
ocupacion VARCHAR(50),
direccion VARCHAR(30),
departamento_direccion VARCHAR(20),
ciudad_direccion VARCHAR(20),
numero_celular INT(10),
numero_telefono INT(10),
PRIMARY KEY(numero_documento, numero_documento_aspirante)
);

CREATE TABLE pariente_amigo_fm_ep(
numero_documento VARCHAR(20),
numero_documento_aspirante VARCHAR(20),
tipo_documento VARCHAR(10),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
primer_nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
grado_ocupacion VARCHAR(50),
direccion VARCHAR(30),
departamento_direccion VARCHAR(20),
ciudad_direccion VARCHAR(20),
organismo_entidad VARCHAR(20),
unidad VARCHAR(20),
numero_celular INT(10),
numero_telefono INT(10),
PRIMARY KEY(numero_documento, numero_documento_aspirante)
);

CREATE TABLE ingresos_renta(
id_ingresos INT(10),
numero_documento_aspirante VARCHAR(20),
salario_ingresos_laborales INT,
cesantias INT,
arriendos INT,
honorarios INT,
otros_ingresos INT,
otros_ingresos_texto TEXT,
PRIMARY KEY (id_ingresos)
);

CREATE TABLE cuentas_bancarias(
numero_cuenta INT(20),
numero_documento_aspirante VARCHAR(20),
entidad_financiera VARCHAR(30),
pais VARCHAR(20),
sede VARCHAR(20),
tipo VARCHAR(10),
saldo INT,
PRIMARY KEY (numero_cuenta)
);

CREATE TABLE bienes_patrimoniales(
identificacion VARCHAR(20),
numero_documento_aspirante VARCHAR(20),
tipo VARCHAR(20),
pais VARCHAR(20),
valor INT,
PRIMARY KEY (identificacion, numero_documento_aspirante)
);

CREATE TABLE obligaciones_crediticias(
id_obligacion VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
entidad VARCHAR(30),
valor INT,
concepto TINYTEXT,
PRIMARY KEY (id_obligacion)
);

CREATE TABLE organizaciones(
id_organizacion VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
nombre VARCHAR(30),
calidad_miembro VARCHAR(20),
PRIMARY KEY (id_organizacion)
);

CREATE TABLE actividad_economica(
id_actividad VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
empresa VARCHAR(30),
razon_social VARCHAR(20),
actividad_desarrollada TINYTEXT,
PRIMARY KEY (id_actividad)
);

CREATE TABLE viajes(
id_viaje VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
fecha DATE,
pais VARCHAR(20),
motivo TINYTEXT,
tiempo_meses INT(10),
actividades TINYTEXT,
PRIMARY KEY (id_viaje)
);

CREATE TABLE organismo_seguridad(
id_organismo VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
entidad VARCHAR(20),
cargo VARCHAR(20),
motivo_retiro TINYTEXT,
PRIMARY KEY (id_organismo)
);

CREATE TABLE armas(
id_armas VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
conoce BOOLEAN,
cuales TINYTEXT,
cuando TINYTEXT,
compania TINYTEXT,
PRIMARY KEY (id_armas)
);

CREATE TABLE seguridad(
id_seguridad VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
concepto_margen_ley TINYTEXT,
informacion_riesgo BOOLEAN,
detalle_informacion_riesgo TINYTEXT,
informacion_corrupcion BOOLEAN,
detalle_informacion_corrupcion TINYTEXT,
PRIMARY KEY (id_seguridad)
);

CREATE TABLE otros_datos(
id_otros VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
conocimiento_empleo VARCHAR(50),
direccion VARCHAR(30),
departamento_direccion VARCHAR(20),
ciudad_direccion VARCHAR(20),
informacion_corrupcion BOOLEAN,
numero_telefono INT(10),
numero_celular INT(10),
razon_vinculacion TINYTEXT,
datos_adicionales TINYTEXT,
PRIMARY KEY (id_otros)
);

CREATE TABLE recomendacion(
numero_documento VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
grado VARCHAR(20),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
primer_nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
fuerza VARCHAR(20),
cargo VARCHAR(20),
unidad VARCHAR(20),
PRIMARY KEY (numero_documento, numero_documento_aspirante)
);

CREATE TABLE antecedentes_judiciales(
id_antecedentes VARCHAR(10),
numero_documento_aspirante VARCHAR(20),
fecha DATE,
tipo_investigacion VARCHAR(20),
causa TINYTEXT,
autoridad VARCHAR(20),
responsable BOOLEAN,
PRIMARY KEY(id_antecedentes)
);

ALTER TABLE libreta_militar ADD CONSTRAINT fk_libreta FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE companerao_sentimental ADD CONSTRAINT fk_companera FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE hijo ADD CONSTRAINT fk_hijo FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE progenitor ADD CONSTRAINT fk_progenitor FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE hermano ADD CONSTRAINT fk_hermano FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE experiencia_laboral ADD CONSTRAINT fk_experiencia FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE estudio_academico ADD CONSTRAINT fk_estudio FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE referencia_personal ADD CONSTRAINT fk_referencia FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE pariente_amigo_fm_ep ADD CONSTRAINT fk_pariente_fm_ep FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE ingresos_renta ADD CONSTRAINT fk_ingresos FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE cuentas_bancarias ADD CONSTRAINT fk_cuentas FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE bienes_patrimoniales ADD CONSTRAINT fk_bienes FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE obligaciones_crediticias ADD CONSTRAINT fk_obligaciones FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE organizaciones ADD CONSTRAINT fk_oraganizaciones FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE actividad_economica ADD CONSTRAINT fk_actividad FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE viajes ADD CONSTRAINT fk_viajes FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE organismo_seguridad ADD CONSTRAINT fk_organismo FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE armas ADD CONSTRAINT fk_armas FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE seguridad ADD CONSTRAINT fk_seguridad FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE otros_datos ADD CONSTRAINT fk_otros_datos FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE recomendacion ADD CONSTRAINT fk_recomendacion FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);

ALTER TABLE antecedentes_judiciales ADD CONSTRAINT fk_antecedentes FOREIGN KEY (numero_documento_aspirante) REFERENCES aspirante(numero_documento);