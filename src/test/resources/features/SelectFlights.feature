#Created for Edison Vasquez
#14 - Marzo - 2021
#language: es

Característica: Validar selección de Vuelos
  Como un usuario de Avianca
  Quiero utilizar la aplicación Web
  Para comprar vuelos a diferentes destinos

  @Smoke @
  Esquema del escenario: Seleccionar vuelos
    Dado que el usuario Edison accede hasta la página de Avianca
    Cuando el selecciona los datos del vuelo <vuelo>
    Entonces el debería poder reservar el vuelo correctamente

    Ejemplos:
      | vuelo |
      | 1     |
      | 2     |
      | 3     |
