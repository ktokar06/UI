package com.example.autotests.test;

import com.example.autotests.pages.BasicAuthPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

@Epic("Блок - U")
@Owner("Kirill")

public class BasicAuthTest extends BaseTest {

    /**
     * Test для проверки работы алертов на странице.
     */
    @Test
    @Description("Тестирование авторизации на странице")
    @Link(name = "Страница проверяемая тестом", url = "https://www.httpwatch.com/httpgallery/authentication/#showExample10")
    @DisplayName("Тестирование авторизации")
    @Story("Работа с авторизацией")
    @Severity(SeverityLevel.NORMAL)
    public void checkAlertsFunctionality() {
        BasicAuthPage basicAuthPage = new BasicAuthPage(getDriver());

        basicAuthPage.openAlertBox();
        basicAuthPage.isAlertTextPresent();
    }
}