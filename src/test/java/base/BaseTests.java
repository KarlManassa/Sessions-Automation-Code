package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup(){
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

        driver.quit();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}