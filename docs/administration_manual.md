# Administration Manual

## Versions
The master branch will always contain the most recent running and stable version of the project. There are no promises made that versions running on other branches will be working nor stable.

## Dependencies
Please see the [Development manual](https://github.com/RU-DDoS/TicTacToe/blob/docs/docs/development_manual.md) for dependencies.

## Uploading changes
The following workflow is required for adding new features or changes to the project
1. Create a new branch with a informative name as to what you wish to accomplish.
2. Make your changes and push them to your branch.
3. Create a pull request to the master branch when you are satisfied with your changes.
4. The pull request will trigger Travis to do the following:
  + Build your updated version
  + Run the unit tests
  + Deploy to staging
  + Run end-to-end tests  
If all these tasks pass then another collaborator can review your code and merge it to the master branch.
5. When a merge to master is performed an automatic script will kick in and the newest changes will be automatically deployed to the production application.
