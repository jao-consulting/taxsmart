# Build Back-End Workflow Documentation

This documentation provides an overview of the Build Back-End workflow used in this project. This workflow is
responsible for building the back-end of the application.

## Build Back-End Workflow

The `build-back-end.yml` workflow is triggered when a new release is created, or when manually dispatched. It performs
the following tasks:

1. Checks out the repository.
2. Runs a Java build command in the `back` directory.
3. Builds a Docker image for the back-end.

### Run Java Build Job

This job is part of the `build-back-end.yml` workflow. It performs the following tasks:

1. Checks out the repository.
2. Runs a Java build command in the `back` directory using the `java-cmd` action with the `mvn --batch-mode verify`
   command.

### Build Docker Image Job

This job is also part of the `build-back-end.yml` workflow. It performs the following tasks:

1. Builds a Docker image for the back-end using the `docker-build` action.
2. The Docker image is tagged with the version from the release event and pushed to the GitHub Container Registry (
   GHCR).

For more detailed information about each step, refer to the respective YAML files in the `.github/workflows` directory.