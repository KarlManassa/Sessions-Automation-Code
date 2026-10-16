package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import pages.HomePage;

public class BaseTests {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}