package com.example.autotests.test;

import com.example.autotests.pages.BasePage;
import com.example.autotests.pages.TitlePage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс для тестирования поведения меню при прокрутке страницы.
 */
public class MenuScrollTest extends BaseTest {

    /**
     * Тест для проверки Отображения меню при скроллинге страницы вниз.
     */
    @Test
    @Issue("---")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/")
    @Owner("Kirill")
    @DisplayName("Отображение меню при скроллинге страницы вниз")
    @Epic("Блок - U")
    @Story("Главная Страница")
    @Feature("Проверка отображения меню при скроллинге страницы внизы")
    @Severity(SeverityLevel.NORMAL)
    public void verifyHeaderContactVisibility() {
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.clickDown(getDriver()));
    }
}
