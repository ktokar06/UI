package com.example.autotests.pages;

import com.example.autotests.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Страница главной страницы веб-приложения.
 */
public class HomePage extends BasePage {

    /**
     * Элемент ссылки для выхода из системы.
     */
    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver экземпляр веб-драйвера, необходимый для взаимодействия со страницей
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Нажимает на ссылку для выхода из системы.
     */
    public void clickLogout() {
        logoutLink.click();
    }
}