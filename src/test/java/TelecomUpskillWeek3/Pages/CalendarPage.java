package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import TelecomUpskillWeek3.Utility.wait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CalendarPage extends Setup {
    @FindBy(css = "h1[itemprop='headline']")
    private WebElement calenderPage;
    @FindBy(id = "g1065-selectorenteradate")
    private WebElement field;
    @FindBy(css = "div[class='entry-content'] button[type='submit']")
    private WebElement submitBtn;
    @FindBy(xpath = "//div[@class='field-value']")
    private WebElement dateField;

    public boolean isVisible(){
        wait.waitForElement(calenderPage);
        return calenderPage.isDisplayed();
    }
    public CalendarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void pickDate(String date){
        field.sendKeys(date);
        field.sendKeys(Keys.ENTER);
    }
    public void clickOnSubmit() throws InterruptedException {
        Thread.sleep(3000);
        wait.waitForElement(submitBtn);
        submitBtn.click();

    }
    public String displayedDate(){
        wait.waitForElement(dateField);
        return dateField.getText();
    }

}
