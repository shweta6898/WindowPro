package regressionTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountCreationPage;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import utilityComponents.BaseClass;

public class AccountCreationTest extends BaseClass{
	AccountCreationPage accCreate;
	IndexPage indexpage;
	HomePage homepage;
	LoginPage loginpage;
	
	@BeforeMethod
	public void setUp()
	{
		launchApp();
		
	}
	
	@Test
	public void verifyAccCreateBtnText()
	{
		indexpage=new IndexPage();
		loginpage=new LoginPage();
		loginpage=indexpage.SignInButton();
		accCreate=new AccountCreationPage();
		loginpage.NewAcc("sunil@gmail.com");
		//accCreate.enterFirstName("shweta");
		accCreate.enterLastName("chavhan");
	}


}
