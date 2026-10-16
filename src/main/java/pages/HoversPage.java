package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By figureCaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * method hovers over a figure of 3
     * @param index 1-based
     */
    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index - 1);

        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", figure);

        WebElement captionElement = figure.findElement(figureCaption);
        js.executeScript("arguments[0].style.display = 'block';", captionElement);

        return new FigureCaption(captionElement);
    }

    public static class FigureCaption {
        private WebElement caption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getName(){
            return caption.findElement(name).getText();
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }

        public String getLinkURL(){
            return caption.findElement(link).getAttribute("href");
        }
    }
}