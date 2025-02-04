package com.example.autotests.test;

import com.example.autotests.pages.IFramePage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс для проведения тестов, связанных с работой с iframe.
 */
@Owner("Кирилл")
@Epic("Блок - U")
public class IFrameTest extends BaseTest{

    /**
     * Тест для проверки перетаскивания элемента в iframe.
     */
    @Test
    @Link(name = "Страница проверяемая тестом", url = "http://way2automation.com/way2auto_jquery/droppable.php")
    @DisplayName("Перетаскивание элемента")
    @Story("Работа с iframe")
    @Feature("Перетаскивание элемента")
    public void dragAndDropTest() {
        IFramePage framePage = new IFramePage(getDriver());

        framePage.dragAndDropElement();

        Assert.assertTrue(framePage.verifyDragAndDropSuccess());
    }
}
