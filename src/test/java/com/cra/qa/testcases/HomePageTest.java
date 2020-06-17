package com.cra.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cra.qa.pages.AboutUsPage;
import com.cra.qa.pages.ContactUsPage;
import com.cra.qa.pages.HomePage;
import com.crm.qa.base.TestBase;

public class HomePageTest extends TestBase{
		
	HomePage obj;
	ContactUsPage contactUs;
	AboutUsPage aboutUs;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		obj = new HomePage();
		contactUs = new ContactUsPage();
		aboutUs = new AboutUsPage();
	}
	
	@Test
	public void homepageTitleTest() {
		String title = obj.validateHomePageTitle();
		Assert.assertEquals("QA, SQL,Oracle Database and BA Training along with Web Development - Roicians", title);
	}
	
	@Test
	public void logoTest() {
		Assert.assertTrue(obj.validateLogo());
	}
	
	@Test
	public void verifyContactUsLink() {
		contactUs = obj.verifyContactUslink();
	}
	
	@Test
	public void verifyAboutUsLink() {
		aboutUs = obj.verifyAboutuslink();
	}
	
	@AfterMethod
	public void clearAll() {
		driver.close();
	}
}
