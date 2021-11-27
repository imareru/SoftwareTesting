Feature: go on site

  Scenario: Logging in to site
    Given I open log in form
    When type to input with name "p_login" text: "RRAkhmetzyanova"
    And enter to input with name "p_pass" text: "ikaz4y6w"
    Then press element with text "Отправить"

  Scenario: Navigate through the site
    Given go to "Успеваемость"
    Then open page "Личный профиль"

  Scenario: Download something
    Given go back to main page
    And open "Заявления"
    And install document
    Then press key with text "Выход"