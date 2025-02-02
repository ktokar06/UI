package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{


    @FindBy(css = "li:active a")
    private WebElement inputButtonAlert;

    @FindBy(css = "button")
    private WebElement buttonAlertBox;

    @FindBy(css = ".demo-frame")
    private WebElement text;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Метод для получения элемента кнопки ввода алерта.
     *
     * @return элемент кнопки ввода алерта
     */
    @Step("Получить элемент кнопки ввода алерта")
    public WebElement getInputButtonAlert() {
        return inputButtonAlert;
    }

    /**
     * Метод для установки элемента кнопки ввода алерта.
     *
     * @param inputButtonAlert элемент кнопки ввода алерта
     */
    @Step("Установить элемент кнопки ввода алерта")
    public void setInputButtonAlert(WebElement inputButtonAlert) {
        this.inputButtonAlert = inputButtonAlert;
    }

    /**
     * Метод для получения элемента кнопки открытия алерт-бокса.
     *
     * @return элемент кнопки открытия алерт-бокса
     */
    @Step("Получить элемент кнопки открытия алерт-бокса")
    public WebElement getButtonAlertBox() {
        return buttonAlertBox;
    }

    /**
     * Метод для установки элемента кнопки открытия алерт-бокса.
     *
     * @param buttonAlertBox элемент кнопки открытия алерт-бокса
     */
    @Step("Установить элемент кнопки открытия алерт-бокса")
    public void setButtonAlertBox(WebElement buttonAlertBox) {
        this.buttonAlertBox = buttonAlertBox;
    }

    /**
     * Метод для получения текста алерта.
     *
     * @return текст алерта
     */
    @Step("Получить текст алерта")
    public WebElement getText() {
        return text;
    }

    /**
     * Метод для установки текста алерта.
     *
     * @param text текст алерта
     */
    @Step("Установить текст алерта")
    public void setText(WebElement text) {
        this.text = text;
    }

    /**
     * Шаг для перехода  на кнопку алерта.
     */
    @Step("Перход на страницу InputAlert")
    public void clickOnInputButtonAlert() {
        inputButtonAlert.click();
    }

    /**
     * Шаг для нажатия на кнопку открытия алерт-бокса.
     */
    @Step("Открыть алерт-бокс")
    public void openAlertBox() {
        buttonAlertBox.click();
    }

    /**
     * Шаг для проверки наличия текста алерта.
     */
    @Step("Проверить наличие текста алерта")
    public boolean isAlertTextPresent() {
        return text.isDisplayed();
    }
}
