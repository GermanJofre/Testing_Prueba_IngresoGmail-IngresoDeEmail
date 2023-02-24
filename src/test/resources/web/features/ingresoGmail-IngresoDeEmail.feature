Feature: Como potencial usuario quiero ingresar a gmail y colocar mi correo

  @Smoke
  Scenario: El usuario busca gmail a traves del buscador
    Given Como usuario estoy en el buscador de Google
    When Como usuario busco gmail en el buscador
    Then Como usuario ingreso a la pagina de gmail

  @Smoke
  Scenario Outline: El usuario quiere ingresar su email
    Given Como usuario ingrese a gmail atreves del buscador
    When Como usuario ingreso para logearme
    And Como usuario ingreso mi <correo>
    Then Como usuario verifico que aparezca el boton siguiente
    Examples:
      | correo                   |
      | yermannintendo@gmail.com |
