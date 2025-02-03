package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasicAuthPage extends BasePage {

    @FindBy(id = "displayImage")
    private WebElement buttonDisplay;

    @FindBy(id = "downloadImg")
    private WebElement downloadImg;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonDisplay() {
        return buttonDisplay;
    }

    public void setButtonDisplay(WebElement buttonDisplay) {
        this.buttonDisplay = buttonDisplay;
    }

    @Step("Открыть алерт-бокс")
    public void openAlertBox() {
        buttonDisplay.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.sendKeys("httpwatch");
        alert.accept();

        getDriver().switchTo().defaultContent();
    }

    /**
     * Шаг для проверки наличия текста алерта.
     */
    @Step("Проверить наличие текста алерта")
    public void isAlertTextPresent() {
        Assert.assertTrue(downloadImg.isDisplayed());
    }
}