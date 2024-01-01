# Semantic Release Workflow Documentation

The `semantic-release.yml` workflow is a crucial part of this project's CI/CD pipeline. It is responsible for automating
the versioning and release process of the application. This workflow is defined in
the `.github/workflows/semantic-release.yml` file.

## Workflow Triggers

The `semantic-release.yml` workflow is triggered in two scenarios:

1. When a push is made to the `main` branch. only when the content of the paths `back/**` or `front/**` are modified.
2. When manually triggered via the `workflow_dispatch` event.

## Workflow Jobs

The workflow consists of three jobs:

### Backend Quality Check

This job uses the `backend-quality-check.yml` workflow to ensure the quality of the backend code. It runs the backend
unit tests and integration tests.

### Frontend Quality Check

This job uses the `frontend-quality-check.yml` workflow to ensure the quality of the frontend code. It runs the frontend
unit tests.

### Release New Version

This job is responsible for releasing a new version of the application. It is dependent on the `backend-quality-check`
and `frontend-quality-check` jobs, meaning it will only run if both of these jobs pass successfully.

The new version is released using the `cycjimmy/semantic-release-action@v4` action. This action automates the versioning
and release process based on the semantic versioning specification. It determines the next semantic version number,
generates the release notes and publishes the release.

## Workflow Permissions

The workflow has `write-all` permissions, meaning it has write access to all resources. This is necessary for the
workflow to be able to create a new release.
Please refer to the [official documentation](https://github.com/marketplace/actions/action-for-semantic-release) of the
used actions and plugins for more detailed information.
