# API de Produtos — Arquitetura MVC

## Sobre o projeto

Este projeto consiste no desenvolvimento de uma API REST utilizando **Java e Spring Boot**, com o objetivo de praticar a arquitetura MVC, a implementação de operações CRUD e a persistência de dados utilizando Spring Data JPA e MySQL.

A API permite cadastrar, consultar, atualizar e excluir produtos.

## Tecnologias utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven
* Postman (para testes das requisições HTTP)

## Estrutura do projeto

O projeto está organizado em camadas, separando as responsabilidades de cada parte da aplicação:

```text
src/
└── main/
    ├── java/
    │   └── br/com/residencia/arquiteturamvc/
    │       ├── controller/
    │       │   └── ProdutoController.java
    │       ├── service/
    │       │   └── ProdutoService.java
    │       ├── repository/
    │       │   └── ProdutoRepository.java
    │       ├── model/
    │       │   └── Produto.java
    │       └── ArquiteturaMvcResidenciaFullStackApplication.java
    └── resources/
        └── application.properties
```

### Responsabilidades das camadas

* **Model:** representa a entidade `Produto`, com os atributos `id`, `nome`, `preco` e `quantidade`.
* **Controller:** recebe as requisições HTTP e retorna as respostas da API.
* **Service:** contém a lógica de negócio e coordena as operações sobre os produtos.
* **Repository:** utiliza o Spring Data JPA para acessar e manipular os dados no banco de dados.
* **application.properties:** configura a conexão com o MySQL e as propriedades do JPA.

## Funcionalidades

A API disponibiliza as seguintes operações CRUD:

| Método HTTP | Endpoint         | Funcionalidade               |
| ----------- | ---------------- | ---------------------------- |
| `POST`      | `/produtos`      | Cadastrar um produto         |
| `GET`       | `/produtos`      | Listar todos os produtos     |
| `GET`       | `/produtos/{id}` | Consultar um produto pelo ID |
| `PUT`       | `/produtos/{id}` | Atualizar um produto         |
| `DELETE`    | `/produtos/{id}` | Excluir um produto           |

A API recebe e retorna dados no formato JSON. As requisições foram testadas utilizando o Postman.

## Persistência de dados

A aplicação utiliza **MySQL** como banco de dados e **Spring Data JPA** para realizar as operações de persistência.

A entidade `Produto` é mapeada com JPA, e seu identificador é gerado automaticamente. O Hibernate está configurado para atualizar a estrutura das tabelas conforme necessário.

## Como executar o projeto

1. Instale o Java 21, o Maven e o MySQL.
2. Crie o banco de dados `arquitetura_mvc`.
3. Configure as credenciais do banco no arquivo `src/main/resources/application.properties`.
4. Execute a classe `ArquiteturaMvcResidenciaFullStackApplication`.
5. Com a aplicação em execução, acesse `http://localhost:8080/produtos` ou utilize o Postman para testar os endpoints.

**Importante:** não compartilhe senhas do banco de dados em repositórios públicos.

## Objetivo de aprendizagem

O projeto foi desenvolvido para praticar os fundamentos do desenvolvimento backend com Spring Boot, incluindo organização em camadas, criação de APIs REST, operações CRUD e integração com banco de dados relacional.
