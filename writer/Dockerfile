FROM openjdk:8-jdk-slim

ENV PORT 8080
ENV CLASSPATH /opt/lib

COPY target/writer-0.0.1-SNAPSHOT.jar /writer.jar

CMD ["sh", "-c", "java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap $APPLICATION_ARGS -jar /writer.jar"]