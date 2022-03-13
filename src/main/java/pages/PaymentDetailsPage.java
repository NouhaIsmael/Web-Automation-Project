package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PaymentDetailsPage {

    private WebDriver driver;


    public PaymentDetailsPage (WebDriver driver){
        this.driver=driver;
    }

    public void ChangeCardType(){
        Select selectcardtype = new Select(
                driver.findElement(By.name("order.cardType")));
        selectcardtype.selectByValue("MasterCard"); //Value - MasterCard//
    }

    public void ChangeCardNumber(String NewCardNumber){

        driver.findElement(By.name("order.creditCard")).clear();
        driver.findElement(By.name("order.creditCard")).sendKeys(NewCardNumber);
    }

    public ConfrimingTheInfoPage ClickContinueButton(){
        driver.findElement(By.name("newOrder")).click();
        return new ConfrimingTheInfoPage(driver);
    }





}
