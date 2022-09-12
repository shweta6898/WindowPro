package regressionTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.IndexPage;
import pages.SubmitContactFormAlertBox;
import utilityComponents.BaseClass;

public class SubmitContactFormAlertBoxTest extends BaseClass{
	IndexPage indexpage;
	SubmitContactFormAlertBox box;
	ContactUsPage contact;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@Test
	public void verifyalertMsg() {
		indexpage=new IndexPage();
		indexpage.ContactBtn();
		contact=new ContactUsPage();
		box=new SubmitContactFormAlertBox();
		contact.formDetails("shweta123@gmail.com","hello bye hiiiiiiiiiiiiiiiiii");
		box.alertMsg();
		Assert.assertTrue(true,"alertbox displayed sucessfully......");
	}
	@AfterMethod
	public void closep() {
		driver.close();
	}
}
