package com.capstone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityPage{
	@FindBy(xpath="//span[text()='Community']")
    WebElement communityLink;

    @FindBy(xpath="//span[text()='Photo Directory']")
    WebElement photoDirectoryLink;

    @FindBy(name = "s")
    WebElement searchBox;
    
    WebDriver driver;

    public CommunityPage(WebDriver driver) {
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickCommunityAndPhotoDirectory() {
        communityLink.click();
        photoDirectoryLink.click();
    }



}
