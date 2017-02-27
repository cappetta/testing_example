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
    
```

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running github.cappetta.testing_example.TestProjectDashboard
Feb 26, 2017 11:44:34 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Attempting bi-dialect session, assuming Postel's Law holds true on the remote end
Feb 26, 2017 11:44:36 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
*** Navigation to Application ***
*** Verifying EditIcons Exists ***
*** Verifying Search Container Exists ***
*** Verifying Record attributes Exists ***
*** Verifying Record Container Exists ***
*** Verifying Search Container Exists ***
*** Verifying Stats Row exists ***
*** Verifying page title ***
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.821 sec - in github.cappetta.testing_example.TestProjectDashboard
checkEditIcon(github.cappetta.testing_example.TestProjectDashboard)  Time elapsed: 0.181 sec
checkMoreButtong(github.cappetta.testing_example.TestProjectDashboard)  Time elapsed: 0.031 sec
checkRecordAttributes(github.cappetta.testing_example.TestProjectDashboard)  Time elapsed: 0.311 sec
checkRecordExists(github.cappetta.testing_example.TestProjectDashboard)  Time elapsed: 0.019 sec
checkSearchExists(github.cappetta.testing_example.TestProjectDashboard)  Time elapsed: 0.142 sec
checkStats(github.cappetta.testing_example.TestProjectDashboard)  Time elapsed: 0.018 sec
checkTitle(github.cappetta.testing_example.TestProjectDashboard)  Time elapsed: 0.014 sec

Results :

Tests run: 7, Failures: 0, Errors: 0, Skipped: 0

```

