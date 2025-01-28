package com.example.autotests.test;

import com.example.autotests.pages.LoginPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;


/**Этот класс предназначен для выполнения тестов, которые должны завершиться неудачей.**/
@Owner("Kirill")
@Epic("Блок - U")
public class FailedTest extends BaseTest {

    /**
     * Тест для проверки видимости полей.
     */
    @Test
    @Issue("---")
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @DisplayName("Видимость полей")
    @Story("Авторизация")
    @Feature("Проверка видимости полей")
    public void visibilityCheck() {
        LoginPage loginPage = new LoginPage(getDriver());

        Assert.assertFalse(loginPage.getUsername().isDisplayed());
        Assert.assertFalse(loginPage.getPassword().isDisplayed());
        Assert.assertFalse(loginPage.getSubmitButton().isEnabled());
    }
}
