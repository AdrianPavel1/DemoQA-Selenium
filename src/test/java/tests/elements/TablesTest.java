package tests.elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TablesTest extends BaseTest {

    @Test
    public void checkTables(){
        String email ="alden@example.com";
        String expectedAge = "24";

        var webTablePage = homePage.goToElements().clickTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("24");
        webTablePage.clickSubmitButton();
        String actualResponse = webTablePage.getTableAge(email);
        Assert.assertEquals(actualResponse,expectedAge);
    }
}
