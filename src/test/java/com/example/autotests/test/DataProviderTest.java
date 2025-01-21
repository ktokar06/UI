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
public class DataProviderTest extends BaseTest{

    /**
     * Тест для проверки авторизации с разными данными.
     */
    @Test(dataProvider = "testData", dataProviderClass = DataProviderExample.class)
    @Issue("5")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @Owner("Tokar Kirill")
    @DisplayName("")
    @Epic("Блок - U")
    @Story("Авторизация")
    @Feature("Проверка Входа с разнными данными")
    @Severity(SeverityLevel.MINOR)
    public void verifyLoginWithDifferentCredentials(String firstName, String lastName, String usernameDescription) {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setUsername(firstName);
        loginPage.setPassword(lastName);
        loginPage.setUsernameDescription(usernameDescription);
        loginPage.setClickLoginButton();

        Assert.assertTrue(loginPage.isLoggedIn(getDriver()));
    }
}
