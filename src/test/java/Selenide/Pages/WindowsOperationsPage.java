package Selenide.Pages;

import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowsOperationsPage extends Setup {
    @FindBy(xpath = "//button[contains(@onclick,'newTab()')]")
    private WebElement newTab;
    @FindBy(css = "button[onclick='newWindowSelf()']")
    private WebElement replaceWindows;
    @FindBy(css = "button[onclick='newWindow()']")
    private WebElement newWindow;
    public WindowsOperationsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public String originalTab(){
        return driver.getWindowHandle();
    }

    public void newTab(){

        newTab.click();


    }
    public void replaceWindow(){
        originalTab();
        replaceWindows.click();

    }

    public void newWindow(){
        newWindow.click();
    }
}
