package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelUtils {
    private WebDriver driver;
    public SelUtils(WebDriver driver){
        this.driver = driver;
    }
    public void selectFromDropdown(By dropdownLocator, String option){
        Select dropdown = new Select(driver.findElement(dropdownLocator));
        dropdown.selectByVisibleText(option);
    }
}