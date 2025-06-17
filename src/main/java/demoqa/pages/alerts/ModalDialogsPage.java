package demoqa.pages.alerts;

import org.openqa.selenium.By;

public class ModalDialogsPage extends AlertsAndFrameWindowsPage{

    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModal(){
        click(smallModalButton);

    }

    public String getSmallModalText(){
        return find(smallModalButton).getText();
    }

    public void clickCloseButton(){
        click(closeButton);
    }
}
