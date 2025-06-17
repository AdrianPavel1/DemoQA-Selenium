package tests.alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.acceptAlert;

public class AlertsTest extends BaseTest {

    @Test
    public void simpleAlertTesting(){
        var alertsPage = homePage.goToAlertsWindowsPage().clickAlertsPage();
        alertsPage.clickOnTheFirstAlertButton();
        String actualResult = alertsPage.getAlertText();
        String expectedAlertText = "You clicked a button";
        Assert.assertTrue(actualResult.contains("You clicked a button"), "\n The Alert does not contain desired message \n ");
        acceptAlert();
    }

}
