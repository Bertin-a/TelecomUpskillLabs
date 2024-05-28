package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import TelecomUpskillWeek3.Utility.Scroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import TelecomUpskillWeek3.Utility.randomNumberGenerator;

import java.util.List;

public class FormPage extends Setup {
    @FindBy(id = "name")
    private WebElement nameField;
    @FindBy(css = "[type='checkbox']")
    private List<WebElement> checkbox;
    @FindBy(css = "[type='radio']")
    private List<WebElement> radioButtons;
    @FindBy(id = "siblings")
    private WebElement dropdown;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "message")
    private WebElement messageField;
    @FindBy(id = "submit-btn")
    private  WebElement submitBtn;

    private WebDriver driver;
    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillNameField(){
        nameField.sendKeys("Bertina Ayuure");
    }
    public void pickCheckBox(){
       checkbox.get(randomNumberGenerator.random(5)).click();
    }
    public void pickColor() throws InterruptedException {
        Scroll.ScrollIntoView(radioButtons.get(0));
        //scrollIntoView(radioButtons.get(0));
        Thread.sleep(3000);
        radioButtons.get(randomNumberGenerator.random(5)).click();
    }

    public void dropDown(){
        Select select = new Select(dropdown);
        select.selectByIndex(randomNumberGenerator.random(4));
    }

    public void fillEmail(){
        emailField.sendKeys("bert.gmail.com");
    }
    public void fillMessage(){
        messageField.sendKeys("Hi and welcome");
    }

    public void clickOnSubmit() throws InterruptedException {
        Scroll.ScrollIntoView(submitBtn);
        Thread.sleep(3000);
        submitBtn.click();
    }

}
