FROM maven:3.9.4-eclipse-temurin-17 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:23.0.2_7-jre-alpine-3.21
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
EXPOSE 4999
CMD ["java", "-jar", "app.jar"]