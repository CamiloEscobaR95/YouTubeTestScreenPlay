Feature: Como usuario de youtube
  quiero ingresar al aplicativo
  para validar sus diferentes funcionalidades.

  Background:
    Given el usuario ingresa a youtube

  @CP_Busq_youtube
  Scenario Outline: Busqueda de cancion
    When  el usuario realiza la busqueda de un tema <tema>
    Then el usuario visulaiza los diferentes resultados de busqueda <tema>

    Examples:

      | tema                 |
      | UB40 - Kingston Town |


  @_Suscripcion_canal
  Scenario Outline:
    Given el usuario realiza la busqueda de un canal <canal>
    When  el usuario se suscribe a el canal
    Then el usuario valida la suscripcion <canal>

    Examples:
      | canal       |
      | Julian Mesa |