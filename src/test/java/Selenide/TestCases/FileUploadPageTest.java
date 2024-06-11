package Selenide.TestCases;


import Selenide.Pages.FileUploadsPage;
import Selenide.Pages.Homepage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Paths;

public class FileUploadPageTest{
    Homepage homepage = new Homepage();
    FileUploadsPage fileUploadsPage = new FileUploadsPage();
    String filepath = Paths.get(getUsersDir() +"\\downloads\\test.pdf").toAbsolutePath().toString();
    File fileToUpload = new File(filepath);


    private String getUsersDir(){
        return System.getProperty("user.dir");
    }
    @BeforeClass
    public void setUp() {
        homepage.open().fileUploads().click();

    }
    @Test
    public void upload(){
        fileUploadsPage.FileUploadBtn().uploadFile(fileToUpload);
        fileUploadsPage.uploadBtn().click();

    }
}
