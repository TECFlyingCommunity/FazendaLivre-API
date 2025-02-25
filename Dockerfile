FROM maven:3.8-openjdk-17 AS builder

WORKDIR /smartfarm

COPY pom.xml /smartfarm/pom.xml

RUN mvn dependency:go-offline

COPY . /smartfarm

RUN mvn package -DskipTes


FROM openjdk:17.0.2

COPY --from=builder /smartfarm/target/SmartFarm-API-0.0.1-SNAPSHOT.jar /SmartFarm-API-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Xdebug","-Xrunjdwp:transport=dt_socket,server=y,address=8081,suspend=n", "-jar","-Dspring.profiles.active=docker", "/SmartFarm-API-0.0.1-SNAPSHOT.jar"]