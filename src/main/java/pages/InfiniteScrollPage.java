package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By paragraphs = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * @param index the number of paragraph to scroll to
     */
    public void scrollIntoParagraph(int index){
        var js = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0, document.body.scrollHeight);";
        while (getNumberOfParagraphs() < index){
            js.executeScript(script);
        }
    }

    public int getNumberOfParagraphs(){
        return driver.findElements(paragraphs).size();
    }
}