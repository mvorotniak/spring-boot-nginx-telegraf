# First build the project in order to create a jar file: mvn clean install

FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# Build an image: docker build -t springio/data-saver-app .
# Create container: run the docker-compose.yml file