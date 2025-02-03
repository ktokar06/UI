package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Страница с примером базовой аутентификации.
 */
public class BasicAuthPage extends BasePage {

    /**
     * Кнопка для отображения изображения.
     */
    @FindBy(id = "displayImage")
    private WebElement buttonDisplay;

    /**
     * Элемент изображения, которое должно загрузиться после успешной аутентификации.
     */
    @FindBy(id = "downloadImg")
    private WebElement downloadImg;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Возвращает элемент кнопки для отображения изображения.
     *
     * @return Веб-элемент кнопки.
     */
    public WebElement getButtonDisplay() {
        return buttonDisplay;
    }

    /**
     * Устанавливает элемент кнопки для отображения изображения.
     *
     * @param buttonDisplay Новый веб-элемент кнопки.
     */
    public void setButtonDisplay(WebElement buttonDisplay) {
        this.buttonDisplay = buttonDisplay;
    }

    /**
     * Возвращает элемент загруженного изображения.
     *
     * @return Веб-элемент изображения.
     */
    public WebElement getDownloadImg() {
        return downloadImg;
    }

    /**
     * Устанавливает элемент загруженного изображения.
     *
     * @param downloadImg Новый веб-элемент изображения.
     */
    public void setDownloadImg(WebElement downloadImg) {
        this.downloadImg = downloadImg;
    }

    /**
     * Нажатие на кнопку для отображения изображения.
     */
    @Step("Нажать на кнопку 'Display Image'")
    public void displayImageClick() {
        buttonDisplay.click();
    }

    /**
     * Проверяет, отображается ли загруженное окно с авторизацией.
     */
    @Step("Проверить, что окно с авторизацией загружено")
    public void assertImageDisplayed() {
        Assert.assertTrue(downloadImg.isDisplayed());
    }
}