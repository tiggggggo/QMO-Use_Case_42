package org.example.pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class SettingsPage extends BasePage {

    private By title = By.className("pb-title-nav-strip__title");

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public String getTitle() {
        String title = driver.findElement(this.title).getText();
        logger.log(Level.INFO, "Got Page titles: %s");
        return title;
    }

}
