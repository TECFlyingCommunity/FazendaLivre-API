FROM openjdk:17

WORKDIR /smartfarm

COPY . /smartfarm

RUN ./mvnw clean package -DskipTes

ENTRYPOINT ["java","-Xdebug","-Xrunjdwp:transport=dt_socket,server=y,address=8081,suspend=n", "-jar","-Dspring.profiles.active=docker", "target/SmartFarm-API-0.0.1-SNAPSHOT.jar"]