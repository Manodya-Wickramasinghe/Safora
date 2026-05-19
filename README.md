# 🧪 Selenium Contact Form Automation

This project contains an automated test script using **Selenium WebDriver (Java)** to test the contact form functionality on the Safora website.

---

## 📌 Project Overview

The automation script performs the following:

* Opens the Safora contact page
* Fills in the contact form fields
* Clicks the **Send Message** button
* Handles basic validation scenarios

---

## 🚀 Getting Started

Follow the steps below to set up and run the project on your local machine.

---

## 🔧 Prerequisites

Make sure the following are installed:

* ✅ Java JDK
* ✅ Apache Maven
* ✅ Google Chrome Browser
* ✅ ChromeDriver (matching your Chrome version)
* ✅ IntelliJ IDEA or Eclipse

---

## 📥 Clone the Repository

```bash
git clone <your-github-repo-link>
```

---

## 📂 Open the Project

* Open **IntelliJ IDEA** or **Eclipse**
* Select **Open Project**
* Navigate to the cloned folder and open it

---

## 📦 Install Dependencies

Update your `pom.xml` with the Selenium dependency:

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.44.0</version>
    <scope>compile</scope>
</dependency>
```

Then run:

```bash
mvn clean install
```

---

## 🌐 ChromeDriver Setup

1. Download ChromeDriver from: https://chromedriver.chromium.org/downloads
2. Make sure the version matches your Chrome browser
3. Add it to your system PATH or configure in code if needed

---

## ▶️ Run the Test

### Option 1: Using IDE

* Locate file:
  `ContactFormTest.java`
* Right-click → **Run**

### Option 2: Using Terminal

```bash
mvn exec:java
```

---

## 🧪 Test Scenarios Covered

* ✅ Form submission with valid data
* ✅ Validation check for empty fields
* ⚠️ CAPTCHA handling (manual intervention required)

---

## ⚠️ Notes

* CAPTCHA cannot be automated easily; manual input may be required
* Avoid using `Thread.sleep()` in real-world projects — use explicit waits instead

---

## 📁 Project Structure

```
Safora/
│── src/
│   ├── main/java/
│   │   └── ContactFormTest.java
│── pom.xml
│── README.md
```

---

## 👨‍💻 Author

**Manodya Wickramasinghe**

---

## ⭐ Future Improvements

* Implement **Page Object Model (POM)**
* Add **TestNG framework**
* Integrate **reporting (Extent Reports)**
* Add **CI/CD with GitHub Actions**

---

## 📜 License

This project is for educational and testing purposes.
