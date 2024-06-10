package Selenide.TestCases;

import TelecomUpskillWeek3.Pages.FileUploadsPage;
import TelecomUpskillWeek3.Pages.Homepage;
import TelecomUpskillWeek3.Setup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadPageTest extends Setup {
    private FileUploadsPage fileUploadsPage;
    private Homepage homepage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        fileUploadsPage = new FileUploadsPage(driver);
        homepage = new Homepage(driver);
        homepage.FileUploads();

    }
    @Test
    public void upload() throws InterruptedException {
        fileUploadsPage.upload();
    }
}
