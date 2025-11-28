package models;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
import testautomationu.BaseTests;
import pages.ModelsPage;

public class ModelTests extends BaseTests{

    @Test
    public void testModels(){
        ModelsPage modelsPage = homePage.clickModelsPage();
        modelsPage.clickButton(1);
        String bodyText = modelsPage.getBodyText();
        modelsPage.closeModel();
        assertEquals("The text is incorrect", "This is the place where the content for the modal dialog displays", bodyText);
    }
}
