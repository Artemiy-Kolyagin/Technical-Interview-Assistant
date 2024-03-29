FROM openjdk:17-oracle
ARG JAR_FILE=build/libs/Technical-Interview-Assistant-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]