FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/guessing-game-1.0.0-jar-with-dependencies.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
