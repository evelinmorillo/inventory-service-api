# 📦 Inventory Service API

API REST robusta y escalable desarrollada para la gestión eficiente de inventarios, construida bajo una **arquitectura por capas** con Java y Spring Boot. Este proyecto forma parte de mi portafolio profesional como Backend Developer.

---

## 🚀 Tecnologías y Herramientas
* **Java 21 / 25**
* **Spring Boot** (Spring Web, Spring Data JPA)
* **Base de Datos:** H2 Database (En memoria para desarrollo y pruebas rápidas)
* **Gestor de Dependencias:** Gradle
* **Pruebas de API:** Postman (Validación de códigos HTTP `200 OK`, `201 Created`)
* **Control de Versiones:** Git & GitHub

---

## 🏛️ Arquitectura del Proyecto
El proyecto sigue el principio de separación de responsabilidades mediante una estructura modular por capas:

```text
src/main/java/com/javaspringinventario/inventarioapi/
│
├── controller/     # Controladores REST (Manejo de endpoints HTTP)
├── service/        # Lógica de negocio y reglas de la aplicación
├── repository/     # Interfaces de persistencia (Spring Data JPA)
└── model/          # Entidades y mapeo de datos con la base de datos
