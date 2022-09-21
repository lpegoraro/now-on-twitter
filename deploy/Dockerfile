FROM openjdk:20-slim

COPY target/feed-${VERSION}.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
