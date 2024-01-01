# CodeQL Security Check Workflow Documentation

This documentation provides an overview of the CodeQL Security Check workflow used in this project. This workflow is
responsible for running security checks on both the back-end and front-end of the application.

## CodeQL Security Check Workflow

The `codeql-security-check.yml` workflow is triggered on push and pull request events to the main branch, and also runs
on a schedule every Wednesday at 6:18 AM UTC. It performs the following tasks:

### Analyze Back-End Job

This job is part of the `codeql-security-check.yml` workflow. It performs the following tasks:

1. Checks out the repository.
2. Initializes CodeQL with the Java and Kotlin languages.
3. Runs a Java build command in the `back` directory.
4. Performs the CodeQL analysis.

### Analyze Front-End Job

This job is also part of the `codeql-security-check.yml` workflow. It performs the following tasks:

1. Checks out the repository.
2. Initializes CodeQL with the JavaScript and TypeScript languages.
3. Runs Node.js build command in the `front` directory.
4. Performs the CodeQL analysis.

For more detailed information about each step, refer to the respective YAML files in the `.github/workflows` directory.