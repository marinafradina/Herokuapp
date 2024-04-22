package com.herokuapp.tests;

import com.herokuapp.pages.DropdownPage;
import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.Panel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdown();

    }
    @Test
    public void selectAnOption(){
        new DropdownPage(driver).getDropdown();
    }
}
