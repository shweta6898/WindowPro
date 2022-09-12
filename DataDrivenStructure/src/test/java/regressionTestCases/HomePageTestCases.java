
package regressionTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actionDriver.ActionClass;
import data.SearchData;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import utilityComponents.BaseClass;

public class HomePageTestCases extends BaseClass{
	
	IndexPage index;
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	/*
	@Test
	public void verifyLogin() {
		index=new IndexPage();
		loginpage=new LoginPage();
		loginpage=index.SignInButton();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
	}
	
	
	
	@Test
	public void verifysearchbtnVisibility()
	{
		index=new IndexPage();
		loginpage=new LoginPage();
		loginpage=index.SignInButton();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage=new HomePage();
		boolean verify=homepage.searchbtnVisibility();
		Assert.assertTrue(verify);
	}
	
	
	@Test
	public void verifyorderhisVisibility()
	{
		index=new IndexPage();
		loginpage=new LoginPage();
		loginpage=index.SignInButton();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage=new HomePage();
		boolean verify=homepage.orderhisVisibility();
		Assert.assertTrue(verify);
		
	}
	
	
	
	@Test
	public void verifyaddressVisibility()
	{
		index=new IndexPage();
		loginpage=new LoginPage();
		loginpage=index.SignInButton();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage=new HomePage();
		boolean verify=homepage.addressVisibility();
		Assert.assertTrue(verify);
	}
	@Test
	public void verifybackHomeVisibility()
	{
		index=new IndexPage();
		loginpage=new LoginPage();
		loginpage=index.SignInButton();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage=new HomePage();
		boolean verify=homepage.backHomeVisibility();
		Assert.assertTrue(verify);
	}
	*/	
	
	
	
	@Test(dataProvider="searchtext",dataProviderClass=SearchData.class)
	public void verifySearchText(String textdata)
	{
		index=new IndexPage();
		loginpage=new LoginPage();
		loginpage=index.SignInButton();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage=new HomePage();
		homepage.searchText(textdata);
	}
	
	/*
	@Test
	public void verifyAddtocart() {
		index=new IndexPage();
		loginpage=new LoginPage();
		loginpage=index.SignInButton();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage=new HomePage();
		homepage.directAddToCart();
		
	}
	*/
	
	@AfterMethod
	public void quit()
	{
		driver.close();
	}

}
