package com.example.autotests.test;

import com.example.autotests.pages.LoginPage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testng.Assert;
import org.testng.annotations.Test;

//@ExtendWith(TestListener.class)
public class FailedTest extends BaseTest {

    /**
     * Тест для проверки видимости полей.
     */
    @Test
    public void visibilityCheck() {
        LoginPage loginPage = new LoginPage(getDriver());

        Assert.assertFalse(loginPage.getUsername().isDisplayed());
        Assert.assertFalse(loginPage.getPassword().isDisplayed());
        Assert.assertFalse(loginPage.getSubmitButton().isEnabled());
    }
}
