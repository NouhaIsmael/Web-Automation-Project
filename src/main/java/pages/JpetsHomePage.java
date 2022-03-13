package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JpetsHomePage {

    private WebDriver driver;

    private By ClickSignInLink = By.linkText("Sign In");

    public JpetsHomePage(WebDriver driver){
        this.driver=driver;
    }

    public SignInPage ClickSignInLinktoRegister(){
        driver.findElement(ClickSignInLink).click();
        return new SignInPage(driver);
    }

    public GoToDogsTypePage ClickDogsIconLink (){
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
    return new GoToDogsTypePage(driver);
    }


    public void ClickSignOutButton(){
        driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
    }

}
