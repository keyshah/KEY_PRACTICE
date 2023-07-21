package Bunch.dummy;

import com.keypractice.testCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Explicit_Implicit_Wait extends BaseClass {

    // Difference between Explicit wait and Implicit wait

    @Test
    public void explicit_implicit_wait() {

        System.out.println("test");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement link_rent = driver.findElement(By.xpath("//span[@class='icon-text' and text()='Rent an Aquaguard']"));
        link_rent.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement btn_checkout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"btntxt\" and text()='Checkout']")));
        btn_checkout.click();

        Wait<WebDriver> fluentwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        fluentwait.until(ExpectedConditions.elementToBeClickable(By.id("phone_number"))).sendKeys("8347109819");

    }

}
