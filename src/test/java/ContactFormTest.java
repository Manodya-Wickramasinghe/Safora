import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactFormTest {

    public static void main(String[] args) {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open Safora Contact Page
        driver.get("https://safora.se/en/contact.html");

        // Maximize window
        driver.manage().window().maximize();

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // TEST CASE 1 - Fill Contact Form

        try {

            // Locate elements
            WebElement name = wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.xpath("//input[@placeholder='Your Name']")
                    )
            );

            WebElement email = driver.findElement(
                    By.xpath("//input[@placeholder='Email Address']")
            );

            WebElement phone = driver.findElement(
                    By.xpath("//input[@placeholder='Phone Number']")
            );

            WebElement message = driver.findElement(
                    By.xpath("//textarea[@placeholder='Your Message']")
            );

            // Fill form
            name.sendKeys("Manodya Wickramasinghe");
            Thread.sleep(1000);

            email.sendKeys("manodya@gmail.com");
            Thread.sleep(1000);

            phone.sendKeys("0712345678");
            Thread.sleep(1000);

            message.sendKeys("Hello, this is my automation testing submission.");
            Thread.sleep(1000);

            System.out.println("Form fields filled successfully.");

            // Click Send Message button after manual CAPTCHA
            System.out.println("Please complete the CAPTCHA manually...");

            // Wait 20 seconds for manual CAPTCHA completion
            Thread.sleep(20000);

            WebElement sendButton = driver.findElement(
                    By.xpath("//button[contains(text(),'Send Message')]")
            );

            sendButton.click();

            System.out.println("Form submitted.");

            // Click Send Message button
            WebElement sendButton2 = driver.findElement(
                    By.xpath("//button[contains(text(),'Send Message')]")
            );

            sendButton2.click();

            System.out.println("Send Message button clicked.");

            // Wait few seconds
            Thread.sleep(3000);

        } catch (Exception e) {

            System.out.println("Error in Test Case 1:");
            e.printStackTrace();
        }


        // TEST CASE 2 - Validation Test


        try {

            // Refresh page
            driver.navigate().refresh();

            Thread.sleep(2000);

            // Click Send Message without entering data
            WebElement sendButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[contains(text(),'Send Message')]")
                    )
            );

            sendButton.click();

            // Get validation message
            WebElement activeElement = driver.switchTo().activeElement();

            String validationMessage =
                    activeElement.getAttribute("validationMessage");

            System.out.println("Validation Message:");
            System.out.println(validationMessage);

        } catch (Exception e) {

            System.out.println("Error in Test Case 2:");
            e.printStackTrace();
        }

        // Close browser
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}