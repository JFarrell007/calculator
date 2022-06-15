FROM openjdk:11
COPY target/calculator-0.0.1-SNAPSHOT.jar calculator-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/calculator-0.0.1-SNAPSHOT.jar"]
