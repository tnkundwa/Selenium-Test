package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModelsPage {
    private WebDriver driver;
    private By launchModelButton = By.xpath(".//button[text() = 'Launch Modal']");
    private By modelText = By.cssSelector(".modal-body p");
    private By closeButton = By.xpath(".//button[text() = 'Close']");
    public ModelsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickButton(int index){
        driver.findElements(launchModelButton).get(index - 1).click();
    }

    public String getBodyText(){
        return driver.findElement(modelText).getText();
    }
    
    public void closeModel(){
        driver.findElement(closeButton).click();
    }
}
