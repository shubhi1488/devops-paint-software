FROM eclipse-temurin:17
WORKDIR /app
COPY target/paint-software.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]