FROM adoptopenjdk/openjdk16

ENV HEALTH_PORT 8081

COPY target/consumer-0.0.1-SNAPSHOT.jar ./

EXPOSE $HEALTH_PORT

CMD java -jar consumer-0.0.1-SNAPSHOT.jar
