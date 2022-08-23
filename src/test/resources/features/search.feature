Feature: Google search

  Scenario Outline: Eu quero fazer uma pesquisa no google
    Given Eu estiver no site do google
    When Eu escrevo "<keyword>" no textbox
    And Eu clico no botão search
    Then Eu espero pelo menos <count> resultados

    Examples: 
      | keyword  | count |
      | selenium |     2 |
      | java     |     5 |
      | spring   |     4 |
