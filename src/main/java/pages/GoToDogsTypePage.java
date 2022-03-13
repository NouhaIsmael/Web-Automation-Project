package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class GoToDogsTypePage {

    private WebDriver driver;

    public GoToDogsTypePage (WebDriver driver){

        this.driver=driver;
    }

    // Poodle //
    public GoToDalmationDogPage ClickToChooseDogType(){
        driver.findElement(By.linkText("K9-DL-01")).click();
        return new GoToDalmationDogPage (driver);
    }



}
