package org.example.pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class HomePage extends BasePage {

    private By queryInput = By.id("sb_form_q");
    private By searchIcon = By.cssSelector(".search.icon svg");
    private By chatIcon = By.id("codex");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step
    public SearchResultsPage search(String query) {
        driver.findElement(queryInput).sendKeys(query);
        logger.log(Level.INFO, "Input search query: %s".formatted(query));
        driver.findElement(searchIcon).submit();
        logger.log(Level.INFO, "Clicked search button");
        return new SearchResultsPage(driver);
    }

    @Step
    public ChatPage navigateToChat() {
        driver.findElement(chatIcon).click();
        logger.log(Level.INFO, "Clicked chat button");
        return new ChatPage(driver);
    }
}
