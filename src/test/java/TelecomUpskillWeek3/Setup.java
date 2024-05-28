package TelecomUpskillWeek3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Setup {
    public static WebDriver driver;

    @BeforeSuite
    public void initializeDriver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice-automation.com/");
    }

    @AfterSuite
    public void teardown() {
        if (driver != null) {
            driver.quit();  // Ensure the browser is closed after all tests
        }
    }
}
