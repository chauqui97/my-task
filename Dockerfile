FROM adoptopenjdk/openjdk11:latest

MAINTAINER Chau Qui

VOLUME /tmp

ADD "target/demo-0.0.1-SNAPSHOT.jar" app.jar

ENV JAVA_OPTS="-Xms256m -Xmx768m"

#ENV JAVA_OPTS="-XX:MaxRAMPercentage=80"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]