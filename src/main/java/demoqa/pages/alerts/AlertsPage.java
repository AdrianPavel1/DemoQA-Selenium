package demoqa.pages.alerts;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.SwitchToUtility.acceptAlert;

public class AlertsPage extends AlertsAndFrameWindowsPage{

    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");
    private By promptAlertButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");


    public void clickOnTheFirstAlertButton(){
        scrollToElementJS(informationAlertButton);
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton(){
        click(confirmationAlertButton);
    }

    public String getAlertText(){
        return getAlertText();
    }
}
