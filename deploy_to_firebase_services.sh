#!/bin/bash
cd ./firebase/services
echo "##############################  CLEAN PUBLIC FOLDER ##############################"
rm -rf public
cd ../../
echo "##############################  COPY REPORT INTO PUBLIC FOLDER ##############################"
cp -r ./target/cucumber-html-reports ./firebase/services/public
cd ./firebase/services
echo "##############################  START DEPLOY INTO FIREBASE ##############################"

firebase deploy --only hosting --token $FIREBASE_TOKEN