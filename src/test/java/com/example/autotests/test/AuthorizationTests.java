package com.example.autotests.test;

import com.example.autotests.pages.LoginPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.example.autotests.config.MyConfig.*;

/**
 * Класс для проведения тестов авторизации.
 */
@Epic("Блок - U")
@Owner("Kirill")
public class AuthorizationTests extends BaseTest {

    /**
     * Тест для проверки видимости полей.
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @DisplayName("Видимость полей")
    @Story("Авторизация")
    @Feature("Проверка видимости полей")
    @Severity(SeverityLevel.NORMAL)
    public void visibilityCheckTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(loginPage.getUsername().isDisplayed());
        softAssert.assertTrue(loginPage.getPassword().isDisplayed());
        softAssert.assertFalse(loginPage.getSubmitButton().isEnabled());

        softAssert.assertAll();
    }

    /**
     * Тест для проверки авторизации с правильными данными.
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @DisplayName("Вход с правильными данными")
    @Story("Авторизация")
    @Feature("Проверка входа с правильными данными")
    @Severity(SeverityLevel.CRITICAL)
    public void validCredentialsTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.setUsername(VALID_USERNAME)
                .setPassword(VALID_PASSWORD)
                .setUsernameDescription(VALID_USERNAME_DESCRIPTION)
                .setClickLoginButton();

        Assert.assertTrue(loginPage.isLoggedIn(getDriver()), "You're logged in!!");
    }

    /**
     * Тест для проверки авторизации с неправильными данными.
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @DisplayName("Вход с неправильными данными")
    @Story("Авторизация")
    @Feature("Проверка входа с неправильными данными")
    @Severity(SeverityLevel.MINOR)
    public void invalidCredentialsTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.setUsername(INVALID_USERNAME)
                .setPassword(INVALID_PASSWORD)
                .setUsernameDescription(INVALID_USERNAME_DESCRIPTION)
                .setClickLoginButton();

        Assert.assertTrue(loginPage.isLoggedIn(getDriver()), "Username or password is incorrect");
    }

    /**
     * Тест для проверка Logout после авторизации в аккаунт.
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @DisplayName("Выход после входа в аккаунт")
    @Story("Авторизация")
    @Feature("Проверка выхода после входа в аккаунт")
    @Severity(SeverityLevel.TRIVIAL)
    public void logoutAfterLoginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.setUsername(VALID_USERNAME)
                .setPassword(VALID_PASSWORD)
                .setUsernameDescription(VALID_USERNAME_DESCRIPTION)
                .setClickLoginButton();

        homePage.setLogoutLink();

        Assert.assertTrue(loginPage.isLoggedIn(getDriver()));
    }
}