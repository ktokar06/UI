package com.example.autotests.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Реализация интерфейса {@link IRetryAnalyzer}, которая определяет стратегию повтора тестов в случае их провала.
 * Этот класс используется для автоматического перезапуска тестов, которые потерпели неудачу, до достижения максимального количества попыток.
 */
public class NgRetry implements IRetryAnalyzer {

    /**
     * Текущий счетчик попыток перезапуска теста.
     */
    private int count = 0;

    /**
     * Максимальное количество попыток перезапуска теста.
     */
    private int maxCount = 2;

    /**
     * Метод, определяющий, нужно ли повторить выполнение теста после его провала.
     *
     * @param result Результат выполнения теста.
     * @return {@code true}, если необходимо повторить выполнение теста, иначе {@code false}.
     */
    @Override
    public boolean retry(ITestResult result) {
        if (!result.isSuccess()) {
            System.out.println("Тест упал! Попытка №" + (count + 1));
            if (count < maxCount) {
                count++;
                return true;
            }
        }
        return false;
    }
}