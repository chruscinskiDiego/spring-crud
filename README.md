# API de gestão comercial com Spring Boot

Projeto de estudo de uma API REST para usuários, produtos, categorias e pedidos, com relacionamentos entre entidades e persistência em H2.

## Recursos

- Consulta e manutenção de usuários e produtos.
- Consulta de categorias e pedidos.
- Modelagem de itens de pedido, pagamentos e status.
- Tratamento de exceções com respostas HTTP.

## Tecnologias

Java 17, Spring Boot, Spring Web, Spring Data JPA, Hibernate e H2.

## Executar localmente

```bash
sh mvnw spring-boot:run
```

Confira src/main/resources/application.properties e application-test.properties para o perfil ativo e os parâmetros do banco. Os dados do ambiente de estudo são configurados em TestConfig.

## Testes

```bash
sh mvnw test
```

## Organização

- `resources/`: interface REST.
- `services/`: operações e exceções.
- `repositories/`: acesso a dados.
- `entities/`: domínio e relacionamentos.
- `config/`: configuração de dados do ambiente de teste.

## Escopo

Projeto de aprendizado de APIs e modelagem relacional. Não inclui checkout financeiro, processamento real de pagamentos ou requisitos completos de uma plataforma comercial em produção.
