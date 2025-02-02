package com.example.autotests.test;

import com.example.autotests.pages.AlertPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

@Epic("Блок - U")
@Owner("Kirill")
public class AlertTest extends BaseTest {

    @Test
    @Issue("---")
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/angularjs-protractor/registeration/#/login")
    @DisplayName("Видимость полей")
    @Story("Авторизация")
    @Feature("Проверка видимости полей")
    @Severity(SeverityLevel.NORMAL)
    public void testAlerts(){
        AlertPage alert = new AlertPage(getDriver());

        alert.clickOnInputButtonAlert();

    }
}
