package Selenide.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class TablesPage {
    public SelenideElement Table(){
        return $("figure[class='wp-block-table'] table");
    }


}
