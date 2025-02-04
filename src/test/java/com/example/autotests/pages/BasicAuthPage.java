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
     * Нажатие на кнопку для отображения окна с авторизацией и ввод логина и пароля.
     *
     * @param username Логин для авторизации.
     * @param password Пароль для авторизации.
     */
    @Step("Нажать на кнопку 'Display Image' и ввести логин '{username}' и пароль '{password}'")
    public void displayImageClick(String username, String password) {
        buttonDisplay.click();
        getDriver().switchTo().alert().sendKeys(username);
        getDriver().switchTo().alert().sendKeys("\t");
        getDriver().switchTo().alert().sendKeys(password);
        getDriver().switchTo().alert().accept();
    }

    /**
     * Проверяет, отображается ли загруженное окно с авторизацией.
     */
    @Step("Проверить, что окно с авторизацией загружено")
    public void imageDisplayed() {
        Assert.assertTrue(downloadImg.isDisplayed());
    }
}