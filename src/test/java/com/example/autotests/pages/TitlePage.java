package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TitlePage extends BasePage {

    // 1.1 Проверка открытия страницы
    @FindBy(css = "#ast-desktop-header > div.ast-above-header-wrap")
    private WebElement header;

    @FindBy(name = "#ast-desktop-header > div.ast-main-header-wrap.main-header-bar-wrap > div")
    private WebElement navigationBar;

    @FindBy(id ="menu-item-27625")
    private WebElement registrationButton;

    @FindBy(css = ".elementor-element-8e1bc6a > div:nth-child(1)")
    private WebElement courseList;

    @FindBy(name = "elementor-background-overlay")
    private WebElement footer;


    // 1.2 Проверка хедера с контактной информацией
    @FindBy(css = "header .phone-number")
    private WebElement phoneNumber;

    @FindBy(css = "header .skype-link")
    private WebElement skypeLink;

    @FindBy(css = "header .email-address")
    private WebElement emailAddress;

    @FindBy(css = "header .social-media-links a")
    private WebElement socialMediaLinks;

    // 1.3 Блок с курсами (Most Popular Software Testing Courses)
    @FindBy(css = ".popular-courses .navigation-buttons .next")
    private WebElement nextCourseButton;

    @FindBy(css = ".popular-courses .navigation-buttons .prev")
    private WebElement previousCourseButton;

    // 1.4 Футер
    @FindBy(css = "footer .address")
    private WebElement address;

    @FindBy(css = "footer .phone-number")
    private WebElement footerPhoneNumbers;

    @FindBy(css = "footer .emails")
    private WebElement emails;

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
     * Получение номера телефона.
     *
     * @return Номер телефона.
     */
    @Step("Получение номера телефона")
    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Установка номера телефона.
     *
     * @param phoneNumber Новый номер телефона.
     */
    @Step("Установка номера телефона")
    public void setPhoneNumber(WebElement phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Получение ссылки на Skype.
     *
     * @return Ссылка на Skype.
     */
    @Step("Получение ссылки на Skype")
    public WebElement getSkypeLink() {
        return skypeLink;
    }

    /**
     * Установка ссылки на Skype.
     *
     * @param skypeLink Новая ссылка на Skype.
     */
    @Step("Установка ссылки на Skype")
    public void setSkypeLink(WebElement skypeLink) {
        this.skypeLink = skypeLink;
    }

    /**
     * Получение адреса электронной почты.
     *
     * @return Адрес электронной почты.
     */
    @Step("Получение адреса электронной почты")
    public WebElement getEmailAddress() {
        return emailAddress;
    }

    /**
     * Установка адреса электронной почты.
     *
     * @param emailAddress Новый адрес электронной почты.
     */
    @Step("Установка адреса электронной почты")
    public void setEmailAddress(WebElement emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Получение ссылок на социальные сети.
     *
     * @return Ссылки на социальные сети.
     */
    @Step("Получение ссылок на социальные сети")
    public WebElement getSocialMediaLinks() {
        return socialMediaLinks;
    }

    /**
     * Установка ссылок на социальные сети.
     *
     * @param socialMediaLinks Новые ссылки на социальные сети.
     */
    @Step("Установка ссылок на социальные сети")
    public void setSocialMediaLinks(WebElement socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
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
     * Получение элемента с адресом в футере.
     *
     * @return Элемент с адресом.
     */
    @Step("Получение элемента с адресом в футере")
    public WebElement getAddress() {
        return address;
    }

    /**
     * Установка элемента с адресом в футере.
     *
     * @param address Новый элемент с адресом.
     */
    @Step("Установка элемента с адресом в футере")
    public void setAddress(WebElement address) {
        this.address = address;
    }

    /**
     * Получение элемента с электронными почтовыми адресами в футере.
     *
     * @return Элемент с электронными почтовыми адресами.
     */
    @Step("Получение элемента с электронными почтовыми адресами в футере")
    public WebElement getEmails() {
        return emails;
    }

    /**
     * Установка элемента с электронными почтовыми адресами в футере.
     *
     * @param emails Новый элемент с электронными почтовыми адресами.
     */
    @Step("Установка элемента с электронными почтовыми адресами в футере")
    public void setEmails(WebElement emails) {
        this.emails = emails;
    }

    /**
     * Получение элемента с номерами телефонов в футере.
     *
     * @return Элемент с номерами телефонов.
     */
    @Step("Получение элемента с номерами телефонов в футере")
    public WebElement getFooterPhoneNumbers() {
        return footerPhoneNumbers;
    }

    /**
     * Установка элемента с номерами телефонов в футере.
     *
     * @param footerPhoneNumbers Новый элемент с номерами телефонов.
     */
    @Step("Установка элемента с номерами телефонов в футере")
    public void setFooterPhoneNumbers(WebElement footerPhoneNumbers) {
        this.footerPhoneNumbers = footerPhoneNumbers;
    }
}