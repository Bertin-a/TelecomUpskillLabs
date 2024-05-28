package TelecomUpskillWeek3.TestCases;

import TelecomUpskillWeek3.Pages.Homepage;
import TelecomUpskillWeek3.Pages.PopupPage;
import TelecomUpskillWeek3.Pages.WindowsOperationsPage;
import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
/*
public class WindowsOperationPageTest extends Setup {
    private WindowsOperationsPage windowsOperationPage;
    private Homepage homepage;
    @BeforeClass
    public void setUpPage() throws InterruptedException {
        windowsOperationPage = new WindowsOperationsPage(driver);
        homepage = new Homepage(driver);

        homepage.WindowsOperations();
    }
    @Test
    public void newTab() throws InterruptedException {
        windowsOperationPage.newTab();
        ((JavascriptExecutor) driver).executeScript("window.open();");
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(10000);
        driver.get("https://automatenow.io/");
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://automatenow.io/",url);
        //System.out.println(windowsOperationPage.originalTab());
        driver.switchTo().window(tabs.get(0));
        //driver.switchTo().window(windowsOperationPage.originalTab());
        Thread.sleep(5000);
        String OriginalUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://practice-automation.com/window-operations/", OriginalUrl);

    }
    @Test
    public void replaceTab(){
        windowsOperationPage.replaceWindow();
        ((JavascriptExecutor) driver).executeScript("window.location.href='https://automatenow.io/'");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://automatenow.io/"));
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://automatenow.io/", url);
        driver.navigate().back();
        wait.until(ExpectedConditions.urlToBe("https://practice-automation.com/window-operations/"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://practice-automation.com/window-operations/");
    }
    @Test
    public void NewWindow() throws InterruptedException {
       String originalTab = driver.getWindowHandle();
       Thread.sleep(2000);
        windowsOperationPage.newWindow();
        Thread.sleep(10000);
        for(String windowHandle : driver.getWindowHandles()){
           if(!windowHandle.equals(originalTab)){
               driver.switchTo().window(windowHandle);
               String url = driver.getCurrentUrl();
               Assert.assertEquals("https://automatenow.io/", url);
               driver.manage().window().maximize();
               driver.close();
            }


        }
        driver.switchTo().window(originalTab);


    }

}

 */
