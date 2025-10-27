# JavaFX JDBC CRUD Application

Aplicação desktop CRUD (Create, Read, Update, Delete) desenvolvida com JavaFX, utilizando JDBC puro para acesso a banco de dados (MySQL) e implementando o padrão DAO (Data Access Object).

Este projeto foi desenvolvido como parte do curso "Java COMPLETO - Programação Orientada a Objetos + Projetos" do Dr. Nélio Alves, aplicando os conceitos de JDBC, padrão DAO e interface gráfica com JavaFX.

## 🚀 Objetivo

O objetivo principal é demonstrar a integração entre uma interface gráfica JavaFX e um banco de dados relacional, permitindo ao usuário gerenciar entidades (neste caso, `Department` e `Seller`) através de operações CRUD completas.

## ✨ Funcionalidades Principais

* **Gerenciamento de Departamentos:**
    * Listar todos os departamentos.
    * Inserir novos departamentos.
    * Atualizar nomes de departamentos existentes.
    * Deletar departamentos (com tratamento para integridade referencial).
* **Gerenciamento de Vendedores:**
    * Listar todos os vendedores.
    * Listar vendedores por departamento.
    * Inserir novos vendedores, associando-os a um departamento.
    * Atualizar dados de vendedores existentes.
    * Deletar vendedores.
* **Interface Gráfica:** Interface intuitiva construída com JavaFX e FXML.
* **Acesso a Dados:** Camada de persistência implementada com JDBC puro e o padrão DAO.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **Interface Gráfica:** JavaFX (SDK correspondente)
* **Banco de Dados:** MySQL (Server 8.4+)
* **Acesso a Dados:** JDBC (MySQL Connector/J)
* **Build Tool:** Maven
* **Padrões de Projeto:** DAO (Data Access Object), Factory, MVC (Model-View-Controller)

## ⚙️ Configuração do Ambiente

*(Esta seção será preenchida conforme o projeto avança, detalhando como configurar o banco, as dependências Maven e os VM Arguments para executar a aplicação)*

1.  **Banco de Dados:**
    * Crie um schema/database chamado `coursejdbc` no seu MySQL.
    * Execute o script SQL encontrado em `database.sql` (adicionar este arquivo ao projeto).
2.  **Configuração de Conexão:**
    * Edite o arquivo `src/main/resources/db.properties` (será criado) com suas credenciais de acesso ao MySQL.
3.  **Dependências:**
    * Este projeto utiliza Maven. As dependências (JavaFX, MySQL Connector/J) são gerenciadas no arquivo `pom.xml`.
4.  **Execução (Via IDE):**
    * Configure os VM Arguments na sua Run Configuration:
        ```
        --module-path /caminho/para/seu/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
        ```
    * Execute a classe principal `com.joaodev.App`.

## 🖼️ Telas (Exemplos)

*(Adicione screenshots da sua aplicação aqui conforme ela for sendo construída)*

## 👨‍💻 Autor

* **João Victor Teixeira** - (https://github.com/Joao-Victor-Teixeira)

## ✨ Créditos

* Curso: "Java COMPLETO - Programação Orientada a Objetos + Projetos" - **Dr. Nélio Alves**
