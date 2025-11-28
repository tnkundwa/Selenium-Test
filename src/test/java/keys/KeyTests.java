package keys;

import org.testng.annotations.Test;

import pages.KeysPressPage;
import testautomationu.BaseTests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;

public class KeyTests extends BaseTests{

    @Test
    public void testKeyPresses(){
        KeysPressPage keysPressPage = homePage.clicKeysPress();
        String text = "h";
        keysPressPage.enterText(text);
        assertEquals("Wrong text!", "You entered: " + text.toUpperCase(), keysPressPage.getText());
    }

    @Test
    public void testBackspace(){
        KeysPressPage keysPressPage = homePage.clicKeysPress();
        String text = "h";
        keysPressPage.enterText(text + Keys.BACK_SPACE);
        assertEquals("Wrong text!", "You entered: BACK_SPACE", keysPressPage.getText());
    }
}
