FROM openjdk:11-jre
ARG JAR_FILE
ENV PROFILE default
ENV JAVA_OPTS -server
ENTRYPOINT java -Dspring.profiles.active=${PROFILE} -Duser.timezone=Asia/Shanghai ${JAVA_OPTS} -jar /usr/share/leve/app.jar
EXPOSE 8761
ADD target/${JAR_FILE} /usr/share/leve/app.jar
