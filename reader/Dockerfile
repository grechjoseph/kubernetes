FROM openjdk:8-jdk-slim

ENV PORT 8080
ENV CLASSPATH /opt/lib

COPY target/reader-0.0.1-SNAPSHOT.jar /reader.jar

CMD ["sh", "-c", "java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap $APPLICATION_ARGS -jar /reader.jar"]