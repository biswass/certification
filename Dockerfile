FROM openjdk:8-jdk-alpine
MAINTAINER bits.com
COPY target/certification-0.0.1-SNAPSHOT.jar certification-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/certification-0.0.1-SNAPSHOT.jar"]