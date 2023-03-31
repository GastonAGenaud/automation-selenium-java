#!/bin/bash
cd ./firebase/products/pre-staging
echo "##############################  CLEAN PUBLIC FOLDER ##############################"
rm -rf public
cd ../../../
echo "##############################  COPY REPORT INTO PUBLIC FOLDER ##############################"
cp -r ./target/cucumber-html-reports ./firebase/products/pre-staging/public
cd ./firebase/products/pre-staging
echo "##############################  START DEPLOY INTO FIREBASE ##############################"

firebase deploy --only hosting --token $FIREBASE_TOKEN