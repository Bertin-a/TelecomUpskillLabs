package Selenide.TestCases;

import Selenide.Pages.DownloadsPage;
import Selenide.Pages.Homepage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DownloadPageTest{
    DownloadsPage downloadsPage = new DownloadsPage();
    Homepage homepage = new Homepage();
    @BeforeClass
    public void setUpPage() {

    }

    @Test
    public void download(){
       downloadsPage.downloadBtn1().download();

    }
}
