# Web Services com Spring Boot, JPA e Hibernate

## 📖 Sobre o Projeto

Este projeto consiste no desenvolvimento de uma API REST utilizando **Spring Boot**, com persistência de dados através do **Spring Data JPA** e **Hibernate**.

A aplicação foi desenvolvida com arquitetura em camadas, implementando operações de CRUD, relacionamentos entre entidades, tratamento de exceções e banco de dados em memória H2 para testes. O projeto segue as boas práticas de desenvolvimento de APIs REST e organização do código. :contentReference[oaicite:1]{index=1}

---

## 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- Banco de Dados H2
- PostgreSQL (opcional)
- REST API

---

## 🏗 Arquitetura

O projeto está organizado em camadas:

```
src
├── config
├── entities
├── repositories
├── resources
├── services
│   └── exceptions
└── resources
    └── exceptions
```

A estrutura segue a separação entre:

- **Resource (Controller)** → Recebe as requisições HTTP.
- **Service** → Contém as regras de negócio.
- **Repository** → Responsável pelo acesso aos dados.
- **Entities** → Modelagem do domínio.
- **Exception Handler** → Tratamento centralizado das exceções.

---

## 📌 Funcionalidades

- Cadastro de usuários
- Listagem de usuários
- Busca de usuário por ID
- Atualização de usuários
- Exclusão de usuários
- Cadastro de pedidos
- Cadastro de produtos
- Cadastro de categorias
- Associação entre pedidos e produtos
- Pagamentos
- Relacionamentos OneToOne, OneToMany e ManyToMany
- Tratamento de exceções personalizadas

---

## 📊 Modelo de Domínio

O projeto possui as seguintes entidades:

- User
- Order
- Product
- Category
- OrderItem
- Payment

Relacionamentos implementados:

- OneToMany
- ManyToOne
- ManyToMany
- OneToOne

---

## ⚙️ Banco de Dados

Durante o desenvolvimento é utilizado o banco de dados **H2** em memória.

Para acessar o console:

```
http://localhost:8080/h2-console
```

---

## ▶️ Como Executar

### Clone o projeto

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

### Entre na pasta

```bash
cd nome-do-projeto
```

### Execute

Pela IDE ou utilizando:

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

---

## Endpoints Principais

### Usuários

| Método | Endpoint |
|---------|----------|
| GET | /users |
| GET | /users/{id} |
| POST | /users |
| PUT | /users/{id} |
| DELETE | /users/{id} |

---

## Exemplo de Requisição

### POST /users

```json
{
    "name": "Bob Brown",
    "email": "bob@gmail.com",
    "phone": "977557755",
    "password": "123456"
}
```

---

## Tratamento de Exceções

O projeto possui tratamento global para:

- ResourceNotFoundException
- DatabaseException
- EntityNotFoundException

Retornando respostas HTTP padronizadas para facilitar o consumo da API. :contentReference[oaicite:2]{index=2}

---

## Conceitos Aplicados

- API REST
- Spring Boot
- Injeção de Dependência
- JPA/Hibernate
- CRUD
- DTOs (quando aplicável)
- Tratamento Global de Exceções
- Relacionamentos entre Entidades
- Persistência de Dados
- Arquitetura em Camadas

---

## 👨‍💻 Autor

Desenvolvido por **Mr Blue**.

Projeto desenvolvido para fins de estudo utilizando Spring Boot, JPA e Hibernate.
