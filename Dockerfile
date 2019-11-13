FROM openjdk:11-jre
VOLUME /root/app
ENV PROFILE default
ENV APPNAME b
ADD target/b-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}","-Dspring.application.name=${APPNAME}","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]