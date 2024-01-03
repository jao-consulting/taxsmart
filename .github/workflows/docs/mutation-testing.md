# Mutation Testing Workflow

This document describes the Mutation Testing workflow defined in the `.github/workflows/mutation-testing.yml` file. This
workflow is part of the GitHub Actions used in this project.

## Overview

The Mutation Testing workflow is designed to run mutation tests on the back-end of the application. Mutation testing is
a type of software testing where certain statements of the source code are changed/mutated to check if the test cases
are able to find the errors. It is used to ensure the quality of the application's tests and that they are able to
detect changes in the code.

## Triggers

This workflow is triggered by various pull request events on the `main` branch. The types of pull request events that
trigger this workflow include when a pull request is opened, reopened, synchronized, or marked as ready for review.

In addition, this workflow can also be manually dispatched or called by other workflows.

## Jobs

The workflow consists of a single job: `backend-mutation-testing`. This job is responsible for running the mutation
tests on the back-end of the application.

### Backend Mutation Testing

This job is skipped if the pull request is a draft. It runs on the latest version of Ubuntu and the default working
directory for this job is `back`.

The job consists of two steps:

1. **Checkout**: This step checks out the repository using the `actions/checkout@v4` action.

2. **Run Java mutation Tests**: This step runs the mutation tests using the PITest Maven plugin. It uses the `java-cmd`
   action defined in `.github/actions/java-cmd`. The working directory is `back`, the Java distribution is `temurin`,
   and the Java version is `21`. The command to run the mutation tests
   is `mvn -B test-compile org.pitest:pitest-maven:mutationCoverage`. The API key for the Stryker dashboard is stored as
   a GitHub secret and is passed as an input to the action.

## Secrets

The workflow uses the following secrets:

- `STRYKER_DASHBOARD_API_KEY`: The API key for the Stryker dashboard. This is used to send the mutation test results to
  the Stryker dashboard.

## Conclusion

The Mutation Testing workflow is an important part of the project's CI/CD pipeline, ensuring that the application's
tests are robust and effective.