package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;
    private By closeLink = By.xpath("//p[text()='Close']");
    private By entryAdHeader = By.cssSelector("#content >div >h3");
    private By restartLink = By.id("restart-ad");
    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickClose(){
        driver.findElement(closeLink).click();
    }
    public String getHeaderText(){
        return driver.findElement(entryAdHeader).getText();
    }
    public void clickRestartLink(){
        driver.findElement(restartLink).click();
    }

}