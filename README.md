# 🧪 Cucumber Login Automation Framework

A Behaviour-Driven Development (BDD) test automation framework built with **Java**, **Cucumber**, **JUnit 4**, and **Maven**.  
This project demonstrates automated testing of **login**, **logout**, and **invalid login** scenarios using readable **Gherkin** syntax.

---

## 🚀 Project Overview

This framework showcases:

✔ Writing test scenarios in **Gherkin**  
✔ Implementing step definitions in **Java**  
✔ Running tests with **JUnit 4 + Maven**  
✔ Handling **positive and negative test cases**  
✔ Generating **Cucumber HTML reports**  
✔ Version control using **Git & GitHub**

---

## 🧰 Tech Stack

| Category | Tool / Version |
|----------|----------------|
| Language | Java 21 |
| BDD Framework | Cucumber 7.15.0 |
| Test Runner | JUnit 4.13.2 |
| Build Tool | Maven 3.x |
| IDE | Eclipse |
| OS | Windows 11 |

---

## 📂 Project Structure

```
CucumberLoginDemo
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── runners
│   │   │   │   └── TestRunner.java
│   │   │   └── stepDefinitions
│   │   │       ├── LoginSteps.java
│   │   │       ├── LogoutSteps.java
│   │   │       └── InvalidLoginSteps.java
│   │   └── resources
│   │       └── features
│   │           ├── login.feature
│   │           ├── logout.feature
│   │           └── invalid_login.feature
├── pom.xml
└── target/ (ignored in Git)
```

---

## ▶️ How to Run the Tests

From the project root:

```bash
mvn clean test
```

---

## 📊 Test Coverage

### ✅ Positive Scenarios
- Successful login
- Successful logout

### ❌ Negative Scenarios
- Login with invalid username
- Login with invalid password
- Login with blank credentials

---

## 📄 Reports

After execution, open:

```
target/cucumber-reports/cucumber-report.html
```

---

## 🔧 What This Framework Demonstrates

- BDD implementation using Cucumber
- Step definition mapping in Java
- Separation of features and steps
- Test execution via Maven
- Handling Git workflow and repository management

---

## 📈 Future Improvements

- Integrate Selenium WebDriver
- Implement Page Object Model (POM)
- Add GitHub Actions CI pipeline
- Tag tests (smoke / regression)
- Headless test execution

---

## 👨‍💻 Author

Christopher Williams  
Senior QA Analyst | Automation & API Testing  
