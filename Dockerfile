FROM openjdk:8-jdk-alpine
#COPY target/spring-boot-aop-0.0.1-SNAPSHOT.jar /usr/local/jetty/webapps/spring-boot-aop-0.0.1-SNAPSHOT.jar
#COPY /home/dswain/target_jar/spring-boot-aop-0.0.1-SNAPSHOT.jar /usr/local/myjettyserver/spring-boot-aop-0.0.1-SNAPSHOT.jar
COPY target/spring-boot-aop-0.0.1-SNAPSHOT.jar /usr/local/myjettyserver/spring-boot-aop-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/local/jetty/webapps/spring-boot-aop-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/local/myjettyserver/spring-boot-aop-0.0.1-SNAPSHOT.jar"]

