package com.example.autotests.pages;

import com.example.autotests.util.WaitUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс, представляющий страницу входа в веб-приложение.
 */
public class LoginPage extends BasePage{

    /**
     * Поле для ввода имени пользователя.
     */
    @FindBy(id = "username")
    public WebElement username;

    /**
     * Поле для ввода пароля.
     */
    @FindBy(id = "password")
    public WebElement password;

    /**
     * Поле для ввода описания имени пользователя.
     */
    @FindBy(id = "formly_1_input_username_0")
    public WebElement usernameDescription;

    /**
     * Кнопка для отправки формы входа.
     */
    @FindBy(className = "btn-danger")
    public WebElement submitButton;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver экземпляр веб-драйвера, необходимый для взаимодействия со страницей
     */

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Устанавливает имя пользователя в соответствующее поле.
     *
     * @param username имя пользователя для ввода
     */
    @Step("Заполняет поле 'Имя' значением {password}")
    public void setUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    /**
     * Устанавливает пароль в соответствующее поле.
     *
     * @param password пароль для ввода
     */
    @Step("Заполняет поле 'Пароль' значением {password}")
    public void setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    /**
     * Устанавливает описание имени пользователя в соответствующее поле.
     *
     * @param description описание имени пользователя для ввода
     */
    @Step("Заполняет поле 'Описание пользователя' значением {description}")
    public void setUsernameDescription(String description) {
        this.usernameDescription.clear();
        this.usernameDescription.sendKeys(description);
    }

    /**
     * Нажимает кнопку для отправки формы входа.
     */
    @Step("Нажимает кнопку под названием 'Login'")
    public void clickLoginButton() {
        this.submitButton.click();
    }

    /**
     * Проверяет, выполнен ли успешный вход в систему.
     *
     * @param driver экземпляр веб-драйвера, необходимый для проверки состояния страницы
     * @return true, если пользователь успешно вошёл в систему, иначе false
     */
    @Step(value = "Проверяет, выполнен ли успешный вход в систему")
    public boolean isLoggedIn(WebDriver driver) {
        return WaitUtils.waitForElementPresence(driver);
    }
}