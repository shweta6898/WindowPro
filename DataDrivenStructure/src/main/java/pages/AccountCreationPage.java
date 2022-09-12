package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class AccountCreationPage extends BaseClass{
	@FindBy(id="id_gender2")
	WebElement gender;
	
	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	WebElement firstName;
	
	@FindBy(id="customer_lastname")
	WebElement lastName;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="days")
	WebElement days;
	
	@FindBy(id="months")
	WebElement months;
	
	@FindBy(id="years")
	WebElement years;
	
	@FindBy(id="uniform-newsletter")
	WebElement checkboxNewletter;
	
	@FindBy(id="firstname")
	WebElement fname;
	
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement add1;
	
	@FindBy(id="address2")
	WebElement add2;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(id="postcode")
	WebElement pincode;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(id="phone")
	WebElement homephone;
	
	@FindBy(id="phone_mobile")
	WebElement mobile;
	
	@FindBy(id="alias")
	WebElement addEmail;
	
	@FindBy(css="#customer_firstname")
	WebElement register;
	
	public AccountCreationPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void selectGender()
	{
		ActionClass.clickElement(driver, gender);
	}
	public void enterFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	public void enterLastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	public void enterPassword(String pass)
	{
		//ActionClass.sendKeys(driver, password);
	}
	public void selectDays(String day)
	{
		ActionClass.selectByValue(days, day);
	}
	public void selectMonths(String month)
	{
		ActionClass.selectByVisibleText(months, month);
	}
	public void selectYears(Integer year)
	{
		ActionClass.selectByIndex(years,year);
	}
	public void clicknewLetter()
	{
		ActionClass.clickElement(driver, checkboxNewletter);
	}
	public void addFname(String addName)
	{
		//ActionClass.sendKeys(driver, fname);
	}
	public void addLname(String addLastname)
	{
		//ActionClass.sendKeys(driver, fname);
	}
	public void enterCompany(String cmp)
	{
		//ActionClass.sendKeys(driver, company);
	}
	public void enterAddress1(String addAdress1)
	{
		//ActionClass.sendKeys(driver, add1);
	}
	public void enterAddress2(String addAdress2)
	{
		//ActionClass.sendKeys(driver, add2);
	}
	public void enterState(String addState)
	{
		ActionClass.selectByVisibleText(state, addState);
	}
	public void enterPinCode(String addpincode)
	{
		ActionClass.clickElement(driver, pincode);
	}
	public void enterCountry(String coun)
	{
		//ActionClass.sendKeys(driver, country);
	}
	public void enterPhone(Integer phone)
	{
		//ActionClass.sendKeys(driver, homephone);
	}
	public void enterMobile(Integer moblieNo)
	{
		//ActionClass.sendKeys(driver, mobile);
	}
	public void enterEmailAgain(String addEmailText) {
		//ActionClass.sendKeys(driver, addEmail);
	}
	public void clickRegisterBtn()
	{
		ActionClass.clickElement(driver, register);
	}
	
}

