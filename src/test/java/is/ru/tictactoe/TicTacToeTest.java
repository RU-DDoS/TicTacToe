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

}