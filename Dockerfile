
FROM openjdk:8-jdk-alpine


EXPOSE 8080

ADD /target/*.jar EurekaServer.jar

ENTRYPOINT ["java","-jar","EurekaServer.jar"]