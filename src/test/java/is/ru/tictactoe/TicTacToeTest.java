package is.ru.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {
	@Test
	public void testIllegalInput() {
		TTTService game = new TTTService();
		try {
			game.makeMove(0);
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
	public void testAlreadyUsedLocation() {
		TTTService game = new TTTService();
		game.makeMove(1);
		assertEquals(false, game.makeMove(1));
		
	}

	@Test
	public void testGetPlayer() {
		TTTService game = new TTTService();
		assertEquals('x', game.getPlayer());
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
}