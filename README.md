# Automated UI Testing Framework

## Overview

This project is an automated UI testing framework for the Magento e-commerce website using Selenium WebDriver, Cucumber (BDD), and JUnit. It includes test scenarios for user authentication, account creation, and navigation validation.

## Tech Stack

*   Java (Programming Language)
*   Selenium WebDriver (UI Automation)
*   Cucumber (BDD Framework)
*   JUnit (Test Runner)

## Key Features

*   **Cucumber BDD:** Write test scenarios in a human-readable format.
*   **Page Object Model (POM):** Ensures maintainability and reusability.
*   **Configurable Test Data:** Uses property files for easy updates.
*   **Explicit Wait Handling:** Prevents flaky tests due to dynamic elements.


## Test Scenarios

| Feature          | Scenario                                     |
| ---------------- | -------------------------------------------- |
| Login            | User can log in with valid credentials       |
| Account Creation | User can create a new account                |


## Troubleshooting

*   Ensure the `chromedriver.exe` path is correctly set in `BrowserDriver.java`
*   Use `WebDriverWait` for dynamically loading elements.

