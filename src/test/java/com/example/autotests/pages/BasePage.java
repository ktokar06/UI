package com.example.autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Базовый класс для всех страниц приложения.
 *
 * Этот класс предоставляет общие методы и свойства,
 * необходимые для работы с различными страницами сайта.
 */
public abstract class BasePage {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    protected WebDriver driver;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver экземпляр веб-драйвера, необходимый для взаимодействия со страницей
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
