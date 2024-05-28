package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import TelecomUpskillWeek3.Utility.Scroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  TelecomUpskillWeek3.Utility.*;


public class Homepage extends Setup {
    @FindBy(xpath = "//strong[contains(text(),'Welcome to your software automation practice websi')]")
    public WebElement header;
    @FindBy(xpath = "(//a[normalize-space()='Form Fields'])[1]")
    private WebElement formsField;
    @FindBy(linkText = "Calendars")
    private WebElement calenders;
    @FindBy(xpath = "//a[normalize-space()='Popups']" )
    private WebElement popups;
    @FindBy(xpath = "//a[normalize-space()='Tables']")
    private WebElement tables;
    @FindBy(xpath = "//a[normalize-space()='Window Operations']")
    private WebElement windowsOperators;
    @FindBy(xpath = "//a[normalize-space()='Modals']")
    private WebElement models;
    @FindBy(xpath = "//a[normalize-space()='File Download']")
    private WebElement fileDownloads;
    @FindBy (xpath = "//a[normalize-space()='File Upload']")
    private WebElement fileUploads;
    @FindBy (xpath = "//a[normalize-space()='Iframes']")
    private WebElement iframes;
    @FindBy (xpath = "//a[normalize-space()='Sliders']")
    private WebElement sliders;

        private WebDriver driver;
        public Homepage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public boolean ValidateHomePage() {
            return header.isDisplayed();
        }
    public FormPage clickOnForms(){
        formsField.click();
        return new FormPage(driver);

    }
    public PopupPage PopUps(){
            popups.click();
            return new PopupPage(driver);

    }

    public CalendarPage Calender(){
            Scroll.ScrollIntoView(calenders);
            wait.waitForElement(calenders);
            calenders.click();
            return new CalendarPage(driver);

    }


    public ModelsPage Models(){
            models.click();
            return new ModelsPage(driver);

    }

    public TablesPage Tables(){
            Scroll.ScrollIntoView(tables);
            wait.waitForElement(tables);
            tables.click();
            return new TablesPage(driver);

    }

    public WindowsOperationsPage WindowsOperations()  {
        Scroll.ScrollIntoView(windowsOperators);
        wait.waitForElement(windowsOperators);
            windowsOperators.click();
            return new WindowsOperationsPage(driver);

    }

    public FileUploadsPage FileUploads(){
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(popups);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 800)
                        .click(fileUploads)
                                .perform();
        return new FileUploadsPage(driver);

    }
   public DownloadsPage Downloads(){
        Scroll.ScrollIntoView(fileDownloads);
        wait.waitForElement(fileDownloads);
        fileDownloads.click();
        return new DownloadsPage(driver);
    }
    public IframesPage Iframes(){
        Scroll.ScrollIntoView(iframes);
        wait.waitForElement(iframes);
        iframes.click();
        return new IframesPage(driver);

    }
    public SliderPage Slider() {
        Scroll.ScrollIntoView(sliders);
        wait.waitForElement(sliders);
        sliders.click();
        return new SliderPage(driver);
    }
}
