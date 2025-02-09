package com.example.autotests.pages;

import com.example.autotests.util.WaitUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Базовый класс для всех страниц приложения.
 *
 * Этот класс предоставляет общие методы и свойства,
 * необходимые для работы с различными страницами сайта.
 */
public class BasePage {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    private WebDriver driver;

    /**
     * Исполнитель JavaScript команд, используемый для взаимодействия с браузером.
     */
    private static JavascriptExecutor jsExecutor;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Возвращает текущий экземпляр веб-драйвера.
     *
     * @return Экземпляр веб-драйвера.
     */
    @Step("Получение текущего экземпляра веб-драйвера")
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Устанавливает новый экземпляр веб-драйвера.
     *
     * @param driver Новый экземпляр веб-драйвера.
     */
    @Step("Установка нового экземпляра веб-драйвера")
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Прокрутка страницы влево
     */
    @Step("Прокрутка страницы влево")
    public static void scrollToElementLeft(WebElement previousCourseButton) {
        jsExecutor.executeScript("window.scrollBy(-500,0)", previousCourseButton);
    }

    /**
     * Прокрутка страницы вправо
     */
    @Step("Прокрутка страницы вправо")
    public static void scrollToElementRight(WebElement nextCourseButton) {
        jsExecutor.executeScript("window.scrollBy(5000,0)", nextCourseButton);
    }

    /**
     * Прокрутка страницы вниз до указанного элемента
     *
     * @param element Элемент, до которого необходимо прокрутить страницу
     */
    @Step("Прокрутка страницы вниз")
    public static void scrollToElementDown(WebElement element) {
        jsExecutor.executeScript("window.scrollIntoView(true)", element);
    }

    /**
     * Проверяет, выполнен ли успешный вход в систему.
     *
     * @return {@code true}, если пользователь успешно вошел в систему, иначе {@code false}.
     */
    @Step("Проверить, выполнен ли успешный вход в систему")
    public boolean isLoggedIn(WebDriver driver) {
        return WaitUtils.waitForElementPresence(driver, By.cssSelector(".ng-scope"));
    }

    /**
     * Проверяет, выполнен ли успешный вход в систему.
     *
     * @return {@code true}, если пользователь успешно вошел в систему, иначе {@code false}.
     */
    @Step("Проверить, выполнен ли успешный вход в систему")
    public boolean isCookieLoggedIn(WebDriver driver) {
        return WaitUtils.waitForElementPresence(driver, By.xpath("/html/body/table[1]/tbody/tr/td[3]"));
    }

    /**
     * Проверяет, что страница "Lifetime Membership Club" доступна и загружена правильно.
     *
     * @param driver Веб-драйвер, используемый для управления браузером.
     * @return {@code true}, если страница загружена успешно, иначе {@code false}.
     */
    @Step("Проверка доступности и корректной загрузки страницы Lifetime Membership Club")
    public boolean checkLifeTime(WebDriver driver) {
        boolean allCoursesPresent = WaitUtils.waitForElementPresence(driver, By.linkText("All Courses"));
        boolean lifetimeMembershipPresent = WaitUtils.waitForElementPresence(driver, By.linkText("Lifetime Membership"));

        if (allCoursesPresent) {
            driver.findElement(By.linkText("All Courses")).click();
        }

        if (lifetimeMembershipPresent) {
            driver.findElement(By.linkText("Lifetime Membership")).click();
        }

        return WaitUtils.waitForElementPresence(driver, By.cssSelector(".elementor-heading-title"));
    }
}