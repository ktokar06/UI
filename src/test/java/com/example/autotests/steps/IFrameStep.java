package com.example.autotests.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import static com.example.autotests.config.MyConfig.URL_IFRAME;


/**
 * Класс для автоматизации тестирования взаимодействия с элементами внутри iframe.
 */
public class IFrameStep {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    private WebDriver driver;

    /**
     * Локатор для фрейма, содержащего элементы для перетаскивания.
     */
    @FindBy(css = "iframe[src='droppable/default.html']")
    private WebElement frameElement;

    /**
     * Локатор для элемента, который будет использоваться для перетаскивания.
     */
    @FindBy(id = "draggable")
    private WebElement draggableElement;

    /**
     * Локатор для элемента, на который будет осуществляться перетаскивание.
     */
    @FindBy(id = "droppable")
    private WebElement droppableElement;

    /**
     * Открывает тестируемую страницу и инициализирует элементы на ней.
     */
    @Given("I have opened the page iframe")
    public void i_have_opened_the_page_iframe() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL_IFRAME);
        PageFactory.initElements(driver, this);
    }

    /**
     * Выполняет перетаскивание элемента {@link #draggableElement} на элемент {@link #droppableElement}.
     */
    @When("I drag an element to a receiving element")
    public void i_drag_an_element_to_a_receiving_element() {
        driver.switchTo().frame(frameElement);

        Actions actions = new Actions(driver);
        actions.clickAndHold(draggableElement)
                .moveToElement(droppableElement)
                .release()
                .build()
                .perform();

        driver.switchTo().defaultContent();
    }

    /**
     * Проверяет, изменился ли текст принимающего элемента после успешного перетаскивания.
     *
     * @return true, если текст изменен успешно, иначе false.
     */
    @Then("The text of the receiving element has changed")
    public boolean the_text_of_the_receiving_element_has_changed() {
        driver.switchTo().frame(frameElement);

        String expectedClass = "ui-droppable ui-state-highlight";
        String actualClass = droppableElement.getAttribute("class");

        boolean isSuccessful = actualClass.contains(expectedClass);

        driver.switchTo().defaultContent();

        return isSuccessful;
    }
}