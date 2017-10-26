package is.ru.tictactoe;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.lang.StringBuilder;
import java.io.InputStreamReader;
import java.io.InputStream;
import spark.QueryParamsMap;
import static spark.Spark.*;

public class TicTacToe {
    public static void main(String[] args) {
    	TTTService game = new TTTService();
   		port(getHerokuPort());
            // Opens the folder named public and searches for a folder called index.html
			staticFiles.location("/public");
			get("/", (req, res) -> {
					return "Hello World!";
			});
			get("/api/click", (req, res) -> {
            QueryParamsMap map = req.queryMap();
            try {
                // Returns the index of the TTT-button
                Integer index = map.get("index").integerValue();
                // Gets the the currents move's player
                char player = game.getPlayer();
                // Main game logic, all statements return string of win/draw/new game and the current player
                if(game.makeMove(index)) {
                    if(game.hasWinner()) {
                        return "w" + player;
                    } else if(game.checkDraw()) {
                        return "d" + player;
                    }
                    return "k" + player;
                }
                return "n" + player;
            }
            catch (Exception e){
                return "Error: " + e.getMessage();
            }
        });
        // Creates a new game
        get("/api/newgame", (req, res) -> {
            try {
                game.newGame();
                return 1;
            }
            catch (Exception e){
                return "Error: " + e.getMessage();
            }
        });
    }
        // Returns the Heroku-port, returns 4567 if there is a problem with the connection
		static int getHerokuPort() {
			ProcessBuilder psb = new ProcessBuilder();
			if (psb.environment().get("PORT") != null) {
					return Integer.parseInt(psb.environment().get("PORT"));
			}
			return 4567;
    }
}
