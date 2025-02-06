package com.example.autotests.test;


import com.example.autotests.pages.JsPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс для проведения тестов, связанных с использованием JavaScriptExecutor.
 */
@Owner("Kirill")
@Epic("Блок - U")
public class JsTest extends BaseTest {

    /**
     * Тест для проверки видимости полей и работы с JavaScriptExecutor.
     */
    @Test
    @Issue("---")
    @Link(name = "Страница проверяемая тестом", url = "https://www.way2automation.com/")
    @DisplayName("Видимость полей и работа с JavaScriptExecutor")
    @Story("Авторизация")
    @Feature("Проверка видимости полей и работы с JavaScriptExecutor")
    public void testJavaScriptExecutor() {
        JsPage js = new JsPage(getDriver());

        // скролл
        boolean hasScroll = js.isScrollPresent();
        System.out.println("Есть ли скролл на странице? " + hasScroll);

        //фокус
        js.getInputField().sendKeys(org.openqa.selenium.Keys.TAB);
        Assert.assertEquals(js.getInputField(), getDriver().switchTo().activeElement());
        js.removeFocus();
        Assert.assertFalse(js.getInputField().equals(getDriver().switchTo().activeElement()));
    }
}
