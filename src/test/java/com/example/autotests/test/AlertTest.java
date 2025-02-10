package com.example.autotests.test;

import com.example.autotests.pages.AlertPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

/**
 * Класс для тестирования функционала алертов на странице.
 */
@Epic("Блок - U")
@Owner("Kirill")
public class AlertTest extends BaseTest {

    /**
     * Test для проверки работы алертов на странице.
     */
    @Test
    @Description("Тестирование функционала алертов на странице")
    @Link(name = "Страница проверяемая тестом", url = "https://way2automation.com/way2auto_jquery/alert.php#load_box")
    @DisplayName("Тестирование алертов")
    @Story("Работа с алертами")
    @Severity(SeverityLevel.NORMAL)
    public void checkAlertsFunctionality(){
        AlertPage alertPage = new AlertPage(getDriver());

        alertPage.clickOnInputButtonAlert();
        alertPage.openAlertBox();
        alertPage.isAlertTextPresent();
    }
}
