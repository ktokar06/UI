package com.example.autotests.test;

import com.example.autotests.pages.TabsPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс для тестирования работы с iframe.
 */
@Owner("Kirill")
@Epic("Блок - U")
public class TabsTest extends BaseTest{

    /**
     * Тест для проверки переноса фокуса на новую вкладку.
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "http://way2automation.com/way2auto_jquery/frames-and-windows.php")
    @DisplayName("Перенос фокуса на новую вкладку")
    @Story("Работа с вкладками")
    @Feature("Переключение между вкладками")
    public void focusOnNewTab() {
        TabsPage tabsPage = new TabsPage(getDriver(),"http://way2automation.com/way2auto_jquery/frames-and-windows.php");

        tabsPage.openBrowser();
        tabsPage.switchToNewTabAndClickLink();

        Assert.assertTrue(tabsPage.isThirdTabOpened());
    }
}