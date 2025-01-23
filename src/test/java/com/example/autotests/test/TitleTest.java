package com.example.autotests.test;

import com.example.autotests.pages.TitlePage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс для проведения тестов главной страницы.
 */
public class TitleTest extends BaseTest {

    /**
     * Тест для проверки видимости основных элементов на странице.
     */
    @Test
    @Issue("---")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/")
    @Owner("Kirill")
    @DisplayName("Видимость полей в заговловке страницы")
    @Epic("Блок - U")
    @Story("Главная Страница")
    @Feature("Проверка видимости полей в заговловке страницы")
    @Severity(SeverityLevel.NORMAL)
    public void visibilityCheckHeaderTest(){
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.getHeader().isDisplayed());
        Assert.assertTrue(titlePage.getNavigationBar().isDisplayed());
        Assert.assertTrue(titlePage.getRegistrationButton().isDisplayed());
        Assert.assertTrue(titlePage.getCourseList().isDisplayed());
        Assert.assertTrue(titlePage.getFooter().isDisplayed());
    }

    /**
     * Тест для проверки наличия контактной информации в header.
     */
    @Test
    @Issue("---")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/")
    @Owner("Kirill")
    @DisplayName("Видимость контактной информации в хедере страницы")
    @Epic("Блок - U")
    @Story("Главная Страница")
    @Feature("Проверка видимости контактной информации в хедере страницы")
    @Severity(SeverityLevel.BLOCKER)
    public void headerContactInfoTest() {
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.getHeaderContactInfo().isDisplayed());
    }

    /**
     * Тест для проверки кнопок навигации (вперед и назад): работают корректно (меняют слайды)
     */
    @Test
    @Issue("---")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/")
    @Owner("Kirill")
    @DisplayName("Кнопоки навигации курсов")
    @Epic("Блок - U")
    @Story("Главная Страница")
    @Feature("Проверка кнопокок навигации курсов")
    @Severity(SeverityLevel.BLOCKER)
    public void navigationButtonsTest() {
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.clickRight(getDriver()));
        Assert.assertTrue(titlePage.clickLeft(getDriver()));
    }

    /**
     * Тест для проверки наличия контактной информации в footer.
     */
    @Test
    @Issue("---")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/")
    @Owner("Kirill")
    @DisplayName("Видимость контактной информации в подвале страницы")
    @Epic("Блок - U")
    @Story("Главная Страница")
    @Feature("Проверка видимости контактной информации в подвале страницы")
    @Severity(SeverityLevel.BLOCKER)
    public void footerContactInfoTest() {
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.getFooterContactInfo().isDisplayed());
    }
}