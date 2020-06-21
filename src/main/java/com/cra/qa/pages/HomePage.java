package com.cra.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	//Page Factory
	@FindBy(xpath = "/html/body/div/header/div[2]/div[1]/div/nav/ul/li[1]/a")
	WebElement homePageLink;
	
	@FindBy(xpath="/html/body/div/header/div[2]/div[1]/div/nav/ul/li[2]/a")
	WebElement aboutUsLink;
	
	@FindBy(xpath="/html/body/div/header/div[2]/div[1]/div/nav/ul/li[3]/a")
	WebElement coursesLink;
	
	@FindBy(xpath="/html/body/div/header/div[2]/div[1]/div/nav/ul/li[4]/a")
	WebElement servicesLink;
	
	@FindBy(xpath="/html/body/div/header/div[2]/div[1]/div/nav/ul/li[5]/a")
	WebElement careersLink;
	
	@FindBy(xpath="/html/body/div/header/div[2]/div[1]/div/nav/ul/li[6]/a")
	WebElement contactUsLink;
	
	@FindBy(xpath="/html/body/div/header/div[2]/div[1]/div/nav/ul/li[7]/a")
	WebElement enquireNowLink;
	
	
	@FindBy(xpath="/html/body/div/div[2]/section[2]/div/div/div[1]/a/div")
	WebElement services2;
	
	@FindBy(xpath="/html/body/div/div[2]/section[2]/div/div/div[2]/a/div")
	WebElement trainingLink;
	
	@FindBy(xpath="/html/body/div/div[2]/section[2]/div/div/div[3]/a/div")
	WebElement career2;
	
	@FindBy(xpath="/html/body/div/div[2]/section[2]/div/div/div[4]/a/div")
	WebElement eventsLink;
	
	@FindBy(xpath="/html/body/div/div[2]/section[3]/div/div/div/div/div/a[1]")
	WebElement moreAboutUsLink;
	
	@FindBy(xpath="/html/body/div/div[2]/section[3]/div/div/div/div/div/a[2]")
	WebElement contactUs2;
	
	@FindBy(xpath="/html/body/div/div[2]/section[4]/div/div/div[2]/div/div[2]/div/div/div")
	WebElement webDevelopment;
	
	@FindBy(xpath="/html/body/div/div[2]/section[4]/div/div/div[2]/div/div[2]/div/div/div/div/a")
	WebElement webDevelopmentLink;
	
	@FindBy(xpath="/html/body/div/div[2]/section[4]/div/div/div[3]/div/div[2]/div/div/div")
	WebElement softwareTesting;
	
	@FindBy(xpath="/html/body/div/div[2]/section[4]/div/div/div[3]/div/div[2]/div/div/div/div/a")
	WebElement softwareTestingLink;
	
	@FindBy(xpath="/html/body/div/div[2]/section[4]/div/div/div[4]/div/div[2]/div/div/div")
	WebElement consultancyPage;
	
	@FindBy(xpath="/html/body/div/div[2]/section[4]/div/div/div[4]/div/div[2]/div/div/div/div/a")
	WebElement consultancyPageLink;
	
	@FindBy(xpath="/html/body/div/div[2]/section[4]/div/div/div[5]/div/div[2]/div/div/div")
	WebElement training2;
	
	@FindBy(xpath="/html/body/div/div[2]/section[4]/div/div/div[5]/div/div[2]/div/div/div/div/a")
	WebElement training2Link;
	
	//Initializing page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public HomePage varifyHomePageLink() {	
		Actions action = new Actions(driver);
		action.moveToElement(homePageLink).click().perform();
		return new HomePage();
	}
	
	public AboutUsPage verifyAboutuslink() {
		Actions action = new Actions(driver);
		action.moveToElement(aboutUsLink).click().perform();
		return new AboutUsPage();
	}
	
	public ContactUsPage verifyContactUslink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactUsLink).click().perform();
		return new ContactUsPage();
	}
	
	public CoursesPage verifyCourseslink() {
		Actions action = new Actions(driver);
		action.moveToElement(coursesLink).click().perform();
		return new CoursesPage();
	}
	
	public ServicesPage verifyServiceslink() {
		Actions action = new Actions(driver);
		action.moveToElement(servicesLink).click().perform();
		return new ServicesPage();
	}
	
	public CareersPage verifyCareerslink() {
		Actions action = new Actions(driver);
		action.moveToElement(careersLink).click().perform();
		return new CareersPage();
	}
	
	public EnquireNowPage verifyEnquireNowlink() {
		Actions action = new Actions(driver);
		action.moveToElement(enquireNowLink).click().perform();
		return new EnquireNowPage();
	}
	
	public ServicesPage verifyServices2link() {
		scrollDownSection2();
        
		Actions action = new Actions(driver);
		action.moveToElement(services2).click().perform();
		return new ServicesPage();
	}
	
	public TrainingPage verifyTraininglink() {
		scrollDownSection2();
		
		Actions action = new Actions(driver);
		action.moveToElement(trainingLink).click().perform();
		return new TrainingPage();
	}
	
	public CareersPage verifyCareer2link() {
		scrollDownSection2();
		
		Actions action = new Actions(driver);
		action.moveToElement(career2).click().perform();
		return new CareersPage();
	}
	
	public EventsPage verifyEventslink() {
		scrollDownSection2();
		
		Actions action = new Actions(driver);
		action.moveToElement(eventsLink).click().perform();
		return new EventsPage();
	}
	
	public AboutUsPage verifyMoreAboutUslink() {
		scrollDownSection3();
		
		Actions action = new Actions(driver);
		action.moveToElement(moreAboutUsLink).click().perform();
		return new AboutUsPage();
	}
	
	public ContactUsPage verifyContactUs2link() {
		scrollDownSection3();
		
		Actions action = new Actions(driver);
		action.moveToElement(contactUs2).click().perform();
		return new ContactUsPage();
	}
	
	public WebDevelopmentPage verifyWebDevelopmentLink(){
		scrollDownSection4();
		
		Actions action = new Actions(driver);
		action.moveToElement(webDevelopment);
      
		action.moveToElement(webDevelopmentLink).click().perform();
		return new WebDevelopmentPage();
	}
	
	public SoftwareTestingPage verifySoftwareTestingLink(){
		scrollDownSection4();
		
		Actions action = new Actions(driver);
		action.moveToElement(softwareTesting);
      
		action.moveToElement(softwareTestingLink).click().perform();
		return new SoftwareTestingPage();
	}
	
	public ConsultancyPage verifyConsultancyLink(){
		scrollDownSection4();
		
		Actions action = new Actions(driver);
		action.moveToElement(consultancyPage);
      
		action.moveToElement(consultancyPageLink).click().perform();
		return new ConsultancyPage();
	}
	
	public TrainingPage verifyTraining2Link(){
		scrollDownSection4();
		
		Actions action = new Actions(driver);
		action.moveToElement(training2);
      
		action.moveToElement(training2Link).click().perform();
		return new TrainingPage();
	}
	
}
