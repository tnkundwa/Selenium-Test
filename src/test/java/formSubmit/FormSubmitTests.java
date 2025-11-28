package formSubmit;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.FormSubmitPage;
import testautomationu.BaseTests;

public class FormSubmitTests extends BaseTests{

    @Test
    public void testFormSubmit(){
        FormSubmitPage formSubmitPage = homePage.clickformSubmit();
        formSubmitPage.enterName("Nkundwa");
        formSubmitPage.enterMessage("I am trying out the first test!");
        formSubmitPage.clickSubmit();
        assertEquals("Your text doesn't match!", "Ajax Request is Processing!", formSubmitPage.getConfirmText());
    }

}
