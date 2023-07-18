package dummy;

import com.eurekaforbes.testCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows_Popups extends BaseClass {

    @Test
    public void multiplehandles() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parenthandle = driver.getWindowHandle();
        System.out.println("Parent Window" + parenthandle);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0, 500);");

        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        for (String handle : windowhandles) {
            System.out.println(handle);
            if (!handle.equalsIgnoreCase(parenthandle)) {
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
                driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("keyur");
                Thread.sleep(5000);
                driver.close();
            }
            driver.switchTo().window(parenthandle);
            driver.findElement(By.id("name")).sendKeys("Kajal");
            Thread.sleep(5000);
        }

    }
}
