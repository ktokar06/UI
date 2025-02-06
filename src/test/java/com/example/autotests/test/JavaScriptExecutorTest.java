package com.example.autotests.test;


import com.example.autotests.pages.LoginPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

/**
 * Класс для проведения тестов, связанных с использованием JavaScriptExecutor.
 */
@Owner("Kirill")
@Epic("Блок - U")
public class JavaScriptExecutorTest extends BaseTest {

    /**
     * Тест для проверки видимости полей и работы с JavaScriptExecutor.
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @DisplayName("Видимость полей и работа с JavaScriptExecutor")
    @Story("Работа с JavaScriptExecutor")
    @Feature("Проверка видимости полей и работы с JavaScriptExecutor")
    public void javaScriptExecutorTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.scrollPresent();
        loginPage.removeFocus();
    }
}
