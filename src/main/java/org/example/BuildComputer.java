package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BuildComputer {
    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");

        //Open the Browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Type URL
        driver.get("https://demo.nopcommerce.com/");

        // Click on Title of Build your own computer
        driver.findElement(By.xpath("//h2/a[@href='/build-your-own-computer']")).click();

        // Click on Picture of Build your own computer
        driver.findElement(By.xpath("//img[@alt='Picture of Build your own computer']")).click();

    }
}
