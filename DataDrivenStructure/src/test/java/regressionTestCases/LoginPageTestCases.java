package regressionTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.Logindata;
import pages.AccountCreationPage;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import utilityComponents.BaseClass;

public class LoginPageTestCases extends BaseClass{

	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	AccountCreationPage createaccount;
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	@Test(dataProvider="data",dataProviderClass=Logindata.class)
	public void verifyLogin(String username,String password)
	{
		indexpage=new IndexPage();
		loginpage=new LoginPage();
		loginpage=indexpage.SignInButton();
		homepage=loginpage.LoginPage(username,password);
		
		String expectedUrl="http://automationpractice.com/index.php?controller=my-account";
		String actualUrl=homepage.getUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	/*
	@Test
	public void createNewLogin() {

		indexpage=new IndexPage();
		loginpage=new LoginPage();
		loginpage=indexpage.SignInButton();
		loginpage.NewAcc("sunilc@gmail.com");
	}
	*/
	@AfterMethod
	public void closeTest()
	{
		driver.quit();
	}
	
	
}
