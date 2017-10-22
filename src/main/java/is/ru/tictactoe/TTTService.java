package is.ru.tictactoe;

public class TTTService {
	private boolean player;
	private char[] board;
	private int moves;
	private char winner;

	public TTTService() {
		player = true;
		moves = 0;
		board = new char[9];
		for(int i = 0; i < 9; i++) {
			board[i] = (char)(i + '1');
		}
	}

	public boolean makeMove(int val) {
		validateInput(val);
		if(validateLocation(val)) {
			board[val-1] = player ? 'x' : 'o';
			player = !player;
			moves++;
			return true;
		}
		return false;
	}

	public char getValue(int index) {
		validateInput(index);
		return board[index-1];
	}

	public char getPlayer() {
		return player ? 'x' : 'o'; 
	}

	public char[] getBoard() {
		return board;
	}

	public boolean hasWinner() {
		for(int i = 0; i < 9; i += 3) {
			if(board[i] == board[i + 1] && board[i] == board[i + 2]) {
				winner = board[i];
				return true;
			}
		}

		for(int i = 0; i < 3; i++) {
			if(board[i] == board[i + 3] && board[i] == board[i + 6]) {
				winner = board[i];
				return true;
			}
		}

		if(board[0] == board[4] && board[0] == board[8]) {
			winner = board[0];
			return true;
		}
		if(board[2] == board[4] && board[0] == board[6]) {
			winner = board[0];
			return true;
		}

		return false;
	}

	public char getWinner() {
		return winner;
	}

	public boolean checkDraw() {
		return moves == 9 ? true : false;
	}

	private void validateInput(int val) {
		if(val < 1 || val > 9) {
			throw new IllegalArgumentException("Element out of range, please stick to 1-9");
		}
	}

	private boolean validateLocation(int val) {
		if(board[val-1] == 'x' || board[val-1] == 'o') {
			return false;
		}
		return true;
	}
}