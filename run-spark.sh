#!/bin/bash
export JAVA_HOME=/opt/homebrew/Cellar/openjdk@17/17.0.16/libexec/openjdk.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH
mvn exec:java