FROM openjdk:11
RUN addgroup -S glid && adduser -S glid -G glid
USER jihen:jihen
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} storeManagement-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/storeManagement-0.0.1-SNAPSHOT.jar"]