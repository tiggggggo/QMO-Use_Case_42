package org.example.pageObject.components;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Level;

public class MenuComponent extends BaseComponent {
    protected By settings = By.id("hbsettings");
    protected By menuItems = By.cssSelector("a[role='menuitem'] .hb_title_col");

    public MenuComponent(WebDriver driver) {
        super(driver);
    }

    @Step
    public void navigateToMenuItem(String menuItem) {
        driver.findElement(settings).click();
        logger.log(Level.INFO, "Click settings button");
        WebElement item = driver.findElements(menuItems).stream()
                .filter(menu -> menu.getText().equalsIgnoreCase(menuItem))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("%s is not presented in setting menu".formatted(menuItem)));
        item.click();
        logger.log(Level.INFO, "Navigate to menu: %s".formatted(menuItem));
    }
}
