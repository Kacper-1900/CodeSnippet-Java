# Modelo_Negocio.md

# CodeSnippet Manager

## 1. Descripción del proyecto

CodeSnippet Manager es una aplicación de escritorio desarrollada en Java cuyo objetivo es permitir a los usuarios almacenar, organizar, consultar y reutilizar fragmentos de código fuente.

La aplicación funciona como un repositorio personal donde cada usuario puede guardar snippets de diferentes lenguajes de programación y clasificarlos mediante categorías y etiquetas para facilitar su búsqueda posterior.

Este proyecto está orientado especialmente a estudiantes y desarrolladores que desean disponer de una biblioteca organizada de soluciones, ejemplos y fragmentos de código reutilizables.

---

# 2. Problema que resuelve

Durante el aprendizaje de programación es habitual generar numerosos fragmentos de código útiles que terminan dispersos en distintos proyectos, documentos o archivos de texto.

Esta situación provoca:

* Pérdida de código reutilizable.
* Dificultad para encontrar ejemplos ya realizados.
* Duplicación de trabajo.
* Falta de organización del conocimiento técnico.

CodeSnippet Manager centraliza toda esta información en una única aplicación, permitiendo almacenar y localizar rápidamente cualquier fragmento de código.

---

# 3. Usuarios del sistema

El sistema está pensado para:

### Estudiantes

Alumnos de programación que desean guardar ejercicios, algoritmos o ejemplos para futuras consultas.

### Desarrolladores

Programadores que necesitan almacenar soluciones reutilizables para distintos proyectos.

### Profesores

Docentes que desean disponer de ejemplos organizados para utilizarlos en clase.

---

# 4. Funcionalidades principales

La aplicación permite:

* Crear snippets de código.
* Modificar snippets existentes.
* Eliminar snippets.
* Consultar todos los snippets almacenados.
* Buscar snippets por título.
* Asociar un lenguaje de programación a cada fragmento.
* Asociar una categoría a cada fragmento.
* Asociar múltiples etiquetas a cada fragmento.
* Gestionar usuarios.
* Gestionar categorías.
* Gestionar lenguajes de programación.
* Gestionar etiquetas.

---

# 5. Información almacenada

El sistema almacena la siguiente información:

### Usuarios

* Nombre
* Correo electrónico
* Curso o grupo académico

### Lenguajes

* Nombre del lenguaje

### Categorías

* Nombre de la categoría

### Etiquetas

* Nombre de la etiqueta

### Snippets

* Título
* Descripción
* Código fuente
* Fecha de creación
* Fecha de modificación
* Usuario propietario
* Lenguaje asociado
* Categoría asociada
* Etiquetas asociadas

---

# 6. Reglas de negocio

Las principales reglas de negocio son:

* Todo snippet debe tener un título.
* Todo snippet debe pertenecer a un usuario.
* Todo snippet debe tener un lenguaje asociado.
* Todo snippet debe tener una categoría asociada.
* Un snippet puede tener varias etiquetas.
* Una etiqueta puede utilizarse en varios snippets.
* No pueden existir dos lenguajes con el mismo nombre.
* No pueden existir dos categorías con el mismo nombre.
* No pueden existir dos etiquetas con el mismo nombre.
* El correo electrónico de un usuario debe ser único.

---

# 7. Beneficios del sistema

La utilización de CodeSnippet Manager aporta las siguientes ventajas:

* Mejor organización del código.
* Mayor reutilización de soluciones existentes.
* Reducción del tiempo de búsqueda.
* Centralización de conocimientos técnicos.
* Mayor productividad para estudiantes y desarrolladores.
* Aprendizaje más eficiente mediante la reutilización de ejemplos.

---

# 8. Alcance del proyecto

La primera versión del proyecto incluye:

* Aplicación de escritorio Java Swing.
* Persistencia de datos mediante Hibernate.
* Base de datos MySQL.
* Arquitectura MVC.
* Operaciones CRUD completas sobre todas las entidades.

No se contempla en esta versión:

* Aplicación web.
* Gestión de permisos avanzados.
* Compartición de snippets entre usuarios.
* Almacenamiento en la nube.

---

# 9. Tecnologías utilizadas

* Java 21
* Java Swing
* Hibernate ORM
* JPA (Jakarta Persistence)
* MySQL
* Maven
* Patrón MVC
* Git y GitHub

---

# 10. Conclusión

CodeSnippet Manager es una herramienta diseñada para facilitar la gestión y reutilización de fragmentos de código. Gracias a su sistema de clasificación mediante lenguajes, categorías y etiquetas, permite mantener organizado el conocimiento técnico generado durante el desarrollo de software y el aprendizaje de programación.
