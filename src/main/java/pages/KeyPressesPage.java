package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultMessage = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void setText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResultMessage(){
        return driver.findElement(resultMessage).getText();
    }
}