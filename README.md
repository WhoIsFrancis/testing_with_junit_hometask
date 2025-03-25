# Calculator Library Testing Project

## Overview
This project provides comprehensive unit testing for the Calculator-1.0.jar library, demonstrating robust test coverage using TestNG and demonstrating best practices in Java software testing.

## Project Structure
```
project-root/
│
├── src/
│   ├── main/
│   │   └── resources/
│   │       └── calculator-1.0.jar
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── epam/
│                     ├── AdditionTest.java
│                     ├── SubtractionTest.java
│                     ├── MultiplicationTest.java
│                     ├── DivisionTest.java
│                     └── BaseCalculatorTest.java
│
├── pom.xml
└── README.md
```

## Prerequisites
- Java Development Kit (JDK) 11 or higher
- Maven 3.6 or higher
- IntelliJ IDEA or Eclipse IDE (recommended)

## Dependencies
- Calculator-1.0.jar library

## Test Coverage
The test suite includes comprehensive test cases for:
- Arithmetic Operations
  - Addition (Integer and Double)
  - Subtraction (Integer and Double)
  - Multiplication (Integer and Double)
  - Division (Integer and Double)
- Error Scenarios
- Parameterized Tests
- Parallel Test Execution

## Test Groups
The test suite is organized into following groups:
- `arithmetic`: All arithmetic operation tests
- `positive`: Tests with positive number scenarios
- `negative`: Tests with negative number scenarios
- `mixed`: Tests with mixed number scenarios
- `parameterized`: Data-driven tests
- `exception`: Tests for error handling

## Running Tests

### Using Maven
```bash
# Run all tests
mvn clean test

# Run specific test group
mvn test -DgrouptToRun=positive

# Run with specific TestNG XML configuration
mvn test -DsuiteXmlFile=testng.xml
```

## Configuration
Key configurations are defined in:
- `pom.xml`: Maven and dependency configurations

## Best Practices Demonstrated
- Separation of concerns
- Comprehensive test coverage
- Consistent test structure
- Meaningful test group organization

## Troubleshooting
- Ensure Java CLASSPATH includes Calculator-1.0.jar
- Verify Maven dependencies are correctly downloaded

## Contact
For any questions or issues, please contact me whoisfransys@gmail.com  
