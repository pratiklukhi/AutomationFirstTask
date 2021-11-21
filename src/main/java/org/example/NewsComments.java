package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NewsComments {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");

        //Open Browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Type URL
        driver.get("https://demo.nopcommerce.com/");

        // Click on News Details
        driver.findElement(By.xpath("//div[@class='news-items']/div[2]/div[3]/a")).click();

        // Click in the Title Text bar
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Product Review");

        // Click in the Comment Text bar
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("This is an amazing product. I like this most.");

        // Click on NEW COMMENT
        driver.findElement(By.xpath("//button[@name='add-comment']")).click();

        // Result show message
        String message = driver.findElement(By.xpath("//div[@class='result']")).getText();

        System.out.println(message);

    }
}