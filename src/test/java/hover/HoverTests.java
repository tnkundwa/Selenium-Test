package hover;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.HoversPage;
import testautomationu.BaseTests;

public class HoverTests extends BaseTests{

    @Test
    public void testHover(){
        HoversPage hoversPage = homePage.clickHoversPage();
        hoversPage.hoverOver();
        assertEquals("Invalid text", "Hover", hoversPage.checkText());
    }
}
