#FROM openjdk:17
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} application.jar
#CMD apt-get update -y
#ENTRYPOINT ["java", "-Xmx2048M", "-jar", "/application.jar"]
#ENTRYPOINT ["java", "-jar", "/application.jar"]


FROM openjdk:17-jdk-alpine
COPY target/spring-postgres-docker.jar application.jar
ENTRYPOINT [ "java", "-jar", "application.jar" ]
