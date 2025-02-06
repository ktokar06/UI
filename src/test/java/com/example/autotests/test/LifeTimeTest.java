package com.example.autotests.test;

import com.example.autotests.pages.TitlePage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс для тестирования страницы "Lifetime Membership Club".
 */
@Owner("Kirill")
@Epic("Блок - U")
public class LifeTimeTest extends BaseTest {

    /**
     * Проверяет, что переход по ссылке в меню навигации приводит к открытию страницы "Lifetime Membership Club".
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/")
    @DisplayName("Переход по ссылке в меню навигации на страницу Lifetime Membership Club")
    @Story("Главная Страница")
    @Feature("Проверка перехода по ссылке в меню навигации")
    @Severity(SeverityLevel.NORMAL)
    public void checkLifeTimeMemberShip() {
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.checkLifeTime(getDriver()));
    }
}
