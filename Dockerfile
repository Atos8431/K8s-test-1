FROM openjdk:8
EXPOSE 8080
ADD Experiment-1-1-1.0.jar backend.jar
ENTRYPOINT ["java","-jar","backend.jar"]