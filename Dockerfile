FROM openjdk:17
EXPOSE 8081
ADD target/springboot-demo-project.jar springboot-demo-project.jar
ENTRYPOINT ["java","-jar","/springboot-demo-project.jar"]