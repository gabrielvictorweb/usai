FROM debian:11
USER root
WORKDIR $HOME

LABEL maintainer="risa"

COPY . .

RUN chmod 755 .docker/entrypoint.sh

# PYTHON PORT
EXPOSE 8000

# JAVA PORT
EXPOSE 8080

RUN apt-get update && apt-get install -y \
    python3 \
    python3-pip \
    maven \ 
    openjdk-17-jdk \ 
    openjdk-17-jre

RUN pip3 install --upgrade pip
RUN pip3 install virtualenv
RUN pip3 install django==3.1
RUN pip3 install djangorestframework==3.1
RUN pip3 install channels==3.0
RUN pip3 install channels_redis==3.2
RUN pip3 install markdown
RUN pip3 install django-filter
# pip install --upgrade attrs