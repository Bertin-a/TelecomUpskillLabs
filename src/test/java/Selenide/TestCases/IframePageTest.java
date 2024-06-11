package Selenide.TestCases;


import Selenide.Pages.Homepage;
import Selenide.Pages.IframesPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.switchTo;
import static org.testng.Assert.assertEquals;

public class IframePageTest  {
    IframesPage iframesPage = new IframesPage();
    Homepage homepage = new Homepage();
    @BeforeClass
    public void setUpPage() throws InterruptedException {
       homepage.open().iframes().click();
    }
    @Test
    public void scrollInIframeAndClick(){
        switchTo().frame(iframesPage.anchorToFrame2());
        assertEquals(iframesPage.DocPageText().getText(), "Selenium automates browsers. That's it!", "Text does not match");



    }


}



