FROM openjdk:21
COPY ./target/ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "org.example.Main"]
