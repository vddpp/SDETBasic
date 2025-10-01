package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
    private static WebDriver driver;

    @Before
    public void setUp() {
    	System.out.println("Hook running");
    	System.setProperty("webdriver.chrome.driver", "C:/Users/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
