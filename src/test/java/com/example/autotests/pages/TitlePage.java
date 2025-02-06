package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс представляет главную страницу сайта и содержит элементы, необходимые для тестирования.
 */

public class TitlePage extends BasePage {

    /**
     * Элемент заголовочной области страницы.
     */
    @FindBy(css = ".ast-above-header-bar")
    private WebElement header;

    /**
     * Элемент навигационной панели.
     */
    @FindBy(css = "#masthead")
    private WebElement navigationBar;

    /**
     * Кнопка регистрации.
     */
    @FindBy(id = "menu-item-27625")
    private WebElement registrationButton;

    /**
     * Список курсов.
     */
    @FindBy(css = ".elementor-element-populated")
    private WebElement courseList;

    /**
     * Элемент подвала страницы.
     */
    @FindBy(css = ".elementor-background-overlay")
    private WebElement footer;

    /**
     * Контактная информация в хедере.
     */
    @FindBy(css = ".elementor-icon-list-items")
    private WebElement headerContactInfo;

    /**
     * Кнопка перехода к следующему курсу.
     */
    @FindBy(css = ".swiper-button-next")
    private WebElement nextCourseButton;

    /**
     * Кнопка возврата к предыдущему курсу.
     */
    @FindBy(css = ".swiper-button-prev")
    private WebElement previousCourseButton;

    /**
     * Контактная информация в подвале.
     */
    @FindBy(css = ".elementor-icon-list-item > a")
    private WebElement footerContactInfo;


    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public TitlePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Получение заголовка страницы.
     *
     * @return Заголовок страницы.
     */
    public WebElement getHeader() {
        return header;
    }

    /**
     * Установка заголовка страницы.
     *
     * @param header Новый заголовок страницы.
     */
    public void setHeader(WebElement header) {
        this.header = header;
    }

    /**
     * Получение навигационной панели страницы.
     *
     * @return Навигационная панель страницы.
     */
    public WebElement getNavigationBar() {
        return navigationBar;
    }

    /**
     * Установка навигационной панели страницы.
     *
     * @param navigationBar Новая навигационная панель страницы.
     */
    public void setNavigationBar(WebElement navigationBar) {
        this.navigationBar = navigationBar;
    }

    /**
     * Получение кнопки регистрации.
     *
     * @return Кнопка регистрации.
     */
    public WebElement getRegistrationButton() {
        return registrationButton;
    }

    /**
     * Установка кнопки регистрации.
     *
     * @param registrationButton Новая кнопка регистрации.
     */
    public void setRegistrationButton(WebElement registrationButton) {
        this.registrationButton = registrationButton;
    }

    /**
     * Получение списка курсов.
     *
     * @return Список курсов.
     */
    public WebElement getCourseList() {
        return courseList;
    }

    /**
     * Установка списка курсов.
     *
     * @param courseList Новый список курсов.
     */
    public void setCourseList(WebElement courseList) {
        this.courseList = courseList;
    }

    /**
     * Получение футера страницы.
     *
     * @return Футер страницы.
     */
    public WebElement getFooter() {
        return footer;
    }

    /**
     * Установка футера страницы.
     *
     * @param footer Новый футер страницы.
     */
    public void setFooter(WebElement footer) {
        this.footer = footer;
    }

    /**
     * Получение элементов, содержащих контактные данные в хедере страницы.
     *
     * @return Веб-элемент с контактными данными в хедере.
     */
    public WebElement getHeaderContactInfo() {
        return headerContactInfo;
    }

    /**
     * Установка новых элементов, содержащих контактные данные в хедере страницы.
     *
     * @param headerContactInfo Новые веб-элементы с контактными данными для хедера.
     */
    public void setHeaderContactInfo(WebElement headerContactInfo) {
        this.headerContactInfo = headerContactInfo;
    }

    /**
     * Получение кнопки для перехода к следующему курсу.
     *
     * @return Кнопка для перехода к следующему курсу.
     */
    public WebElement getNextCourseButton() {
        return nextCourseButton;
    }

    /**
     * Установка кнопки для перехода к следующему курсу.
     *
     * @param nextCourseButton Новая кнопка для перехода к следующему курсу.
     */
    public void setNextCourseButton(WebElement nextCourseButton) {
        this.nextCourseButton = nextCourseButton;
    }

    /**
     * Получение кнопки для перехода к предыдущему курсу.
     *
     * @return Кнопка для перехода к предыдущему курсу.
     */
    public WebElement getPreviousCourseButton() {
        return previousCourseButton;
    }

    /**
     * Установка кнопки для перехода к предыдущему курсу.
     *
     * @param previousCourseButton Новая кнопка для перехода к предыдущему курсу.
     */
    public void setPreviousCourseButton(WebElement previousCourseButton) {
        this.previousCourseButton = previousCourseButton;
    }

    /**
     * Возвращает элемент, содержащий контактную информацию в подвале страницы.
     *
     * @return Веб-элемент с контактной информацией в подвале.
     */
    public WebElement getFooterContactInfo() {
        return footerContactInfo;
    }

    /**
     * Устанавливает новый элемент, содержащий контактную информацию в подвале страницы.
     *
     * @param footerContactInfo Новый веб-элемент с контактной информацией для подвала.
     */
    public void setFooterContactInfo(WebElement footerContactInfo) {
        this.footerContactInfo = footerContactInfo;
    }

    /**
     * Прокручивает страницу браузера влево на 500 пикселей относительно текущего положения окна.
     *
     * @param driver Веб-драйвер, используемый для управления браузером.
     * @return {@code true}, если прокрутка выполнена успешно, иначе {@code false}.
     */
    @Step("Прокрутить страницу влево")
    public boolean clickLeft(WebDriver driver) {
        scrollToElementLeft(previousCourseButton);
        return false;
    }

    /**
     * Прокручивает страницу браузера вправо на 500 пикселей относительно текущего положения окна.
     *
     * @param driver Веб-драйвер, используемый для управления браузером.
     * @return {@code true}, если прокрутка выполнена успешно, иначе {@code false}.
     */
    @Step("Прокрутить страницу вправо")
    public boolean clickRight(WebDriver driver) {
        scrollToElementRight(nextCourseButton);
        return false;
    }

    /**
     * Прокручивает страницу браузера вниз на 500 пикселей относительно текущего положения окна.
     *
     * @param driver Веб-драйвер, используемый для управления браузером.
     * @return {@code true}, если прокрутка выполнена успешно, иначе {@code false}.
     */
    @Step("Прокрутка страницы вниз")
    public boolean clickDown(WebDriver driver) {
        scrollToElementDown(courseList);
        return false;
    }
}