package Selenide.Pages;




import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class IframesPage {

    public SelenideElement Iframe(){
        return $(By.id("frame1"));
    }
    public SelenideElement anchorToFrame2(){
        return $(By.id("frame1"));
    }
    public SelenideElement DocPageText(){
        return $(".d-1.fw-bold");
    }


}
