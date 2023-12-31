FROM eclipse-temurin:21-jre-alpine
LABEL authors="jugurta"
ARG MODULE

EXPOSE 8080

RUN mkdir -p /usr/src/web-app/config
WORKDIR /usr/src/web-app

#Add user
RUN adduser -u 1001 1001 --disabled-password \
    && chown 1001 -R /usr/src/web-app/

#Copy files
COPY ${MODULE}/target/${MODULE}.jar app.jar
COPY back-entrypoint.sh back-entrypoint.sh

RUN chmod +x back-entrypoint.sh

USER 1001

CMD ["sh", "back-entrypoint.sh"]