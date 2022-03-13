package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    public void USERINFO (String UserID, String NewPass , String RepeatPass){
        driver.findElement(By.name("username")).sendKeys(UserID);
        driver.findElement(By.name("password")).sendKeys(NewPass);
        driver.findElement(By.name("repeatedPassword")).sendKeys(RepeatPass);
    }

   public void ACCOUNTINFO(String Fname ,String Lname , String Email ,
                            String Phone , String Add1 , String Add2 , String City
    ,String State , String Zip , String Country ) {

        driver.findElement(By.name("account.firstName")).sendKeys(Fname);
        driver.findElement(By.name("account.lastName")).sendKeys(Lname);
        driver.findElement(By.name("account.email")).sendKeys(Email);
        driver.findElement(By.name("account.phone")).sendKeys(Phone);
        driver.findElement(By.name("account.address1")).sendKeys(Add1);
        driver.findElement(By.name("account.address2")).sendKeys(Add2);
        driver.findElement(By.name("account.city")).sendKeys(City);
        driver.findElement(By.name("account.state")).sendKeys(State);
        driver.findElement(By.name("account.zip")).sendKeys(Zip);
        driver.findElement(By.name("account.country")).sendKeys(Country);
    }

    public void LANGUAGEPREF(){
        Select language = new Select(driver.findElement
                (By.name("account.languagePreference")));
        language.selectByValue("english");
    }

    public void FAVORITECATEGORY(){
        Select language = new Select(driver.findElement
                (By.name("account.favouriteCategoryId")));
        language.selectByValue("DOGS");
    }

    public void ENABLEMYLIST(){
        driver.findElement(By.name("account.listOption")).click();
    }

    public void ENABLEMYBANNER(){
        driver.findElement(By.name("account.bannerOption")).click();
    }

    public JpetsHomePage CLICKONSAVEACCOUNTINFOBUTTON(){
        driver.findElement(By.name("newAccount")).click();
        return new JpetsHomePage(driver);
    }

}
