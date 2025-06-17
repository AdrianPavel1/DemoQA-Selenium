package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testCheckbox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();

        boolean isFemaleSelected = formsPage.isFemaleRadioButtonSelected();
        Assert.assertTrue(isFemaleSelected,"Female radio button is not selected");
    }
}
