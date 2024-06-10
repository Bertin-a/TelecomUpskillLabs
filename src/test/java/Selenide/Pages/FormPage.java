package Selenide.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class FormPage {

    public SelenideElement nameField(){
        return $(By.id("name"));
    }

  public ElementsCollection checkBox (){
        return $$("[type='checkbox']");
  }

  public ElementsCollection RadioBtn(){
        return $$("[type='radio']");
  }

    public SelenideElement Dropdown(){
        return $(By.id("siblings"));
    }
   public SelenideElement EmailField(){
        return $(By.id("email"));
   }
   public SelenideElement MessageField(){
        return $(By.id("message"));
   }
   public SelenideElement SubmitBtn(){
        return $(By.id("submit-btn"));
   }


}
