package org.example.pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class ChatPage extends BasePage {

    private By informationPopup = By.cssSelector(".b_vfly");

    public ChatPage(WebDriver driver) {
        super(driver);
    }


    @Step
    public Boolean isInformationPopupDisplayed() {
        Boolean isInformationPopupDisplayed = driver.findElement(informationPopup).isDisplayed();
        logger.log(Level.INFO, "Checked if information popup is displayed: %s".formatted(isInformationPopupDisplayed));
        return isInformationPopupDisplayed;
    }

}
