package Bunch.retry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class retry1 {
    public static WebDriver driver;

    public static void screenshot() {
        System.out.println("Test");

    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testing() throws InterruptedException {

        WebElement searhcbox = driver.findElement(By.xpath("//textarea[@name='q']"));
        searhcbox.sendKeys("India");
        searhcbox.sendKeys(Keys.ENTER);
        Actions action = new Actions(driver);


        WebElement ele = driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div/div/div/div[1]/div/a"));
        ele.sendKeys(Keys.CONTROL, Keys.RETURN);
        //  ele.click();
        //action.keyDown(Keys.CONTROL).moveToElement(ele).click().perform();
    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        //     driver.quit();
    }

}
