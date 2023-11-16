Feature: user use alerts in the application

  Scenario Outline: user use alerts in the application
    Given user open application
    And select option
      | <option> | <subMenu> |
    When tour in alerts
      | <text> |
    Then validates alerts "<text>"

    Examples:
      | option                  | subMenu | text   |
      | Alerts, Frame & Windows |  Alerts | prueba |