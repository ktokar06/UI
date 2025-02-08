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

import static com.example.autotests.config.MyConfig.*;

public class LoginStep {

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

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get(URL_LOGIN);
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("username")).sendKeys(VALID_USERNAME);
        driver.findElement(By.id("password")).sendKeys(VALID_PASSWORD);
        driver.findElement(By.id("formly_1_input_username_0")).sendKeys(VALID_USERNAME_DESCRIPTION);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String buttonText) {
        driver.findElement(By.cssSelector("btn-danger")).click();
    }

    @Then("I should see the message {string}")
    public boolean i_should_see_the_message(String expectedMessage) {
        return WaitUtils.waitForElementPresence(driver, By.cssSelector(".ng-scope "));
    }
}