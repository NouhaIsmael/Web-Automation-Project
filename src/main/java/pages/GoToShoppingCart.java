package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToShoppingCart {

    private WebDriver driver;

    private By NewChangedQuantity = By.xpath ("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input");
    private By ListPrice = By.xpath("//td[normalize-space()='$18.50']");
    private By TotalCost = By.cssSelector("tbody tr td:nth-child(7)");

    public GoToShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public void CHANGEQUANTITY(String NewQuantity) {
        driver.findElement (NewChangedQuantity).clear();
        driver.findElement (NewChangedQuantity).sendKeys(NewQuantity);
    }

    public void ClickOnUpdateCartToUpdateTheTotalCost() {
        driver.findElement(By.name("updateCartQuantities")).click();
    }

    // Method to read the Actual result //

    public String getTotalPrice() {
        return driver.findElement(TotalCost).getText();
    }

    public PaymentDetailsPage ClickProceedToCheckout(){
        driver.findElement(By.linkText("Proceed to Checkout")).click();
    return new PaymentDetailsPage(driver);
    }

}
