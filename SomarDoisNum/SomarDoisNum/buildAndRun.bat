@echo off
call mvn clean package
call docker build -t com.mycompany/Aula4Pratica2 .
call docker rm -f Aula4Pratica2
call docker run -d -p 9080:9080 -p 9443:9443 --name Aula4Pratica2 com.mycompany/Aula4Pratica2