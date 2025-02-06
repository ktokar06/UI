package com.example.autotests.dataprovider;

import org.testng.annotations.DataProvider;

public class BrowserDataProvider {

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