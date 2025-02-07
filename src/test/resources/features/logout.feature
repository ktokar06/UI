Feature: Выход из системы

  Scenario: Пользователь выходит из системы успешно
    Given Я вошел в приложение на странине https://www.way2automation.com/angularjs-protractor/registeration/#/login.
    When Я нажимаю на кнопку "Выход"
    Then Я должен увидеть поля для входа
