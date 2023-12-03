# Scan & Detect Secrets Workflow Documentation

This document provides an overview of the `Scan & Detect Secrets` workflow used in this project. The workflow is defined
in the `.github/workflows/scan-detect-secrets.yml` file.

## Workflow Triggers

The workflow is triggered in four scenarios related to pull requests:

1. When a pull request is opened (`opened`).
2. When a pull request is reopened (`reopened`).
3. When a pull request is synchronized (`synchronize`).
4. When a pull request is marked as ready for review (`ready_for_review`).

The workflow only runs if the pull request is not a draft (`! github.event.pull_request.draft`).

## Jobs

The workflow consists of a single job named `scan-detect-secrets`. This job runs on the latest version of Ubuntu.

### Steps

The job consists of two steps:

1. **Checkout**: This step checks out the repository using the `actions/checkout@v4` action.
2. **Detect Secrets**: This step uses the `reviewdog/action-detect-secrets@master` action to scan the code and detect
   secrets. It uses the `GITHUB_TOKEN` secret for authentication. The reporter is set based on the event type, and the
   action is configured to fail on error with a level of `error`.

Please refer to the [official documentation](https://github.com/marketplace/actions/run-detect-secrets-with-reviewdog)
of the used actions for more detailed information.