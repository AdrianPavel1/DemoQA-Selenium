package demoqa.pages;
//homePage contains methods for going to a certain page
import com.BasePage.BasePage;
import demoqa.pages.alerts.AlertsAndFrameWindowsPage;
import demoqa.pages.elements.ElementsPage;
import demoqa.pages.forms.FormsPage;
import demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertsCard = By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public AlertsAndFrameWindowsPage goToAlertsWindowsPage(){
        scrollToElementJS(alertsCard);
        click(alertsCard);
        return new AlertsAndFrameWindowsPage();
    }
}
