package com.example.autotests.steps;

import com.example.autotests.util.WaitUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import static com.example.autotests.config.MyConfig.*;


/**
 * Класс для автоматизации тестирования процесса авторизации.
 */
public class LoginStep {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    private WebDriver driver;

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
     * Открывает страницу авторизации и инициализирует элементы на ней.
     */
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL_LOGIN);
        PageFactory.initElements(driver, this);
    }

    /**
     * Заполняет поля формы входа валидными данными.
     */
    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password(){
        username.sendKeys(VALID_USERNAME);
        password.sendKeys(VALID_PASSWORD);
        usernameDescription.sendKeys(VALID_USERNAME_DESCRIPTION);
    }

    /**
     * Нажимает на кнопку с указанным текстом.
     */
    @When("I click on the Login button")
    public void i_click_on_the_button() {
        submitButton.click();
    }

    /**
     * Проверяет наличие сообщения с ожидаемым текстом.
     * @return true, если сообщение найдено, иначе false
     */
    @Then("I should see the message You are logged in!!")
    public boolean i_should_see_the_message() {
        return WaitUtils.waitForElementPresence(driver, By.cssSelector(".ng-scope"));
    }
}