FROM maven:3.6.0-jdk-11-slim AS build

COPY ./src /usr/src/app/src
COPY ./pom.xml /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package -DskipTests

FROM adoptopenjdk/openjdk11:jre11u-alpine-nightly

COPY --from=build /usr/src/app/target/logger_service-0.0.1-SNAPSHOT.jar /usr/src/app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/usr/src/app/app.jar"]