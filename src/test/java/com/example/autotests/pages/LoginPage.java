package com.example.autotests.pages;

import com.example.autotests.base.BasePage;
import com.example.autotests.util.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс, представляющий страницу входа в веб-приложение.
 */
public class LoginPage extends BasePage {

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
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Устанавливает имя пользователя в соответствующее поле.
     *
     * @param username имя пользователя для ввода
     */
    public void setUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    /**
     * Устанавливает описание имени пользователя в соответствующее поле.
     *
     * @param description описание имени пользователя для ввода
     */
    public void setUsernameDescription(String description) {
        this.usernameDescription.clear();
        this.usernameDescription.sendKeys(description);
    }

    /**
     * Устанавливает пароль в соответствующее поле.
     *
     * @param password пароль для ввода
     */
    public void setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    /**
     * Нажимает кнопку для отправки формы входа.
     */
    public void clickLoginButton() {
        submitButton.click();
    }

    /**
     * Проверяет, выполнен ли успешный вход в систему.
     *
     * @param driver экземпляр веб-драйвера, необходимый для проверки состояния страницы
     * @return true, если пользователь успешно вошёл в систему, иначе false
     */
    public boolean isLoggedIn(WebDriver driver) {
        return WaitUtils.waitUtils;
    }
}