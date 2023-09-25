#!/bin/sh

# execute migrations, create user admin and run server (Django) 
python3 python/manage.py migrate
python3 python/manage.py createsuperuser --email admin@example.com --username admin

# compile and generate package .jar to run server (Maven)
(cd ./java/ && mvn compile)
(cd ./java/ && mvn package)

# run servers
python3 python/manage.py runserver 0.0.0.0:8000 & (cd ./java/ && java -jar target/restapi-0.0.1-SNAPSHOT.jar)
