package pages;
//mvn test -Dtest=LoginTests


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public FormSubmitPage clickformSubmit(){
        clickAllLinks("Ajax Form Submit");
        return new FormSubmitPage(driver);
    }
    public DropdownPage clickDropdown(){
        clickAllLinks("Select Dropdown List");
        return new DropdownPage(driver);
    }

    private void clickAllLinks(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}


