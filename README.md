# lamansys-selenium-java
# Spanish version

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

___
# English version

Selenium test automation for lamansys.

To run the Runner.java file and execute the test cases marked with the @ebay and @gmail tags, you can follow the steps below:

## Requirements

```

➔ Make sure you have Apache Maven installed on your system. If you don't have it, you can download it from the following link: https://maven.apache.org/download.cgi
➔ Make sure you have all the necessary dependencies installed in the project. You can check the dependencies being used in the pom.xml file.
➔ Make sure you have the features and steps files in their respective places in the project. The features files should be in the "features" folder and the steps files should be in the "steps" folder.
➔ Make sure that the Runner.java file is in the "runner" folder.
➔ In the Runner.java file, you can specify the tags of the test cases you want to run by using the "tags" attribute in the @CucumberOptions annotation. For example, if you want to run only the test cases with the tag @ebay, you should write: tags = "@ebay". If you want to run the test cases with the @ebay tag and the @gmail tag, you should write: tags = "(@ebay or @gmail)".
➔Once you have specified the tags you want to use, you can run the Runner.java like any other Java class. You can do this from your IDE or from the command line.
```
## How to run the tests
If you opted for the command line:

    mvn test

## Stack
As for the project dependencies:

> Cucumber-java: version 7.8.1. This dependency allows you to use the Cucumber test case writing syntax, which allows you to write test cases in natural language and use regular expressions to map them to Java methods.

> Cucumber-testng: version 7.8.1. This dependency allows integrating Cucumber with the TestNG test execution framework.

> Selenium-java: version 4.6.0. This dependency is the core of Selenium, a tool that allows automating tests in web browsers.

> Selenium-support: version 4.0.0. This dependency provides additional support classes for Selenium.

> TestNG: version 7.1.0. This dependency is a test execution framework designed to be used with Java. It allows running unit and integration tests, and provides a variety of configuration options and annotations to customize test execution.

> Commons-lang3: version 3.12.0. This dependency is a library of Apache Commons utility classes, which provides a number of useful methods for working with strings, numbers, dates and other data types.

