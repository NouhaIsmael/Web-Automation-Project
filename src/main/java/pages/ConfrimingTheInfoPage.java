package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfrimingTheInfoPage {


    private WebDriver driver;

    public ConfrimingTheInfoPage (WebDriver driver){
        this.driver=driver;
    }

    public ThankYouPage ClickConfirmToCheckOut(){
        driver.findElement(By.linkText("Confirm")).click();
        return new ThankYouPage(driver);
    }

}
