FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} medical-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/medical-0.0.1-SNAPSHOT.jar"]