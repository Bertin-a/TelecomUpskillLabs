package Selenide.Pages;

import TelecomUpskillWeek3.Setup;
import TelecomUpskillWeek3.Utility.wait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class CalendarPage extends Setup {
    public SelenideElement calendersPage(){
        return $("h1[itemprop='headline']");
    }
    public SelenideElement field(String date){
        return $(By.id("g1065-selectorenteradate")).val(date);
    }
    public SelenideElement submitBtn(){
        return $("div[class='entry-content'] button[type='submit']");
    }
    public SelenideElement dataField(){
        return $(".field-value");
    }

}
