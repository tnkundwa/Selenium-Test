package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By divContainer = By.xpath(".//div[@class = 's__column m-15']");
    private By divtext = By.xpath(".//p[text() = 'Hover']");
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    public void hoverOver(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(divContainer)).perform();    
    }
    public String checkText(){
        hoverOver();
        return driver.findElement(divtext).getText();
    }
    
}
