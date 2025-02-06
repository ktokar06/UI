package com.example.autotests.test;

import io.qameta.allure.Step;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;


import static com.example.autotests.config.MyConfig.*;

import static com.example.autotests.config.MyConfig.URL_TABS;
import static com.example.autotests.config.MyConfig.URL_IFRAME;


/**
 * Базовый класс для всех тестов.
 *
 * Этот класс обеспечивает настройку и завершение тестов, создавая и уничтожая экземпляр веб-драйвера.
 */
public class BaseTest {

    /**
     * Веб-драйвер, который используется для управления браузером и выполнения действий на страницах.
     */
    private static WebDriver driver;

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

        driver.get(URL_BASIC);


        driver.get(URL_TABS);

        driver.get(URL_IFRAME);


    }

    /**
     * Метод, выполняемый после каждого тестового метода.
     *FailedScreenshot
     * Закрывает браузер и освобождает ресурсы.
     */
    @AfterMethod
    public void tearDown()  {
        Allure.getLifecycle().addAttachment(
                "Screenshot", "image/png", "png"
                , ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)
        );
        getDriver().close();
        getDriver().quit();
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