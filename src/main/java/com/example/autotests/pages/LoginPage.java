package com.example.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {
    private final WebDriver driver;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/form/ng-form/div[1]/div/div/input")
    public WebElement usernameDescription;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/form/div[3]/button")
    public WebElement submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    public void setUsernameDescription(String description) {
        usernameDescription.clear();
        usernameDescription.sendKeys(description);
    }

    public void setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void clickLoginButton() {
        submitButton.click();
    }

    public boolean isLoggedIn(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("/html/body/div[1]/div/div/div/p[2]")));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}