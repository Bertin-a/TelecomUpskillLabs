package Selenide.TestCases;


import Selenide.Pages.Homepage;
import Selenide.Pages.TablesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TablesPageTest {
    TablesPage tablesPage = new TablesPage();
    Homepage homepage = new Homepage();
    @BeforeClass
    public void setUpPage() throws InterruptedException {
        homepage.open().tables().click();
    }
    @Test
    public void printData(){
        retrieveDataOnTable();

    }
    public void retrieveDataOnTable() {
        List<WebElement> rows = tablesPage.Table().findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));

            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t");
            }

            System.out.println();


        }


    }
}


