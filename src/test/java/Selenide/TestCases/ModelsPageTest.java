package Selenide.TestCases;

import Selenide.Pages.Homepage;
import Selenide.Pages.ModelsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ModelsPageTest {
    Homepage homepage = new Homepage();
    ModelsPage modelsPage = new ModelsPage();

    @BeforeClass
    public void setup(){
        homepage.open().models().click();

    }
    @Test
    public void interactWithModels(){
        modelsPage.SimpleModel().click();
        assertTrue(modelsPage.PopUpModel().isDisplayed());
        modelsPage.CloseBtn().click();
        modelsPage.formModel().click();
        modelsPage.nameField().val("Bertina");
        modelsPage.emailField().val("Bertina@gmail.com");
        modelsPage.messageField().val("This is a message");
        modelsPage.submitBtn().click();

    }

}
