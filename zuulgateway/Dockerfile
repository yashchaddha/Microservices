FROM openjdk:10

ADD ./target/zuulgateway-0.0.1-SNAPSHOT.jar /usr/src/zuulgateway-0.0.1-SNAPSHOT.jar

WORKDIR usr/src



ENTRYPOINT ["java","-jar", "zuulgateway-0.0.1-SNAPSHOT.jar"]