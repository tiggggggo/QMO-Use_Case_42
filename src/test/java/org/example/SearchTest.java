package org.example;

import org.example.pageObject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends BaseTest {
    @Test
    public void test2() {
        String query = "weather";
        List<String> resultsTitles = new HomePage(driver).search(query).getResultsTitles();
        resultsTitles.forEach(title -> Assert.assertTrue(title.toLowerCase().contains(query),
                "Title: '%s' should contain %s".formatted(title, query)));
    }
}
