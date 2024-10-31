# Etapa de build
FROM ubuntu:latest AS build

# Atualiza o apt-get e instala o JDK e o Maven
RUN apt-get update && apt-get install -y openjdk-17-jdk maven

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia o código-fonte para o contêiner
COPY . .

# Executa o Maven para compilar o projeto e criar o jar final
RUN mvn clean install -DskipTests

# Etapa de execução
FROM openjdk:17-jdk-slim

# Exponha a porta 8080
EXPOSE 8080

# Copia o arquivo .jar gerado na etapa de build para o diretório atual do contêiner
COPY --from=build /app/target/course-0.0.1-SNAPSHOT.jar app.jar

# Define o comando de entrada para executar a aplicação Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
