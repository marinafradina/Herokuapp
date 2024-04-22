package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.JSAlertsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getJavaScriptAlert();
        new JSAlertsPage(driver).selectJavaSkriptAlerts();
        //new JSAlertsPage(driver).selectJSConfirm();
         //new JSAlertsPage(driver).selectJSPrompt();
    }

    @Test
    public void alertIamJSAlertTest() {
        new JSAlertsPage(driver).alertIamJSAlert();

    }
    @Test
    public void selectJSConfirmTest() {
        //new JSAlertsPage(driver).selectJSConfirm("Ok").verifyResult("Abrechen");
        new JSAlertsPage(driver).alertIamConfirm();
    }
    @Test
    public void alertIamConfirmTest() {
        new JSAlertsPage(driver).selectResult().verifyResult("Ok");
    }
    @Test
   public void selectJSPromtTest() {
      new JSAlertsPage(driver).selectResult().verifyResult("Ok");
  }
  @Test
    public void sendMessageToAlertPromtTest(){
        new JSAlertsPage(driver).sendMessageToAlertPromt("Hello").verifyMessage("Hello");
  }

}


