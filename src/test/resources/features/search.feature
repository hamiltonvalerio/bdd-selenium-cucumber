Feature: Google search

  Scenario: Eu quero fazer uma pesquisa no google
    Given Eu estiver no site do google
    When Eu escrevo "spring" no textbox
    Then Eu devo ver os resultados da busca
    Then Eu espero pelo menos 2 resultados

  Scenario: Eu quero fazer uma pesquisa no google
    Given Eu estiver no site do google
    When Eu escrevo "java" no textbox
    Then Eu devo ver os resultados da busca
    Then Eu espero pelo menos 1 resultados
