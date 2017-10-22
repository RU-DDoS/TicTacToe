package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
    	TTTService game = new TTTService();
   		System.out.println("Welcome to Tic Tac Toe!");

    	while(true) {
    		printBoard(game.getBoard());
    		char player = game.getPlayer();

    		System.out.println("Now playing: " + player);
    		System.out.println("Please enter a number between 1 and 9 for a location:");
    		Scanner scan = new Scanner(System.in);
    		String inputString = scan.nextLine();
    		int input = Integer.parseInt(inputString);
    		try {
	    		if(game.makeMove(input)) {
	    			System.out.println("Nice move!\n");
	    		}
	    		else {
	    			System.out.println("I'm sorry that location was already selected.\n");
	    		}
	    	} catch (IllegalArgumentException e) {
	    		System.out.println(e.getMessage() + "\n");
	    	}
    	}
    }

    private static void printBoard(char[] board) {
    	for(int i = 0; i < 9; i++) {
    		System.out.print(board[i] + "   ");
    		if(i == 2 || i == 5) {
    			System.out.print("\n");
    		}
    	}
    	System.out.print("\n");
    }
}