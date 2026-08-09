# Sistema de Bocadillos Saludables - Healthy Bites

Sistema web para la gestión de pedidos, inventario, productos, clientes y reportes de la cafetería Healthy Bites.

## Tabla de contenidos

1. Resumen ejecutivo
2. Arquitectura
3. Requerimientos
4. Instalación
5. Configuración
6. Uso
7. Contribución
8. Roadmap

## 1. Resumen ejecutivo

### Descripción

Healthy Bites es un sistema web diseñado para apoyar la administración de una cafetería de bocadillos saludables. El sistema permite organizar productos, pedidos, inventario, clientes y reportes desde una solución centralizada.

### Problema identificado

La administración manual de pedidos, productos e inventario puede provocar errores en los registros, pérdida de información y dificultades para conocer la disponibilidad de los productos.

### Solución

Se propone una aplicación web que centralice la información de Healthy Bites y facilite la administración de pedidos, productos, inventario y clientes.

El proyecto utiliza GitHub para el control de versiones, ramas para organizar el desarrollo, Issues para administrar requerimientos, Pull Requests para integrar cambios y un flujo de integración continua para ejecutar pruebas automáticamente.

## 2. Arquitectura

La solución considera los siguientes componentes:

- Usuario final.
- Navegador web.
- Servidor web.
- Servidor de aplicación.
- Módulo de productos.
- Módulo de pedidos.
- Módulo de inventario.
- Base de datos.
- Repositorio GitHub.
- Integración continua.

El usuario accede al sistema desde un navegador web. Las solicitudes son procesadas por la aplicación y la información del sistema se almacena en una base de datos.

## 3. Requerimientos

Para trabajar con el proyecto se requiere:

- Git.
- GitHub.
- Java JDK 17.
- Apache Maven.
- Navegador web.
- Conexión a Internet.

### Paquetes adicionales

El proyecto utiliza Maven para administrar las dependencias necesarias para la ejecución de las pruebas JUnit.

## 4. Instalación

### Clonar el repositorio

```bash
git clone <URL-DEL-REPOSITORIO>
