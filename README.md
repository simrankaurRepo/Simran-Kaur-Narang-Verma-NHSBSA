
# 🧪 NHS JOB SEARCH - Selenium BDD Framework

This project is an automated testing framework for the **NHS Job Search** website. It uses **Java**, **Selenium WebDriver**, **Cucumber (BDD)**, **TestNG**, and **ExtentReports** to automate and report on UI test scenarios like job searching.

---

## 📚 Table of Contents

- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [How to Run Tests](#how-to-run-tests)
- [How to Add Features](#how-to-add-features)
- [Reports](#reports)
- [Contributing](#contributing)
- [License](#license)

---

## 📖 Overview

This project allows QA engineers to write user-centric tests using Gherkin syntax for the NHS job search platform. The framework enables automated UI testing, integrates with ExtentReports for detailed reports, and supports tag-based execution.

---

## ⚙️ Tech Stack

- Java 21
- Selenium WebDriver
- Cucumber JVM (BDD)
- TestNG
- Maven
- ExtentReports
- ChromeDriver / GeckoDriver

---

## 🗂 Project Structure

```
nhs-job-search/
├── pom.xml
├── README.md
├── src/
│   ├── main/java/pages/             # Page Object Models
│   └── test/java/
│       ├── stepdefinitions/         # Cucumber Step Definitions
│       ├── runners/                 # TestNG Cucumber Test Runners
│       └── resources/features/      # .feature files
└── reports/                         # ExtentReports output
```

---

## 💻 Prerequisites

- Java JDK 21
- Maven 3.x
- Chrome or Firefox browser installed
- IntelliJ IDEA / Eclipse IDE

---

## ⚙️ Setup Instructions

```bash
# Clone the repository
git clone https://github.com/simrankaurRepo/Simran-Kaur-Narang-Verma-NHSBSA.git
cd nhs-Assignment

# Build the project
mvn clean install
```

---

## ▶️ How to Run Tests

### Run All Scenarios
### Browser(Firefox/Chrome) can be set in src\test\resources\Global.properties
```bash
mvn test
```

### Run by Tag (e.g., Search)
```bash
### Add tags in feature file first and then in TestNGRunner.java file
mvn test -Dcucumber.filter.tags="@search"
```

### Run from IDE
You can also right-click `TestRunner.java` and choose **Run** in IntelliJ or Eclipse.

---

## 🧾 How to Add Features

1. **Create a new feature file** in `src/test/java/features/`:

```gherkin
Feature: NHS Job Search

  Scenario: Search for a job
    Given I am on the NHS jobs homepage
    When I enter "nurse" in the search box
    And I click the search button
    Then I should see relevant job listings
```

2. **Add Step Definitions** in `stepdefinitions/`.

3. **Add/Update Page Objects** in `pages/`.

---

## 📊 Reports

### ExtentReports
Reports are generated automatically under the `test-output/` directory after each test run.

```bash
open test-output/SparkReport/Spark.html
```

You can customize ExtentReports setup in the utility/reporting class.

---

## 🤝 Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Make changes and commit (`git commit -m "Add new feature"`)
4. Push and create a Pull Request

---

## 📄 License

