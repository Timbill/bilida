FROM openjdk:11-jdk-slim
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} bilidaApplication.java
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bilidaApplication.java"]