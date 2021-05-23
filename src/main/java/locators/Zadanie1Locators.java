package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Zadanie1Locators {

    @FindBy(css ="a[href*='pricing/']:nth-of-type(1)")
    private WebElement pricing;

    public WebElement getPricing() {
        return pricing;
    }

    public void setPricing(WebElement pricing) {
        this.pricing = pricing;
    }

    @FindBy(xpath = "//a[normalize-space()='Calculator']")
    private WebElement calculator;

    public WebElement getCalculator() {
        return calculator;
    }

    public void setCalculator(WebElement calculator) {
        this.calculator = calculator;
    }

    @FindBy(className = "pricing-iframe")
    private WebElement iframe;

    public WebElement getIframe() {
        return iframe;
    }

    public void setIframe(WebElement iframe) {
        this.iframe = iframe;
    }

    @FindBy(xpath = "//*[@id=\"new-xtm-subscription-form\"]/div/div/fieldset[1]/div/div[1]/div[1]/div/span[1]/span[1]/span")
    private WebElement accountType;


    public WebElement getAccountType() {
        return accountType;
    }

    public void setAccountType(WebElement accountType) {
        this.accountType = accountType;
    }

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElement setAccountType;

    public WebElement getSetAccountType() {
        return setAccountType;
    }

    public void setSetAccountType(WebElement setAccountType) {
        this.setAccountType = setAccountType;
    }

    @FindBy(xpath = "/html/body/div/section/div/form/div/div/fieldset[1]/div/div[1]/div[2]/div/span[1]/span[1]/span/span[1]")
    private WebElement noOfUsers;


    public WebElement getNoOfUsers() {
        return noOfUsers;
    }

    public void setNoOfUsers(WebElement noOfUsers) {
        this.noOfUsers = noOfUsers;
    }

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElement inputNoOfUsers;

    public WebElement getInputNoOfUsers() {
        return inputNoOfUsers;
    }

    public void setInputNoOfUsers(WebElement inputNoOfUsers) {
        this.inputNoOfUsers = inputNoOfUsers;
    }

    @FindBy(xpath = "/html/body/div/section/div/form/div/div/fieldset[1]/div/div[2]/div[1]/div/span[1]/span[1]/span")
    private WebElement duration;

    public WebElement getDuration() {
        return duration;
    }

    public void setDuration(WebElement duration) {
        this.duration = duration;
    }

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElement inputDuration;

    public WebElement getInputDuration() {
        return inputDuration;
    }

    public void setInputDuration(WebElement inputDuration) {
        this.inputDuration = inputDuration;
    }

    @FindBy(xpath = "/html/body/div/section/div/form/div/div/fieldset[2]/div/div/div[1]/ul/li[2]/label")
    private WebElement euro;

    public WebElement getEuro() {
        return euro;
    }

    public void setEuro(WebElement euro) {
        this.euro = euro;
    }

    @FindBy(xpath = "/html/body/div/section/div/form/div/div/fieldset[2]/div/div/div[1]/ul/li[3]/label")
    private WebElement dollars;

    public WebElement getDollars() {
        return dollars;
    }

    public void setDollars(WebElement dollars) {
        this.dollars = dollars;
    }

    @FindBy(css = ".total-cost>p>span")
    private WebElement result;

    public WebElement getResult() {
        return result;
    }

    public void setResult(WebElement result) {
        this.result = result;
    }
}