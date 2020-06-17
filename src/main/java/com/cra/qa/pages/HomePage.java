package com.cra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	//Page Factory
	@FindBy(xpath = "//*[@id=\"masthead\"]/div/div/div/div[1]/a/img")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"menu-item-185\"]/a")
	WebElement aboutUs;
	
	@FindBy(xpath="//*[@id=\"menu-item-4173\"]/a")
	WebElement contactUs;
	
	//Initializing page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public AboutUsPage verifyAboutuslink() {
		aboutUs.click();
		return new AboutUsPage();
	}
	
	public ContactUsPage verifyContactUslink() {
		contactUs.click();
		return new ContactUsPage();
	}
	
}
