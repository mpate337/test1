package com.cra.qa.testcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cra.qa.pages.AboutUsPage;
import com.cra.qa.pages.CareersPage;
import com.cra.qa.pages.ConsultancyPage;
import com.cra.qa.pages.ContactUsPage;
import com.cra.qa.pages.CoursesPage;
import com.cra.qa.pages.EnquireNowPage;
import com.cra.qa.pages.EventsPage;
import com.cra.qa.pages.HomePage;
import com.cra.qa.pages.ServicesPage;
import com.cra.qa.pages.SoftwareTestingPage;
import com.cra.qa.pages.TrainingPage;
import com.cra.qa.pages.WebDevelopmentPage;
import com.crm.qa.base.TestBase;

public class HomePageTest extends TestBase{
		
	HomePage obj;
	ContactUsPage contactUs;
	AboutUsPage aboutUs;
	CareersPage careers;
	CoursesPage courses;
	EnquireNowPage enquireNow;
	ServicesPage services;
	TrainingPage training;
	EventsPage events;
	SoftwareTestingPage softwareTesting;
	WebDevelopmentPage webDevelopment;
	ConsultancyPage consultancy;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		obj = new HomePage();
		contactUs = new ContactUsPage();
		aboutUs = new AboutUsPage();
		careers = new CareersPage();
		courses = new CoursesPage();
		enquireNow = new EnquireNowPage();
		services = new ServicesPage();
		training = new TrainingPage();
		events = new EventsPage();
		softwareTesting = new SoftwareTestingPage();
		webDevelopment = new WebDevelopmentPage();
		consultancy = new ConsultancyPage();

	}
	
	@Test(priority = 1)
	public void homepageTitleTest() {
		String title = obj.validateHomePageTitle();
		Assert.assertEquals("Home - Roicians", title);
	}
	
	@Test(priority = 2)
	public void verifyHomePageLink() {
		obj = obj.varifyHomePageLink(); 
	}
	
	@Test(priority = 3)
	public void verifyContactUsLink() {
		contactUs = obj.verifyContactUslink();
	}
	
	@Test(priority = 4)
	public void verifyAboutUsLink() {
		aboutUs = obj.verifyAboutuslink();
	}
	
	@Test(priority = 5)
	public void verifyCoursesLink() {
		courses = obj.verifyCourseslink();
	}
	
	@Test(priority = 6)
	public void verifyServicesLink() {
		services = obj.verifyServiceslink();
	}
	
	@Test(priority = 7)
	public void verifyCareersLink() {
		careers = obj.verifyCareerslink();
	}
	
	@Test(priority = 8)
	public void verifyEnquireNowLink() {
		enquireNow = obj.verifyEnquireNowlink();
	}
	
	@Test(priority = 9)
	public void verifyServices2Link() {
		services = obj.verifyServices2link();
	}
	
	@Test(priority = 10)
	public void verifyTrainingLink() {
		training = obj.verifyTraininglink();
	}
	
	@Test(priority = 11)
	public void verifyCareer2Link() {
		careers = obj.verifyCareer2link();
	}
	
	@Test(priority = 12)
	public void verifyEventsLink() {
		events = obj.verifyEventslink();
	}
	
	@Test(priority = 13)
	public void verifyMoreAboutUsLink() {
		aboutUs = obj.verifyMoreAboutUslink();
	}
	
	@Test(priority = 14)
	public void verifyContactUs2Link() {
		contactUs = obj.verifyContactUs2link();
	}
	
	@Test(priority = 15)
	public void verifyWebDevelopmentLink() {
		webDevelopment = obj.verifyWebDevelopmentLink();
	}
	
	@Test(priority = 16)
	public void verifySoftwareTestingLink() {
		softwareTesting = obj.verifySoftwareTestingLink();
	}
	
	@Test(priority = 17)
	public void verifyConsultancyPageLink() {
		consultancy = obj.verifyConsultancyLink();
	}
	
	@Test(priority = 18)
	public void verifyTraining2Link() {
		training = obj.verifyTraining2Link();
	}
	
	@AfterMethod
	public void clearAll() {
		driver.close();
	}
}
