package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

/**
 * Класс, представляющий страницу с iframe.
 */
public class TabsPage extends BasePage {

    /**
     * Локатор для фрейма, содержащего элемент для переноса на другую страницу.
     */
    @FindBy(css = "#example-1-tab-1 > div > iframe")
    private WebElement frameElement;

    /**
     * Кнопка браузера на странице.
     */
    @FindBy(css = ".farme_window p a")
    private WebElement buttonBrowser;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public TabsPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Возвращает элемент кнопки браузера.
     *
     * @return Элемент кнопки браузера.
     */
    public WebElement getButtonBrowser() {
        return buttonBrowser;
    }

    /**
     * Устанавливает элемент кнопки браузера.
     *
     * @param buttonBrowser Новый элемент кнопки браузера.
     */
    public void setButtonBrowser(WebElement buttonBrowser) {
        this.buttonBrowser = buttonBrowser;
    }

    /**
     * Открывает браузер внутри iframe.
     */
    @Step("Открыть браузер")
    public void openBrowser() {
        getDriver().switchTo().frame(frameElement);

        buttonBrowser.click();
    }

    /**
     * Переносит фокус на новую вкладку и нажимает ссылку.
     */
    @Step("Перейти на новую вкладку и нажать ссылку")
    public void switchToNewTabAndClickLink() {
        ArrayList<String> windows = new ArrayList<>(getDriver().getWindowHandles());

        if (windows.size() >= 2) {
            getDriver().switchTo().window(windows.get(1));
        }

        WebElement linkElement = getDriver().findElement(By.cssSelector("body > div > p > a"));
        linkElement.click();
    }

    /**
     * Проверяет, что открыта третья вкладка.
     *
     * @return true, если открыто ровно три вкладки, иначе false.
     */
    @Step("Проверить, что открыта третья вкладка")
    public boolean isThirdTabOpened() {
        ArrayList<String> windows = new ArrayList<>(getDriver().getWindowHandles());

        return windows.size() == 3;
    }
}