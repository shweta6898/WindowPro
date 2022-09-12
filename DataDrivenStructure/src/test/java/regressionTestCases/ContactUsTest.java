package regressionTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.IndexPage;
import utilityComponents.BaseClass;

public class ContactUsTest extends BaseClass{

	IndexPage indexpage;
	ContactUsPage contact;
	
	@BeforeMethod
	public void set() {
		launchApp();
	}
	@Test
	public void verifyCon() {
		indexpage=new IndexPage();
		indexpage.ContactBtn();
		contact=new ContactUsPage();
		contact.formDetails("shweta123@gmail.com", "hello shweta sunil chavhan");
	}
	@AfterMethod
	public void closepage() {
		driver.close();
	}
}
