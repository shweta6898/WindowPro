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
		indexpage.SignInButton();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage.clickHomeBtn();
		homepage.searchText("t-shirts");
		searchResult=new SearchResultPage();
		boolean verify=searchResult.isSearchResultDisplay();
		Assert.assertTrue(verify);
		
	}

}
