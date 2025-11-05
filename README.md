# ⛽ API - Posto de Combustível

Esta é uma **API RESTful** desenvolvida em **Java** para o gerenciamento de um **posto de combustível**.  
O sistema permite o **cadastro de bombas, produtos (como gasolina e etanol)** e o **registro de abastecimentos**, com todos os dados sendo salvos em um banco de dados relacional.

---

## 🚀 Funcionalidades

- ✅ Cadastro de **bombas**
- ✅ Cadastro de **produtos** (Gasolina, Etanol, Diesel etc.)
- ✅ Registro de **abastecimentos**, vinculando bomba e produto
- ✅ Operações **CRUD completas** (Criar, Ler, Atualizar e Deletar)
- ✅ Integração com banco de dados H2
- ✅ Documentação automática com **Swagger**
- ✅ Estrutura pronta para expansão e integração com frontend

---

## 🧠 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Lombok**
- **Swagger (Springdoc OpenAPI)**
- **Maven**
- **Postman** (para testes da API)

---

---

## ⚙️ Configuração e Execução

### 🔧 Pré-requisitos

Antes de iniciar, certifique-se de ter instalado:
- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

---

### 🧩 Passo a passo para rodar localmente

```bash
# 1️⃣ Clone o repositório
git clone https://github.com/ArthurCoode/Posto-Combustivel.git

# 2️⃣ Acesse a pasta do projeto
cd Posto-Combustivel

# 3️⃣ Compile e baixe as dependências
mvn clean install

# 4️⃣ Execute o projeto
mvn spring-boot:run

