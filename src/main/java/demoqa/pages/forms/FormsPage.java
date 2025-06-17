package demoqa.pages.forms;

import demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.JavaScriptUtility.scrollToElementJS;
public class FormsPage extends HomePage {
    //click on that button practice form

    private By practiceForm = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");
    public PracticeFormPage clickPracticeForm(){
        WebElement practice = find(practiceForm);
        scrollToElementJS(practiceForm);
        click(practiceForm);
        return new PracticeFormPage();
    }

}
