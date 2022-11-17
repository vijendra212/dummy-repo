FROM openjdk:8
EXPOSE 8080
ADD target/temp-0.0.1.jar temp-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/temp-0.0.1.jar"]