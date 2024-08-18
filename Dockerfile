FROM openjdk:17

RUN mkdir -p /home/app
COPY /build/libs /home/app
CMD ["java","-jar","/home/app/com.azure.webapp-0.0.1-SNAPSHOT.jar"]