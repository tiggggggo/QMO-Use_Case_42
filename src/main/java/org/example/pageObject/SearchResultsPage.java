package org.example.pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;

public class SearchResultsPage extends BasePage {

    private By resultsTitles = By.cssSelector("#b_content li > h2");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public List<String> getResultsTitles() {
        List<String> titles = driver.findElements(resultsTitles).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        logger.log(Level.INFO, "Got search results title: %s".formatted(titles));
        return titles;
    }
}
