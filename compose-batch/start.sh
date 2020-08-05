#! /bin/bash
/app/wait-for-it.sh psql:5432 -t 15
java -Djava.security.egd=file:/dev/./urandom -jar /app/app.jar