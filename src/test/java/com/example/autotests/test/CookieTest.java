package com.example.autotests.test;

import com.example.autotests.pages.CookiePage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.example.autotests.config.MyConfig.*;

/**
 * Класс для проведения тестов, связанных с работой с куками и авторизацией.
 */
public class CookieTest extends BaseTest{

    /**
     * Тест для проверки авторизации с правильными данными.
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "https://www.sql-ex.ru/")
    @DisplayName("Первый запуск: Вход с правильными данными и сохранение куки")
    @Story("Авторизация")
    @Feature("Проверка входа с правильными данными и сохранение куки")
    @Severity(SeverityLevel.CRITICAL)
    public void firstRunValidCredentialsTest() {
        CookiePage cookie = new CookiePage(getDriver());

        cookie.setUsername(COOKIE_VALID_USERNAME)
                .setPassword(COOKIE_VALID_PASSWORD)
                .setSubmitButton()
                .saveCookies();


        Assert.assertTrue(cookie.isCookieLoggedIn(getDriver()), "You're logged in!!");

    }

    /**
     * Тест для проверки использования сохранённых куки для входа.
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "https://www.sql-ex.ru/")
    @DisplayName("Второй запуск: Вход с использованием сохранённых куки")
    @Story("Авторизация")
    @Feature("Проверка использования сохранённых куки")
    @Severity(SeverityLevel.CRITICAL)
    public void secondRunUsingSavedCookiesTest() {
        CookiePage cookie = new CookiePage(getDriver());

        cookie.loadCookies();
        cookie.refreshPage();

        Assert.assertTrue(cookie.isCookieLoggedIn(getDriver()), "You're logged in!!");
    }
}
