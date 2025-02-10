package com.example.autotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.*;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Представляет страницу авторизации на сайте.
 */
public class CookiePage extends BasePage {

    /**
     * Поле для ввода имени пользователя.
     */
    @FindBy(css = "input[type='text']")
    private WebElement username;

    /**
     * Поле для ввода пароля.
     */
    @FindBy(css = "input[type='password']")
    private WebElement password;

    /**
     * Кнопка для отправки формы входа.
     */
    @FindBy(css = "input[type='submit']")
    private WebElement submitButton;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver Экземпляр веб-драйвера, необходимый для взаимодействия со страницей.
     */
    public CookiePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Возвращает элемент поля для ввода имени пользователя.
     *
     * @return Элемент поля для ввода имени пользователя.
     */
    public WebElement getUsername() {
        return username;
    }

    /**
     * Возвращает элемент поля для ввода пароля.
     *
     * @return Элемент поля для ввода пароля.
     */
    public WebElement getPassword() {
        return password;
    }

    /**
     * Возвращает элемент кнопки для отправки формы входа.
     *
     * @return Элемент кнопки для отправки формы входа.
     */
    public WebElement getSubmitButton() {
        return submitButton;
    }

    /**
     * Устанавливает значение в поле для ввода имени пользователя.
     *
     * @param username Имя пользователя, которое нужно ввести.
     */
    @Step("Заполнить поле 'Имя пользователя' значением '{username}'")
    public CookiePage setUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
        return this;
    }

    /**
     * Устанавливает значение в поле для ввода пароля.
     *
     * @param password Пароль, который нужно ввести.
     */
    @Step("Заполнить поле 'Пароль' значением '{password}'")
    public CookiePage setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
        return this;
    }

    /**
     * Нажимает на кнопку для отправки формы входа.
     */
    @Step("Нажать кнопку 'Login'")
    public CookiePage setSubmitButton() {
        this.submitButton.click();
        return this;
    }

    /**
     * Создает файл для хранения информации о входе.
     */
    @Step("Сохранение куки в файл.")
    public void saveCookies() {
        File file = new File("Cookies.data");
        try {
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);

            for (Cookie ck : getDriver().manage().getCookies()) {
                Bwrite.write(ck.getName() + ";" + ck.getValue()
                        + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
                        + ck.getExpiry() + ";" + ck.isSecure());
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Загружает сохранённые куки из файла.
     */
    @Step("Загрузить куки из файла.")
    public void loadCookies() {
        File file = new File("Cookies.data");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            Map<String, String> cookieMap = new HashMap<>();

            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ";");
                String name = tokenizer.nextToken();
                String value = tokenizer.nextToken();

                cookieMap.put(name, value);
            }

            cookieMap.forEach((name, value) -> getDriver().manage().addCookie(new Cookie(name, value)));

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Обновляет текущую страницу.
     */
    @Step("Обновить страницу после загрузки куки.")
    public void refreshPage() {
        getDriver().navigate().refresh();
    }
}