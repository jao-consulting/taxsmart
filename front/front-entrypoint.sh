#!/usr/bin/env sh

# This script is used to start the front-end server of the application.

# The NITRO_PORT environment variable is set to "8080". This is the port that the server will listen on.
export NITRO_PORT="8080"

# The node command is used to start the server. The server code is located in the .output/server/index.mjs file.
node .output/server/index.mjs