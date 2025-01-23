package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Базовый класс для всех страниц приложения.
 *
 * Этот класс предоставляет общие методы и свойства,
 * необходимые для работы с различными страницами сайта.
 */
public class BasePage {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    private WebDriver driver;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Возвращает текущий экземпляр веб-драйвера.
     *
     * @return Экземпляр веб-драйвера.
     */
    @Step("Получение текущего экземпляра веб-драйвера")
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Устанавливает новый экземпляр веб-драйвера.
     *
     * @param driver Новый экземпляр веб-драйвера.
     */
    @Step("Установка нового экземпляра веб-драйвера")
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}