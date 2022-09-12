package regressionTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.AddressPage;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import pages.OrderPage;
import pages.OrderSummeryPage;
import pages.PaymentPage;
import pages.SearchResultPage;
import pages.ShippingPage;
import pages.SummeryPage;
import utilityComponents.BaseClass;

public class OrderSummeryPageTest extends BaseClass{

	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	SearchResultPage searchResult;
	AddToCartPage addtocart;
	OrderPage orderpage;
	SummeryPage summerypage;
	AddressPage addresspage;
	ShippingPage shippingpage;
	PaymentPage paymentpage;
	OrderSummeryPage ordersummerypage;
	
	@BeforeMethod
	public void openUrl() {
		launchApp();
	}
	
	@Test
	public void verifyclickOnMyOrderPageBtn() {
		indexpage=new IndexPage();
		indexpage.SignInButton();
		loginpage=new LoginPage();
		homepage=loginpage.LoginPage("shweta123@gmail.com", "123456");
		homepage=new HomePage();
		homepage.clickHomeBtn();
		searchResult=homepage.searchText("top");
		searchResult=new SearchResultPage();
		searchResult.clickBtn();
		addtocart=new AddToCartPage();
		addtocart.clickOnAddToCartBtn();
		orderpage=new OrderPage();
		orderpage.clickOnCheckoutBtn();
		summerypage=new SummeryPage();
		summerypage.proceedToCheckoutBtn();
		addresspage=new AddressPage();
		addresspage.clickOnProccedCheckOutBtn();
		shippingpage=new ShippingPage();
		shippingpage.clickOnTermsconditons();
		paymentpage=new PaymentPage();
		paymentpage.clickOnPayByCheck();
		ordersummerypage=new OrderSummeryPage();
		ordersummerypage.clickOnMyOrderPageBtn();
	}
	
	@AfterMethod
	public void closed() {
		driver.close();
	}
}
