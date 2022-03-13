package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage {

    private WebDriver driver;

    public ThankYouPage (WebDriver driver){
        this.driver=driver;
    }

    public String GetConfirmationMsg(){
       return driver.findElement(By.className("messages")).getText();
    }

    public JpetsHomePage ClickOnReturnToMainMenuLink(){
        driver.findElement(By.linkText("Return to Main Menu")).click();
    return new JpetsHomePage(driver);
    }
}
