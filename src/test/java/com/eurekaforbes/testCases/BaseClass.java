package com.eurekaforbes.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

    public static WebDriver driver;
    public static Logger logger;
    public String baseURL = "https://www.saucedemo.com/";

    @BeforeClass(alwaysRun = true)
    @Parameters("browsername")
    public void setup(String browsername) {

        if (browsername.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            System.out.println("Browser Started" + browsername);
            System.out.println(Thread.currentThread().getId());
        } else if (browsername.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            System.out.println("Browser Started" + browsername);
            System.out.println(Thread.currentThread().getId());
        } else if (browsername.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            System.out.println("Browser Started" + browsername);
            System.out.println("Threadid" + Thread.currentThread().getId());
        }
        logger = LogManager.getLogger(BaseClass.class);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(baseURL);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
