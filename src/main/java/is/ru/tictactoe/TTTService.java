package is.ru.tictactoe;

public class TTTService {
	private boolean player;
	private char[] board;
	private int moves;

	public TTTService() {
		player = true;
		moves = 0;
		board = new char[9];
		for(int i = 0; i < 9; i++) {
			board[i] = (char)(i + '1');
		}
	}

	public void makeMove(int val) {
		if(val < 1 || val > 9) {
			throw new IllegalArgumentException("Element out of range, please stick to 1-9");
		}
	}

	public char getValue(int index) {
		return board[index-1];
	}
}