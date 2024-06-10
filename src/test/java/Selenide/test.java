package Selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class test {
    @BeforeMethod
    public void testName() {
        //img[alt='automateNow Logo']
        open("https://practice-automation.com/");
        String url = WebDriverRunner.url();
        Assert.assertEquals(url, "https://practice-automation.com/");

    }

    @Test
    public void interactingWithElement() {
        $("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > div:nth-child(1) > article:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1)").click();
        String url = WebDriverRunner.url();
        Assert.assertTrue(url.contains("form-fields/"));

        // store multiple elements

        //List<String> checkbox =

        ElementsCollection checkBox = $$("[name =\"fav_drink\"]");

        System.out.println(checkBox.texts());

    }

}
