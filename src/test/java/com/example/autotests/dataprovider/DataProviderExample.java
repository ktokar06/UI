package com.example.autotests.dataprovider;

import org.testng.annotations.DataProvider;

/**
 * Класс, предоставляющий данные для тестов.
 */
public class DataProviderExample {

    /**
     * Метод, создающий набор данных для тестов.
     *
     * @return Массив строковых массивов, содержащих наборы данных для тестов.
     */
    @DataProvider(name = "testData")
    public String[][] createData() {
        return new String[][]{
                {"angular", "password", "hello"},
                {"Max", "123", "привет"},
                {"Jane", "123", "Good"}
        };
    }
}