package com.example.autotests.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import static com.example.autotests.test.AuthorizationTests.URL;


/**
 * Базовый класс для всех тестов.
 *
 * Этот класс обеспечивает настройку и завершение тестов, создавая и уничтожая экземпляр веб-драйвера.
 */
public class BaseTest {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    protected WebDriver driver;

    /**
     * Метод, выполняемый перед каждым тестовым методом.
     *
     * Создаёт новый экземпляр веб-драйвера, максимизирует окно браузера и устанавливает время ожидания для поиска элементов.
     */
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get(URL);
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
}