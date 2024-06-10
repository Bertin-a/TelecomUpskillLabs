package Selenide.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class ModelsPage {
    public SelenideElement SimpleModel() {
        return $(By.id("simpleModal"));
    }

    public SelenideElement PopUpModel() {
        return $(By.id("popmake-1318"));
    }

    public SelenideElement CloseBtn() {
        return $("div[id='popmake-1318'] button[aria-label='Close']");
    }

    public SelenideElement formModel() {
        return $(By.id("formModal"));
    }

    public SelenideElement modelForm() {
        return $(By.id("popmake-674"));
    }

    public SelenideElement nameField() {
        return $(By.id("g1051-name"));
    }

    public SelenideElement emailField() {
        return $(By.id("g1051-email"));
    }

    public SelenideElement messageField() {
        return $(By.id("contact-form-comment-g1051-message"));
    }

    public SelenideElement submitBtn() {
        return $("button[class='pushbutton-wide']");
    }
}
