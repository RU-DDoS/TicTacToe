# Design report
## Service
Since the TicTacToe game does not require any database, it does not include any datalayer classes. It requires two Service classes, one for listening to Ajax calls from the website which uses another Service class's API to update the website's board. the API keeps uses variables to create a virtual board that keeps track of the status of it's current game and players.
## Front-end
The website will be written in HTML, CSS and Javascript. It should be as simple as possible for it's only purpose, the game itself. The game board will have 3x3 buttons (boxes). If one is clicked it will either be marked with *X* or *O*.
**Mockup:**
![Mockup][https://github.com/RU-DDoS/TicTacToe/Docs/Images/mockup.png]
## Conclusion
