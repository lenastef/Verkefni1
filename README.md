# Verkefni1 Reiknivel

A very simple implementation of a calculator for general use for integer numbers to be tested using JUnit4.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands
when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `Lokaverkefni`,
but in the usual separate Maven `src` directories:

- `src/main/java`:
    - `Reiknivel.java`: In this class it is showing how it is supposed calculate.
    - `ReiknivelController.java`: This class is showing what the application has.
    - `ReiknivelApplicatoin.java`: This class is showing how the application is supposed to look like.

- `src/test/java`:
    - `ReiknivelTest.java`: In this class it is testing the functionality of the application.

Maven:

- `mvn compile` compiles all implementation classes.
- `mvn exec:java` executes the main method of the implementation.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`
  , `Tests`, or `TestCase`).

