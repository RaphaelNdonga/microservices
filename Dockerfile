# Start with a base image containing java runtime
FROM eclipse-temurin:25

#Information around who maintains the image
MAINTAINER raphaelndonga.com

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]