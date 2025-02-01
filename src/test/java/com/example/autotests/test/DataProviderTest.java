package com.example.autotests.test;

import com.example.autotests.dataprovider.DataProviderExample;
import com.example.autotests.pages.LoginPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс для тестирования различных сценариев входа в систему с использованием разных наборов данных.
 */
@Owner("Kirill")
@Epic("Блок - U")
public class DataProviderTest extends BaseTest{

    /**
     * Тест для проверки авторизации с разными данными.
     */
    @Test(dataProvider = "testData", dataProviderClass = DataProviderExample.class)
    @Issue("---")
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @DisplayName("Проверка авторизации с разными данными")
    @Story("Авторизация")
    @Feature("Проверка авторизации с разнными данными")
    @Severity(SeverityLevel.BLOCKER)
    public void verifyLoginWithDifferentCredentials(String firstName, String lastName, String usernameDescription) {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.setUsername(firstName)
                .setPassword(lastName)
                .setUsernameDescription(usernameDescription)
                .setClickLoginButton();

        Assert.assertTrue(loginPage.isLoggedIn(getDriver()));
    }
}