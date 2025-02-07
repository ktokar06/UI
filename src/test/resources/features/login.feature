Feature: Авторизация

  Scenario: Пользователь входит с действительными учетными данными
    Given Я нахожусь на странице входа https://www.way2automation.com/angularjs-protractor/registeration/#/login.
    When Я ввожу действительные имя пользователя и пароль
    And Я нажимаю на кнопку "Вход"
    Then Я должен увидеть сообщение "Вы вошли!!"
