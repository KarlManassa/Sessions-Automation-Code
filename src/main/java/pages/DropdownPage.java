package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {

    private WebDriver driver;
    private By dropdownLocator = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for(WebElement element : selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdownLocator));
    }
}