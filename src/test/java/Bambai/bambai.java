package Bambai;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class bambai {
    public  static WebDriver driver;

    @BeforeSuite
    public void initializeDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bamb.ai/auth-login");

    }
    @AfterSuite
    public void tearDown(){
        if (driver != null) {  // Added null check
            driver.quit();
        }
    }

}
