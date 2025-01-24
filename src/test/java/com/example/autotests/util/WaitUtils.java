package com.example.autotests.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Предоставляет методы для ожидания выполнения различных условий перед продолжением выполнения тестов.
 */
public class WaitUtils {

    /**
     * Ожидается появление элемента на странице.
     *
     * @param driver Веб-драйвер.
     * @return {@code true}, если элемент появился, иначе {@code false}.
     */
    public static boolean waitForElementPresence(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.
                    visibilityOfElementLocated(By.className("ng-scope")));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}