FROM maven:3.6.3-openjdk-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src/ ./src/
RUN mvn clean install
FROM openjdk:17
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
CMD java -jar app.jar