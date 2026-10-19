package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By ex1Link = By.partialLinkText("Example 1");
    private By ex2Link = By.partialLinkText("Example 2");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public Ex1Page clickEx1Link(){
        driver.findElement(ex1Link).click();
        return new Ex1Page(driver);
    }

    public Ex2Page clickEx2Link(){
        driver.findElement(ex2Link).click();
        return new Ex2Page(driver);
    }
}