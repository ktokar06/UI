Feature: Выход из системы

  @success
  Scenario: Пользователь выходит из системы успешно
    Given Я вошел в приложение
    When Я нажимаю на кнопку "Выход"
    Then Я должен увидеть поля для входа

  @fail
  Scenario: Пользователь не может выйти из системы, потому что он не вошел
    Given Я не вошел в приложение
    When Я нажимаю на кнопку "Выход"
    Then Я должен увидеть сообщение об ошибке "Вы должны быть авторизованы, чтобы выйти"