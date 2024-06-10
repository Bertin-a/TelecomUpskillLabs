package Selenide.Utility;

import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public abstract class Scroll extends Setup {
    public static void ScrollIntoView(WebElement element){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);

        }
}
