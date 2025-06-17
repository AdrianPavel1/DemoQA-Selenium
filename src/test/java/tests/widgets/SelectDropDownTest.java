package tests.widgets;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void selectDropDown(){
        var selectMenu = homePage.goToWidgets().clickSelectMenu();
        selectMenu.selectStandardMulti("Volvo");
        selectMenu.selectStandardMulti("Audi");

        selectMenu.deselectStandartMulti("saab");
       List<String> actualSelectedOptions = selectMenu.getAllSelectedStandartMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
