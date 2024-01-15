# 4. Front End Code Architecture

## Status

[![Generic badge](https://img.shields.io/badge/Date-2024/01/15-blue.svg)](https://shields.io/)
[![Generic badge](https://img.shields.io/badge/Status-Accepted-Green.svg)](https://shields.io/)

## Context

In order to have a maintainable codebase, we need to define the architecture of the front end. This architecture should
be able to be applied to all the different components of the front end.

## Decision

We'll follow the clean architecture with a clear input and output services. This architecture is based on the idea that
we should have a clear separation of the different layers of the application. This will allow us to have a more
maintainable codebase.

We'll have the following layers:

- **Presentation**: This layer will contain the components that will be rendered in the browser. These components will
  be responsible for the UI and the user interactions. They will be connected to the domain layer through the
  presentation layer.

- **Domain**: This layer will contain the business logic of the application. It will be responsible for the business
  rules and the data validation. It will be connected to the data layer through the domain layer.

- **Data**: This layer will contain the data access logic. It will be responsible for the communication with the backend
  and the data persistence. It will be connected to the presentation layer through the data layer.

As we're using Nuxt.js, we'll have the following folders structure as it is recommended by the framework [doc](https://nuxt.com/docs/guide/directory-structure/app):

- **assets**: This folder will contain the assets of the presentation layer.
- **components**: This folder will contain the components of the presentation layer.
- **composables**: This folder will contain the composables of the domain layer.
- **layouts**: This folder will contain the layouts of the presentation layer.
- **pages**: This folder will contain the pages of the presentation layer and the routing of the application.
- **server**: This folder will contain the server that will be responsible for interacting with the backend.
- **store**: This folder will contain the store of the application.

## Consequences

This architecture will allow us to build a robust software with a high quality. It will also allow us to refactor the
code easily if needed.