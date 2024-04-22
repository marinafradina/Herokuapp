package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class JSAlertsPage extends BasePage {
    public JSAlertsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[.='Click for JS Alert']")
    WebElement clickForJavaAlert;
    public JSAlertsPage selectJavaSkriptAlerts() {
        click(clickForJavaAlert);
        return new JSAlertsPage(driver);
    }
    public JSAlertsPage alertIamJSAlert() {
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }
    @FindBy(xpath = "//button[.='Click for JS Confirm']")
    WebElement clickForJSConfirm;

    public JSAlertsPage selectJSConfirm(String confirm) {
        click(clickForJSConfirm);
        Assert.assertTrue(confirm.contains(confirm));
        //return new JSAlertsPage(driver);


        if(confirm != null && confirm.equals("OK")){
            driver.switchTo().alert().accept();
        }else if(confirm != null && confirm.equals("Abrechen")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }
    public JSAlertsPage alertIamConfirm() {
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }
    @FindBy(xpath = "/button[.='Click for JS Prompt']")
    WebElement clickForJSPromt;
    public JSAlertsPage selectJSPromt() {
        click(clickForJSPromt);
        return this;
    }
    public JSAlertsPage verifyResult(String text) {
        return this;
    }
    public JSAlertsPage selectResult() {
        return this;
    }
    public JSAlertsPage sendMessageToAlertPromt(String message) {
        click(clickForJSPromt);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }
    @FindBy(id = "result")
    WebElement result;

    public JSAlertsPage verifyMessage(String text) {
        click(result);
        //Assert.assertTrue(result).getText().contains;
        return this;
    }
}
