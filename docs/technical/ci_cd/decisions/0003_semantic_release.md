# 3. Semantic Release

## Status
[![Generic badge](https://img.shields.io/badge/Date-2023/12/09-blue.svg)](https://shields.io/)
[![Generic badge](https://img.shields.io/badge/Status-Accepted-Green.svg)](https://shields.io/)

## Context

We want to automate the release process of our project. We want to be able to release a new version of our project by
just merging a pull request.

## Decision

We decided to use semantic release to automate the release process of our project. Semantic release will be triggered by
a push on the main branch.

we will implement semantic release as defined in the following (https://semver.org/)

## Consequences

Semantic release will automate the release process of our project. Semantic release will analyze the commit messages and
will determine the next version of the project.

Semantic release will also create a changelog based on the commit messages.
