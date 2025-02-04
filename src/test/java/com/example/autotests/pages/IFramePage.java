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
public class IFramePage extends BasePage {

    /**
     * Кнопка браузера на странице.
     */
    @FindBy(xpath = "/html/body/div/p/a")
    private WebElement buttonBrowser;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public IFramePage(WebDriver driver) {
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
        WebElement frameElement = getDriver().findElement(By.cssSelector("#example-1-tab-1 > div > iframe"));
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
}