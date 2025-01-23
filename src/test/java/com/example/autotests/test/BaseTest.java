package com.example.autotests.test;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import static com.example.autotests.test.AuthorizationTests.URL_LOGIN;
import static com.example.autotests.test.TitleTest.URL_TITLE;

/**
 * Базовый класс для всех тестов.
 *
 * Этот класс обеспечивает настройку и завершение тестов, создавая и уничтожая экземпляр веб-драйвера.
 */
public class BaseTest {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    private WebDriver driver;

    /**
     * Метод, выполняемый перед каждым тестовым методом.
     *
     * Создаёт новый экземпляр веб-драйвера, максимизирует окно браузера и устанавливает время ожидания для поиска элементов.
     */
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.get(URL_LOGIN);
        driver.get(URL_TITLE);
    }

    /**
     * Метод, выполняемый после каждого тестового метода.
     *
     * Закрывает браузер и освобождает ресурсы.
     */
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Возвращает текущий экземпляр веб-драйвера.
     *
     * @return Экземпляр веб-драйвера.
     */
    @Step("Получение текущего экземпляра веб-драйвера")
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Устанавливает новый экземпляр веб-драйвера.
     *
     * @param driver Новый экземпляр веб-драйвера.
     */
    @Step("Установка нового экземпляра веб-драйвера")
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}