FROM openjdk:11.0.2-jre-slim

# AppD
RUN apt-get update
RUN apt-get install -y curl jq unzip
COPY downloadJavaAgentLatest.sh .
RUN ./downloadJavaAgentLatest.sh

RUN mkdir /app
WORKDIR /app

# Add Scala App Components
#ADD target/scala-2.13/play-scala-starter-example_2.13-1.0-SNAPSHOT.jar .
ADD target/universal/play-scala-starter-example-1.0-SNAPSHOT.zip .
RUN unzip play-scala-starter-example-1.0-SNAPSHOT.zip && rm play-scala-starter-example-1.0-SNAPSHOT.zip

### OpenShift Considerations...
### Setup user for build execution and application runtime
#ENV APP_ROOT=/app
#ENV PATH=${APP_ROOT}:${PATH} HOME=${APP_ROOT}
#RUN chmod -R u+x ${APP_ROOT} && \
#    chgrp -R 0 ${APP_ROOT} && \
#    chmod -R g=u ${APP_ROOT} /etc/passwd

### Setup user for AppD agent access
#ENV APPD_ROOT=/opt/appdynamics
#RUN chmod -R u+x ${APPD_ROOT} && \
#    chgrp -R 0 ${APPD_ROOT} && \
#    chmod -R g=u ${APPD_ROOT} /etc/passwd

### Containers should NOT run as root as a good practice
#USER 10001
#WORKDIR ${APP_ROOT}

#ENTRYPOINT ["java", "-javaagent:/opt/appdynamics/java/javaagent.jar", "-jar", "play-scala-starter-example_2.13-1.0-SNAPSHOT.jar"]
#ENTRYPOINT ["./sbt", "run", "-Dplay.http.secret.key=ad31779d4ee49d5ad5162bf1429c32e2e9933f3"]
#ENTRYPOINT ["tail", "-f", "/dev/null"]
ENTRYPOINT ["play-scala-starter-example-1.0-SNAPSHOT/bin/play-scala-starter-example", "-Dplay.http.secret.key=ad31779d4ee49d5ad5162bf1429c32e2e9933f3"]
