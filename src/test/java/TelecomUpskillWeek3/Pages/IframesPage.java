package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import TelecomUpskillWeek3.Utility.Scroll;
import TelecomUpskillWeek3.Utility.wait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframesPage extends Setup {
    private WebDriver driver;
    @FindBy(id = "frame1")
    private WebElement iframe;
    @FindBy(css = "[class=\"selenium-button-container\"] >a[href=\"/documentation/webdriver/\"]")
    private WebElement anchorToFrame2;
    public IframesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void frame(){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void scrollInIframeAndClickMonAnchor() throws InterruptedException {
        driver.switchTo().frame(iframe);
        //driver.switchTo().alert().accept();
        Scroll.ScrollIntoView(anchorToFrame2);
        wait.waitForElement(anchorToFrame2);
        anchorToFrame2.click();
    }
}
