Feature: Проверка футера

  @success
  Scenario: Отображение контактной информации в футере
    Given Я открываю главную страницу сайта
    Then Футер отображается
    And Он содержит следующие контактные данные:
      | Адрес              | CDR Complex, 3rd Floor, Naya Bans Market, Sector 15, Noida, Near sec-16 Metro Station|
      | Номер телефона     | +91 97111-11-558                                                                     |
      |                    | +91 97111-91-558                                                                     |
      | Email              | trainer@way2automation.com                                                           |
      |                    | seleniumcoaching@gmail.com                                                           |