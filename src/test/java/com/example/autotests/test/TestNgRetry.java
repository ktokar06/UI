package com.example.autotests.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNgRetry implements IRetryAnalyzer {

    private int count = 0;
    private int maxCount = 2;

    @Override
    public boolean retry(ITestResult result) {
        if(!result.isSuccess()){
            if(count < maxCount){
                count++;
                return true;
            }
        }
        return false;
    }
}
