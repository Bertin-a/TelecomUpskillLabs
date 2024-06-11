package Selenide.TestCases;


import Selenide.Pages.Homepage;
import Selenide.Pages.SliderPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SliderPageTest  {

    Homepage homepage = new Homepage();
    SliderPage sliderPage = new SliderPage();
    @BeforeClass
    public void setUpPage()  {
        homepage.open().slider().click();
    }
    @Test
    public void slideTo50(){
        int offset = calculateOffset(25, sliderPage.slider());
        Actions slide = new Actions(WebDriverRunner.getWebDriver());
        slide.dragAndDropBy(sliderPage.slider(),offset,0).perform();

    }
    private int calculateOffset(int desireValue, SelenideElement sliderHandle){
        int SliderWidth = sliderHandle.getSize().getWidth();
        int MaxSliderVal = 100;
        return (SliderWidth * desireValue) / MaxSliderVal;
    }
}


