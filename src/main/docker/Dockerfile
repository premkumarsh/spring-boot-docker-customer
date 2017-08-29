FROM java:8
VOLUME /tmp
EXPOSE 8081
ADD spring-boot-docker-customer.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]