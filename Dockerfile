FROM openjdk:17-jdk-slim
COPY target/review-filte-0.0.1-SNAPSHOT.jar review-filte-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/review-filte-0.0.1-SNAPSHOT.jar"]
