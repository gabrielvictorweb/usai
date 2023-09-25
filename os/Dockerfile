FROM debian:11
USER root
WORKDIR $HOME

LABEL maintainer="usai"

COPY . .

RUN chmod 755 .docker/entrypoint.sh

# PYTHON PORT
EXPOSE 8000

# JAVA PORT
EXPOSE 8080

# INSTALL PACKAGES REQUIRED TO RUN THE APPLICATION
RUN apt-get update && apt-get install -y \
    python3 \
    python3-pip \
    maven \ 
    openjdk-17-jdk \ 
    openjdk-17-jre \
    iproute2

# INSTALL PACKAGES REQUIRED TO RUN DJANGO APP
RUN pip3 install -r python/requirements.txt