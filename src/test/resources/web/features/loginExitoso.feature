Feature: Como potencial usuario quiero ingresar a mi cuenta de gmail

  @Smoke
  Scenario Outline: El usuario busca gmail a traves del buscador, accede a la misma y logra un login exitoso
    Given Como usuario estoy en el buscador de Google
    When Como usuario busco gmail en el buscador
    And Como usuario ingreso a la pagina gmail
    And Como usuario quiero logearme
    And Como usuario ingreso mi <correo> y <contrasena>
    Then Como usuario puedo ingresar a mi correo

    Examples:
      | correo | contrasena |
      | ascs   |       hbjh     |
