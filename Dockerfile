FROM openjdk:8
COPY target/springbootapplicationwithannotation-0.0.1-SNAPSHOT.jar springbootapplicationwithannotation.jar
ENTRYPOINT ["java","-jar","springbootapplicationwithannotation.jar"]