package com.capstone.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage{

    @FindBy(xpath = "//div[contains(@class, 'global-header__desktop-get-wordpress-container')]//a")
    WebElement getWordPressLink;
    
    @FindBy(tagName = "title")
    WebElement pageTitle;
    
    @FindBy(xpath ="//h1[text()='Get WordPress']")
    WebElement wordPressText;

    WebDriver driver;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    
    public void hoverAndClickGetWordPress() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(getWordPressLink));
    	Actions actions = new Actions(driver);
    	actions.moveToElement(getWordPressLink).perform();
    	getWordPressLink.click();
    	
    }
    
    public String getPageTitle() {
        return driver.getTitle();
    }
    
    public String getWordPressText() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(wordPressText));
        return wordPressText.getText();
    }

}
