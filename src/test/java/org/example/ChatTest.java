package org.example;

import org.example.pageObject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChatTest extends BaseTest{

    @Test
    public void test2() {
        Assert.assertTrue(new HomePage(driver).navigateToChat().isInformationPopupDisplayed());
    }
}
