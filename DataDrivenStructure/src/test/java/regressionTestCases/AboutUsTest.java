package regressionTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AboutUsPage;
import pages.IndexPage;
import utilityComponents.BaseClass;
import utilityComponents.Log;

public class AboutUsTest extends BaseClass{
	IndexPage index;
	AboutUsPage about;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	@Test
	public void verifyAboutusTitle()
	{
		index=new IndexPage();
		about=new AboutUsPage();
		Log.info("click on project");
		index.addresspage();
		about.aboutUsTitle();
	}
	/*
	@Test
	public void verifyOurCompanyTitle() {
		index=new IndexPage();
		about=new AboutUsPage();
		index.addresspage();
		about.ourCompany();
	}
	@Test
	public void verifyOurTeamTitle() {
		index=new IndexPage();
		about=new AboutUsPage();
		index.addresspage();
		about.ourTeam();
	}
	
	@Test
	public void verifyOurTestTitle() {
		index=new IndexPage();
		about=new AboutUsPage();
		index.addresspage();
		about.testmonialTitle();
	}
	
	@Test
	public void verifyimgDisplay() {
		index=new IndexPage();
		about=new AboutUsPage();
		index.addresspage();
		about.displayImage();
	}
	@Test
	public void verifyTextMsgDisplay() {
		index=new IndexPage();
		about=new AboutUsPage();
		index.addresspage();
		about.dislpayTestmonialMsg();
	}*/
	
	@AfterMethod
	public void closepage() {
		driver.close();
	}

}
