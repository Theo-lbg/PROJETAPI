FROM openjdk:21
EXPOSE 8080
ADD target/projetapi-docker.jar projetapi-docker.jar
ENTRYPOINT ["java","-jar","/projetapi-docker.jar"]