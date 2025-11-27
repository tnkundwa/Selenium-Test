package testautomationu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import pages.HomePage;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        // String projectRoot = System.getProperty("user.dir") + "\\javadriver_java";
        // System.setProperty("webdriver.chrome.driver", projectRoot + "\\resources\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        goHome();
        
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    
}
