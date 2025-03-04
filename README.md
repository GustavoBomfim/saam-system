# 🚀 SAAM System

O **SAAM System** é uma aplicação desenvolvida para monitorar e gerenciar os funcionários da empresa Saam.  
Oferece funcionalidades como cadastro de usuários, login, gerenciamento de funcionários e recuperação de senha, garantindo segurança e eficiência na gestão de recursos humanos.

---
## 📸 Vídeo explicando o projeto
- https://www.youtube.com/watch?v=eRoF6VEVjZ4

---

## ✨ Funcionalidades

- ✅ **Cadastro de Usuários e Login:** Permite que novos usuários se cadastrem e realizem login no sistema.  
- ✅ **Gerenciamento de Funcionários:** Facilita o cadastro, edição e visualização de informações dos funcionários.  
- ✅ **Recuperação de Senha:** Disponibiliza a funcionalidade "Esqueci minha senha", onde o sistema gera uma nova senha e a envia para o e-mail cadastrado.  

---

## 🛠 Tecnologias Utilizadas

- **Linguagem de Programação:** Java  
- **Banco de Dados:** PostgreSQL
- **IDE:** Apache NetBeans 25
- **Segurança:** Senhas criptografadas utilizando o algoritmo SHA-256  

---

## ⚙️ Configuração do Ambiente

### 🔹 1️⃣ Clonar o Repositório

```bash
git clone https://github.com/GustavoBomfim/saam-system.git
```

### 🔹 2️⃣ Configurar o Banco de Dados

Certifique-se de que o PostgreSQL está instalado e em execução.

Crie um banco de dados chamado saam.

As credenciais padrão são:

```bash
URL: jdbc:postgresql://localhost:5432/saam
Usuário: postgres
Senha: postgres
```

### 🔹 3️⃣ Executar Scripts SQL

No PostgreSQL, execute os seguintes comandos para criar as tabelas necessárias:

```bash
CREATE TABLE funcionarios (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(60),
    data_de_admissao DATE,
    salario DOUBLE PRECISION,
    status BOOLEAN
);

CREATE TABLE usuarios (
    nome VARCHAR(60),
    email VARCHAR(60),
    senha VARCHAR(64)
);

ALTER TABLE usuarios ADD CONSTRAINT unique_email UNIQUE (email);
```
