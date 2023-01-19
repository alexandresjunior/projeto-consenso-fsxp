# Roteiro de Criação de Projeto com Spring Boot

1. Criar o projeto no site do [Spring Boot](https://start.spring.io/)
  i. Gerenciador de Dependências: Maven
  ii. Versão do Spring Boot: manter o padrão
  iii. Preencher formulário de meta-dados. Recomendações:
    * `groupId` ser igual ao `package name`
    * `artifactId` ser igual ao `name` (sem espaços, sem acentos)
    * escolher JDK compatível com a do seu computador
  iv. Adicionar dependências:
    * Spring Dev Tools
    * Lombok
    * Spring Web
    * Spring Data JPA
    * MySQL Driver
  v. Fazer download do arquivo .zip, extrair e abrir no VS Code.
2. Depois de criar o banco de dados, definir as propriedades de conexão com o banco de dados no arquivo `application.properties`. Link para [documentação oficial](https://spring.io/guides/gs/accessing-data-mysql/)
3. Criação das entidades na camada model.
4. Criação da camada service.
5. Criação das rotas na camada controller.
6. Link para documentação oficial com exemplo de [Como construir um Web Service Restful](https://spring.io/guides/gs/rest-service/)
