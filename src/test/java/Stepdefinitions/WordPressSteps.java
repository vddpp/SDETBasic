package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.capstone.pages.BaseClass;
import com.capstone.pages.CommunityPage;
import com.capstone.pages.DownloadPage;
import com.capstone.pages.HomePage;
import com.capstone.pages.PhotoDirectoryPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WordPressSteps extends BaseClass{
	
	WebDriver driver = Hooks.getDriver(); // Assuming you use Hooks for setup
	HomePage homePage = new HomePage(driver);
    DownloadPage downloadPage = new DownloadPage(driver);
	CommunityPage communityPage = new CommunityPage(driver);
    PhotoDirectoryPage photoDirectoryPage = new PhotoDirectoryPage(driver);

    @Given("User launches the WordPress homepage")
    public void userLaunchesWordPressHomepage() {
        driver.get("https://wordpress.org/");
        
    }

    @Then("Verify the title of the page is {string}")
    public void verifyPageTitle(String expectedTitle) {
        Assert.assertEquals(homePage.getPageTitle(), expectedTitle);
    }

    @When("User hovers and clicks 'Get WordPress'")
    public void hoverAndClickOnGetWordPressButton() {
        homePage.hoverAndClickGetWordPress();
    }

    @Then("Verify the text is {string}")
    public void verifyTheText(String expectedText) {
        Assert.assertEquals(downloadPage.getHeaderText(), expectedText);
    }


    @When("User clicks on 'Community' and then 'Photo Directory'")
    public void userClicksCommunityAndPhotoDirectory() {
        communityPage.ClickCommunityAndPhotoDirectory();
    }

    @When("User searches for an image {string}")
    public void userSearchesForImage(String imageName) {
        photoDirectoryPage.searchPhoto(imageName);
    }

    @Then("Verify the image is displayed")
    public void verifyImageDisplayed() {
        Assert.assertTrue(photoDirectoryPage.isImageDisplayed());
    }

}
