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

    public final static String URL_TITLE = "https://www.way2automation.com/";

    /**
     * Тест для проверки видимости основных элементов на странице.
     */
    @Test
    @Issue("1")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/")
    @Owner("Tokar Kirill")
    @DisplayName("Проверка видимости полей")
    @Epic("Блок - U")
    @Story("Главная Страница")
    @Feature("Проверка видимости полей")
    @Severity(SeverityLevel.BLOCKER)
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
    @Issue("2")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/")
    @Owner("Tokar Kirill")
    @DisplayName("Проверка видимости контактной информации")
    @Epic("Блок - U")
    @Story("Главная Страница")
    @Feature("Проверка видимости контактной информации")
    @Severity(SeverityLevel.BLOCKER)
    public void headerContactInfoTest() {
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.getPhoneNumber().isDisplayed());
        Assert.assertTrue(titlePage.getSkypeLink().isDisplayed());
        Assert.assertTrue(titlePage.getEmailAddress().isDisplayed());
        Assert.assertTrue(titlePage.getSocialMediaLinks().isDisplayed());
    }

    /**
     * Тест для проверки кнопок навигации (вперед и назад): работают корректно (меняют слайды)
     */
    @Test
    @Issue("2")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/")
    @Owner("Tokar Kirill")
    @DisplayName("Проверка видимости контактной информации")
    @Epic("Блок - U")
    @Story("Главная Страница")
    @Feature("Проверка видимости контактной информации")
    @Severity(SeverityLevel.BLOCKER)
    public void BlockContactInfoTest() {
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.getNextCourseButton().isDisplayed());
        Assert.assertTrue(titlePage.getPreviousCourseButton().isDisplayed());
    }

    /**
     * Тест для проверки наличия контактной информации в footer.
     */
    @Test
    @Issue("2")
    @Link(name = "Ссылка на баг", url = "https://www.way2automation.com/")
    @Owner("Tokar Kirill")
    @DisplayName("Проверка видимости контактной информации")
    @Epic("Блок - U")
    @Story("Главная Страница")
    @Feature("Проверка видимости контактной информации")
    @Severity(SeverityLevel.BLOCKER)
    public void footerContactInfoTest() {
        TitlePage titlePage = new TitlePage(getDriver());

        Assert.assertTrue(titlePage.getAddress().isDisplayed());
        Assert.assertTrue(titlePage.getFooterPhoneNumbers().isDisplayed());
        Assert.assertTrue(titlePage.getEmails().isDisplayed());
    }
}