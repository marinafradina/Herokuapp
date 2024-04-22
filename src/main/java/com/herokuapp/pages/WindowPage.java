package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver driver) {
        super(driver);
    }
//    @FindBy(css = "[href='/windows']")
//    WebElement multiplewindow;
//    public JSAlertsPage switchToNextWindow() {
//        click(multiplewindow);
//        return new JSAlertsPage(driver);
//    }
    @FindBy(css = "[href='/windows/new']")
    WebElement clickHere;
    public WindowPage clickHere() {
        clickWithJS(clickHere, 0, 50);
        return this;
    }
}
