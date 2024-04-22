package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Panel extends BasePage{
    public Panel(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[href='/javascript_alerts']")
    WebElement javaSkriptAlerts;
    public JSAlertsPage AlertsWindow() {
        click(javaSkriptAlerts);
        return new JSAlertsPage(driver);
    }
    @FindBy(css = "[href='/windows']")
    WebElement multiplewindow;
    public WindowPage selectMultipleWindow() {
        click(multiplewindow);
        return new WindowPage(driver);
    }
}
