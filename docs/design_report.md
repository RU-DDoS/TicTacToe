# Design report
## Design layout
It was decided to implement the game using a simple 3 layer design method, e.g UI-, business- and data-layer. Since the game is meant to be simple it will not include custom user names nor a high score table and therefore there is no need for a data-layer. The game will be coded using TDD along with a simple console UI but when the logic is complete the console UI will be swapped out for a GUI to be able to run the program on the web.

## Back-end
The logic for the website will be written in Java whilst keeping in mind that all the functionality will be accessed through asynchronous calls with Javascript. Since the game is so simple the underlying structures will not be broken down into smaller units as that will only complicate the program as a whole. Therefore there will be a single service class which will keep track of the board, the players and the state of the game.

## Front-end
The website will be written in HTML, CSS and Javascript. It should be as simple as possible for it's only purpose is running the game itself. The game board will have 3x3 buttons (boxes). If one is clicked it will either be marked with *X* or *O*.
**Mockup:**
This is a basic mockup of the webpage  
![alt text](https://github.com/RU-DDoS/TicTacToe/blob/docs/docs/Images/mockup.png)

## Logic
The following state diagram shows how the team envisioned the logic for the game.  
The game will be a continous loop of reading input from the user, validating the input and making the appropriate move. After each move the game will need to check if there is a winner or if the board is full. If the game is over the user will be prompted to decide whether he wants to play a new game or if he wants to quit.
![alt text](https://github.com/RU-DDoS/TicTacToe/blob/docs/docs/Images/logic.png)

## Flow of services
The following diagram shows how the flow through the external services will be. We have not yet decided on all the services we plan to utilize but we have decided on what we want the flow to be like.  
As the diagram shows when a developer pushes to Github Travis will run the unit tests, deploy a staging server and run the end-to-end test.
If the branch being pushed to is the master branch Travis should also deploy to production before sending a report on whether something went wrong or if everything was successful.
![alt text](https://github.com/RU-DDoS/TicTacToe/blob/docs/docs/Images/flow.png)

