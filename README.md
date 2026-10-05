# Mechanical Workshop Management System

A Java desktop application for managing vehicles, vehicle models, brands, users, people and maintenance services in a mechanical workshop.

The system provides different access levels for workshop staff and allows authorized users to manage vehicles, their associated models and brands, and maintenance records.

## Features

- User authentication
- User and role management
- Person management
- Vehicle management
- Vehicle model management
- Brand management
- Maintenance service management
- Session management
- Access control based on user roles
- PostgreSQL database persistence

## Architecture

The application follows a layered architecture that separates the user interface, business logic, data access and domain entities.

```text
View
  │
  ▼
Service Layer
  │
  ▼
DAO Layer
  │
  ▼
Entity Layer
  │
  ▼
PostgreSQL Database
```

### View

The `view` package contains the graphical user interface of the application.

Main components include:

- `Home`
- `LoginSwing`

The application uses Java Swing for its desktop interface.

### Service Layer

The `service` package contains the application's business logic.

Main services include:

- `MantenimientoService`
- `MarcaService`
- `ModeloService`
- `UsuarioService`
- `VehiculoService`

This layer separates business operations from the user interface and persistence logic.

### DAO Layer

The `dao` package contains Data Access Objects responsible for database operations.

Main DAO components include:

- `MantenimientoDao`
- `MarcaDao`
- `ModeloDao`
- `PersonaDao`
- `SesionDao`
- `UsuarioDao`
- `VehiculoDao`

### Entity Layer

The `entity` package contains the domain entities used by the application.

Main entities include:

- `Mantenimiento`
- `Marca`
- `Modelo`
- `Persona`
- `Usuario`
- `Vehiculo`

## Domain Model

The application models the main entities involved in the management of a mechanical workshop.

The main relationships include:

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

A vehicle is associated with a model, which belongs to a brand. Maintenance records are associated with vehicles.

Users are associated with people and have roles that determine their access to the system.

## Database

The application uses PostgreSQL for data persistence and Hibernate for object-relational mapping.

The main database tables are:

- `persona`
- `usuario`
- `marca`
- `modelo`
- `vehiculo`
- `mantenimiento`

The database includes primary keys, foreign key relationships and constraints such as a unique vehicle license plate.

The database schema and sample data are included in the repository.

## Project Structure

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

## Technologies & Concepts

- Java
- Java Swing
- Hibernate
- PostgreSQL
- SQL
- Object-Oriented Programming
- DAO Pattern
- Service Layer
- Entity Modeling
- Relational Database Design
- Authentication
- Session Management
- Role-Based Access Control

## Project Goals

The project was developed to practice and demonstrate:

- Java desktop application development
- Layered application architecture
- Object-oriented programming
- Database persistence
- Object-relational mapping with Hibernate
- DAO-based data access
- Business logic separation
- Authentication and session management
- Relational database design

## Project Status

This project is preserved as a portfolio project and represents an earlier stage of my software development experience.

It demonstrates practical experience with Java desktop applications, Hibernate, PostgreSQL, layered architecture, database persistence and business logic implementation.

## Author

**Gastón Pini**

Backend Developer | Data Engineer | Bioinformatician

[LinkedIn](https://www.linkedin.com/in/gaston-pini/) · [GitHub](https://github.com/GastonPini)
