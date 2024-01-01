# This Dockerfile is used to build the front-end of the application.

# The base image is node:20-alpine3.18.
FROM node:20-alpine3.18

# The authors of the Dockerfile are specified using the LABEL instruction.
LABEL authors="jugurta"

# The EXPOSE instruction informs Docker that the container listens on the specified network port at runtime.
EXPOSE 8080

# The RUN instruction creates a new directory and sets it as the working directory.
RUN mkdir -p /usr/src/web-app/config
WORKDIR /usr/src/web-app

# The RUN instruction adds a new user with user ID 1001 and changes the ownership of the working directory to this user.
RUN adduser -u 1001 1001 --disabled-password \
    && chown 1001 -R /usr/src/web-app/

# The COPY instruction copies new files from the source on the host to the filesystem of the container at the destination.
COPY .output/.  ./.output/
COPY node_modules/. ./node_modules/
COPY package.json/. ./package.json
COPY front-entrypoint.sh ./front-entrypoint.sh

# The RUN instruction changes the permissions of the front-entrypoint.sh file to make it executable and changes its ownership to the user with user ID 1001.
RUN chmod +x front-entrypoint.sh  \
    && chown -R 1001 ./.output/

# The USER instruction sets the user name (or UID) to use when running the image.
USER 1001

# The CMD instruction provides defaults for an executing container.
CMD ["sh", "front-entrypoint.sh"]