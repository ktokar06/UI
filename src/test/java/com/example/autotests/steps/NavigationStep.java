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
import static com.example.autotests.config.MyConfig.URL_TITLE;


/**
 * Класс, содержащий шаги для тестирования навигации между страницами через навигационное меню.
 */
public class NavigationStep {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    private WebDriver driver;

    /**
     * Кнопка 'All Courses'.
     */
    @FindBy(linkText = "All Courses")
    private WebElement buttonAllCourse;

    /**
     * Кнопка 'Lifetime Membership'.
     */
    @FindBy(linkText = "Lifetime Membership")
    private WebElement buttonLifeTime;

    /**
     * Шаг открытия главной страницы сайта.
     *
     * @throws Exception при возникновении ошибки во время инициализации драйвера или загрузки страницы
     */
    @Given("I open the homepage of the website")
    public void i_open_the_homepage_of_the_website() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL_TITLE);
        PageFactory.initElements(driver, this);
    }

    /**
     * Шаг клика на блок 'All Courses'.
     *
     * @throws Exception при возникновении ошибки во время нажатия на элемент
     */
    @When("I click on the All Courses block")
    public void i_click_on_the_block() throws Exception {
        buttonAllCourse.click();
    }

    /**
     * Шаг выбора опции 'Lifetime Membership' в блоке.
     *
     * @throws Exception при возникновении ошибки во время нажатия на элемент
     */
    @When("I select the Lifetime Membership option in this block")
    public void i_select_the_option_in_this_block() throws Exception {
        buttonLifeTime.click();
    }

    /**
     * Проверяет наличие текста 'Lifetime Membership' в заголовке страницы.
     *
     * @return true, если текст присутствует, иначе false
     * @throws Exception при возникновении ошибки во время ожидания элемента
     */
    @Then("The page title contains")
    public boolean the_page_title_contains_the_text() throws Exception {
        return WaitUtils.waitForElementPresence(driver, By.linkText("Lifetime Membership"));
    }
}