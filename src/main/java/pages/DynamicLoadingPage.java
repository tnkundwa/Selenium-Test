package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By getUserButton = By.id("save");
    private By userData = By.cssSelector("#loading img");
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickButton(){
        driver.findElement(getUserButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userData));
    }
    public Boolean getImage(){
        clickButton();
        return driver.findElement(userData).isEnabled();
    }
}
