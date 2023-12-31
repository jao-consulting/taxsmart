# GitHub Actions Workflow Documentation

This documentation provides an overview of the GitHub Actions workflows used in this project. The project uses several workflows for building the front-end and back-end, as well as for running quality checks on the back-end.

## Build Front-End Workflow

The `build-front-end.yml` workflow is triggered when a new release is created, or when manually dispatched. It performs the following tasks:

1. Checks out the repository.
2. Runs a Node.js build command in the `front` directory.
3. Builds a Docker image for the front-end and pushes it to the GitHub Container Registry (GHCR).

## Build Back-End Workflow

The `build-back-end.yml` workflow is also triggered when a new release is created, or when manually dispatched. It performs the following tasks:

1. Checks out the repository.
2. Runs a Java build command in the `back` directory.
3. Builds a Docker image for the back-end and pushes it to the GHCR.

## Docker Build Action

The `docker-build` action is a reusable action used in both the front-end and back-end build workflows. It performs the following tasks:

1. Sets up QEMU and Docker Buildx.
2. Logs in to the GHCR.
3. Builds and pushes a Docker image to the GHCR.

## Backend Quality Check Workflow

The `backend-quality-check.yml` workflow is triggered when a pull request is opened, reopened, synchronized, or marked as ready for review on the `main` branch. It performs the following tasks:

1. Checks out the repository.
2. Runs Java unit tests in the `back` directory.
3. Uploads the code coverage report to Codecov.
4. Runs Java integration tests in the `back` directory.

Note: Both the unit tests and integration tests jobs are skipped if the pull request is a draft.

For more detailed information about each step, refer to the respective YAML files in the `.github/workflows` and `.github/actions` directories.