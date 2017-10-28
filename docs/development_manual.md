# Developement manual for TicTacToe

## Getting Started

### Github
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
Log in at <https://dashboard.heroku.com/apps>  
Contact Matthías (matthiasd16@ru.is) to gain access
```sh
  $ git remote rm heroku
  $ heroku git:remote -a tictactoe-hugb-12345
```

### Slack
Join the teams slack channel at <https://l2n3rd.slack.com> 
Contact any member of the team to gain access.
Access the Travis slack app settings here: <https://l2n3rd.slack.com/services/B7NUQNQK0>
