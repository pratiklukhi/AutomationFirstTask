package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");

        // Open the browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Type the URL
        driver.get("https://demo.nopcommerce.com/");

        // Click on Registration button
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();

        // Type First Name
        driver.findElement(By.id("FirstName")).sendKeys("Pratik");

        //Type Last Name
        driver.findElement(By.id("LastName")).sendKeys("Patel");

        // Type Email Address
        driver.findElement(By.id("Email")).sendKeys("pratikpatel12@gmail.com");

        // Type Password
        driver.findElement(By.id("Password")).sendKeys("12345678");

        // Type Confirm Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");

        // Click on Register button
        driver.findElement(By.xpath("//button[@name='register-button']")).click();

        // Result show message
        String message = driver.findElement(By.xpath("//div[@class='result']")).getText();

        System.out.println(message);
    }
}
