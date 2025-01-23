package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TitlePage extends BasePage {

    // 1.1 Проверка открытия страницы
    @FindBy(css = ".ast-above-header-bar")
    private WebElement header;

    @FindBy(css = "#masthead")
    private WebElement navigationBar;

    @FindBy(id ="menu-item-27625")
    private WebElement registrationButton;

    @FindBy(css = ".elementor-element-populated")
    private WebElement courseList;

    @FindBy(css = ".elementor-background-overlay")
    private WebElement footer;


    // 1.2 Проверка хедера с контактной информацией
    @FindBy(css = ".elementor-icon-list-items")
    private WebElement contactInfo;


    // 1.3 Блок с курсами (Most Popular Software Testing Courses)
    @FindBy(css = ".swiper-button-next")
    private WebElement nextCourseButton;

    @FindBy(css = ".swiper-button-prev")
    private WebElement previousCourseButton;

    // 1.4 Футер
    @FindBy(css = ".elementor-icon-list-item > a")
    private WebElement footerInfo;


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
    @Step("Получение заголовка страницы")
    public WebElement getHeader() {
        return header;
    }

    /**
     * Установка заголовка страницы.
     *
     * @param header Новый заголовок страницы.
     */
    @Step("Установка заголовка страницы")
    public void setHeader(WebElement header) {
        this.header = header;
    }

    /**
     * Получение навигационной панели страницы.
     *
     * @return Навигационная панель страницы.
     */
    @Step("Получение навигационной панели страницы")
    public WebElement getNavigationBar() {
        return navigationBar;
    }

    /**
     * Установка навигационной панели страницы.
     *
     * @param navigationBar Новая навигационная панель страницы.
     */
    @Step("Установка навигационной панели страницы")
    public void setNavigationBar(WebElement navigationBar) {
        this.navigationBar = navigationBar;
    }

    /**
     * Получение кнопки регистрации.
     *
     * @return Кнопка регистрации.
     */
    @Step("Получение кнопки регистрации")
    public WebElement getRegistrationButton() {
        return registrationButton;
    }

    /**
     * Установка кнопки регистрации.
     *
     * @param registrationButton Новая кнопка регистрации.
     */
    @Step("Установка кнопки регистрации")
    public void setRegistrationButton(WebElement registrationButton) {
        this.registrationButton = registrationButton;
    }

    /**
     * Получение списка курсов.
     *
     * @return Список курсов.
     */
    @Step("Получение списка курсов")
    public WebElement getCourseList() {
        return courseList;
    }

    /**
     * Установка списка курсов.
     *
     * @param courseList Новый список курсов.
     */
    @Step("Установка списка курсов")
    public void setCourseList(WebElement courseList) {
        this.courseList = courseList;
    }

    /**
     * Получение футера страницы.
     *
     * @return Футер страницы.
     */
    @Step("Получение футера страницы")
    public WebElement getFooter() {
        return footer;
    }

    /**
     * Установка футера страницы.
     *
     * @param footer Новый футер страницы.
     */
    @Step("Установка футера страницы")
    public void setFooter(WebElement footer) {
        this.footer = footer;
    }

    /**
     * Получение ссылок на контакную информацию.
     *
     * @return Ссылки на социальные сети.
     */
    @Step("Получение ссылок на социальные сети")
    public WebElement getContactInfo() {
        return contactInfo;
    }

    /**
     * Установка ссылок на контакную информацию.
     *
     * @param contactInfo Новые ссылки на социальные сети.
     */
    @Step("Установка ссылок на социальные сети")
    public void setContactInfo(WebElement contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * Получение кнопки для перехода к следующему курсу.
     *
     * @return Кнопка для перехода к следующему курсу.
     */
    @Step("Получение кнопки для перехода к следующему курсу")
    public WebElement getNextCourseButton() {
        return nextCourseButton;
    }

    /**
     * Установка кнопки для перехода к следующему курсу.
     *
     * @param nextCourseButton Новая кнопка для перехода к следующему курсу.
     */
    @Step("Установка кнопки для перехода к следующему курсу")
    public void setNextCourseButton(WebElement nextCourseButton) {
        this.nextCourseButton = nextCourseButton;
    }

    /**
     * Получение кнопки для перехода к предыдущему курсу.
     *
     * @return Кнопка для перехода к предыдущему курсу.
     */
    @Step("Получение кнопки для перехода к предыдущему курсу")
    public WebElement getPreviousCourseButton() {
        return previousCourseButton;
    }

    /**
     * Установка кнопки для перехода к предыдущему курсу.
     *
     * @param previousCourseButton Новая кнопка для перехода к предыдущему курсу.
     */
    @Step("Установка кнопки для перехода к предыдущему курсу")
    public void setPreviousCourseButton(WebElement previousCourseButton) {
        this.previousCourseButton = previousCourseButton;
    }

    /**
     * Получение элемента с номерами телефонов в футере.
     *
     * @return Элемент с номерами телефонов.
     */
    @Step("Получение элемента с номерами телефонов в футере")
    public WebElement getFooterInfo() {
        return footerInfo;
    }

    /**
     * Установка элемента с номерами телефонов в футере.
     *
     * @param footerPhoneNumbers Новый элемент с номерами телефонов.
     */
    @Step("Установка элемента с номерами телефонов в футере")
    public void setFooterInfo(WebElement footerPhoneNumbers) {
        this.footerInfo = footerPhoneNumbers;
    }
}