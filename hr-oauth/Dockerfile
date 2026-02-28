FROM eclipse-temurin:11-jdk
VOLUME /tmp
EXPOSE 8761
ADD ./target/hr-oauth-0.0.1-SNAPSHOT.jar hr-oauth.jar
ENTRYPOINT ["java","-jar","/hr-oauth.jar"]