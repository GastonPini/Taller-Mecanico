# Sistema de Gestión de Taller Mecánico

Una aplicación de escritorio desarrollada en Java para gestionar vehículos, modelos, marcas, usuarios, personas y servicios de mantenimiento en un taller mecánico.

El sistema proporciona diferentes niveles de acceso para el personal del taller y permite a los usuarios autorizados gestionar vehículos, sus modelos y marcas asociadas, y los registros de mantenimiento.

## Funcionalidades

- Autenticación de usuarios
- Gestión de usuarios y roles
- Gestión de personas
- Gestión de vehículos
- Gestión de modelos de vehículos
- Gestión de marcas
- Gestión de servicios de mantenimiento
- Gestión de sesiones
- Control de acceso según roles de usuario
- Persistencia de datos en PostgreSQL

## Arquitectura

La aplicación utiliza una arquitectura por capas que separa la interfaz de usuario, la lógica de negocio, el acceso a datos y las entidades del dominio.

```text
Vista
  │
  ▼
Capa de Servicios
  │
  ▼
Capa DAO
  │
  ▼
Capa de Entidades
  │
  ▼
Base de Datos PostgreSQL
```

### Vista

El paquete `view` contiene la interfaz gráfica de la aplicación.

Los principales componentes incluyen:

- `Home`
- `LoginSwing`

La aplicación utiliza Java Swing para su interfaz de escritorio.

### Capa de Servicios

El paquete `service` contiene la lógica de negocio de la aplicación.

Los principales servicios incluyen:

- `MantenimientoService`
- `MarcaService`
- `ModeloService`
- `UsuarioService`
- `VehiculoService`

Esta capa separa las operaciones de negocio de la interfaz de usuario y de la lógica de persistencia.

### Capa DAO

El paquete `dao` contiene los Data Access Objects responsables de las operaciones con la base de datos.

Los principales componentes DAO incluyen:

- `MantenimientoDao`
- `MarcaDao`
- `ModeloDao`
- `PersonaDao`
- `SesionDao`
- `UsuarioDao`
- `VehiculoDao`

### Capa de Entidades

El paquete `entity` contiene las entidades del dominio utilizadas por la aplicación.

Las principales entidades incluyen:

- `Mantenimiento`
- `Marca`
- `Modelo`
- `Persona`
- `Usuario`
- `Vehiculo`

## Modelo de Dominio

La aplicación modela las principales entidades involucradas en la gestión de un taller mecánico.

Las principales relaciones incluyen:

```text
Persona
   │
   ▼
Usuario

Marca
   │
   ▼
Modelo
   │
   ▼
Vehiculo
   │
   ▼
Mantenimiento
```

Un vehículo está asociado a un modelo, que pertenece a una marca. Los registros de mantenimiento están asociados a vehículos.

Los usuarios están asociados a personas y poseen roles que determinan su acceso al sistema.

## Base de Datos

La aplicación utiliza PostgreSQL para la persistencia de datos y Hibernate para el mapeo objeto-relacional.

Las principales tablas de la base de datos son:

- `persona`
- `usuario`
- `marca`
- `modelo`
- `vehiculo`
- `mantenimiento`

La base de datos incluye claves primarias, relaciones mediante claves foráneas y restricciones como la unicidad de la patente del vehículo.

El esquema de la base de datos y los datos de ejemplo están incluidos en el repositorio.

## Estructura del Proyecto

```text
Taller-Mecanico/
├── src/
│   ├── com/ar/cp/taller/
│   │   ├── img/
│   │   ├── model/
│   │   │   ├── dao/
│   │   │   ├── entity/
│   │   │   └── service/
│   │   └── view/
│   │
│   ├── hibernate.cfg.xml
│   └── hibernate.reveng.xml
│
├── build/
├── nbproject/
├── script-insert.txt
├── script-tallermecanico.sql
├── README.md
└── README_esp.md
```

## Tecnologías y Conceptos

- Java
- Java Swing
- Hibernate
- PostgreSQL
- SQL
- Programación Orientada a Objetos
- Patrón DAO
- Capa de Servicios
- Modelado de Entidades
- Diseño de Bases de Datos Relacionales
- Autenticación
- Gestión de Sesiones
- Control de Acceso Basado en Roles

## Objetivos del Proyecto

El proyecto fue desarrollado para practicar y demostrar:

- Desarrollo de aplicaciones de escritorio con Java
- Arquitectura de aplicaciones por capas
- Programación Orientada a Objetos
- Persistencia de datos
- Mapeo objeto-relacional con Hibernate
- Acceso a datos mediante DAO
- Separación de la lógica de negocio
- Autenticación y gestión de sesiones
- Diseño de bases de datos relacionales

## Estado del Proyecto

Este proyecto se conserva como parte del portfolio y representa una etapa anterior de mi experiencia en desarrollo de software.

Demuestra experiencia práctica con aplicaciones de escritorio Java, Hibernate, PostgreSQL, arquitectura por capas, persistencia de datos e implementación de lógica de negocio.

## Autor

**Gastón Pini**

Backend Developer | Data Engineer | Bioinformatician

[LinkedIn](https://www.linkedin.com/in/gaston-pini/) · [GitHub](https://github.com/GastonPini)
