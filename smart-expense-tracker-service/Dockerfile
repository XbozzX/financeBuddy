# ----- Build stage -------
FROM maven:3.9.6-eclipse-temurin-17-alpine AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests


# ----- Runtime stage ------
FROM eclipse-temurin:17-jre
WORKDIR /app
EXPOSE 8080

COPY --from=builder /app/target/*.jar app.jar
CMD [ "java", "-jar",  "ap.jar"]


