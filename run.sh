#!/bin/sh

echo "Build project"
javac -cp src:lib/hamcrest-core-1.3.jar:lib/richtextfx-fat-0.6.10.jar src/application/MainApp.java

echo "Run"
java -cp src:lib/hamcrest-core-1.3.jar:lib/richtextfx-fat-0.6.10.jar application.MainApp
