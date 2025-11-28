package dynamicload;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.DynamicLoadingPage;
import testautomationu.BaseTests;

public class DynamicLoadingTests extends BaseTests{

    @Test
    public void testDynamicLoad(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        dynamicLoadingPage.clickButton();
        assertTrue("Image not available", dynamicLoadingPage.getImage());
    }
}
