package pages;

import locators.Zadanie1Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadanie1 {

    WebDriver driver;
    WebDriverWait wait;
    Zadanie1Locators zadanie1Locators;


    public Zadanie1(WebDriver driver)
    {
        this.driver = driver;
        zadanie1Locators = new Zadanie1Locators();
        PageFactory.initElements(driver, zadanie1Locators);
        wait = new WebDriverWait(driver, 10);

    }

    public void pricing()
    {
        Actions action = new Actions(driver);
        action.moveToElement(zadanie1Locators.getPricing()).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Calculator']")));
    }

    public void calculator()
    {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Calculator']")));
    zadanie1Locators.getCalculator().click();
    }

    public void switchToIframe()
    {
        driver.switchTo().frame(zadanie1Locators.getIframe());
    }

    public void selectAccountType(String type)
    {
       zadanie1Locators.getAccountType().click();
       zadanie1Locators.getSetAccountType().click();
       zadanie1Locators.getSetAccountType().sendKeys(type);
       zadanie1Locators.getSetAccountType().sendKeys(Keys.ENTER);

    }

    public void selectNoOfUsers(String users)
    {
        zadanie1Locators.getNoOfUsers().click();
        zadanie1Locators.getInputNoOfUsers().click();
        zadanie1Locators.getInputNoOfUsers().sendKeys(users);
        zadanie1Locators.getInputNoOfUsers().sendKeys(Keys.ENTER);
    }

    public void selectDuration(String duration)
    {
        zadanie1Locators.getDuration().click();
        zadanie1Locators.getInputDuration().click();
        zadanie1Locators.getInputDuration().sendKeys(duration);
        zadanie1Locators.getInputDuration().sendKeys(Keys.ENTER);
    }

    public void euro()
    {
        zadanie1Locators.getEuro().click();
    }

    public void dollars()
    {
        zadanie1Locators.getDollars().click();
    }

}
