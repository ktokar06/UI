package com.example.autotests;

import com.example.autotests.base.BaseTest;
import com.example.autotests.pages.HomePage;
import com.example.autotests.pages.LoginPage;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;
import org.testng.Assert;
import org.testng.annotations.Test;


@OrderWith(Alphanumeric.class)
public class AuthorizationTests extends BaseTest {

    private static final String VALID_USERNAME = "angular";
    private static final String VALID_PASSWORD = "password";
    private static final String VALID_USERNAME_DESCRIPTION = "hello";

    private static final String INVALID_USERNAME = "user";
    private static final String INVALID_PASSWORD = "pass24word";
    private static final String INVALID_USERNAME_DESCRIPTION = "description";

    @Test(description = "Проверка полей")
    public void TestA() {
        driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/login");
        LoginPage loginPage = new LoginPage(driver);

        org.testng.Assert.assertTrue(loginPage.username.isDisplayed());
        org.testng.Assert.assertTrue(loginPage.password.isDisplayed());
        org.testng.Assert.assertFalse(loginPage.submitButton.isEnabled());
    }

    @Test(description = "Проверка на правильные данные")
    public void TestB() {
        driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUsername(VALID_USERNAME);
        loginPage.setPassword(VALID_PASSWORD);
        loginPage.setUsernameDescription(VALID_USERNAME_DESCRIPTION);
        loginPage.clickLoginButton();

        Assert.assertTrue(loginPage.isLoggedIn(driver), "You're logged in!!");
    }


    @Test(description = "Проверка на неправильные данные")
    public void TestC() {
        driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUsername(INVALID_USERNAME);
        loginPage.setPassword(INVALID_PASSWORD);
        loginPage.setUsernameDescription(INVALID_USERNAME_DESCRIPTION);
        loginPage.clickLoginButton();

        Assert.assertFalse(loginPage.isLoggedIn(driver), "Username or password is incorrect");
    }

    @Test(description = "Проверка Выхода после Входа в аккаунт")
    public void TestD(){
        driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername(VALID_USERNAME);
        loginPage.setPassword(VALID_PASSWORD);
        loginPage.setUsernameDescription(VALID_USERNAME_DESCRIPTION);
        loginPage.clickLoginButton();

        HomePage homePage = new HomePage(driver);
        homePage.clickLogout();

        Assert.assertFalse(loginPage.isLoggedIn(driver));
    }

}