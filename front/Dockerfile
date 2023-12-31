FROM node:20-alpine3.18
LABEL authors="jugurta"

EXPOSE 8080

#Create app directory
RUN mkdir -p /usr/src/web-app/config
WORKDIR /usr/src/web-app

#Add user
RUN adduser -u 1001 1001 --disabled-password \
    && chown 1001 -R /usr/src/web-app/

#Copy files
COPY .output/.  ./.output/
COPY node_modules/. ./node_modules/
COPY package.json/. ./package.json
COPY front-entrypoint.sh ./front-entrypoint.sh


RUN chmod +x front-entrypoint.sh  \
    && chown -R 1001 ./.output/

USER 1001

CMD ["sh", "front-entrypoint.sh"]