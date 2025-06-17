package tests.modals;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {

    @Test
    public void modalTest(){

        var modalTestPage = homePage.goToAlertsWindowsPage().clickModalDialogs();
        modalTestPage.clickSmallModal();
        String actualResponse = modalTestPage.getSmallModalText();

        Assert.assertTrue(actualResponse.contains("Small modal"),
                "\n The message does not contain small modal\n"
                        +"Actual response:"  + actualResponse);
        modalTestPage.clickCloseButton();
    }

}
