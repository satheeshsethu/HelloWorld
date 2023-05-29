FROM eclipse-temurin:18.0.2.1_1-jdk
COPY build/libs/*.jar hello.jar
ENTRYPOINT ["java","-jar","/hello.jar"]