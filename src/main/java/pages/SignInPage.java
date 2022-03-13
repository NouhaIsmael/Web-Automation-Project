package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    private WebDriver driver;

private By RegisterNowButton = By.linkText("Register Now!");

    public SignInPage(WebDriver driver){
        this.driver=driver;
    }

    public void USERNAMEFIELD (String username) throws InterruptedException {
        Thread.sleep(500);
    // driver.findElement(By.id("stripes-1791154865")).sendKeys(username);
       //driver.findElement(By.xpath("//input[@id='stripes-1791154865']")).sendKeys(username);
        driver.findElement(By.name("username")).sendKeys(username);
    }

    public void PASSWORDFIELD (String password){

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);}


    public JpetsHomePage CLICKLOGINBUTTON (){

        try {
            driver.findElement(By.name("signon")).click();
        }
        catch(NoSuchWindowException n){}

        return new JpetsHomePage(driver);
    }

    public RegisterPage ClickRegisterNowLink(){
        driver.findElement(RegisterNowButton).click();
        return new RegisterPage(driver);
    }





}
