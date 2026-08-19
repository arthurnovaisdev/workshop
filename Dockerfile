FROM eclipse-temurin:25-jdk

WORKDIR /app

COPY src .

RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/web-services-0.0.1-SNAPSHOT.jar"]