package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import java.util.stream.Collectors;

public class DropdownPage {
    WebDriver driver;
    private By dropdown = By.id("select-demo");
    private By mutliSelect = By.id("multi-select");
    private By selectedText = By.id("select-demo");
    private By firstSelectedButton = By.id("printMe");
    private By lastSelectedButon = By.id("printAll");
    private By firstOption = By.className("genderbutton");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    private Select selectFromDropdown(){
        return new Select(driver.findElement(dropdown));
    }
    public void selectEverything(String option){
        selectFromDropdown().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> options = selectFromDropdown().getAllSelectedOptions();
        return options.stream().map(e -> e.getText()).collect(Collectors.toList());
    }
    private Select selectFromMultiSelect(){
        return new Select(driver.findElement(mutliSelect));
    }
    public void selectEverythingMulti(String option){
        selectFromMultiSelect().selectByValue(option);
    }
    public void clickFirstSelectedButton(){
        driver.findElement(firstSelectedButton).click();
    }
    public void clickLastSelectButton(){
        driver.findElement(lastSelectedButon).click();
    }
    public String getSelectedOptionText(){
        return driver.findElement(selectedText).getText();
    }
    public String getFirstOption(){
        return driver.findElement(firstOption).getText();
    }

}
