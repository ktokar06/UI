#!/bin/bash

rm -f failed_tests.txt

cd /home/k/IdeaProjects/AutoTest/

mvn test

grep -E 'Tests run: [0-9]+, Failures: [1-9]' target/surefire-reports/*.txt |
cut -d' ' -f6 |
sed 's/\..*$//' >> failed_tests.txt


sort -u failed_tests.txt -o failed_tests.txt