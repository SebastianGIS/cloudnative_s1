# Imagen base con Java 21
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY pom.xml .
COPY src /app/src

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
