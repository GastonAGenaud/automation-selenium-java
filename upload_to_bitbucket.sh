#!/bin/bash

# Set the repository URL and branch name
BRANCH_NAME="test-report"
# Checkout the branch
git pull --rebase
git fetch origin
git merge origin/test-report

# Move to the Reports directory
cd Reports

# Stage all changes
git pull --rebase
git add --update
git add .

# Commit changes with a timestamp
TIMESTAMP=$(date +%Y-%m-%d_%H:%M:%S)
git commit -m "Auto-commit at $TIMESTAMP of $ENVIRONMENT $SUITE Report"

# Push changes
git push -f origin $BRANCH_NAME
