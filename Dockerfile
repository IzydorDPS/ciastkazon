FROM openjdk:14
ADD target/ciastkazon-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar ciastkazon-0.0.1-SNAPSHOT.jar