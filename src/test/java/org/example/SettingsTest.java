package org.example;

import org.example.pageObject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingsTest extends BaseTest {
    @Test
    public void test3() {
        String expectedTitle = "Settings";
        String actualTitle = new HomePage(driver).navigateToSettings().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
