# Backend Quality Check Workflow

The `backend-quality-check.yml` workflow is triggered when a pull request is opened, reopened, synchronized, or marked
as ready for review on the `main` branch. It performs the following tasks:

1. Checks out the repository.
2. Runs Java unit tests in the `back` directory.
3. Uploads the code coverage report to Codecov.
4. Runs Java integration tests in the `back` directory.

Note: Both the unit tests and integration tests jobs are skipped if the pull request is a draft.

### Run Back-End Unit Tests Job

This job is part of the `backend-quality-check.yml` workflow. It performs the following tasks:

1. Checks out the repository.
2. Runs Java unit tests in the `back` directory using the `java-cmd` action with the `mvn --batch-mode verify` command.
3. Uploads the code coverage report to Codecov using the `codecov/codecov-action@v3` action.

### Run Back-End Integration Tests Job

This job is also part of the `backend-quality-check.yml` workflow. It performs the following tasks:

1. Checks out the repository.
2. Runs Java integration tests in the `back` directory using the `java-cmd` action with
   the `mvn --batch-mode -DskipTests install && mvn failsafe:integration-test` command.

For more detailed information about each step, refer to the respective YAML files in the `.github/workflows` directory.