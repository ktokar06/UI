package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс, представляющий страницу входа в веб-приложение.
 */
public class LoginPage extends BasePage {

    /**
     * Поле для ввода имени пользователя.
     */
    @FindBy(id = "username")
    private WebElement username;

    /**
     * Поле для ввода пароля.
     */
    @FindBy(id = "password")
    private WebElement password;

    /**
     * Поле для ввода описания имени пользователя.
     */
    @FindBy(id = "formly_1_input_username_0")
    private WebElement usernameDescription;

    /**
     * Кнопка для отправки формы входа.
     */
    @FindBy(className = "btn-danger")
    private WebElement submitButton;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Возвращает элемент поля для ввода имени пользователя.
     *
     * @return Элемент поля для ввода имени пользователя.
     */
    public WebElement getUsername() {
        return username;
    }

    /**
     * Возвращает элемент поля для ввода пароля.
     *
     * @return Элемент поля для ввода пароля.
     */
    public WebElement getPassword() {
        return password;
    }

    /**
     * Возвращает элемент поля для ввода описания имени пользователя.
     *
     * @return Элемент поля для ввода описания имени пользователя.
     */
    public WebElement getUsernameDescription() {
        return usernameDescription;
    }

    /**
     * Возвращает элемент кнопки для отправки формы входа.
     *
     * @return Элемент кнопки для отправки формы входа.
     */
    public WebElement getSubmitButton() {
        return submitButton;
    }

    /**
     * Вводит имя пользователя в соответствующее поле.
     *
     * @param username Имя пользователя для ввода.
     * @return Эта страница (для цепочки вызовов).
     */
    @Step("Заполнить поле 'Имя пользователя' значением '{username}'")
    public LoginPage setUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
        return this;
    }

    /**
     * Вводит пароль в соответствующее поле.
     *
     * @param password Пароль для ввода.
     * @return Эта страница (для цепочки вызовов).
     */
    @Step("Заполнить поле 'Пароль' значением '{password}'")
    public LoginPage setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
        return this;
    }

    /**
     * Вводит описание имени пользователя в соответствующее поле.
     *
     * @param description Описание имени пользователя для ввода.
     * @return Эта страница (для цепочки вызовов).
     */
    @Step("Заполнить поле 'Описание пользователя' значением '{description}'")
    public LoginPage setUsernameDescription(String description) {
        this.usernameDescription.clear();
        this.usernameDescription.sendKeys(description);
        return this;
    }

    /**
     * Нажимает кнопку для отправки формы входа.
     *
     * @return Эта страница (для цепочки вызовов).
     */
    @Step("Нажать кнопку 'Login'")
    public LoginPage setClickLoginButton() {
        this.submitButton.click();
        return this;
    }
}