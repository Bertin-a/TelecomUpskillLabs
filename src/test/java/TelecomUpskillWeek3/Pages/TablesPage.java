package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TablesPage extends Setup {
    @FindBy(css = "figure[class='wp-block-table'] table")
    private WebElement table;
    public TablesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void retrieveDataOnTable() {
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));

            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t");
            }

            System.out.println();


        }
    }
}
