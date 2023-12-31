# Frontend Quality Check Workflow Documentation

This documentation provides an overview of the Frontend Quality Check workflow used in this project. This workflow is
responsible for running quality checks on the front-end.

## Frontend Quality Check Workflow

The `frontend-quality-check.yml` workflow is triggered when a pull request is opened, reopened, synchronized, or marked
as ready for review on the `main` branch. It performs the following tasks:

1. Checks out the repository.
2. Runs Node.js unit tests in the `front` directory.
3. Uploads the code coverage report to Codecov.

Note: The unit tests job is skipped if the pull request is a draft.

### Run Front-End Unit Tests Job

This job is part of the `frontend-quality-check.yml` workflow. It performs the following tasks:

1. Checks out the repository.
2. Runs Node.js unit tests in the `front` directory using the `node-cmd` action with the `npm run test:coverage`
   command.
3. Uploads the code coverage report to Codecov using the `codecov/codecov-action@v3` action.

For more detailed information about each step, refer to the respective YAML files in the `.github/workflows` directory.