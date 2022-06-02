FROM adoptopenjdk/openjdk15:alpine-slim

RUN addgroup -S spring && adduser -S spring -G spring

USER spring:spring

VOLUME /tmp

ARG JAR_FILE

ADD ${JAR_FILE} /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]