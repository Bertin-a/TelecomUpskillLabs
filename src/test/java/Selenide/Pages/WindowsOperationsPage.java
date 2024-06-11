package Selenide.Pages;

import TelecomUpskillWeek3.Setup;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class WindowsOperationsPage extends Setup {

    public SelenideElement NewTab() {
        return $(By.xpath("//button[contains(@onclick,'newTab()')]"));
    }

    public SelenideElement ReplaceWindows() {
        return $("button[onclick='newWindowSelf()']");
    }

    public SelenideElement NewWindows() {
        return $("button[onclick='newWindow()']");
    }
}