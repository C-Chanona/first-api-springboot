# Spring Boot API - Evaluacion Diagnostica

Este proyecto fue desarrollado bajo el framework de Java **Spring Boot** y trabajado con **Maeven**.

Este servicio se conecta a una base de datos **MySQL**

## REQUISITOS

Antes de inicializar el servicio se debe tener instalado:

- [JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/installer/)

Tambien se necesita instalar las siguientes dependencias:

- [Spring Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
- [Spring Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
- [MySQL Driver](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j)
- [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)
- [java-dotenv](https://mvnrepository.com/artifact/io.github.cdimascio/dotenv-java)

Una vez descargado todas las dependencias unicamente se debe crear la Base de datos de manera manual en MySQL ya sea desde consola o con un cliente SQL. En mi caso decidi llamar a mi BD nursery para el contexto de mi problematica:

`CREATE DATABASE nursery;`

Una vez completado el paso anterior se debe generar un archivo .env antes de inicializar el servicio en la raiz del proyecto con las siguientes variables de entorno:

API_PORT
DB_URL
DB_USERNAME
DB_PASSWORD

Si se tiene un IDE que te ayude a compilar el codigo escrito en Java como Intellij IDEA, Eclipse o NetBeans basta con cargar el proyecto desde el panel de archivos, de lo contrario si usas Visual Studio Code debes instalar las extensiones java-pack y spring-devtools de la tienda de extensiones de VS Code, o en caso contrario utilizar el comando.

`mvn spring-boot:run`

Este servicio unicamente cuenta con 4 peticiones HTTP los cuales encontraras en la siguiente documentacion:

https://documenter.getpostman.com/view/29125970/2sAXjRXA7f