# Automatización ejercicio Sophos
> Repositorio Automatización Ejercicio  Sophos donde. Basado en un patrón de Diseño ScreenPlay el cual nos permite estructurar los paquetes de
>- Factories: Clases encargadas de crear objetos models y "convertir" los datos JSON a objectos Java   
>- Models: Clases donde se manejan los datos a utilizar en la ejecución
>- Questions: Validación de estado de objetos en la interfaz
>- Tasks: Ejecución de Pasos y acciones sobre el navegador
>- UI: Especificación de elementos de la UI
>- Utils: Clases reutilizables con acciones llamadas desde diferentes escenarios
>
>Una estructura Java donde se pueden crear los
>- Runners: Clases ejecutoras de casos de prueba
>- StepsDefinitions: Definición de pasos y órden de ejecución
>
>Y donde tenemos los casos de Pruebas especificados
>- Features: Definición de escenarios y casos de prueba en lenguaje Gherkin
>
>Se utilizó SerenityBDD por la integración que tiene con Cucumber y el lenguaje Gherkin, de igual manera para funcionalidades menos concurrentes se utiliza Selenium Web Driver teniendo en cuenta que no genera ninguna inconformidad o error al moento de la importación de librerías o utilidades.

**Pre-requisitos**
- jdk1.8.0_241
- jre1.8.0_241
- IntelliJ
- Driver Chrome

**Ejecución**
- mvn clean verify -Dtest=ReserveFlightsRunner

**Construido con**
- Maven
- Cucumber
- Selenium Web Driver
- SerenityBDD
- Java

**Opciones**
- Lenguaje Gherkin
- Config UTF-8
- Especificación de librerías en pom.xml
