FROM maven:3.8.4-eclipse-temurin-11-alpine

COPY /target/simpleapi3-0.0.1-SNAPSHOT.jar myapi.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/myapi.jar"]