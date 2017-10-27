package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class SeleniumTestWrapper {
  static PhantomJSDriver driver;
  static String baseUrl;
  static String port;

  @BeforeClass
  public static void openBrowser() {
    //driver = new ChromeDriver(chromeOptions);
    driver = new PhantomJSDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    baseUrl = "https://tictactoe-staging-ddos.herokuapp.com";
  }

  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }
}
