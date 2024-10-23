# Sistema de Gestión de Clientes

Este es un proyecto de una aplicación web para la gestión de clientes, que permite listar, buscar y crear clientes a través de una interfaz simple. La aplicación está construida con un **frontend en Angular** y un **backend en Java (Spring Boot)**.

## Tecnologías Utilizadas

- **Frontend**: Angular 12
- **Backend**: Java 17 con Spring Boot 3.3.4
- **Frameworks de prueba**: JUnit 5 para backend, Jasmine y Karma para frontend
- **CSS**: Responsividad usando Flexbox y Grid
- **Sistema de Logs**: SLF4J y Logback

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalado lo siguiente:

- **Node.js**: Para ejecutar Angular.
- **Angular CLI**: Para manejar el proyecto de Angular.
- **Java 17**: Para ejecutar el backend con Spring Boot.
- **Maven**: Para gestionar dependencias del proyecto Java.
- **Git**: Para clonar este repositorio.

## Instalación

### 1. Clonar el repositorio

Primero, clona este repositorio en tu máquina local usando Git:


git clone https://github.com/tu-usuario/sistema-gestion-clientes.git
cd sistema-gestion-clientes



### 2. Ejecutar el Frontend (Angular)

cd cliente-administracion-frontend

npm install
ng serve

El frontend estará disponible en http://localhost:4200.


###  3.  Ejecutar el Backend (Spring Boot)

cd cliente-administracion

mvn clean install
mvn spring-boot:run

El backend se ejecutará en http://localhost:8080.

