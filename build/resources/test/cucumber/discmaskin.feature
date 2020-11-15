Feature: Hämta album för artist eller producent
  För att få fram information om skivor
  som en användare
  vill jag få reda på 20 första skivorna

  Scenario: Mata in namn få fram 20 skivor
    Given Jag har en prompt
    When Jag skriver in ett namn
    Then Borde jag få tillbaka de 20 första skivorna av artisten