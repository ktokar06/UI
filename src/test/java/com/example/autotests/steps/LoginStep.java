package com.example.autotests.steps;

import com.example.autotests.test.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep extends BaseTest {

    @Given("Я нахожусь на странице входа")
    public void navigateToLoginPage() {

    }

    @When("Я ввожу имя пользователя и пароль")
    public void enterCredentials(String credentialsType) {

    }

    @When("Я нажимаю на кнопку Войти")
    public void clickButton(String buttonText) {

    }

    @Then("Я должен увидеть сообщение")
    public void verifyMessage(String expectedMessage) {

    }
}