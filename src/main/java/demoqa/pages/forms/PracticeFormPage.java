package demoqa.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.JavaScriptUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;


public class PracticeFormPage extends FormsPage
{
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.xpath("//label[@for='hobbies-checkbox-1']");
    private By readingHobbyCheckbox = By.xpath("//label[@for='hobbies-checkbox-2']");
    private By musicHobbyCheckbox = By.xpath("//label[@for='hobbies-checkbox-3']");

    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected(){
        WebElement radio = driver.findElement(femaleRadioButton);
        return radio.isSelected();
    }

    public void clickSportsCheckbox(){
        WebElement checkbox = find(sportsHobbyCheckbox);
        boolean alreadySelected = checkbox.isSelected();
        if (!alreadySelected) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingCheckbox(){
        WebElement checkbox = find(readingHobbyCheckbox);
        boolean alreadySelected = checkbox.isSelected();
        if (!alreadySelected) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicCheckbox(){
        WebElement checkbox = find(musicHobbyCheckbox);
        boolean alreadySelected = checkbox.isSelected();
        if (!alreadySelected) {
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unclickReadingCheckbox(){
        WebElement checkbox = find(readingHobbyCheckbox);
        boolean alreadySelected = checkbox.isSelected();
        if (alreadySelected) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }

}
