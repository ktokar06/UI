package com.example.autotests.pages;

import com.example.autotests.util.WaitUtils;
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
     * Вводит имя пользователя в соответствующее поле.
     *
     * @param username Имя пользователя для ввода.
     */
    @Step("Заполнить поле 'Имя пользователя' значением '{username}'")
    public void setUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    /**
     * Возвращает элемент поля для ввода имени пользователя.
     *
     * @return Элемент поля для ввода имени пользователя.
     */
    @Step("Получение элемента поля для ввода имени пользователя")
    public WebElement getUsername() {
        return username;
    }

    /**
     * Вводит пароль в соответствующее поле.
     *
     * @param password Пароль для ввода.
     */
    @Step("Заполнить поле 'Пароль' значением '{password}'")
    public void setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    /**
     * Возвращает элемент поля для ввода пароля.
     *
     * @return Элемент поля для ввода пароля.
     */
    @Step("Получение элемента поля для ввода пароля")
    public WebElement getPassword() {
        return password;
    }

    /**
     * Вводит описание имени пользователя в соответствующее поле.
     *
     * @param description Описание имени пользователя для ввода.
     */
    @Step("Заполнить поле 'Описание пользователя' значением '{description}'")
    public void setUsernameDescription(String description) {
        this.usernameDescription.clear();
        this.usernameDescription.sendKeys(description);
    }

    /**
     * Возвращает элемент поля для ввода описания имени пользователя.
     *
     * @return Элемент поля для ввода описания имени пользователя.
     */
    @Step("Получение элемента поля для ввода описания имени пользователя")
    public WebElement getUsernameDescription() {
        return usernameDescription;
    }

    /**
     * Нажимает кнопку для отправки формы входа.
     */
    @Step("Нажать кнопку 'Login'")
    public void setClickLoginButton() {
        this.submitButton.click();
    }

    /**
     * Возвращает элемент кнопки для отправки формы входа.
     *
     * @return Элемент кнопки для отправки формы входа.
     */
    @Step("Получение элемента кнопки для отправки формы входа")
    public WebElement getSubmitButton() {
        return submitButton;
    }

    /**
     * Проверяет, выполнен ли успешный вход в систему.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для проверки состояния страницы.
     * @return {@code true}, если пользователь успешно вошел в систему, иначе {@code false}.
     */
    @Step("Проверить, выполнен ли успешный вход в систему")
    public boolean isLoggedIn(WebDriver driver) {
        return WaitUtils.waitForElementPresence(driver);
    }
}