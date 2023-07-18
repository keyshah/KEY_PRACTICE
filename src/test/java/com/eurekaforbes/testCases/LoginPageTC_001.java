package com.eurekaforbes.testCases;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LoginPageTC_001 extends BaseClass {

    @Test(priority = 1, enabled = true, groups = {"sanity"})

    public void Verify_Page_Title_Of_Login_Page() throws InterruptedException, IOException {
        logger = LogManager.getLogger(LoginPageTC_001.class);
        logger.info("Browser is open with given URL");
        logger.debug("Browser is open with given URL");


        String expectedTitle = "Swag Labs";
        if (expectedTitle.equalsIgnoreCase(driver.getTitle())) {
            Assert.assertTrue(true);
        } else {
            System.out.println(driver.getTitle());
            System.out.println(expectedTitle);
            Assert.assertTrue(false);

        }

        TakesScreenshot tks = (TakesScreenshot) driver;
        File src = tks.getScreenshotAs(OutputType.FILE);
        File target = new File("./screenshots/homepage.png");
        FileUtils.copyFile(src, target);

        WebElement pageseciton = driver.findElement(By.xpath("//div[@id='login_button_container']"));
        File src1 = pageseciton.getScreenshotAs(OutputType.FILE);
        File target1 = new File("./screenshots/login    .png");
        FileUtils.copyFile(src1, target1);
    }


}
