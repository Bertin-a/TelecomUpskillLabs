package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.io.File;

public class DownloadsPage extends Setup {
    @FindBy(xpath = "//a[@class='wpdm-download-link download-on-click btn btn-primary ']")
    WebElement downloadbtn1;

    @FindBy(xpath = "//a[contains(@class,'wpdm-download-link wpdm-download-locked btn btn-primary')]")
    WebElement downloadBtn2;
    String filename = "test.pdf";
    String downloadDir = System.getProperty("user.home") + "\\Downloads";

    public DownloadsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDownload(){
        downloadbtn1.click();
    }

    public boolean verifyFileExists(){
        File filedownload = new File(downloadDir, + '\\' + filename);
        return filedownload.exists();
    }
    public void protectedDownload(){
        downloadBtn2.click();

    }

}
