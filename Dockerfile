FROM openjdk:17-jdk-slim
COPY target/review-filte-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
