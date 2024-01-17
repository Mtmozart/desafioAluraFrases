
# Sreenmatch-frases - desafio alura formação Java Web

Projeto criado em função do desafio alura frases.

| :placard: Vitrine.Dev |  Desafio ALura - Spring BOot   |
| -------------  | --- |
| :sparkles: Nome        | **Frases**
| :label: Tecnologias | java, Spring boot(tecnologias utilizadas)
| :rocket: URL         | https://github.com/Mtmozart/desafioAluraFrases
| :fire: Desafio     | https://url-do-desafio.com.br

<!-- Inserir imagem com a #vitrinedev ao final do link -->
![](https://media.discordapp.net/attachments/467195714745663498/1197235681190228129/spring-boot.jpeg?ex=65ba879d&is=65a8129d&hm=85900a3656bbac99e32bd92970c3d28e462fb470bdedecafb2bdbb379f3d674d&=&format=webp#vitrinedev)

## Detalhes do projeto

Textos e imagens que descrevam seu projeto, suas conquistas, seus desafios, próximos passos, etc...

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
