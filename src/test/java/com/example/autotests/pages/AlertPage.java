package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

/**
 * Страница, содержащая элементы для работы с алертами.
 */
public class AlertPage extends BasePage{

    /**
     * Переход на страницу InputAlert
     */
    @FindBy(css = ".responsive-tabs-default .responsive-tabs li:last-child")
    private WebElement inputButtonAlert;

    /**
     * Кнопка для открытия алерт-бокса.
     */
    @FindBy(xpath = "/html/body/button")
    private WebElement buttonAlertBox;

    /**
     * Элемент для вывода текста.
     */
    @FindBy(id = "demo")
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
     * Шаг для перехода на кнопку алерта.
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
        WebElement frameElement = getDriver().findElement(By.cssSelector("iframe[src='alert/input-alert.html']"));
        getDriver().switchTo().frame(frameElement);

        buttonAlertBox.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Selenuim Test!");
        alert.accept();

        getDriver().switchTo().defaultContent();
    }

    /**
     * Шаг для проверки наличия текста алерта.
     */
    @Step("Проверить наличие текста алерта")
    public void isAlertTextPresent() {
        WebElement frameElement = getDriver().findElement(By.cssSelector("iframe[src='alert/input-alert.html']"));
        getDriver().switchTo().frame(frameElement);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(text)).isDisplayed();

        getDriver().switchTo().defaultContent();
    }
}
