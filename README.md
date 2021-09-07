Data: 06/09/2021

# copiar os arquivos JARs (dependências) para a pasta </target/dependency>.
mvn dependency:copy-dependencies

# compilar o projeto
mvn compile

# executar os testes
mvn test 

# gerar o pacote de deploy do projeto
mvn clean install -DskipTests=true

# Executar a aplicação Java e Angular via linha de comando
mvn spring::run
ng serve


# URL do java e Angular

http://localhost:8080/api/v1/...

http://localhost:4200

