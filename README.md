# api-manutencoes

# API de Manutenções

API REST desenvolvida em Java com Spring Boot para gerenciamento de manutenções. Utiliza o padrão de projeto MVC, Maven como gerenciador de dependências e banco H2 em memória para persistência.

---

## Tecnologias Utilizadas

- Java 21
- Spring Boot
  - Spring Web
  - Spring Data JPA
  - H2 Database
- Maven
- Git
- Postman (para testes)

---

## Estrutura do Projeto

```
src/
 └── main/
      └── java/
           └── com/
                └── joao/
                     └── manutencoes/
                          ├── controller/
                          ├── model/
                          ├── repository/
                          └── service/
```

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/joaocjmoraes/api-manutencoes.git
   cd manutencoes
   ```

2. Importe o projeto no Eclipse como "Maven Project".

3. Execute a aplicação:
   - Pelo Eclipse: Run As > Spring Boot App
   - Ou via terminal:
     ```bash
     ./mvnw spring-boot:run
     ```

---

## Endpoints REST

| Método | Endpoint                    | Descrição                    |
|--------|-----------------------------|------------------------------|
| GET    | `/api/manutencao`           | Lista todas as manutenções  |
| GET    | `/api/manutencao/{id}`      | Retorna manutenção por ID   |
| POST   | `/api/manutencao`           | Cria uma nova manutenção    |
| PUT    | `/api/manutencao/{id}`      | Atualiza uma manutenção     |
| DELETE | `/api/manutencao/{id}`      | Remove uma manutenção       |

---

## Testando com Postman

### Exemplo de corpo JSON para POST/PUT:
```json
{
  "descricao": "Troca de cartucho",
  "data": "16/04"
}
```

---

## Acessando o Banco de Dados H2

- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Usuário: `sa`
- Senha: `password`

---

## Versionamento com Git

### Estrutura de Branches:
- `main`: produção
- `develop`: desenvolvimento principal
- `feature/nome-da-tarefa`: novas funcionalidades
- `homolog`: homologação

### Comandos básicos:
```bash
git checkout develop
git checkout -b feature/nome-da-tarefa
git add .
git commit -m "Descrição da tarefa"
git push origin feature/nome-da-tarefa
```

---

## Autor

Desenvolvido por João Antônio Moraes 
Repositório: [https://github.com/joaocjmoraes/api-manutencoes](https://github.com/joaocjmoraes/api-manutencoes)
