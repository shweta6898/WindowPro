package regressionTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import pages.SearchResultPage;
import utilityComponents.BaseClass;
import utilityComponents.Log;

public class SearchResultTest extends BaseClass{
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	SearchResultPage searchResult;
	
	@BeforeMethod
	public void setUp()
	{
		launchApp();
	}
	@Test
	public void verifySearchResult()
	{
		indexpage=new IndexPage();
		loginpage=new LoginPage();
		homepage=new HomePage();
		Log.info("Click on sign in button");
		indexpage.SignInButton();
		Log.info("Enter username & password");
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		Log.info("Click on Home Button");
		homepage.clickHomeBtn();
		Log.info("Search products");
		homepage.searchText("t-shirts");
		searchResult=new SearchResultPage();
		boolean verify=searchResult.isSearchResultDisplay();
		Assert.assertTrue(verify);
		
	}

}
