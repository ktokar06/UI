package com.example.autotests.steps;

import com.example.autotests.util.WaitUtils;
import io.cucumber.java.en.And;
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
 * Класс для работы с шагами, связанными с выходом из системы.
 */
public class LogoutStep {

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
     * Элемент ссылки для выхода из системы.
     */
    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    /**
     * Кнопка для отправки формы входа.
     */
    @FindBy(className = "btn-danger")
    private WebElement submitButton;


    /**
     * Открывает страницу входа.
     *
     */
    @Given("I have opened the page Login")
    public void i_have_opened_the_page_login(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL_LOGIN);
        PageFactory.initElements(driver, this);
    }

    /**
     * Выполняет ввод корректных учетных данных и осуществляет вход в систему.
     *
     * @throws InterruptedException Если произошло прерывание потока.
     */
    @When("I enter my credentials and log in")
    public void i_enter_my_credentials_and_log_in() throws InterruptedException {
        Thread.sleep(5000);
        username.sendKeys(VALID_USERNAME);
        password.sendKeys(VALID_PASSWORD);
        usernameDescription.sendKeys(VALID_USERNAME_DESCRIPTION);
        submitButton.click();
    }

    /**
     * Нажимает на кнопку выхода из системы.
     */
    @And("I click on the Logout button")
    public void i_click_on_the_logout_button() throws InterruptedException {
        Thread.sleep(5000);
        logoutLink.click();
    }

    /**
     * Проверяет наличие полей для входа на странице.
     *
     * @return true, если поля для входа присутствуют, иначе false.
     */
    @Then("I should see the login fields")
    public boolean i_should_see_the_login_fields() {
        return WaitUtils.waitForElementPresence(driver, By.cssSelector("body > div.jumbotron > div > div > div"));
    }
}