# 4. Delivery Process

## Status
[![Generic badge](https://img.shields.io/badge/Date-2023/12/31-blue.svg)](https://shields.io/)
[![Generic badge](https://img.shields.io/badge/Status-Accepted-Green.svg)](https://shields.io/)

## Context

We want to have a clear and concise delivery process.
We want to be able to deliver a new version of our project by just merging a pull request.

## Decision

We decided to use the following delivery process:

1. A developer creates a pull request from a feature branch to the main branch.
2. If the pull request is ready to be reviewed, the developer assigns the pull request to a reviewer.
3. Several Workflows will be triggered to check the quality of the pull request.
4. The reviewer reviews the pull request.
5. The developer responsible for the pull request merges the pull request if the reviewer approved it.
6. The release workflow will be triggered by the merge of the pull request.
7. The release workflow will check the quality by executing the tests for the front and backend modules , then creates a
   new release.
8. The release workflow will create a changelog based on the commit messages.
9. The BackEnd and Front-End Builds workflows will create a docker image and push it to the GitHub container registry.

## Consequences

The delivery process is based on the semantic release, it is automated, clear and concise.
