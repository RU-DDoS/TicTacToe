package is.ru.tictactoe;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.lang.StringBuilder;
import java.io.InputStreamReader;
import java.io.InputStream;
import spark.QueryParamsMap;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
    	TTTService game = new TTTService();
   		port(getHerokuPort());

			staticFiles.location("/public");

			get("/", (req, res) -> {
					return "Hello World!";
			});
			get("/api/click", (req, res) -> {
            QueryParamsMap map = req.queryMap();
            try {
                Integer index = map.get("index").integerValue();
                return index;
            }
            catch (Exception e){
                return "Error: " + e.getMessage();
            }
        });
    }

		static int getHerokuPort() {
			ProcessBuilder psb = new ProcessBuilder();
			if (psb.environment().get("PORT") != null) {
					return Integer.parseInt(psb.environment().get("PORT"));
			}
			return 4567;
    }
}