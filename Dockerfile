FROM openjdk:11-jre
COPY /target/sample-gdp-growth-0.0.1-SNAPSHOT.jar /app/sample-gdp-growth-0.0.1-SNAPSHOT.jar
WORKDIR /app
RUN ["ls","-la"]
CMD ["java", "-jar", "sample-gdp-growth-0.0.1-SNAPSHOT.jar"]