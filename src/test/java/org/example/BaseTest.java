package org.example;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


@Test
public class BaseTest {
    protected WebDriver driver;
    private static final String baseUrl = "https://www.bing.com/";


    @BeforeClass
    public void navigateHomePage() {
        driver = DriverManager.getWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void opnVaseUrl() {
        driver.get(baseUrl);
    }

    @AfterClass
    public void quiteBrowser() {
        DriverManager.quitWebDriver();
    }

}
