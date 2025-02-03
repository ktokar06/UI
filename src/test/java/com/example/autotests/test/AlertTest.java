package com.example.autotests.test;

import com.example.autotests.pages.AlertPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

/**
 * Класс для тестирования функционала алертов на странице.
 * Этот класс содержит методы для проверки различных аспектов работы алертов,
 * таких как открытие алертов, ввод текста и проверка результатов.
 */
@Epic("Блок - U")
@Owner("Kirill")
public class AlertTest extends BaseTest {

    /**
     * Test для проверки работы алертов на странице.
     */
    @Test(description = "Проверка работы алертов на странице")
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
