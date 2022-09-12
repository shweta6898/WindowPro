package regressionTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import pages.OrderPage;
import pages.SearchResultPage;
import utilityComponents.BaseClass;

public class AddToCartTest extends BaseClass{
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	SearchResultPage searchResult;
	AddToCartPage addtocart;
	OrderPage orderpage;
	
	@BeforeMethod
	public void set() {
		launchApp();
	}
	@Test
	public void verifyAddCartBtn() {
		indexpage=new IndexPage();
		loginpage=new LoginPage();
		homepage=new HomePage();
		indexpage.SignInButton();
		searchResult=new SearchResultPage();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage.clickHomeBtn();
		searchResult=homepage.searchText("top");
		searchResult=new SearchResultPage();
		searchResult.clickBtn();
		addtocart=new AddToCartPage();
		addtocart.clickOnAddToCartBtn();
	}

}
