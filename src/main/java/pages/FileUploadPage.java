package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUploadButton = By.id("file-upload");
    private By fileSubmitButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void uploadFile(String absoluteFilePath){
        driver.findElement(fileUploadButton).sendKeys(absoluteFilePath);
        clickSubmitButton();
    }
    private void clickSubmitButton(){
        driver.findElement(fileSubmitButton).click();
    }
    public String getUploadedFileName(){
        return driver.findElement(uploadedFiles).getText();
    }

}