package Selenide.Pages;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;


public class Homepage{

    public Homepage open(){
        Selenide.open("https://practice-automation.com/");
        return this;
    }


    public SelenideElement header(){
        return $(By.xpath("//strong[contains(text(),'Welcome to your software automation practice websi')]"));
    }

    public SelenideElement  formField(){
        return $(By.xpath("(//a[normalize-space()='Form Fields'])[1]"));
    }
    public SelenideElement calenders(){
        return $(By.xpath("//a[normalize-space()='Calendars']"));
    }
    public SelenideElement popUps(){
        return $(By.xpath("//a[normalize-space()='Popups']"));
    }
    public SelenideElement tables(){
        return $(By.xpath("//a[normalize-space()='Tables']"));
    }
    public SelenideElement windowsOperation(){
        return $(By.xpath("//a[normalize-space()='Window Operations']"));
    }
    public SelenideElement models(){
        return $(By.xpath("//a[normalize-space()='Modals']"));
    }
    public SelenideElement fileDownload(){
        return $(By.xpath("//a[normalize-space()='File Download']"));
    }
    public SelenideElement fileUploads(){
        return $(By.xpath("//a[normalize-space()='File Upload']"));
    }

    public SelenideElement iframes(){
        return $(By.xpath("//a[normalize-space()='Iframes']"));
    }
    public SelenideElement slider(){
        return $(By.xpath("//a[normalize-space()='Sliders']"));
    }

}
