FROM maven:3.8.1-openjdk-17-slim AS build
RUN mkdir /home/int-stubs
COPY . /home/int-stubs
RUN cd /home/int-stubs && mvn clean package
RUN cp /home/int-stubs/target/*.jar int-stubs.jar
ENTRYPOINT [ "java","-jar","int-stubs.jar" ]
EXPOSE 8080
