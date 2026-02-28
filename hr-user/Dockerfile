FROM eclipse-temurin:11-jdk
VOLUME /tmp
EXPOSE 8761
ADD ./target/hr-user-0.0.1-SNAPSHOT.jar hr-user.jar
ENTRYPOINT ["java","-jar","/hr-user.jar"]