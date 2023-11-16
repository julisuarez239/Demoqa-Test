Feature: user use auto complete in the application

  Scenario Outline: user use auto complete in the application
    Given user open application
    And select option
      | <option> | <subMenu> |
    When complete form
      | <color1> | <color2> | <color3> |
    Then validates that the text is reflected "<color3>"

    Examples:
      | option  | subMenu       | color1 | color2 | color3 |
      | Widgets | Auto Complete | Black  | White  | White  |