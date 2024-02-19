FROM eclipse-temurin:17
COPY target/deployment-0.0.1-SNAPSHOT.jar deployment-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","deployment-0.0.1-SNAPSHOT.jar"]