package com.example.autotests.test;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.Optional;


public class TestListener extends BaseTest implements TestWatcher {

/*    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        Allure.getLifecycle().addAttachment(
                "DisableScreenshot", "image/png", "png"
                , ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)
        );
        getDriver().close();
        getDriver().quit();
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        Allure.getLifecycle().addAttachment(
                "SuccessfulScreenshot", "image/png", "png"
                , ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)
        );
        getDriver().close();
        getDriver().quit();
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        Allure.getLifecycle().addAttachment(
                "AbortedScreenshot", "image/png", "png"
                , ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)
        );
        getDriver().close();
        getDriver().quit();
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.getLifecycle().addAttachment(
                "FailedScreenshot", "image/png", "png"
                , ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)
        );
        getDriver().close();
        getDriver().quit();
    }*/
}
