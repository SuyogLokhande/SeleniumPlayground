# 1. Abstract
This project (downloadable from git) is a very minimalistic Maven project to run a Selenium Java Test Case performing a simple login against the slenium demo website on: https://www.lambdatest.com/selenium-playground/


The project simply imports via Maven Selenium, Chrome Driver, JUnit and surefire plugin for better test output. The project is by purpose very simple to show a very basic setup to run Selenium automation, the pom.xml is the required Maven file with the dependencies.

# 2. Prerequirements
* Java 1.8.x
* Maven (configured properly with Java)
* Internet connection
* Google Chrome browser

# 3. Installation
* Checkout/download the project from the git repository into a root folder

# 4. To run the test cases
* Open a Command Line
* Go where this project was checked out (root folder)\n
* Run
```
mvn clean verify
```
The command will clean any existing target folder, compile and build the project and run the test case. The screen command line output will provide the test logs and information.
* Sample test execution results when passed
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] ├─ org.suyog.uiautomation.selenium.playground.ValidateLandingPageTest - 11.458s
[INFO] │  ├─ ✔ validatePageTitle - 5.811s
[INFO] │  └─ ✔ validatePageElements - 5.594s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
```
* Sample test execution results when failed
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] ├─ org.suyog.uiautomation.selenium.playground.ValidateLandingPageTest - 9.135s
[INFO] │  ├─ ✔ validatePageTitle - 5.175s
[INFO] │  └─ ✘ validatePageElements - 3.913s
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   ValidateLandingPageTest.validatePageElements:31 Validating landing page center header:  ==> expected: <Selenium Playground2> but was: <Selenium Playground>
[INFO] 
[ERROR] Tests run: 2, Failures: 1, Errors: 0, Skipped: 0

```
  

**Note:** on some OS like on a Mac, at the first execution please remember to give the rights from the security checkings to execute the Chrome or Gecko Driver executable file.
