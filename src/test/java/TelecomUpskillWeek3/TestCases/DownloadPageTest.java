package TelecomUpskillWeek3.TestCases;

import TelecomUpskillWeek3.Pages.DownloadsPage;
import TelecomUpskillWeek3.Pages.Homepage;
import TelecomUpskillWeek3.Pages.WindowsOperationsPage;
import TelecomUpskillWeek3.Setup;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DownloadPageTest extends Setup {
    private DownloadsPage downloadsPage;
    private Homepage homepage;
    @BeforeClass
    public void setUpPage() throws InterruptedException {
        downloadsPage = new DownloadsPage(driver);
        homepage = new Homepage(driver);
        homepage.Downloads();
    }
    @Test
    public void download(){
        downloadsPage.clickDownload();
        //Assert.assertTrue(downloadsPage.verifyFileExists());
    }
}
