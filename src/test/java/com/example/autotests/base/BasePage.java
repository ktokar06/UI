package com.example.autotests.base;

import org.openqa.selenium.WebDriver;

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
}