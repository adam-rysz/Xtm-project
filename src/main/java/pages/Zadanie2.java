package pages;

import locators.Zadanie2Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadanie2 {
    WebDriver driver;
    WebDriverWait wait;
    Zadanie2Locators zadanie2Locators;

    public Zadanie2(WebDriver driver) {

        this.driver = driver;
        zadanie2Locators = new Zadanie2Locators();
        PageFactory.initElements(driver, zadanie2Locators);
        wait = new WebDriverWait(driver, 10);
    }

    public void openKnowledgeBase(){

        Actions action = new Actions(driver);
        action.moveToElement(zadanie2Locators.getOpenAcademy()).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href*='knowledge-base/']:nth-of-type(1)")));
        zadanie2Locators.getKnowledgeBase().click();
    }

    public void downloadDocumentation(){

        zadanie2Locators.getDocumentation().click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", zadanie2Locators.getXtmFile());
    }

}
