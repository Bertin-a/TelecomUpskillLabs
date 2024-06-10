package Selenide.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class PopupPage {
    public SelenideElement AlertPopUp() {
        return $(By.id("alert"));
    }

    public SelenideElement ConfirmPopup() {
        return $(By.id("confirm"));
    }

    public SelenideElement PromptPopup() {
        return $(By.id("prompt"));
    }

    public SelenideElement toolTip() {
        return $(By.className("tooltip_1"));
    }

    public SelenideElement confirmResults() {
        return $(By.id("confirmResult"));
    }
}