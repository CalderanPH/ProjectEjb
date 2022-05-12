#!/bin/sh
mvn clean package && docker build -t com.mycompany/Aula4Pratica2 .
docker rm -f Aula4Pratica2 || true && docker run -d -p 9080:9080 -p 9443:9443 --name Aula4Pratica2 com.mycompany/Aula4Pratica2