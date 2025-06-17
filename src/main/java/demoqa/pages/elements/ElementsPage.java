package demoqa.pages.elements;

import demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By linksButton = By.xpath("//ul[@class='menu-list']/li[@id='item-5']/span[text()='Links']");
    private By tablesButton = By.xpath("//ul[@class='menu-list']/li[@id='item-3']/span[text()='Web Tables']");

    public LinksPage clickLinks(){
        scrollToElementJS(linksButton);
        click(linksButton);
        return new LinksPage();
    }

    public TablesPage clickTables(){
        scrollToElementJS(tablesButton);
        click(tablesButton);
        return new TablesPage();
    }
}
