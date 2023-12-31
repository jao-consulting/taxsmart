# Build Front-End Workflow Documentation

This documentation provides an overview of the Build Front-End workflow used in this project. This workflow is
responsible for building the front-end of the application.

## Build Front-End Workflow

The `build-front-end.yml` workflow is triggered when a new release is created, or when manually dispatched. It performs
the following tasks:

1. Checks out the repository.
2. Runs a Node.js build command in the `front` directory.
3. Builds a Docker image for the front-end.

### Run Node.js Build Job

This job is part of the `build-front-end.yml` workflow. It performs the following tasks:

1. Checks out the repository.
2. Runs a Node.js build command in the `front` directory using the `node-cmd` action with the `npm ci`
   and `npm run build` commands.

### Build Docker Image Job

This job is also part of the `build-front-end.yml` workflow. It performs the following tasks:

1. Builds a Docker image for the front-end using the `docker-build` action.
2. The Docker image is tagged with the version from the release event and pushed to the GitHub Container Registry (
   GHCR).

For more detailed information about each step, refer to the respective YAML files in the `.github/workflows` directory.