package Bambai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends bambai {
    @FindBy(id = "fullName")
    private WebElement fullname;
    @FindBy(id = "registrationType")
    private  WebElement registration;
    @FindBy(id = "default-01")
    private WebElement email;
    @FindBy(id ="password")
    private WebElement password;
    @FindBy(css = "select[name=\"phoneNumberCountry\"]")
    private WebElement phoneNumber;
    @FindBy(id = "phoneNumber")
    private WebElement phoneNumberfield;

    @FindBy(id = "default-01")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement passcode;

    public CreateAccount(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectFromDropdown(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void fillForm() throws InterruptedException {
        fullname.sendKeys("Bertina Ayuure");
        registration.click();
        selectFromDropdown(registration, "Independent School");
        Thread.sleep(3000);
        selectFromDropdown(phoneNumber, "Ghana");
        Thread.sleep(3000);
        phoneNumberfield.sendKeys("553467110");
        password.sendKeys("1234");
    }

    public void login(){
        username.sendKeys("bertina@gmail.com");
        passcode.sendKeys("1234");
    }

}
