package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlerts(){
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}