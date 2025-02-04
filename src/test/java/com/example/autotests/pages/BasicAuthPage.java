package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
     * Устанавливает элемент кнопки для отображения изображения.
     *
     * @param buttonDisplay Новый веб-элемент кнопки.
     */
    public void setButtonDisplay(WebElement buttonDisplay) {
        this.buttonDisplay = buttonDisplay;
    }

    @Step("Нажать на кнопку 'Display Image' и ввести логин '{username}' и пароль '{password}'")
    public void displayImageClick(String username, String password) {
        String currentUrl = getDriver().getCurrentUrl();
        String authUrl = currentUrl.replace("https://", "https://" + username + ":" + password + "@");
        getDriver().get(authUrl);

        buttonDisplay.click();
    }
}