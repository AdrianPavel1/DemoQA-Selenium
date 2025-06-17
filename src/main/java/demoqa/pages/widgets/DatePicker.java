package demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class DatePicker extends WidgetsPage{

    private By clickDateInput = By.id("datePickerMonthYearInput");
    private By clickMonthSelect = By.className("react-datepicker__month-select");
    private By clickYearSelect = By.className("react-datepicker__year-select");

    public void clickOnInput() {
        scrollToElementJS(clickDateInput);
        find(clickDateInput);
        click(clickDateInput);
    }

    public void selectMonth(String month){
        selectByVisibleText(clickMonthSelect,month);
    }

    public void selectYear(String year){
        selectByVisibleText(clickYearSelect,year);
    }

    private By dayValue(String day){
        return By.xpath(
                "//div[" +
                        "contains(@class,'react-datepicker__day')" +
                        " and text()='" + day + "'" +
                        " and not(contains(@class,'react-datepicker__day--outside-month'))" +
                        "]"
        );
    }

    public void clickDay(String day){
        click(dayValue(day));
    }

    public String getDate(){
        return find(clickDateInput).getAttribute("value");
    }
}
