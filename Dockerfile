FROM openjdk:17-oracle
COPY ./target/bookdetails-0.0.1-SNAPSHOT.jar bookdetails.jar
CMD ["java","-jar","bookdetails.jar"]
