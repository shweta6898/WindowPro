package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class AddressPage extends BaseClass{

	@FindBy(xpath="//textarea[@class=\"form-control\"]")
	WebElement commentText;
	@FindBy(xpath="//button[@name=\"processAddress\"]")
	WebElement addressCheckoutBtn;
	@FindBy(id="address_delivery")
	WebElement addressDelivery;
	@FindBy(id="address_invoice")
	WebElement billingAddress;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	public void commentTextBox()
	{
		commentText.sendKeys("I ordered first time");
	}
	
	public ShippingPage clickOnProccedCheckOutBtn()
	{
		ActionClass.clickElement(driver, addressCheckoutBtn);
		return new ShippingPage();
	}
}
