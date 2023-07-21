package newinterview;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class test1 {
    public static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    Actions actions = new Actions(driver);

    public static void main(String[] args) throws IOException, InterruptedException {

        ChromeOptions options = new ChromeOptions();
// Disable browser notifications
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        options.addExtensions(new File("extension_5_8_1_0.crx"));
// Launch Chrome browser with options
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        WebDriver driver = new ChromeDriver(options);
		Thread.sleep(10000);
		//driver.close();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
//        Thread.sleep(5000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(1000,0)");
//        Thread.sleep(10000);
        //js.executeScript("window.scrollBy(0,0)");


//		WebElement fname = driver.findElement(By.id("firstName"));
//        js.executeScript(fname.sendKeys("test"));

    }

    public static void scren() throws IOException {

        TakesScreenshot tks = (TakesScreenshot) driver;
        File src = tks.getScreenshotAs(OutputType.FILE);
        File dest = new File("ke.png");
        FileUtils.copyFile(src, dest);
    }

    public void dropdowntest() {
        WebElement carsdropdown = driver.findElement(By.id("cars"));
        wait.until(ExpectedConditions.elementToBeClickable(carsdropdown));
        //carsdropdown.click();
        Select select = new Select(carsdropdown);
        select.selectByValue("audi");
    }

    public void mousehover() {
        WebElement proele = driver.findElement(By.xpath("//a[@class='hfe-menu-item' and text()='Products']"));
        actions.moveToElement(proele).perform();
    }

    public void upload() {
        WebElement ele1 = driver.findElement(By.id("input-4"));
        //   ele1.click();
        ele1.sendKeys("D:\\Key-Study\\git-cheat-sheet-education.pdf");

    }

    public void frame() {
        driver.switchTo().frame("frame1");
        WebElement ele = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        String s = ele.getText();
        System.out.println(s);
        driver.switchTo().defaultContent();
        WebElement ele11 = driver.findElement(By.xpath("//div[contains(text(),\"Sample Iframe\")]"));
        String s2 = ele11.getText();
        System.out.println(s2);
    }

}
