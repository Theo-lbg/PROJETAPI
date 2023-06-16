Feature: Composant test

  Background:
    * url 'http://localhost:8081'

  Scenario: Get All Composant

    Given path '/composant'
    When method GET
    Then status 200
    When method GET
    Then status 200
