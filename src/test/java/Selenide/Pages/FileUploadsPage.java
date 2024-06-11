package Selenide.Pages;



import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.$;

public class FileUploadsPage {
    public SelenideElement FileUploadBtn(){
        return $(By.id("file-upload"));
    }
    public SelenideElement uploadBtn(){
        return $(By.id("upload-btn"));
    }
    public SelenideElement thankYouMessage(){
        return $(By.xpath("//div[@class='wpcf7-response-output']"));
    }


}
