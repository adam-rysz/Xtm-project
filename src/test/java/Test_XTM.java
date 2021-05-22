import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;

public class Test_XTM {
    private WebDriver driver;

    @Before
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://xtm.cloud/");
        driver.manage().window().maximize();

    }

    @Test
    public void zadanie1() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        Actions action = new Actions(driver);
        WebElement pricing = driver.findElement(By.cssSelector("a[href*='pricing/']:nth-of-type(1)"));
        action.moveToElement(pricing).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Calculator']")));

        WebElement calculator = driver.findElement(By.xpath("//a[normalize-space()='Calculator']"));
        calculator.click();

        Thread.sleep(3000);

        WebElement frame = driver.findElement(By.className("pricing-iframe"));

        driver.switchTo().frame(frame);

        WebElement typ = driver.findElement(By.xpath("//*[@id=\"new-xtm-subscription-form\"]/div/div/fieldset[1]/div/div[1]/div[1]/div/span[1]/span[1]/span"));
        typ.click();

        WebElement wybor = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        wybor.sendKeys("Enterpri");
        wybor.sendKeys(Keys.ENTER);

        WebElement typ2 = driver.findElement(By.xpath("/html/body/div/section/div/form/div/div/fieldset[1]/div/div[1]/div[2]/div/span[1]/span[1]/span/span[1]"));
        typ2.click();

        WebElement noOfUsers = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        noOfUsers.sendKeys("7");
        noOfUsers.sendKeys(Keys.ENTER);

        WebElement duration = driver.findElement(By.xpath("/html/body/div/section/div/form/div/div/fieldset[1]/div/div[2]/div[1]/div/span[1]/span[1]/span"));
        duration.click();

        WebElement wybor2 = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        wybor2.sendKeys("3");
        wybor2.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.textToBe(By.cssSelector(".total-cost>p>span"), "£1 065,00"));

        String totalCost = driver.findElement(By.cssSelector(".total-cost>p>span")).getText();

        Assert.assertEquals(totalCost, "£1 065,00");
        System.out.println("Wynik asercji poprawny");

    }

    @Test
    public void zadanie1Euro() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        Actions action = new Actions(driver);
        WebElement pricing = driver.findElement(By.cssSelector("a[href*='pricing/']:nth-of-type(1)"));
        action.moveToElement(pricing).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Calculator']")));

        WebElement calculator = driver.findElement(By.xpath("//a[normalize-space()='Calculator']"));
        calculator.click();

        Thread.sleep(2000);

        WebElement frame = driver.findElement(By.className("pricing-iframe"));

        driver.switchTo().frame(frame);

        WebElement typ = driver.findElement(By.xpath("//*[@id=\"new-xtm-subscription-form\"]/div/div/fieldset[1]/div/div[1]/div[1]/div/span[1]/span[1]/span"));
        typ.click();

        WebElement wybor = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        wybor.sendKeys("Enterpri");
        wybor.sendKeys(Keys.ENTER);

        WebElement typ2 = driver.findElement(By.xpath("/html/body/div/section/div/form/div/div/fieldset[1]/div/div[1]/div[2]/div/span[1]/span[1]/span/span[1]"));
        typ2.click();

        WebElement noOfUsers = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        noOfUsers.sendKeys("7");
        noOfUsers.sendKeys(Keys.ENTER);

        WebElement duration = driver.findElement(By.xpath("/html/body/div/section/div/form/div/div/fieldset[1]/div/div[2]/div[1]/div/span[1]/span[1]/span"));
        duration.click();

        WebElement wybor2 = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        wybor2.sendKeys("3");
        wybor2.sendKeys(Keys.ENTER);

        Thread.sleep(1000);

        WebElement euro = driver.findElement(By.xpath("/html/body/div/section/div/form/div/div/fieldset[2]/div/div/div[1]/ul/li[2]/label"));
        euro.click();

        wait.until(ExpectedConditions.textToBe(By.cssSelector(".total-cost>p>span"), "€1 214,10"));

        String totalCost = driver.findElement(By.cssSelector(".total-cost>p>span")).getText();

        Assert.assertEquals(totalCost, "€1 214,10");
        System.out.println("Wynik asercji poprawny");
    }

    @Test
    public void zadanie1Dolary() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        Actions action = new Actions(driver);
        WebElement pricing = driver.findElement(By.cssSelector("a[href*='pricing/']:nth-of-type(1)"));
        action.moveToElement(pricing).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Calculator']")));

        WebElement calculator = driver.findElement(By.xpath("//a[normalize-space()='Calculator']"));
        calculator.click();

        Thread.sleep(2000);

        WebElement frame = driver.findElement(By.className("pricing-iframe"));

        driver.switchTo().frame(frame);

        WebElement typ = driver.findElement(By.xpath("//*[@id=\"new-xtm-subscription-form\"]/div/div/fieldset[1]/div/div[1]/div[1]/div/span[1]/span[1]/span"));
        typ.click();

        WebElement wybor = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        wybor.sendKeys("Enterpri");
        wybor.sendKeys(Keys.ENTER);

        WebElement typ2 = driver.findElement(By.xpath("/html/body/div/section/div/form/div/div/fieldset[1]/div/div[1]/div[2]/div/span[1]/span[1]/span/span[1]"));
        typ2.click();

        WebElement noOfUsers = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        noOfUsers.sendKeys("7");
        noOfUsers.sendKeys(Keys.ENTER);

        WebElement duration = driver.findElement(By.xpath("/html/body/div/section/div/form/div/div/fieldset[1]/div/div[2]/div[1]/div/span[1]/span[1]/span"));
        duration.click();

        WebElement wybor2 = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        wybor2.sendKeys("3");
        wybor2.sendKeys(Keys.ENTER);

        Thread.sleep(1000);

        WebElement dolary = driver.findElement(By.xpath("/html/body/div/section/div/form/div/div/fieldset[2]/div/div/div[1]/ul/li[3]/label"));
        dolary.click();

        wait.until(ExpectedConditions.textToBe(By.cssSelector(".total-cost>p>span"), "$1 533,60"));

        String totalCost = driver.findElement(By.cssSelector(".total-cost>p>span")).getText();

        Assert.assertEquals(totalCost, "$1 533,60");
        System.out.println("Wynik asercji poprawny");
    }

    @Test
    public void zadanie2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        Actions action = new Actions(driver);
        WebElement academy = driver.findElement(By.cssSelector("a[href*='academy/']:nth-of-type(1)"));
        action.moveToElement(academy).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href*='knowledge-base/']:nth-of-type(1)")));

        WebElement konwledgeBase = driver.findElement(By.cssSelector("a[href*='knowledge-base/']:nth-of-type(1)"));
        konwledgeBase.click();

        Thread.sleep(2000);

        WebElement documentation = driver.findElement(By.xpath("//li[@id='menu-item-5037']//a[normalize-space()='Documentation']"));
        documentation.click();

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'XTM Manual')]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", element);

        Thread.sleep(32000);

    }

        @After
        public void tearDown()
        {
            //driver.quit();

            File dir = new File("C:\\Users\\NBARYSZKOWSKI\\Downloads");
            File[] dirContents = dir.listFiles();

            for (File plik : dirContents){
                if (plik.isFile()){
                    if (plik.getName().contains("xtm-manual")){
                        System.out.println("Plik xtm-manual pobrano.");
                    }
                }
            }
        }
    }




