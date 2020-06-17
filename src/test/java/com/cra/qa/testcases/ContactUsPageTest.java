package com.cra.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cra.qa.pages.ContactUsPage;
import com.cra.qa.pages.HomePage;
import com.cra.qa.util.TestUtil;
import com.crm.qa.base.TestBase;

public class ContactUsPageTest extends TestBase{
		
		HomePage obj;
		ContactUsPage contactUs;
		
		public ContactUsPageTest() {
			super();
		}
		
		@BeforeMethod
		public void setup() {
			initialization();
			obj = new HomePage();
			contactUs = new ContactUsPage();
		}
		
		@Test(priority = 1)
		public void contactUsTitleTest() {
			obj.verifyContactUslink();
			String title = obj.validateHomePageTitle();
			Assert.assertEquals("Contact Us | Roicians", title);
		}
		
		@DataProvider
		public Object[][] getData() throws EncryptedDocumentException, InvalidFormatException, IOException {
			String sheetname = "contactus";
			Object data[][] = TestUtil.getTestData(sheetname);
			return data;
		}
		
		@Test(priority = 2, dataProvider = "getData")
		public void fillFormTest(String name, String email, String subject, String message) {
			obj.verifyContactUslink();
			contactUs.fillForm(name, email, subject, message);
		}
		
		//@AfterMethod
		//public void clearAll() {
		//	driver.close();
		//}
		
		
}
