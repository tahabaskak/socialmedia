FROM adoptopenjdk:8-jre-hotspot
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} socialmedia_app.jar
ENTRYPOINT ["java", "-jar", "socialmedia_app.jar"]