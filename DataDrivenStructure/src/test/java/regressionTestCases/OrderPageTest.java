package regressionTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import pages.OrderPage;
import pages.SearchResultPage;
import utilityComponents.BaseClass;

public class OrderPageTest extends BaseClass{
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	SearchResultPage searchResult;
	AddToCartPage addtocart;
	OrderPage orderpage;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	@Test
	public void verifyisAddToCartMsgDisplay() throws IOException {
		indexpage=new IndexPage();
		loginpage=new LoginPage();
		homepage=new HomePage();
		indexpage.SignInButton();
		searchResult=new SearchResultPage();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage.clickHomeBtn();
		searchResult=homepage.searchText("top");
		searchResult.clickBtn();
		addtocart=new AddToCartPage();
		addtocart.clickOnAddToCartBtn();
		orderpage=new OrderPage();
		orderpage.isAddToCartMsgDisplay();
	}

}

