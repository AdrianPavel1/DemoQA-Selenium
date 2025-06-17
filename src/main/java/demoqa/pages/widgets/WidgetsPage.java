package demoqa.pages.widgets;

import demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;


public class WidgetsPage extends HomePage {

    private By selectMenu = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private By selectDatePicker = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");

    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenu);
        click(selectMenu);
        return new SelectMenuPage();
    }

    public DatePicker clickDatePickerMenu(){
        scrollToElementJS(selectDatePicker);
        click(selectDatePicker);
        return new DatePicker();
    }
}
