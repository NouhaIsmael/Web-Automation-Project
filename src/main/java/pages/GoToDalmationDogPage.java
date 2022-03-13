package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToDalmationDogPage {

    private WebDriver driver;

    public GoToDalmationDogPage(WebDriver driver){

        this.driver=driver;
    }

    public SpottedAdultFemaleDalmationDescriptionPage CHOOSEMALEPUPPY(){
        driver.findElement(By.linkText("EST-10")).click();
        return new SpottedAdultFemaleDalmationDescriptionPage(driver);

    }


}
