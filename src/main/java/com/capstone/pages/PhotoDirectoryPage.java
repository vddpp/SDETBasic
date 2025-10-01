package com.capstone.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhotoDirectoryPage {
	
    @FindBy(xpath = "//input[@placeholder=\"Search photos\"]")
    WebElement searchBox;
    
    @FindBy(xpath ="//h1[text()='Search results for: “WordPress Logo”']")
    WebElement searchResultImage;

    
    WebDriver driver;

    public PhotoDirectoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	public void searchPhoto(String keyword) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(searchBox));
		 searchBox.sendKeys(keyword);
	        searchBox.sendKeys(Keys.ENTER);
	}

	public boolean isImageDisplayed() {
	        return searchResultImage.isDisplayed();
	}

}
