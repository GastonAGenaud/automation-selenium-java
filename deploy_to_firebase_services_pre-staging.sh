#!/bin/bash
cd ./firebase/services/pre-staging
echo "##############################  CLEAN PUBLIC FOLDER ##############################"
rm -rf public
cd ../../../
echo "##############################  COPY REPORT INTO PUBLIC FOLDER ##############################"
cp -r ./target/cucumber-html-reports ./firebase/services/pre-staging/public
cd ./firebase/services/pre-staging
echo "##############################  START DEPLOY INTO FIREBASE ##############################"

firebase deploy --only hosting --token $FIREBASE_TOKEN