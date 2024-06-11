package Selenide.Pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class DownloadsPage {
    String filename = "test.pdf";
    String downloadDir = System.getProperty("user.home") + "\\Downloads";

    public SelenideElement downloadBtn1(){
        return $(By.xpath("//a[@class='wpdm-download-link download-on-click btn btn-primary ']"));
    }
    public SelenideElement downloadBtn2(){
        return $(By.xpath("//a[contains(@class,'wpdm-download-link wpdm-download-locked btn btn-primary')]"));
    }


/*
    public boolean verifyFileExists(){
        File filedownload = new File(downloadDir, + '\\' + filename);
        return filedownload.exists();
    }
    public void protectedDownload(){
        downloadBtn2.click();

    }

 */

}
