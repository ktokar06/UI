package com.example.autotests.steps;

import com.example.autotests.pages.BasePage;
import com.example.autotests.test.BaseTest;
import org.openqa.selenium.WebDriver;

public class NavigationStep extends BasePage {

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public NavigationStep(WebDriver driver) {
        super(driver);
    }
}