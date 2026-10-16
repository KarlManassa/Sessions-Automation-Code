package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By alertButton = By.xpath("//button[contains(.,'Alert')]");
    private By confirmButton = By.xpath("//button[contains(.,'Confirm')]");
    private By promptButton = By.xpath("//button[contains(.,'Prompt')]");
    private By resultMessage = By.id("result");
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickJSAlert(){
        driver.findElement(alertButton).click();
    }

    public void clickJSConfirm(){
        driver.findElement(confirmButton).click();
    }

    public void clickJSPrompt(){
        driver.findElement(promptButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void dismissConfirm(){
        driver.switchTo().alert().dismiss();
    }

    public void setPromptText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResultMessage(){
        return driver.findElement(resultMessage).getText();
    }

}
