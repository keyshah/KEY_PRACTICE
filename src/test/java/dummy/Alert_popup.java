package dummy;

import com.eurekaforbes.testCases.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Alert_popup extends BaseClass {

    @Test
    public  void alert(){

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.id("alertBox")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.id("confirmBox")).click();
        alert.dismiss();
        driver.findElement(By.id("promptBox")).click();
        alert.sendKeys("tset");
        alert.accept();

    }

}
