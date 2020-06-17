package com.cra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactUsPage extends TestBase{
	
		//Page Factory
		@FindBy(name = "your-name")
		WebElement yourname;
		
		@FindBy(name="your-email")
		WebElement youremail;
		
		@FindBy(name="your-subject")
		WebElement yoursubject;
		
		@FindBy(name="your-message")
		WebElement yourmessage;
		
		@FindBy(xpath="/html/body/div[4]/div[3]/div/div/div/main/div/div/div[3]/div/div[1]/div/div/div/div/form/p[5]/input")
		WebElement sendbtn;
		
		//Initializing page object
		public ContactUsPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public void fillForm(String name, String email, String subject, String msg) {
			yourname.sendKeys(name);
			youremail.sendKeys(email);
			yoursubject.sendKeys(subject);
			yourmessage.sendKeys(msg);
		}
}
