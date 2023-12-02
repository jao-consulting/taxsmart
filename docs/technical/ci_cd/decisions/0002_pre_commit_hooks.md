# Pre-Commit Hooks

## Context

Back-End code is free to be pushed to git without any check on the quality of its formatting or good practices.

## Decision

We decided to add a pre-commit hook, that will execute **formatter** using the standards of eclipse formatter
automatically before the commit.

Each developer will have to install husky on his/her machine and run the following command at the root of the
repository :

```bash
    npm install
    husky install
 ```

and in order to have the same formatter as the one used in eclipse, the developer will have to import the file
eclipse-formatter.xml in his editor.

## Consequences

The commits can be blocked on the developer machine, forcing him/her to fix the issues before committing to git.