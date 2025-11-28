package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeysPressPage {
    private WebDriver driver;
    private By textField = By.id("my_field");
    private By resultField = By.id("result");

    public KeysPressPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(textField).sendKeys(text);
    }

    public String getText(){
        return driver.findElement(resultField).getText();
    }
}
