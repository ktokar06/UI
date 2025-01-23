package com.example.autotests.test;

import com.example.autotests.pages.HomePage;
import com.example.autotests.pages.LoginPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.example.autotests.config.MyConfig.*;

/**
 * Класс для проведения тестов авторизации.
 */
public class AuthorizationTests extends BaseTest {

    /**
     * Тест для проверки видимости полей.
     */
    @Test
    @Issue("---")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @Owner("Kirill")
    @DisplayName("Видимость полей")
    @Epic("Блок - U")
    @Story("Авторизация")
    @Feature("Проверка видимости полей")
    @Severity(SeverityLevel.NORMAL)
    public void visibilityCheckTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        Assert.assertTrue(loginPage.getUsername().isDisplayed());
        Assert.assertTrue(loginPage.getPassword().isDisplayed());
        Assert.assertFalse(loginPage.getSubmitButton().isEnabled());
    }

    /**
     * Тест для проверки входа с правильными данными.
     */
    @Test
    @Issue("---")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @Owner("Kirill")
    @DisplayName("Вход с правильными данными")
    @Epic("Блок - U")
    @Story("Авторизация")
    @Feature("Проверка входа с правильными данными")
    @Severity(SeverityLevel.CRITICAL)
    public void validCredentialsTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.setUsername(VALID_USERNAME);
        loginPage.setPassword(VALID_PASSWORD);
        loginPage.setUsernameDescription(VALID_USERNAME_DESCRIPTION);
        loginPage.setClickLoginButton();

        Assert.assertTrue(loginPage.isLoggedIn(getDriver()), "You're logged in!!");
    }

    /**
     * Тест для проверки входа с неправильными данными.
     */
    @Test
    @Issue("---")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @Owner("Kirill")
    @DisplayName("Вход с неправильными данными")
    @Epic("Блок - U")
    @Story("Авторизация")
    @Feature("Проверка входа с неправильными данными")
    @Severity(SeverityLevel.MINOR)
    public void invalidCredentialsTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.setUsername(INVALID_USERNAME);
        loginPage.setPassword(INVALID_PASSWORD);
        loginPage.setUsernameDescription(INVALID_USERNAME_DESCRIPTION);
        loginPage.setClickLoginButton();

        Assert.assertTrue(loginPage.isLoggedIn(getDriver()), "Username or password is incorrect");
    }

    /**
     * Тест для проверка Выхода после Входа в аккаунт.
     */
    @Test
    @Issue("---")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @Owner("Kirill")
    @DisplayName("Выход после входа в аккаунт")
    @Epic("Блок - U")
    @Story("Авторизация")
    @Feature("Проверка выхода после входа в аккаунт")
    @Severity(SeverityLevel.TRIVIAL)
    public void logoutAfterLoginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setUsername(VALID_USERNAME);
        loginPage.setPassword(VALID_PASSWORD);
        loginPage.setUsernameDescription(VALID_USERNAME_DESCRIPTION);
        loginPage.setClickLoginButton();

        HomePage homePage = new HomePage(getDriver());
        homePage.setLogoutLink();

        Assert.assertTrue(loginPage.isLoggedIn(getDriver()));
    }
}