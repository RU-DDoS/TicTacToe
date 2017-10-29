# Developement manual for TicTacToe

## Getting Started

### Github
Install [Git](https://git-scm.com/downloads)  
Clone or download the repository
<https://github.com/RU-DDoS/TicTacToe>  
Contact either Matthías (matthiasd16@ru.is) or Birkir (birkirk16@ru.is) to gain access.

### Java SDK
Make sure you have Java SE Developement Kit 8 installed.  
You can get it here: <http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html>
```sh
	$ javac -version
```


### Gradle
Make sure you have Gradle installed.  
You can get it here: <https://gradle.org/install/>
```sh
	$ gradle -v
```


#### Build with Gradle
This depends on the build.gradle file in the root of the project.  
This builds the test files as well.
```sh
	$ gradle build
```


### Travis
1. Log in at <https://travis-ci.org/>
2. Connect your travis account to your github account.
3. Click the **+** on the left side to add a new repository.
4. Press the **[Sync Account]** button to the right.

You should now have access to the repository build history on Travis.

### Heroku
The application is hosted on Heroku, there are two versions of the app both of them are publically available and you therefore don't need to sign up for Heroku in order to access or update them. If you need access to the Heroku settings please contact Matthías (matthiasd16@ru.is).

[Staging](https://tictactoe-staging-ddos.herokuapp.com)

[Production](https://tictactoe-production-ddos.herokuapp.com)

### Slack
Join the teams slack channel at <https://l2n3rd.slack.com>  
Contact any member of the team to gain access.  
Access the Travis slack app settings here: <https://l2n3rd.slack.com/services/B7NUQNQK0>

### Selenium
In order to run Selenium tests locally you will need  to install both [Chrome](https://www.google.com/chrome/browser/features.html?brand=CHBD&gclid=CjwKCAjw-NXPBRB4EiwAVNRLKuDAUlRgcNqBHzC9UJ1FtyCEqArTz_D3vLo-csV6oBIyI9ln9am_hRoCY94QAvD_BwE&dclid=CJrR0_OMltcCFQSZdwodMpQOsQ) and [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads). If you are on windows you must add them to path in your system environment variables.  
From there you should be able to run the following to run the Selenium tests:
```sh
	$ ./gradlew check
	$ ./gradlew selenium
```
