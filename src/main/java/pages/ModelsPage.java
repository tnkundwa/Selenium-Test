package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModelsPage {
    private WebDriver driver;
    private By launchModelButton = By.xpath(".//button[text() = 'Launch Modal']");
    private By modelText = By.className("modal-body");
    private By closeButton = By.className("btn");
    public ModelsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickButton(int index){
        WebElement allLaunchButtons = driver.findElements(launchModelButton).get(index - 1);
        allLaunchButtons.click();
    }

    public String getBodyText(){
        return driver.findElement(modelText).getText();
    }
    
    public void closeModel(){
        driver.findElement(closeButton).click();
    }
}
