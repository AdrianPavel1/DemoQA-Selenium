package demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage{

    private By badRequestButton = By.id("bad-request");
    private By linkResponse = By.id("linkResponse");

    public void clickBadRequestLink(){
        scrollToElementJS(badRequestButton);
        click(badRequestButton);
    }

    public String getResponse() {
        return find(linkResponse).getText();
    }
}
