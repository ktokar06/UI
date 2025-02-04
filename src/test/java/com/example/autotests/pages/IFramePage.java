package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Класс, представляющий страницу с элементом для перетаскивания внутри iframe.
 */
public class IFramePage extends BasePage {

    /**
     * Локатор для элемента, который будет использоваться для перетаскивания.
     */
    @FindBy(id = "draggable")
    private WebElement dragElement;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public IFramePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Возвращает элемент, который будет использоваться для перетаскивания.
     *
     * @return Элемент для перетаскивания.
     */
    public WebElement getDragElement() {
        return dragElement;
    }

    /**
     * Устанавливает элемент, который будет использоваться для перетаскивания.
     *
     * @param dragElement Новый элемент для перетаскивания.
     */
    public void setDragElement(WebElement dragElement) {
        this.dragElement = dragElement;
    }

    @Step
    public void DragAndDropElement(){
        WebElement frameElement = getDriver().findElement(By.cssSelector("iframe[src='droppable/default.html']"));
        getDriver().switchTo().frame(frameElement);

        WebElement draggableElement = getDriver().findElement(By.id("draggable"));
        WebElement droppableElement = getDriver().findElement(By.id("droppable"));

        Actions actions = new Actions(getDriver());
        actions.clickAndHold(draggableElement)
                .moveToElement(droppableElement)
                .release()
                .build()
                .perform();
    }
}