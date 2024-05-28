package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Paths;

public class FileUploadsPage extends Setup {
    @FindBy(id = "file-upload")
    WebElement fileUploadBtn;
    @FindBy(id = "upload-btn")
    WebElement uploadBtn;
    @FindBy(xpath = "//div[@class='wpcf7-response-output']")
    WebElement thankYouMessage;
    String filepath = Paths.get(getUsersDir() +"\\downloads\\test.pdf").toAbsolutePath().toString();

    private WebDriver driver;
    public FileUploadsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void upload() throws InterruptedException {
        fileUploadBtn.sendKeys(filepath);
        Thread.sleep(3000);
        uploadBtn.click();

    }

    private String getUsersDir(){
       return System.getProperty("user.dir");
    }
}
