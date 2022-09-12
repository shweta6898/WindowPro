package regressionTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.IndexPage;
import pages.LoginPage;
import utilityComponents.BaseClass;

public class IndexPageTest extends BaseClass{
	IndexPage index;
	
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	@Test
	public void verifyLogo()
	{
		index=new IndexPage();
		boolean result=index.LogoVisibility();	
		Assert.assertTrue(result);
	}
	@Test
	public void verifyTitle() {
		String actualTile=index.getTitle();
		Assert.assertEquals(actualTile, "My Store");
	}
	@Test
	public void verifyonSale() {
		index=new IndexPage();
		index.clickOnSale();
	}
	
	@Test
	public void verifySliderNxtClick() throws InterruptedException {
		index=new IndexPage();
		index.clickNextSlider();
	}
	
	
	
	
	@AfterClass
	public void closesite()
	{
		driver.quit();
	}
}
