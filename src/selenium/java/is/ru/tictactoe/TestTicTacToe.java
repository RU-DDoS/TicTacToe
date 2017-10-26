package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestTicTacToe extends SeleniumTestWrapper {
  @Test
  public void testButtonChanges() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(500);
    driver.findElementById("resetButton").click();
    Thread.sleep(500);

    driver.findElementByClassName("game-button--1").click();
    Thread.sleep(500);

    assertEquals("x", driver.findElementByClassName("game-button--1").getText());
  }

  @Test
  public void testSecondClick() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(500);
    driver.findElementById("resetButton").click();
    Thread.sleep(500);

    driver.findElementByClassName("game-button--1").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--2").click();
    Thread.sleep(500);

    assertEquals("o", driver.findElementByClassName("game-button--2").getText());
  }

  @Test
  public void testXWins() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(500);
    driver.findElementById("resetButton").click();
    Thread.sleep(500);

    driver.findElementByClassName("game-button--1").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--4").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--2").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--5").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--3").click();
    Thread.sleep(500);

    assertEquals("Game Over! x wins!", driver.findElementByClassName("gamebox-wintext").getText());
  }

  @Test
  public void testOWins() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(500);
    driver.findElementById("resetButton").click();
    Thread.sleep(500);

    driver.findElementByClassName("game-button--1").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--4").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--2").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--5").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--7").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--6").click();
    Thread.sleep(1500);

    assertEquals("Game Over! o wins!", driver.findElementByClassName("gamebox-wintext").getText());
  }

  @Test
  public void testDraw() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(500);
    driver.findElementById("resetButton").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--5").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--1").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--2").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--8").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--7").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--3").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--4").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--6").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--9").click();
    Thread.sleep(1500);

    assertEquals("Draw!", driver.findElementByClassName("gamebox-wintext").getText());
  }

  @Test
  public void testNewGame() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(500);
    driver.findElementById("resetButton").click();
    Thread.sleep(500);

    driver.findElementByClassName("game-button--1").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--4").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--2").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--5").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--7").click();
    Thread.sleep(500);
    driver.findElementByClassName("game-button--6").click();
    Thread.sleep(500);
    
    driver.findElementById("popButton").click();
    Thread.sleep(500);

    assertEquals("", driver.findElementByClassName("game-button--1").getText());
  }   
}