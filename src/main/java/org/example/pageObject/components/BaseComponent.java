package org.example.pageObject.components;


import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public abstract class BaseComponent {
    protected WebDriver driver;
    protected Logger logger = Logger.getLogger(BaseComponent.class.getName());
    public BaseComponent(WebDriver driver) {
        this.driver = driver;
    }

}
