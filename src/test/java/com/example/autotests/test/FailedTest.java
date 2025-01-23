package com.example.autotests.test;

import com.example.autotests.pages.LoginPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest extends BaseTest{

    /**
     * Тест для проверки видимости полей.
     */
    @Test
    @Issue("1")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @Owner("Tokar Kirill")
    @DisplayName("Проверка видимости полей")
    @Epic("Блок - U")
    @Story("Авторизация")
    @Feature("Проверка видимости полей")
    @Severity(SeverityLevel.BLOCKER)
    public void visibilityCheck() {
        LoginPage loginPage = new LoginPage(getDriver());

        Assert.assertFalse(loginPage.getUsername().isDisplayed());
        Assert.assertFalse(loginPage.getPassword().isDisplayed());
        Assert.assertFalse(loginPage.getSubmitButton().isEnabled());
    }
}
