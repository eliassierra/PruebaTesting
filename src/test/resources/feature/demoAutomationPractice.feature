Feature: Automation Practice
      Como Usuario
      Quiero ingresar a automationpractice.com
      A crear una cuenta de usuario

  @CrearUserExitoso
  Scenario Outline: Crear User
    Given Cristian ingresa a la pagina web
    And ingresar correo
      |<Email>|
    When Diliencio el formulario de creacion de cuenta
    |firstName|lastName|password|company|directory|city|state|codeP|country|mobilePhone|
    |<firstName>|<lastName>|<password>|<company>|<directory>|<city>|<state>|<codeP>|<country>|<mobilePhone>|
    Then se crea la cuenta satisfactoriamente
    Examples:
    |Email|firstName|lastName|password|company|directory|city|state|codeP|country|mobilePhone|
    |carlosAtencia@gmal.com|Carlos|Atencia|1234567|Choucair|Calle 27|Sincelejo|Alabama|055450|United States|3006312895|






