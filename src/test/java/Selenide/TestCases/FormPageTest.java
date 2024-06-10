package Selenide.TestCases;


import Selenide.Pages.FormPage;
import Selenide.Pages.Homepage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormPageTest {
   Homepage homepage = new Homepage();
   FormPage formPage = new FormPage();
    @BeforeClass
    public void setUp(){
        homepage.open().formField().click();

    }

    @Test
    public void fillform() throws InterruptedException {
        formPage.nameField().val("Bertina");
        formPage.Dropdown().selectOption(0);
        formPage.EmailField().val("bertina@gmail.com");
        formPage.MessageField().val("this is a message to myself");
        //formPage.SubmitBtn().click();


    }
}
