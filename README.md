# Overview
This is a simple open-source solution which provides a test manifest, plan, test cases, and few automated tests.

# Google Documents:

* Requirements / Test Plan & Test Cases: https://docs.google.com/spreadsheets/d/1nZyouaqQ0Imz5X-9XT4rZfOFgCuHHoxtxky83jL4ikM/edit?usp=sharing 
* Automated Test Scripts: 
    ** Java: https://github.com/cappetta/testing_example/blob/master/test/github.cappetta.testing_example/TestProjectDashboard.java


How to use:
 - install maven
 - using a docker server, perform a docker-compose up using the docker-compose.yml file
 - clone the github repo: git@github.com:cappetta/testing_example.git
 - update line 31 on TestProjectDashboard.java to the ip/hostname of the docker server
 - perform a "docker-compose scale firefox=5"
 - mvn clean install 
 - Verify tests ran as expected.
    

