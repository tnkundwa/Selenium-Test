package dropdown;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.testng.annotations.*;

import pages.DropdownPage;
import testautomationu.BaseTests;

public class DropdownTests extends BaseTests{

    @Test
    public void testDropdown(){
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.selectEverything("Friday");
        dropdownPage.selectEverythingMulti("Texas");
        dropdownPage.clickFirstSelectedButton();
        dropdownPage.selectEverythingMulti("Washington");
        dropdownPage.clickLastSelectButton();
        assertEquals("Incorrect number of selections", 1, dropdownPage.getSelectedOptions().size());
        assertTrue("Option not selected", dropdownPage.getSelectedOptions().contains("Friday"));
        assertEquals("Incorrect option", "Day selected :- Friday", dropdownPage.getSelectedOptionText());
        assertEquals("Option selected incorrect!", "First selected option is : Texas", dropdownPage.getFirstOption());
        assertTrue("Option selected incorrect!", dropdownPage.getLastOption().contains("Washington"));
    }
}
