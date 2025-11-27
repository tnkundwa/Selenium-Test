// package testautomationu;

// import static org.junit.Assert.assertTrue;

// import org.junit.Test;

// /**
//  * Unit test for simple App.
//  */
// public class AppTest 
// {
//     /**
//      * Rigorous Test :-)
//      */
//     @Test
//     public void shouldAnswerWithTrue()
//     {
//         assertTrue( true );
//     }
// }
package testautomationu;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void shouldOpenGoogle() {
        // --- 1. Set up ChromeOptions (Optional, but good practice) ---
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in the background (no UI visible)
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        // --- 2. Initialize WebDriver ---
        String driverPath = System.getProperty("user.dir") + "\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver(options);

        try {
            // --- 3. Execute Actions ---
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            
            // --- 4. Verify (Assertion) ---
            System.out.println("Page Title: " + title);
            assertTrue("Title should contain 'Google'", title.contains("Google"));

        } finally {
            // --- 5. Clean up ---
            if (driver != null) {
                driver.quit(); // Closes the browser and ends the session
            }
        }
    }
}
