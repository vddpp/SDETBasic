package com.capstone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage{
    @FindBy(xpath = "//h1[contains(text(),'Get WordPress')]")
    WebElement getWordPressText;

    WebDriver driver;
    
    public DownloadPage(WebDriver driver) {
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	public String getHeaderText() {
        return getWordPressText.getText();
    }

}
