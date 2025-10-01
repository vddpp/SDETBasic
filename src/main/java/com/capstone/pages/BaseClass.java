package com.capstone.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public WebDriver driver;

//    public void setUp() {
//        // Set the path to your chromedriver
//        System.setProperty("webdriver.chrome.driver", "C:/Users/drivers/chromedriver.exe"); // Replace with your path
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
