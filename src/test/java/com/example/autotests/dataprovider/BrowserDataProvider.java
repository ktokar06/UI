package com.example.autotests.dataprovider;

import org.testng.annotations.DataProvider;

/**
 * Класс-провайдер данных для тестирования различных браузеров.
 */
public class BrowserDataProvider {

    /**
     * Предоставляет список поддерживаемых браузеров для тестирования.
     *
     * @return Массив строк с названиями браузеров: "chrome", "firefox", "ie", "edge".
     */
    @DataProvider(name = "browsers")
    public static Object[][] browserProvider() {
        return new Object[][]{
                {"chrome"},
                {"firefox"},
                {"ie"},
                {"edge"}
        };
    }
}