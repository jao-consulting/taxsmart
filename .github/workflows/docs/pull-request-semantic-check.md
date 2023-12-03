# Pull Request Title and Commit Check Workflow Documentation

This document provides an overview of the `Pull Request Title and Commit Check` workflow used in this project. The
workflow is defined in the `.github/workflows/pull-request-semantic-check.yml` file.

## Workflow Triggers

The workflow is triggered in four scenarios related to pull requests:

1. When a pull request is opened (`opened`).
2. When a pull request is reopened (`reopened`).
3. When a pull request is synchronized (`synchronize`).
4. When a pull request is marked as ready for review (`ready_for_review`).

The workflow only runs if the pull request is not a draft (`! github.event.pull_request.draft`).

## Jobs

The workflow consists of a single job named `check-pull-request-title`. This job runs on the latest version of Ubuntu.

### Steps

The job consists of a single step:

1. **Validate PR title**: This step uses the `amannn/action-semantic-pull-request@v5` action to validate the PR title
   and commits. It uses the `GITHUB_TOKEN` secret for authentication. The action is configured to validate single
   commits and ensure that the single commit matches the PR title.

Please refer to the [official documentation](https://github.com/marketplace/actions/semantic-pull-request) of the used
actions for more detailed information.