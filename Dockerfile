FROM openjdk:8
EXPOSE 80
COPY Experiment-1-1-1.0.jar
CMD ["java","-jar","Experiment-1-1-1.0.jar"]