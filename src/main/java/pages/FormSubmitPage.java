package pages;
import org.openqa.selenium.*;


public class FormSubmitPage {
    private WebDriver driver;
    private By nameField = By.id("title");
    private By messageField = By.id("description");
    private By submitButton = By.id("btn-submit");
    private By confirmText = By.id("submit-control");

    public FormSubmitPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterName(String text){
        driver.findElement(nameField).sendKeys(text);
    }

    public void enterMessage(String text){
        driver.findElement(messageField).sendKeys(text);
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }

    public String getConfirmText(){
        return driver.findElement(confirmText).getText();
    }

}
