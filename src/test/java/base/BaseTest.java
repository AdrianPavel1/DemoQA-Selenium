package base;

import com.BasePage.BasePage;
import demoqa.pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;


import static utilities.Utility.setUtilityDriver;

public class BaseTest extends BasePage{
    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com";

    @BeforeClass
    //driver setup
    public void setUp(){
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void loadApplication(){
    driver.get(DEMOQA_URL);
    basePage = new BasePage();
    basePage.setDriver(driver);
    setUtilityDriver();
    homePage = new HomePage();
    }

    @AfterMethod
    public void takeFailResultScreenshot(ITestResult testResult){
        if(ITestResult.FAILURE == testResult.getStatus()){
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir")+
                    "/resources/screenshots/("+
                    java.time.LocalDate.now() +
                    testResult.getName() + ".png");
            try{
                FileHandler.copy(source,destination);
            }catch(IOException e){
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located At " + destination);
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
