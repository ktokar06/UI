package com.example.autotests.pages;

import com.example.autotests.util.WaitUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Страница с примером базовой аутентификации.
 */
public class BasicAuthPage extends BasePage {

    /**
     * Кнопка для отображения изображения.
     */
    @FindBy(id = "displayImage")
    private WebElement buttonDisplay;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Возвращает элемент кнопки для отображения изображения.
     *
     * @return Веб-элемент кнопки.
     */
    public WebElement getButtonDisplay() {
        return buttonDisplay;
    }

    /**
     * Метод выполняет следующие шаги:
     * 1. Получает текущий URL.
     * 2. Формирует новый URL с включением логина и пароля.
     * 3. Переходит по новому URL.
     *
     * @param username Логин пользователя.
     * @param password Пароль пользователя.
     */
    @Step("Нажать на кнопку 'Display Image' и ввести логин '{username}' и пароль '{password}'")
    public void displayImageClick(String username, String password) {
        String currentUrl = getDriver().getCurrentUrl();
        String authUrl = String.format("https://%s:%s@%s", username, password, currentUrl.substring(currentUrl.indexOf("//") + 2));
        getDriver().get(authUrl);

        buttonDisplay.click();
    }

    /**
     * Метод проверяет успешность авторизации по наличию элемента,
     * содержащего текст об успешной авторизации.
     *
     * @return true, если авторизация была успешной, иначе false.
     */
    @Step("Проверить успешность авторизации")
    public boolean isAuthorizationSuccessful(WebDriver driver) {
        return WaitUtils.waitForElementPresence(driver, By.id("downloadImg"));
    }
}