package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUpload = By.id("file");
    private By displayField = By.id("error");
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void uploadFile(String path){
        driver.findElement(fileUpload).sendKeys(path);
    }
    public String successMessage(){
        return driver.findElement(displayField).getText();
    }
}
