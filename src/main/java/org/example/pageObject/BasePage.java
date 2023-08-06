package org.example.pageObject;


import io.qameta.allure.Step;
import org.example.pageObject.components.MenuComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class BasePage {

    protected WebDriver driver;
    protected Logger logger = Logger.getLogger(BasePage.class.getName());
    protected By burgerMenu = By.id("id_sc");
    protected MenuComponent menu;
    private final String more = "More";


    public BasePage(WebDriver driver) {
        this.driver = driver;
        menu = new MenuComponent(driver);
    }

    @Step
    public SettingsPage navigateToSettings() {
        driver.findElement(burgerMenu).click();
        driver.findElement(burgerMenu).click();
        logger.log(Level.INFO, "Clicked burger menu");
        menu.navigateToMenuItem(more);
        return new SettingsPage(driver);
    }
}
