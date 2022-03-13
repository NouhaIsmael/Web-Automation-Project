package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.JpetsHomePage;
import java.util.concurrent.TimeUnit;

public class JpetsBase {

    private WebDriver driver;
    protected JpetsHomePage jhomepage;

    @BeforeClass
    public void SetUpBrowser(){

        System.setProperty("webdriver.driver.chrome","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.manage().window().maximize();
        jhomepage = new JpetsHomePage(driver);
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
    }

     @AfterClass
     public void Quit(){
        driver.quit();}
}
