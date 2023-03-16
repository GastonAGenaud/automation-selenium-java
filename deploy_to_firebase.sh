#!/bin/bash
cd ./firebase/products
echo "##############################  CLEAN PUBLIC FOLDER ##############################"
rm -rf public
cd ../../
echo "##############################  COPY REPORT INTO PUBLIC FOLDER ##############################"
cp -r ./target/cucumber-html-reports ./firebase/products/public
cd ./firebase/products
echo "##############################  START DEPLOY INTO FIREBASE ##############################"

firebase deploy --only hosting --token $FIREBASE_TOKEN