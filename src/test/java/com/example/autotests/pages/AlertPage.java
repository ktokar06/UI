package com.example.autotests.pages;

import com.example.autotests.util.WaitUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Страница, содержащая элементы для работы с алертами.
 */
public class AlertPage extends BasePage{

    /**
     * Локатор для фрейма, содержащего элементы для перетаскивания.
     */
    @FindBy(css = "iframe[src='alert/input-alert.html']")
    private WebElement frameElement;

    /**
     * Переход на страницу InputAlert
     */
    @FindBy(css = ".responsive-tabs-default .responsive-tabs li:last-child")
    private WebElement inputButtonAlert;

    /**
     * Кнопка для открытия алерт-бокса.
     */
    @FindBy(css = "body > button")
    private WebElement buttonAlertBox;

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
     * Метод для получения элемента кнопки открытия алерт-бокса.
     *
     * @return элемент кнопки открытия алерт-бокса
     */
    @Step("Получить элемент кнопки открытия алерт-бокса")
    public WebElement getButtonAlertBox() {
        return buttonAlertBox;
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
        getDriver().switchTo().frame(frameElement);

        buttonAlertBox.click();

        Alert alert = getDriver().switchTo().alert();
        alert.sendKeys("Selenium Test!");
        alert.accept();

        getDriver().switchTo().defaultContent();
    }

    /**
     * Шаг для проверки наличия текста алерта.
     */
    @Step("Проверить наличие текста алерта")
    public boolean isAlertTextPresent() {
        getDriver().switchTo().frame(frameElement);

        return WaitUtils.waitForElementPresence(getDriver(), By.id("demo"));
    }
}
