package com.example.autotests.util;

import org.openqa.selenium.*;
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
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.className("ng-scope")));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Прокручивает страницу браузера влево на 500 пикселей относительно текущего положения окна.
     *
     * @param driver Веб-драйвер, используемый для управления браузером.
     * @return {@code true}, если прокрутка выполнена успешно, иначе {@code false}.
     */
    public static boolean scrollToLeft(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement coursesContainer = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"post-17\"]/div/div/section[4]")));

            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("window.scrollBy(0,500)", coursesContainer);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Прокручивает страницу браузера вправо на 500 пикселей относительно текущего положения окна.
     *
     * @param driver Веб-драйвер, используемый для управления браузером.
     * @return {@code true}, если прокрутка выполнена успешно, иначе {@code false}.
     */
    public static boolean scrollToRight(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement coursesContainer = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"post-17\"]/div/div/section[4]")));

            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("window.scrollBy(500,0)", coursesContainer);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Прокручивает страницу вниз до указанного элемента.
     *
     * @param driver Веб-драйвер, используемый для управления браузером.
     * @return {@code true}, если прокрутка выполнена успешно, иначе {@code false}.
     * @throws TimeoutException Если указанный элемент не найден в течение заданного времени ожидания.
     */
    public static boolean scrollToDown(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement coursesContainer = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("/html/body")));

            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("window.scrollIntoView(true)", coursesContainer);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}