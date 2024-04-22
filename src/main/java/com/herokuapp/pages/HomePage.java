package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[href='/javascript_alerts']")
    WebElement alertsWindows;

    public Panel getJavaScriptAlert() {
        click(alertsWindows);
        return new Panel(driver);
    }
    @FindBy(css = "[href='/windows']")
    WebElement multiplewindow;

    public Panel getMultiWindowAlert() {
        click(multiplewindow);
        return new Panel(driver);
    }
    @FindBy(css = "[href='/dropdown']")
    WebElement dropdown;

    public Panel getDropdown() {
        click(dropdown);

        return new Panel(driver);
    }
}
