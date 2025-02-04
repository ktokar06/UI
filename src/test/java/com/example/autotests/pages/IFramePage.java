package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Класс, представляющий страницу с элементом для перетаскивания внутри iframe.
 */
public class IFramePage extends BasePage {

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
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public IFramePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Получает элемент фрейма, содержащий элементы для перетаскивания.
     *
     * @return Элемент фрейма.
     */
    public WebElement getFrameElement() {
        return frameElement;
    }

    /**
     * Устанавливает элемент фрейма, содержащий элементы для перетаскивания.
     *
     * @param frameElement Новый элемент фрейма.
     */
    public void setFrameElement(WebElement frameElement) {
        this.frameElement = frameElement;
    }

    /**
     * Получает элемент, который будет использоваться для перетаскивания.
     *
     * @return Элемент для перетаскивания.
     */
    public WebElement getDraggableElement() {
        return draggableElement;
    }

    /**
     * Устанавливает элемент, который будет использоваться для перетаскивания.
     *
     * @param draggableElement Новый элемент для перетаскивания.
     */
    public void setDraggableElement(WebElement draggableElement) {
        this.draggableElement = draggableElement;
    }

    /**
     * Получает элемент, на который будет осуществляться перетаскивание.
     *
     * @return Целевой элемент для перетаскивания.
     */
    public WebElement getDroppableElement() {
        return droppableElement;
    }

    /**
     * Устанавливает элемент, на который будет осуществляться перетаскивание.
     *
     * @param droppableElement Новый целевой элемент для перетаскивания.
     */
    public void setDroppableElement(WebElement droppableElement) {
        this.droppableElement = droppableElement;
    }

    /**
     * Перетаскивает элемент draggableElement на элемент droppableElement.
     */
    @Step("Перетаскиваем элемент")
    public void dragAndDropElement() {
        getDriver().switchTo().frame(frameElement);

        Actions actions = new Actions(getDriver());
        actions.clickAndHold(draggableElement)
                .moveToElement(droppableElement)
                .release()
                .build()
                .perform();

        getDriver().switchTo().defaultContent();
    }

    /**
     * Проверяет успешность выполнения операции Drag-and-drop.
     *
     * @return true, если операция Drag-and-drop была успешной, иначе false
     */
    @Step("Проверяем успешность перетаскивания элемента")
    public boolean verifyDragAndDropSuccess() {
        getDriver().switchTo().frame(frameElement);

        String expectedClass = "ui-droppable ui-state-highlight";
        String actualClass = droppableElement.getAttribute("class");

        boolean isSuccessful = actualClass.contains(expectedClass);

        getDriver().switchTo().defaultContent();

        return isSuccessful;
    }
}