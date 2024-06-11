package Selenide.TestCases;


import Selenide.Pages.Homepage;
import Selenide.Pages.WindowsOperationsPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsOperationPageTest{
    Homepage homepage = new Homepage();
    WindowsOperationsPage windowsOperationsPage = new WindowsOperationsPage();

    @BeforeClass
    public void setUp(){
        homepage.open().windowsOperation().click();
    }
    @Test
    public void operations(){
        windowsOperationsPage.NewWindows().click();
        String currentWindowHandle = WebDriverRunner.getWebDriver().getWindowHandle();

        Set<String> allWindowsHandle = WebDriverRunner.getWebDriver().getWindowHandles();

        for(String window : allWindowsHandle){
            if(window != currentWindowHandle){
                WebDriverRunner.getWebDriver().switchTo().window(window);
               // Selenide.closeWindow();
                WebDriverRunner.getWebDriver().switchTo().window(currentWindowHandle);
                break;
            }
        }
        windowsOperationsPage.NewTab().click();
        String mainTab = WebDriverRunner.getWebDriver().getWindowHandle();

        Set<String> tabHandles = WebDriverRunner.getWebDriver().getWindowHandles();

        for(String tabs : tabHandles){
            if(tabs != mainTab){
                WebDriverRunner.getWebDriver().switchTo().window(tabs);
                WebDriverRunner.getWebDriver().switchTo().window(mainTab);
                break;
            }
        }
        windowsOperationsPage.ReplaceWindows().click();

        String mainReplaceTab = WebDriverRunner.getWebDriver().getWindowHandle();

        Set<String> ReplacedTabHandles = WebDriverRunner.getWebDriver().getWindowHandles();

        for(String tabs : ReplacedTabHandles){
            if(tabs != mainReplaceTab){
                WebDriverRunner.getWebDriver().switchTo().window(tabs);
                WebDriverRunner.getWebDriver().switchTo().window(mainReplaceTab);
                break;
            }
        }

    }
    }