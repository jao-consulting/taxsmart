#!/bin/bash

# This script is used to prepare a new release of the project.
# It updates the version number in both the back-end and front-end of the project.

# The version number is passed as an argument to the script.
VERSION=$1

# Navigate to the back-end directory.
cd back
# Use Maven to set the 'revision' property to the new version number.
mvn versions:set-property -Dproperty=revision -DnewVersion="$VERSION"
# Navigate back to the root directory.
cd ../

# Navigate to the front-end directory.
cd front
# Use npm to set the version number in the package.json file.
# The '--allow-same-version' option allows the version number to be set to its current value.
# The '--no-git-tag-version' option prevents npm from creating a Git tag for the new version.
npm version --allow-same-version --no-git-tag-version "$VERSION"
# Navigate back to the root directory.
cd ../