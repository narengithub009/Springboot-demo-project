FROM openjdk:17
EXPOSE 8081
ADD target/Springboot-demo-project.jar Springboot-demo-project.jar
ENTRYPOINT ["java","-jar","/Springboot-demo-project.jar"]