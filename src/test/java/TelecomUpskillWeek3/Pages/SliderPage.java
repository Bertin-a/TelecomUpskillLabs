package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPage extends Setup {
    @FindBy(id = "slideMe")
    private WebElement slider;
    public SliderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void slide() throws InterruptedException {
       // int sliderWidth = slider.getSize().width;
        //int offset = (int) (((double)(50 - 0) / (100 - 0)) * sliderWidth);
        //((50-0)/(100-0))

        //System.out.println(offset);
        //System.out.println(sliderWidth);
       // Actions move = new Actions(driver);
       // move.clickAndHold(slider).moveByOffset(offset,0).release();
       // Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", slider, 50);

    }

}
