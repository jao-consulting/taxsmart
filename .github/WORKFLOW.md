# Github pipeline

## Description

TaxSmart is a product composed of two sub applications:

- Backend: a back-end application that is based on Spring Boot.
- Frontend: a front-end application that is based on Nuxt.js.

Each project has its own pipeline which are triggered depending on code changes.

## Documentation of workflows

### Summary

- [Pull request semantic checks](workflows/docs/pull-request-semantic-check.md)
- [Scan & Detect secrets](workflows/docs/scan-detect-secrets.md)
- [Backend Quality Check](workflows/docs/backend-quality-check.md)
- [Frontend Quality Check](workflows/docs/frontend-quality-check.md)
- [Semantic release](workflows/docs/semantic-release.md)
- [Build Back-End](workflows/docs/build-back-end.md)
- [Build Front-End](workflows/docs/build-front-end.md)

### Pull request checks

All pull request checks are only triggered if the pull request is ready for review,
so that we don't waste resources on checks that will be useless if the pull request is not ready.

#### Common

- Semantic checks that run on every pull request : it checks the commit and the Pr title.
- Secrets detection : it checks if there is any secret in the code.

#### Backend Quality Check

It will only trigger if the folder containing the Backend has any changes.

- Unit tests & coverage : it runs the unit tests and checks the coverage.
- Integration tests : it runs the integration tests.

#### Frontend Quality Check

It will only trigger if the folder containing the Frontend has any changes.

- Unit tests & coverage : it runs the unit tests and checks the coverage.

### Release

The release is based on semantic release as described in
the [documentation](../docs/technical/ci_cd/decisions/0003_semantic_release.md).

It will be triggered if there's any changes in the `main` branch.

- Quality checks : it checks the code quality by running the tests.
- Release : it will create a new release and publish it to the GitHub registry.

### Build phase

Once the release is done, the build phase will be triggered. the front end and the back end will be built and pushed to
the GitHub registry.