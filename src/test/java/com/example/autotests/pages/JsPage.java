package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс для работы с JavaScriptExecutor на веб-страницах.
 */
public class JsPage extends BasePage {

    /**
     * Локальное поле, представляющее элемент ввода на веб-странице.
     */
    @FindBy(id = "containers.field.input")
    private WebElement inputField;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public JsPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Устанавливает значение приватного поля `inputField` равным переданному параметру `inputField`.
     *
     * @param inputField Объект `WebElement`, представляющий элемент ввода на веб-странице.
     */
    public void setInputField(WebElement inputField) {
        this.inputField = inputField;
    }

    /**
     * Метод для получения элемента ввода.
     *
     * @return Элемент ввода.
     */
    @Step("Получить элемент ввода.")
    public WebElement getInputField() {
        return inputField;
    }

    /**
     * Метод для удаления фокуса из активного элемента.
     */
    @Step("Удалить фокус из активного элемента.")
    public void removeFocus() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("document.activeElement.blur();");
    }

    /**
     * Метод для проверки наличия скролла на странице.
     *
     * @return True, если на странице есть скролл, иначе False.
     */
    @Step("Проверить наличие скролла на странице.")
    public boolean isScrollPresent() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return (Boolean) js.executeScript("return document.body.scrollHeight > window.innerHeight;");
    }
}