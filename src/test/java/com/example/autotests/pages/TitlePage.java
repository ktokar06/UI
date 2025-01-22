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
     * Возвращает элемент заголовка страницы.
     *
     * @return Элемент заголовка страницы.
     */
    @Step("Получение элемента заголовка страницы")
    public WebElement getHeader() {
        return header;
    }

    /**
     * Устанавливает элемент заголовка страницы.
     *
     * @param header Новый элемент заголовка страницы.
     */
    @Step("Установка элемента заголовка страницы")
    public void setHeader(WebElement header) {
        this.header = header;
    }

    /**
     * Возвращает электронные почты в футере страницы.
     *
     * @return Электронные почты в футере страницы.
     */
    @Step("Получение электронных почт в футере страницы")
    public WebElement getEmails() {
        return emails;
    }

    /**
     * Устанавливает электронные почты в футере страницы.
     *
     * @param emails Новые электронные почты в футере страницы.
     */
    @Step("Установка электронных почт в футере страницы")
    public void setEmails(WebElement emails) {
        this.emails = emails;
    }

    /**
     * Возвращает номера телефонов в футере страницы.
     *
     * @return Номера телефонов в футере страницы.
     */
    @Step("Получение номеров телефонов в футере страницы")
    public WebElement getFooterPhoneNumbers() {
        return footerPhoneNumbers;
    }

    /**
     * Устанавливает номера телефонов в футере страницы.
     *
     * @param footerPhoneNumbers Новые номера телефонов в футере страницы.
     */
    @Step("Установка номеров телефонов в футере страницы")
    public void setFooterPhoneNumbers(WebElement footerPhoneNumbers) {
        this.footerPhoneNumbers = footerPhoneNumbers;
    }

    /**
     * Возвращает адрес компании в футере страницы.
     *
     * @return Адрес компании в футере страницы.
     */
    @Step("Получение адреса компании в футере страницы")
    public WebElement getAddress() {
        return address;
    }

    /**
     * Устанавливает адрес компании в футере страницы.
     *
     * @param address Новый адрес компании в футере страницы.
     */
    @Step("Установка адреса компании в футере страницы")
    public void setAddress(WebElement address) {
        this.address = address;
    }

    /**
     * Возвращает кнопку перехода к предыдущему курсу.
     *
     * @return Кнопку перехода к предыдущему курсу.
     */
    @Step("Получение кнопки перехода к предыдущему курсу")
    public WebElement getPreviousCourseButton() {
        return previousCourseButton;
    }

    /**
     * Устанавливает кнопку перехода к предыдущему курсу.
     *
     * @param previousCourseButton Новая кнопка перехода к предыдущему курсу.
     */
    @Step("Установка кнопки перехода к предыдущему курсу")
    public void setPreviousCourseButton(WebElement previousCourseButton) {
        this.previousCourseButton = previousCourseButton;
    }

    /**
     * Возвращает кнопку перехода к следующему курсу.
     *
     * @return Кнопку перехода к следующему курсу.
     */
    @Step("Получение кнопки перехода к следующему курсу")
    public WebElement getNextCourseButton() {
        return nextCourseButton;
    }

    /**
     * Устанавливает кнопку перехода к следующему курсу.
     *
     * @param nextCourseButton Новая кнопка перехода к следующему курсу.
     */
    @Step("Установка кнопки перехода к следующему курсу")
    public void setNextCourseButton(WebElement nextCourseButton) {
        this.nextCourseButton = nextCourseButton;
    }

    /**
     * Возвращает ссылки на социальные сети в шапке страницы.
     *
     * @return Ссылки на социальные сети в шапке страницы.
     */
    @Step("Получение ссылок на социальные сети в шапке страницы")
    public WebElement getSocialMediaLinks() {
        return socialMediaLinks;
    }

    /**
     * Устанавливает ссылки на социальные сети в шапке страницы.
     *
     * @param socialMediaLinks Новые ссылки на социальные сети в шапке страницы.
     */
    @Step("Установка ссылок на социальные сети в шапке страницы")
    public void setSocialMediaLinks(WebElement socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    /**
     * Возвращает электронную почту в шапке страницы.
     *
     * @return Электронную почту в шапке страницы.
     */
    @Step("Получение электронной почты в шапке страницы")
    public WebElement getEmailAddress() {
        return emailAddress;
    }

    /**
     * Устанавливает электронную почту в шапке страницы.
     *
     * @param emailAddress Новая электронная почта в шапке страницы.
     */
    @Step("Установка электронной почты в шапке страницы")
    public void setEmailAddress(WebElement emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Возвращает ссылку на Skype в шапке страницы.
     *
     * @return Ссылку на Skype в шапке страницы.
     */
    @Step("Получение ссылки на Skype в шапке страницы")
    public WebElement getSkypeLink() {
        return skypeLink;
    }

    /**
     * Устанавливает ссылку на Skype в шапке страницы.
     *
     * @param skypeLink Новая ссылка на Skype в шапке страницы.
     */
    @Step("Установка ссылки на Skype в шапке страницы")
    public void setSkypeLink(WebElement skypeLink) {
        this.skypeLink = skypeLink;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(WebElement phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Возвращает элемент футера страницы.
     *
     * @return Элемент футера страницы.
     */
    @Step("Получение элемента футера страницы")
    public WebElement getFooter() {
        return footer;
    }

    /**
     * Устанавливает элемент футера страницы.
     *
     * @param footer Новый элемент футера страницы.
     */
    @Step("Установка элемента футера страницы")
    public void setFooter(WebElement footer) {
        this.footer = footer;
    }

    /**
     * Возвращает список курсов.
     *
     * @return Элемент списка курсов.
     */
    @Step("Получение списка курсов")
    public WebElement getCourseList() {
        return courseList;
    }

    /**
     * Устанавливает список курсов.
     *
     * @param courseList Новый элемент списка курсов.
     */
    @Step("Установка списка курсов")
    public void setCourseList(WebElement courseList) {
        this.courseList = courseList;
    }

    /**
     * Возвращает кнопку регистрации.
     *
     * @return Элемент кнопки регистрации.
     */
    @Step("Получение кнопки регистрации")
    public WebElement getRegistrationButton() {
        return registrationButton;
    }

    /**
     * Устанавливает кнопку регистрации.
     *
     * @param registrationButton Новый элемент кнопки регистрации.
     */
    @Step("Установка кнопки регистрации")
    public void setRegistrationButton(WebElement registrationButton) {
        this.registrationButton = registrationButton;
    }

    /**
     * Возвращает навигационную панель.
     *
     * @return Элемент навигационной панели.
     */
    @Step("Получение навигационной панели")
    public WebElement getNavigationBar() {

        return navigationBar;
    }

    /**
     * Устанавливает навигационную панель.
     *
     * @param navigationBar Новый элемент навигационной панели.
     */
    @Step("Установка навигационной панели")
    public void setNavigationBar(WebElement navigationBar) {
        this.navigationBar = navigationBar;
    }
}