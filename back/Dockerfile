# This Dockerfile is used to build the back-end of the application.

# The base image is eclipse-temurin:21-jre-alpine.
FROM eclipse-temurin:21-jre-alpine

# The authors of the Dockerfile are specified using the LABEL instruction.
LABEL authors="jugurta"

# The ARG instruction defines a variable that users can pass at build-time to the builder with the docker build command.
ARG MODULE

# The EXPOSE instruction informs Docker that the container listens on the specified network port at runtime.
EXPOSE 8080

# The RUN instruction creates a new directory and sets it as the working directory.
RUN mkdir -p /usr/src/web-app/config
WORKDIR /usr/src/web-app

# The RUN instruction adds a new user with user ID 1001 and changes the ownership of the working directory to this user.
RUN adduser -u 1001 1001 --disabled-password \
    && chown 1001 -R /usr/src/web-app/

# The COPY instruction copies new files from the source on the host to the filesystem of the container at the destination.
COPY ${MODULE}/target/${MODULE}.jar app.jar
COPY back-entrypoint.sh back-entrypoint.sh

# The RUN instruction changes the permissions of the back-entrypoint.sh file to make it executable.
RUN chmod +x back-entrypoint.sh

# The USER instruction sets the user name (or UID) to use when running the image.
USER 1001

# The CMD instruction provides defaults for an executing container.
CMD ["sh", "back-entrypoint.sh"]