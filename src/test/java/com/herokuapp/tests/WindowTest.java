package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.WindowPage;
import com.herokuapp.pages.Panel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowTest extends TestBase{

    @BeforeMethod
    public void precondicion() {
        new HomePage(driver).getMultiWindowAlert();
        new Panel(driver).selectMultipleWindow();
        //new Panel(driver).selectClickHere();
    }
    @Test
    public void newWindowTest() {
        new WindowPage(driver).clickHere();

//        new WindowPage(driver).
//                switchToNextWindow().verifyMessage("New Window");
  }
}
