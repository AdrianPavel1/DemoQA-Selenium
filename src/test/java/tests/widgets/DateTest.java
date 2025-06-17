package tests.widgets;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateTest extends BaseTest {

    @Test
    public void checkDate(){
        String day = "5";
        String month = "January";
        String year = "2034";
        String monthNumber = "1";

        var datePage = homePage.goToWidgets().clickDatePickerMenu();
        datePage.clickOnInput();
        datePage.selectMonth(month);
        datePage.selectYear(year);
        datePage.clickDay(day);

        String actualResponse = datePage.getDate();
        String expectedResponse = String.format(
                "%02d/%02d/%s",
                Integer.parseInt(monthNumber),
                Integer.parseInt(day),
                year
        );
        Assert.assertEquals(actualResponse,expectedResponse,"Response is not correct"
                +"Expected: "+ expectedResponse
                +"And got:" + actualResponse);
    }
}
