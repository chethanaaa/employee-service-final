FROM adoptopenjdk/openjdk11
EXPOSE 8080
ADD target/employee-microservice-0.0.1-SNAPSHOT.jar employee-microservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/employee-microservice-0.0.1-SNAPSHOT.jar"]