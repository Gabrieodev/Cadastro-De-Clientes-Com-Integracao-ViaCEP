# 🚀 Cadastro de Clientes com Integração ViaCEP

Aplicação Java com Spring Boot que permite **cadastrar clientes informando apenas nome e CEP**, buscando automaticamente os dados do endereço via **API pública do ViaCEP**.

---

## 📌 Funcionalidades

- ➕ Adicionar clientes
- 🔍 Visualizar todos os clientes
- 📄 Buscar cliente por ID
- ✏️ Atualizar informações de um cliente
- ❌ Deletar um cliente
- 🌐 Obter automaticamente dados como rua, bairro, cidade e estado a partir do CEP

---

## 🗂️ Estrutura da Aplicação

- **controller**: Responsável pelos endpoints REST que recebem as requisições HTTP.
- **model**: Contém as classes `Cliente` e `Endereco`, que representam os dados da aplicação.
- **service**: Centraliza a lógica de negócio, incluindo a integração com o ViaCEP através do OpenFeign.

---

## 🧰 Tecnologias Utilizadas

- **Java**: Linguagem usada no desenvolvimento da aplicação.
- **Spring Boot**: Facilita a configuração e execução do projeto.
- **Spring Web**: Criação dos endpoints da API REST.
- **Spring Data JPA**: Gerenciamento do acesso aos dados.
- **Spring Cloud OpenFeign**: Integração com a API do ViaCEP.
- **H2 Database**: Banco de dados em memória para testes.
- **ViaCEP API**: Busca automática de endereço via CEP.
- **Postman**: Testes das requisições HTTP.
- **Maven**: Gerenciamento de dependências e build.

---

## 🖼️ Exemplos de Uso

### 📬 Cadastro de Cliente via Postman
Abaixo, um exemplo de requisição `POST` no Postman, cadastrando um cliente com nome e CEP:

![Captura de tela 2025-04-23 162839](https://github.com/user-attachments/assets/cfff1477-1e96-4f8a-9537-60730eafb842)

---

### 🧾 Visualização de Clientes no Navegador e Código no VS Code
Aqui está a aplicação rodando no navegador com os clientes cadastrados, e ao lado o VS Code com o código fonte:

![Captura de tela 2025-04-23 163158](https://github.com/user-attachments/assets/825ca54f-4e9c-4c38-ae3a-e72d649e5ba9)

---

## 💙 Agradecimento

Obrigado por conferir este projeto!  
Fique à vontade para clonar, testar, sugerir melhorias ou contribuir.  
🚀 Que esse seja só o começo da sua jornada com Spring Boot!
