package com.example.autotests.steps;

import com.example.autotests.util.WaitUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import static com.example.autotests.config.MyConfig.URL_ALERT;


/**
 * Класс для автоматизации тестирования работы с алертами.
 *
 * @author Ваше имя
 */
public class AlertStep {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    private WebDriver driver;

    /**
     * Локатор для фрейма, содержащего элементы для работы с алертами.
     */
    @FindBy(css = "iframe[src='alert/input-alert.html']")
    private WebElement frameElement;

    /**
     * Элемент кнопки перехода на вкладку InputAlert.
     */
    @FindBy(css = ".responsive-tabs-default .responsive-tabs li:last-child")
    private WebElement inputButtonAlert;

    /**
     * Кнопка для открытия алерт-бокса.
     */
    @FindBy(css = "body > button")
    private WebElement buttonAlertBox;

    /**
     * Открывает тестируемую страницу и инициализирует элементы на ней.
     */
    @Given("I have opened the page")
    public void i_have_opened_the_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL_ALERT);
        PageFactory.initElements(driver, this);
    }

    /**
     * Вводит текст в алерт и подтверждает его.
     *
     * @throws InterruptedException если возникает ошибка при ожидании
     */
    @When("I enter text into the alert")
    public void i_enter_text_into_the_alert() throws InterruptedException {
        Thread.sleep(5000);

        inputButtonAlert.click();

        driver.switchTo().frame(frameElement);

        buttonAlertBox.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Selenium Test!");
        alert.accept();

        driver.switchTo().defaultContent();
    }

    /**
     * Проверяет наличие элемента с id 'demo' после ввода текста в алерт.
     *
     * @return true, если элемент найден, иначе false
     */
    @Then("The alert's text has changed")
    public boolean the_alert_s_text_has_changed() {
        driver.switchTo().frame(frameElement);

        return WaitUtils.waitForElementPresence(driver, By.id("demo"));
    }
}