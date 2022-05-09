FROM alpine:3.15.4

WORKDIR /smartfarm

COPY . /smartfarm

RUN apk --no-cache add openjdk17-jdk
RUN apk --no-cache add maven

RUN mvn clean package -DskipTes

ENTRYPOINT ["java","-Xdebug","-Xrunjdwp:transport=dt_socket,server=y,address=8081,suspend=n", "-jar","-Dspring.profiles.active=docker", "target/SmartFarm-API-0.0.1-SNAPSHOT.jar"]