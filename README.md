# Desafio Alura - Frases - Projeto com Spring Boot, JPA, PostgreSQL e MVC

Este projeto é parte do Desafio Alura e foi desenvolvido utilizando tecnologias como Spring Boot, JPA (Java Persistence API), PostgreSQL como banco de dados e segue o padrão de projeto MVC (Model-View-Controller), além de aplicar o uso de DTOs (Data Transfer Objects) e outros pontos do Java.

## Sobre o Projeto

O objetivo deste projeto é criar uma aplicação que gerencie frases, aplicando boas práticas de desenvolvimento, design de software e utilizando tecnologias modernas. O código faz uso extensivo de streams para manipulação de dados e listas para armazenamento e processamento eficiente.

## Tecnologias Utilizadas

- Java
- Spring Boot
- JPA (Java Persistence API)
- PostgreSQL
- Padrão de Projeto MVC
- DTO (Data Transfer Object)
- Streams
- Listas

## Configuração do Banco de Dados

Certifique-se de ter um servidor PostgreSQL instalado e crie um banco de dados chamado `${DB_NAME_EXERCICIO_FRASES}`.

Atualize as configurações de acesso ao banco de dados no arquivo `application.properties`.

```properties
spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME_EXERCICIO_FRASES}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver
hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update

# spring.jpa.show-sql=true
# spring.jpa.format-sql=true