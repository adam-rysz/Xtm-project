import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Zadanie1;
import pages.Zadanie2;

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
    public void zadanie1() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        Zadanie1 zadanie1 = new Zadanie1(driver);
        zadanie1.pricing();
        zadanie1.calculator();
        Thread.sleep(3000);
        zadanie1.switchToIframe();
        zadanie1.selectAccountType("Enterprise - 5 + użytkowników");
        zadanie1.selectNoOfUsers("7");
        zadanie1.selectDuration("3");

        wait.until(ExpectedConditions.textToBe(By.cssSelector(".total-cost>p>span"), "£1 065,00"));
        String totalCost = driver.findElement(By.cssSelector(".total-cost>p>span")).getText();

        Assert.assertEquals(totalCost, "£1 065,00");
        System.out.println("Wynik asercji poprawny");

    }

    @Test
    public void zadanie1Euro() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 3);
        Zadanie1 zadanie1 = new Zadanie1(driver);
        zadanie1.pricing();
        zadanie1.calculator();
        Thread.sleep(3000);
        zadanie1.switchToIframe();
        zadanie1.selectAccountType("Enterprise - 5 + użytkowników");
        zadanie1.selectNoOfUsers("7");
        zadanie1.selectDuration("3");
        Thread.sleep(1000);
        zadanie1.euro();

        wait.until(ExpectedConditions.textToBe(By.cssSelector(".total-cost>p>span"), "€1 214,10"));
        String totalCost = driver.findElement(By.cssSelector(".total-cost>p>span")).getText();

        Assert.assertEquals(totalCost, "€1 214,10");
        System.out.println("Wynik asercji poprawny");
    }

    @Test
    public void zadanie1Dolary() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        Zadanie1 zadanie1 = new Zadanie1(driver);
        zadanie1.pricing();
        zadanie1.calculator();
        Thread.sleep(3000);
        zadanie1.switchToIframe();
        zadanie1.selectAccountType("Enterprise - 5 + użytkowników");
        zadanie1.selectNoOfUsers("7");
        zadanie1.selectDuration("3");
        Thread.sleep(1000);
        zadanie1.dollars();

        wait.until(ExpectedConditions.textToBe(By.cssSelector(".total-cost>p>span"), "$1 533,60"));
        String totalCost = driver.findElement(By.cssSelector(".total-cost>p>span")).getText();

        Assert.assertEquals(totalCost, "$1 533,60");
        System.out.println("Wynik asercji poprawny");
    }

    @Test
    public void zadanie2() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 3);
        Zadanie2 zadanie2 = new Zadanie2(driver);

        zadanie2.openKnowledgeBase();
        Thread.sleep(2000);
        zadanie2.downloadDocumentation();
        Thread.sleep(28000);
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




