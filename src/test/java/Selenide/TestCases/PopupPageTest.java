package Selenide.TestCases;


import Selenide.Pages.Homepage;
import Selenide.Pages.PopupPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PopupPageTest {

    Homepage homepage = new Homepage();
    PopupPage popupPage = new PopupPage();

    @BeforeClass
    public void setup(){
        homepage.open().popUps().click();
    }

    @Test
    public void interactWithPopUps() throws InterruptedException {
        popupPage.PromptPopup().click();
        Selenide.confirm();
        popupPage.ConfirmPopup().click();
        Selenide.confirm();
        popupPage.AlertPopUp().click();
        Selenide.confirm();
       // popupPage.confirmResults().click();
    }
    }
