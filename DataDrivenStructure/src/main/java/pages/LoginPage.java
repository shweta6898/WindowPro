package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="passwd")
	WebElement Password;
	
	@FindBy(id="SubmitLogin")
	WebElement LogIn;
	
	@FindBy(id="email_create")
	WebElement emailWrite;
	
	@FindBy(id="SubmitCreate")
	WebElement CreateNewAcc;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage LoginPage(String email,String pass)
	{
		Email.sendKeys(email);
		Password.sendKeys(pass);
		ActionClass.clickElement(driver, LogIn);
		return new HomePage();
	}
	public AddressPage login1(String email,String pass)//when we will checkout without sign in then it will go to address page
	{
		Email.sendKeys(email);
		Password.sendKeys(pass);
		ActionClass.clickElement(driver,LogIn);
		return new AddressPage();
	}
	public AccountCreationPage NewAcc(String email) {
		emailWrite.sendKeys(email);
		ActionClass.clickElement(driver, CreateNewAcc);
		return new AccountCreationPage();
	}

}
