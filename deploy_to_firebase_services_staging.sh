#!/bin/bash
cd ./firebase/services/staging
echo "##############################  CLEAN PUBLIC FOLDER ##############################"
rm -rf public
cd ../../../
echo "##############################  COPY REPORT INTO PUBLIC FOLDER ##############################"
cp -r ./target/cucumber-html-reports ./firebase/services/staging/public
cd ./firebase/services/staging
echo "##############################  START DEPLOY INTO FIREBASE ##############################"

firebase deploy --only hosting --token $FIREBASE_TOKEN