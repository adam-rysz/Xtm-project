package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Zadanie2Locators
{
    @FindBy(css = "a[href*='academy/']:nth-of-type(1)")
    private WebElement openAcademy;


    public WebElement getOpenAcademy() {
        return openAcademy;
    }

    public void setOpenAcademy(WebElement openAcademy) {
        this.openAcademy = openAcademy;
    }

    @FindBy(css = "a[href*='knowledge-base/']:nth-of-type(1)")
    private WebElement knowledgeBase;

    public WebElement getKnowledgeBase() {
        return knowledgeBase;
    }

    public void setKnowledgeBase(WebElement knowledgeBase) {
        this.knowledgeBase = knowledgeBase;
    }

    @FindBy(xpath = "//li[@id='menu-item-5037']//a[normalize-space()='Documentation']")
    private WebElement Documentation;

    public WebElement getDocumentation() {
        return Documentation;
    }

    @FindBy(xpath = "//a[contains(text(),'XTM Manual')]")
    private WebElement xtmFile;

    public void setDocumentation(WebElement documentation) {
        Documentation = documentation;
    }

    public WebElement getXtmFile() {
        return xtmFile;
    }

    public void setXtmFile(WebElement xtmFile) {
        this.xtmFile = xtmFile;
    }
}


