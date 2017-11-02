package is.ru.tictactoe;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class TicTacToeTest {
	@Test
	public void testIllegalInputLower() {
		TTTService game = new TTTService();
		try {
			game.makeMove(0);
		} catch (IllegalArgumentException e) {
			assertEquals("Element out of range, please stick to 1-9", e.getMessage());
		}
	}

	@Test
	public void testIllegalInputUpper() {
		TTTService game = new TTTService();
		try {
			game.makeMove(10);
		} catch (IllegalArgumentException e) {
			assertEquals("Element out of range, please stick to 1-9", e.getMessage());
		}
	}

	@Test
	public void testGetValue() {
		TTTService game = new TTTService();
		assertEquals('1', game.getValue(1));
	}

	@Test
	public void testMakeMoveAsX() {
		TTTService game = new TTTService();
		game.makeMove(1);
		assertEquals('x', game.getValue(1));
	}

	@Test
	public void testMakeMoveAsO() {
		TTTService game = new TTTService();
		game.makeMove(1);
		game.makeMove(2);
		assertEquals('o', game.getValue(2));
	}

	@Test
	public void testAlreadyUsedLocationX() {
		TTTService game = new TTTService();
		game.makeMove(1);
		assertEquals(false, game.makeMove(1));	
	}
	@Test
	public void testAlreadyUsedLocationO() {
		TTTService game = new TTTService();
		game.makeMove(1);
		game.makeMove(2);
		assertEquals(false, game.makeMove(2));	
	}

	@Test
	public void testGetPlayerX() {
		TTTService game = new TTTService();
		assertEquals('x', game.getPlayer());
	}

	@Test
	public void testGetPlayerO() {
		TTTService game = new TTTService();
		game.makeMove(1);
		assertEquals('o', game.getPlayer());
	}

	@Test
	public void testHorizontalWin() {
		TTTService game = new TTTService();
		game.makeMove(1);
		game.makeMove(4);
		game.makeMove(2);
		game.makeMove(5);
		game.makeMove(3);
		assertEquals(true, game.hasWinner());
	}

	@Test
	public void testVerticalWin() {
		TTTService game = new TTTService();
		game.makeMove(1);
		game.makeMove(2);
		game.makeMove(4);
		game.makeMove(3);
		game.makeMove(7);
		assertEquals(true, game.hasWinner());
	}

	@Test
	public void testCrossWin() {
		TTTService game = new TTTService();
		game.makeMove(1);
		game.makeMove(2);
		game.makeMove(5);
		game.makeMove(3);
		game.makeMove(9);
		assertEquals(true, game.hasWinner());
	}

	@Test
	public void testDraw() {
		TTTService game = new TTTService();
		game.makeMove(1);
		game.makeMove(3);
		game.makeMove(2);
		game.makeMove(5);
		game.makeMove(4);
		game.makeMove(7);
		game.makeMove(6);
		game.makeMove(9);
		game.makeMove(8);
		assertEquals(true, game.checkDraw());
	}

	@Test
	public void testNoDraw() {
		TTTService game = new TTTService();
		assertEquals(false, game.checkDraw());
	}

	@Test
	public void testGetWinner() {
		TTTService game = new TTTService();
		game.makeMove(1);
		game.makeMove(4);
		game.makeMove(2);
		game.makeMove(5);
		game.makeMove(3);
		assertEquals('x', game.getWinner());
	}

	@Test
	public void testNewGame() {
		TTTService game = new TTTService();
		game.makeMove(1);
		game.newGame();
		assertEquals('1', game.getValue(1));
	}

	@Test
	public void testGetBoard() {
		TTTService game = new TTTService();

		char[] board = game.getBoard();
		boolean success = true;
		for(int i = 0; i < 9; i++) {
			if(board[i] != (char)(i + '1')) {
				success = false;
			}
		}
		assertEquals(true, success);
	}

	@Test
	public void testHasWinner() {
		TTTService game = new TTTService();
		game.makeMove(1);
		game.makeMove(4);
		game.makeMove(2);
		game.makeMove(5);
		game.makeMove(3);
		assertEquals(true, game.hasWinner());
	}

	@Test
	public void testHasNoWinner() {
		TTTService game = new TTTService();
		assertEquals(false, game.hasWinner());
	}


}