package com.example.autotests.dataprovider;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
    @DataProvider(name = "testData")
    public String[][]createData() {
        return new String[][]{
                {"angular", "password", "hello"},
                {"Max", "123", "privet"},
                {"Jane", "123", "Good"}
        };
    }

}
