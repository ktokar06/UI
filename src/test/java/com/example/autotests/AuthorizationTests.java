package com.example.autotests;

import com.example.autotests.pages.HomePage;
import com.example.autotests.pages.LoginPage;
import com.example.autotests.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс для проведения тестов авторизации.
 */
public class AuthorizationTests extends BaseTest {

    public static final String URL = "https://www.way2automation.com/angularjs-protractor/registeration/#/login";

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
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.username.isDisplayed());
        Assert.assertTrue(loginPage.password.isDisplayed());
        Assert.assertFalse(loginPage.submitButton.isEnabled());
    }

    /**
     * Тест для проверки входа с неправильными данными.
     */
    @Test(description = "Проверка на правильные данные")
    public void validCredentialsTest() {;
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUsername(VALID_USERNAME);
        loginPage.setPassword(VALID_PASSWORD);
        loginPage.setUsernameDescription(VALID_USERNAME_DESCRIPTION);
        loginPage.clickLoginButton();

        Assert.assertTrue(loginPage.isLoggedIn(driver), "You're logged in!!");
    }

    /**
     * Тест для проверки выхода после успешного входа в аккаунт.
     */
    @Test(description = "Проверка на неправильные данные")
    public void invalidCredentialsTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUsername(INVALID_USERNAME);
        loginPage.setPassword(INVALID_PASSWORD);
        loginPage.setUsernameDescription(INVALID_USERNAME_DESCRIPTION);
        loginPage.clickLoginButton();

        Assert.assertTrue(loginPage.isLoggedIn(driver), "Username or password is incorrect");
    }

    /**
     * Тест для проверка Выхода после Входа в аккаунт.
     */
    @Test(description = "Проверка Выхода после Входа в аккаунт")
    public void logoutAfterLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername(VALID_USERNAME);
        loginPage.setPassword(VALID_PASSWORD);
        loginPage.setUsernameDescription(VALID_USERNAME_DESCRIPTION);
        loginPage.clickLoginButton();

        HomePage homePage = new HomePage(driver);
        homePage.clickLogout();

        Assert.assertTrue(loginPage.isLoggedIn(driver));
    }
}