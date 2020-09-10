FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} bilidaApplication.java
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bilidaApplication.java"]