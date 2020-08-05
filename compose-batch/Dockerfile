FROM openjdk:11-jre
WORKDIR /app
COPY target/springboot-batch-1.0-SNAPSHOT.jar app.jar
COPY compose-batch/wait-for-it.sh wait-for-it.sh
COPY compose-batch/start.sh start.sh
ENTRYPOINT ["./start.sh"]