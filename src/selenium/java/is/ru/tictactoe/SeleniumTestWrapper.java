package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class SeleniumTestWrapper {
  static ChromeDriver driver;
  static String baseUrl;
  static String port;

  @BeforeClass
  public static void openBrowser() {
    ChromeOptions chromeOptions = new ChromeOptions();
    //chromeOptions.setBinary("/tmp/google-chrome-stable_current_amd64.deb");
    chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("--disable-gpu");
    driver = new ChromeDriver(chromeOptions);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    baseUrl = "https://tictactoe-ddos-staging.herokuapp.com";
  }

  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }
}
