package Selenide.TestCases;



import Selenide.Pages.CalendarPage;
import Selenide.Pages.Homepage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CalenderPageTest {

    private String date = "2000-11-07";
    CalendarPage calendarPage = new CalendarPage();
    Homepage homepage = new Homepage();

    @BeforeClass
    public void setUp(){

        homepage.open().calenders().click();

    }
    @Test
    public void pickDate() throws InterruptedException {
        assertTrue(calendarPage.calendersPage().isDisplayed(), "Page is not visible");
        calendarPage.field(date).pressEnter();
        calendarPage.submitBtn().click();
        assertEquals(date, calendarPage.dataField().text(), "Wrong date is being displayed");

    }
}


