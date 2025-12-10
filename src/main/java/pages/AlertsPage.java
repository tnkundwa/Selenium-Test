package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage {
    private WebDriver driver;
    private By clickMeButton = By.xpath(".//button[text() = 'Click Me']"); 
    private By textField = By.id("confirm-demo");
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickButton(int index){
        driver.findElements(clickMeButton).get(index - 1).click();
    }

    public String getAlertText(){
        clickButton(1);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getAlertText2(){
        return driver.findElement(textField).getText();
    }
    public void cancelAlert(){
        clickButton(2);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
    }
}
