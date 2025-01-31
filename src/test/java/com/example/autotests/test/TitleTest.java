package com.example.autotests.test;

import com.example.autotests.pages.TitlePage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Класс для проведения тестов главной страницы.
 */
@Owner("Kirill")
@Epic("Блок - U")
public class TitleTest extends BaseTest {

    /**
     * Тест для проверки видимости основных элементов на странице.
     */
    @Test
    @Issue("---")
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/")
    @DisplayName("Видимость полей в заговловке страницы")
    @Story("Главная Страница")
    @Feature("Проверка видимости полей в заговловке страницы")
    @Severity(SeverityLevel.NORMAL)
    public void visibilityCheckHeaderTest(){
        TitlePage titlePage = new TitlePage(getDriver());
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(titlePage.getHeader().isDisplayed());
        softAssert.assertTrue(titlePage.getNavigationBar().isDisplayed());
        softAssert.assertTrue(titlePage.getRegistrationButton().isDisplayed());
        softAssert.assertTrue(titlePage.getCourseList().isDisplayed());
        softAssert.assertTrue(titlePage.getFooter().isDisplayed());

        softAssert.assertAll();
    }

    /**
     * Тест для проверки наличия контактной информации в header.
     */
    @Test
    @Issue("---")
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/")
    @DisplayName("Видимость контактной информации в хедере страницы")
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
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/")
    @DisplayName("Кнопоки навигации курсов")
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
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/")
    @DisplayName("Видимость контактной информации в подвале страницы")
    @Story("Главная Страница")
    @Feature("Проверка видимости контактной информации в подвале страницы")
    @Severity(SeverityLevel.BLOCKER)
    public void footerContactInfoTest() {
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.getFooterContactInfo().isDisplayed());
    }
}