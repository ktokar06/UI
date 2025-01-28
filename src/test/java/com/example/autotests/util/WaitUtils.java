package com.example.autotests.util;

import com.example.autotests.pages.BasePage;
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
     * @param wait Объект WebDriverWait для ожидания элемента.
     * @return {@code true}, если элемент появился, иначе {@code false}.
     */
    public static boolean waitForElementPresence(WebDriverWait wait) {
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
     * @param wait Объект WebDriverWait для ожидания элемента.
     * @return {@code true}, если прокрутка выполнена успешно, иначе {@code false}.
     */
    public static boolean scrollToLeft(WebDriverWait wait) {
        try {
            WebElement coursesContainer = wait.until(ExpectedConditions.
                    presenceOfElementLocated(By.cssSelector(".swiper-button-prev")));

            BasePage.scrollToElementLeft(coursesContainer);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Прокручивает страницу браузера вправо на 500 пикселей относительно текущего положения окна.
     *
     * @param wait Объект WebDriverWait для ожидания элемента.
     * @return {@code true}, если прокрутка выполнена успешно, иначе {@code false}.
     */
    public static boolean scrollToRight(WebDriverWait wait) {
        try {
            WebElement coursesContainer = wait.until(ExpectedConditions
                    .presenceOfElementLocated(By.cssSelector(".swiper-button-next")));

            BasePage.scrollToElementRight(coursesContainer);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Прокручивает страницу вниз до указанного элемента.
     *
     * @param wait Объект WebDriverWait для ожидания элемента.
     * @return {@code true}, если прокрутка выполнена успешно, иначе {@code false}.
     */
    public static boolean scrollToDown(WebDriverWait wait) {
        try {
            WebElement coursesContainer = wait.until(ExpectedConditions
                    .presenceOfElementLocated(By.cssSelector("body:not(.logged-in)")));

            BasePage.scrollToElementDown(coursesContainer);

            return true;
        } catch (Exception e) {
            System.out.println("Ошибка при прокрутке страницы вниз: " + e.getMessage());
            return false;
        }
    }

    /**
     * Ожидается появление элемента на странице.
     *
     * @param wait Объект WebDriverWait для ожидания элемента.
     * @return {@code true}, если элемент появился, иначе {@code false}.
     */
    public static boolean waitForElementPresenceTitle(WebDriverWait wait) {
        try {

            WebElement allCourses = wait.until(ExpectedConditions
                    .presenceOfElementLocated(By.linkText("All Courses")));
            allCourses.click();

            WebElement lifeTimeMemberShip = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Lifetime Membership")));
            lifeTimeMemberShip.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector(".elementor-heading-title")));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}