package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс представляет страницу главной страницы веб-приложения.
 */
public class HomePage extends BasePage {

    /**
     * Элемент ссылки для выхода из системы.
     */
    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Нажатие на ссылку для выхода из системы.
     */
    @Step("Нажать на кнопку 'Logout'")
    public void setLogoutLink() {
        this.logoutLink.click();
    }

    /**
     * Возвращает элемент ссылки для выхода из системы.
     *
     * @return Элемент ссылки для выхода из системы.
     */
    @Step("Получение элемента ссылки для выхода из системы")
    public WebElement getLogoutLink() {
        return logoutLink;
    }
}
