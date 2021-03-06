package com.sayem.rough;


import com.sayem.pages.AccountSettingPage;
import com.sayem.pages.LandingPage;
import com.sayem.pages.LoginPage;
import com.sayem.pages.TopMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ChangePasswordTest {
    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        // loginPage.doLogin(method) from LoginPage will return you to the LandingPage
        LandingPage landingPage = loginPage.doLogin("syed@hotmail.com", "user123");

        TopMenu topMenu = PageFactory.initElements(driver, TopMenu.class);
        AccountSettingPage accountSettingPage = topMenu.clickAccountSettingLink();
        accountSettingPage.clickChangePasswordEdit("user123", "user123", "user123");








    }


}
