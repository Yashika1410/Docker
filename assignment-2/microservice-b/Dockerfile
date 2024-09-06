FROM maven:3.6.3-openjdk-17 AS dependencies
WORKDIR /app
COPY pom.xml . 
RUN mvn dependency:go-offline -B


FROM maven:3.6.3-openjdk-17 AS builder
WORKDIR /app
COPY --from=dependencies /root/.m2 /root/.m2
COPY src ./src
COPY pom.xml .
RUN mvn clean install -DskipTests



FROM openjdk:17-jdk-slim
RUN mkdir log
RUN chown -R 1000:1000 ./log
RUN apt-get update && apt-get install -y curl \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/* && echo hello
RUN groupadd appgroup && useradd appuser -G appgroup
USER appuser

COPY --from=builder /app/target/*.jar app.jar

HEALTHCHECK --interval=30s --timeout=10s --start-period=5s --retries=3 \
    CMD curl --fail http://localhost:8080/api/v1/microservice-b/welcome || exit 1

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
