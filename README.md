# lamansys-selenium-java
Selenium test automation for lamansys.

Para ejecutar el archivo Runner.java y ejecutar los casos de prueba marcados con los tags @ebay y @gmail, puedes seguir los siguientes pasos:

## Requerimientos

```

➔ Asegúrate de tener instalado Apache Maven en tu sistema. Si no lo tienes, puedes descargarlo desde el siguiente enlace: https://maven.apache.org/download.cgi
➔ Asegúrate de tener todas las dependencias necesarias instaladas en el proyecto. Puedes verificar las dependencias que se estan utilizando en el archivo pom.xml.
➔ Asegúrate de tener los archivos features y steps en su respectivo lugar en el proyecto. Los archivos features deben estar en la carpeta "features" y los archivos steps deben estar en la carpeta "steps".
➔ Asegúrate de que el archivo Runner.java esté en la carpeta "runner".
➔ En el archivo Runner.java, puedes especificar los tags de los casos de prueba que deseas ejecutar utilizando el atributo "tags" en la anotación @CucumberOptions. Por ejemplo, si quieres ejecutar solo los casos de prueba con el tag @ebay, debes escribir: tags = "@ebay". Si quieres ejecutar los casos de prueba con el tag @ebay y el tag @gmail, debes escribir: tags = "(@ebay or @gmail)".
➔Una vez que hayas especificado los tags que deseas utilizar, puedes ejecutar el Runner.java como cualquier otra clase Java. Puedes hacerlo desde tu IDE o desde la línea de comandos.
```
## Como ejecutar los tests
Si optaste por la linea de comandos:

    mvn test

## Stack
En cuanto a las dependencias del proyecto:

> Cucumber-java: versión 7.8.1. Esta dependencia permite utilizar la sintaxis de escritura de casos de prueba de Cucumber, que permite escribir casos de prueba en lenguaje natural y utilizar expresiones regulares para mapearlos con métodos Java. 

> Cucumber-testng: versión 7.8.1. Esta dependencia permite integrar Cucumber con el framework de ejecución de pruebas TestNG. 

> Selenium-java: versión 4.6.0. Esta dependencia es el core de Selenium, una herramienta que permite automatizar pruebas en navegadores web. 

> Selenium-support: versión 4.0.0. Esta dependencia proporciona clases de soporte adicionales para Selenium.

> TestNG: versión 7.1.0. Esta dependencia es un framework de ejecución de pruebas diseñado para ser utilizado con Java. Permite ejecutar pruebas unitarias y de integración, y proporciona una variedad de opciones de configuración y anotaciones para personalizar la ejecución de pruebas.

> Commons-lang3: versión 3.12.0. Esta dependencia es una biblioteca de clases utilitarias de Apache Commons, que proporciona una serie de métodos útiles para trabajar con cadenas, números, fechas y otros tipos de datos
