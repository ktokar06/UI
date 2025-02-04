package com.example.autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFramePage extends BasePage{

    @FindBy(xpath = "/html/body/div/p/a")
    private WebElement buttonBrowser;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public IFramePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonBrowser() {
        return buttonBrowser;
    }

    public void setButtonBrowser(WebElement buttonBrowser) {
        this.buttonBrowser = buttonBrowser;
    }

    public void openBrowser(){
        buttonBrowser.click();
    }
}
