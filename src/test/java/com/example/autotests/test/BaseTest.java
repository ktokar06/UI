package com.example.autotests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

import static com.example.autotests.config.MyConfig.*;

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
     * Этот метод создает новый экземпляр веб-драйвера для указанного браузера,
     * максимизирует окно браузера и устанавливает время ожидания для поиска элементов.
     *
     * @param browser Название браузера, для которого будет создан веб-драйвер.
     *                Возможные значения: "chrome", "firefox", "ie", "edge".
     */
    @BeforeMethod
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                throw new IllegalArgumentException("Неподдерживаемый браузер: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL_COOKIE);
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