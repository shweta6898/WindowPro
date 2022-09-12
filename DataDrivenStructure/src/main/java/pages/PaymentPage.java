package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class PaymentPage extends  BaseClass{
	@FindBy(xpath="//a[@title=\"Pay by bank wire\"]")
	WebElement payByBank;
	
	@FindBy(xpath="//a[@class=\"cheque\"]")
	WebElement payByCheck;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	public OrderSummeryPage clickOnPayByBank() {
		ActionClass.clickElement(driver, payByBank);
		return new OrderSummeryPage();
	}
	public OrderSummeryPage clickOnPayByCheck() {
		ActionClass.clickElement(driver,payByCheck );
		return new OrderSummeryPage();
	}
	
}
