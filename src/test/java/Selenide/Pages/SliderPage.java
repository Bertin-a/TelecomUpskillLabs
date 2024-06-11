package Selenide.Pages;

import TelecomUpskillWeek3.Setup;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class SliderPage extends Setup {
    public SelenideElement slider(){
        return $(By.id("slideMe"));
    }


  //  public void slide() throws InterruptedException {
       // int sliderWidth = slider.getSize().width;
        //int offset = (int) (((double)(50 - 0) / (100 - 0)) * sliderWidth);
        //((50-0)/(100-0))

        //System.out.println(offset);
        //System.out.println(sliderWidth);
       // Actions move = new Actions(driver);
       // move.clickAndHold(slider).moveByOffset(offset,0).release();
       // Thread.sleep(3000);
        //((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", slider, 50);

    //}

}
