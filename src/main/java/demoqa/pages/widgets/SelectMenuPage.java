package demoqa.pages.widgets;

import org.openqa.selenium.By;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends  WidgetsPage{
    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String text){
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect,text);
    }

    public void deselectStandartMulti(String value){
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect,value);
    }

    public List<String> getAllSelectedStandartMultiOptions(){
        return getAllSelectedOptions(standardMultiSelect);
    }

}
