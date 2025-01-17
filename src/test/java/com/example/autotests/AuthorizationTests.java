package com.example.autotests;

import com.example.autotests.base.BasePage;
import com.example.autotests.base.BaseTest;
import com.example.autotests.pages.HomePage;
import com.example.autotests.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс для проведения тестов авторизации.
 */
public class AuthorizationTests extends BasePage {

    private static final String URL = "https://www.way2automation.com/angularjs-protractor/registeration/#/login";

    private static final String VALID_USERNAME = "angular";
    private static final String VALID_PASSWORD = "password";
    private static final String VALID_USERNAME_DESCRIPTION = "hello";

    private static final String INVALID_USERNAME = "user";
    private static final String INVALID_PASSWORD = "pass24word";
    private static final String INVALID_USERNAME_DESCRIPTION = "description";

    /**
     * Тест для проверки видимости полей.
     */
    @Test(description = "Проверка полей")
    public void visibilityCheck() {
        driver.get(URL);
        LoginPage loginPage = new LoginPage(driver);

        org.testng.Assert.assertTrue(loginPage.username.isDisplayed());
        org.testng.Assert.assertTrue(loginPage.password.isDisplayed());
        org.testng.Assert.assertFalse(loginPage.submitButton.isEnabled());
    }

    /**
     * Тест для проверки входа с неправильными данными.
     */
    @Test(description = "Проверка на правильные данные")
    public void validCredentialsTest() {
        driver.get(URL);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUsername(VALID_USERNAME);
        loginPage.setPassword(VALID_PASSWORD);
        loginPage.setUsernameDescription(VALID_USERNAME_DESCRIPTION);
        loginPage.clickLoginButton();

        Assert.assertFalse(loginPage.isLoggedIn(driver), "You're logged in!!");
    }

    /**
     * Тест для проверки выхода после успешного входа в аккаунт.
     */
    @Test(description = "Проверка на неправильные данные")
    public void invalidCredentialsTest() {
        driver.get(URL);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUsername(INVALID_USERNAME);
        loginPage.setPassword(INVALID_PASSWORD);
        loginPage.setUsernameDescription(INVALID_USERNAME_DESCRIPTION);
        loginPage.clickLoginButton();

        Assert.assertFalse(loginPage.isLoggedIn(driver), "Username or password is incorrect");
    }

    /**
     * Тест для проверка Выхода после Входа в аккаунт.
     */
    @Test(description = "Проверка Выхода после Входа в аккаунт")
    public void logoutAfterLoginTest() {
        driver.get(URL);
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