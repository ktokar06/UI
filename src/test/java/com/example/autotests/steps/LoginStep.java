package com.example.autotests.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.example.autotests.config.MyConfig.*;

public class LoginStep {

    private WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        driver = new ChromeDriver();
        driver.get(URL_LOGIN);

    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {

    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String b) {

    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String string) {

    }
}