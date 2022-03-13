package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpottedAdultFemaleDalmationDescriptionPage {


    private WebDriver driver;

    public SpottedAdultFemaleDalmationDescriptionPage(WebDriver driver){

        this.driver=driver;
    }

    public GoToShoppingCart ClickAddToCart(){
        driver.findElement(By.linkText("Add to Cart")).click();
        return new GoToShoppingCart(driver);
    }


}
