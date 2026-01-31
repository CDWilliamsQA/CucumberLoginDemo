# 🧪 Cucumber Login Demo
A basic BDD automation framework built with **Java**, **Cucumber**, **JUnit 4**, and **Maven**.  
This project demonstrates how to automate a simple login feature using readable **Gherkin** syntax.

---

## 📋 Overview
This project shows how to:
- Write test scenarios in **Gherkin** (`.feature` files)
- Implement step definitions in **Java**
- Run the tests using **JUnit 4** and **Maven**
- Generate standard **Cucumber HTML reports**

---

## 🛠 Tech Stack
| Category | Tool / Version |
|-----------|----------------|
| Language | Java 21 |
| Test Framework | Cucumber 7.15.0 |
| Test Runner | JUnit 4.13.2 |
| Build Tool | Maven 3.x |
| IDE | Eclipse IDE |
| OS | Windows 11 |

---

CucumberLoginDemo
├── src
│ ├── main/java
│ └── test/java
│ ├── runners/
│ │ └── TestRunner.java
│ └── stepDefinitions/
│ └── LoginSteps.java
│
├── src/test/resources/features/
│ └── login.feature
│
├── pom.xml
└── target/cucumber-reports/


---

## ▶️ How to Run Tests
Run the following command from the project root:
```bash
mvn clean test

When complete, open the report:
target/cucumber-reports/cucumber-report.html

🧾 Example Scenario
Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    And clicks the login button
    Then the user should be redirected to the homepage

📚 Next Steps

Add additional features and step definitions

Integrate Selenium WebDriver for browser automation

Add GitHub Actions for automated test execution


4. Scroll down → keep **“Commit directly to the main branch”** selected  
5. Click **Commit changes**

---

## ⚙️ Project Structure
