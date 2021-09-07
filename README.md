Data: 06/09/2021
Autor: Mauro Salomão

/*------------------------------------------------------------------------------------------------------------------------*/
# baixar as dependências e compilar o projeto
/*------------------------------------------------------------------------------------------------------------------------*/
# copia os arquivos JARs (dependências) para a pasta </target/dependency>.
#mvn dependency:copy-dependencies

# compila o projeto
#mvn compile

# executa os testes
#mvn test 

# gerar o pacote de deploy do projeto
mvn clean install -DskipTests=true


/*------------------------------------------------------------------------------------------------------------------------*/
# Executar a aplicação Java e Angular via linha de comando
/*------------------------------------------------------------------------------------------------------------------------*/
mvn spring::run

ng serve


/*------------------------------------------------------------------------------------------------------------------------*/
# URL do java e Angular
/*------------------------------------------------------------------------------------------------------------------------*/
http://localhost:8080/api/v1/...

http://localhost:4200



