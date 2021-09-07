Data: 05/09/2021
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
# Executar a aplicação via linha de comando
/*------------------------------------------------------------------------------------------------------------------------*/
mvn spring::run

