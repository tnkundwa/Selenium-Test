package alerts;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AlertsPage;
import testautomationu.BaseTests;

public class AlertTests extends BaseTests{

    @Test
    public void testAlerts(){
        AlertsPage alertsPage = homePage.clickAlertsPage();
        String text = alertsPage.getAlertText();
        alertsPage.acceptAlert();
        assertEquals("Option incorrect!", "I am an alert box!", text);
    }

    @Test
    public void testAlerts2(){
        AlertsPage alertsPage = homePage.clickAlertsPage();
        alertsPage.cancelAlert();
        assertEquals("Option incorrect!", "You pressed Cancel!", alertsPage.getAlertText2());
    }
}
