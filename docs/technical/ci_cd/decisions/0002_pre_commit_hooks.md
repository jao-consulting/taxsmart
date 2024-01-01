# 2. Pre-Commit Hooks

[![Generic badge](https://img.shields.io/badge/Date-2023/12/01-blue.svg)](https://shields.io/)
[![Generic badge](https://img.shields.io/badge/Status-Accepted-Green.svg)](https://shields.io/)

## Context

Source code is free to be pushed to git without any check on the quality of its formatting or good practices.

## Decision

We decided to add a pre-commit hook, that will execute **formatter** using the standards of eclipse formatter
automatically before the commit.

Each developer will have to install husky on his/her machine and run the following command at the root of the
repository :

```bash
    npm install
    husky install
 ```

We use two different formatters, one for the java code and one for the javascript code. The java formatter is configured
in the pom.xml file, and the javascript formatter is configured in the .prettierrc file.

and in order to have the same formatter in the IDE as the one used by the pre-commit hook, we have to configure the IDE
by importing the formatter configuration file.

## Consequences

The commits can be blocked on the developer machine, forcing him/her to fix the issues before committing to git.