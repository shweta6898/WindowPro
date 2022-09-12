package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class ShippingPage extends BaseClass{
	@FindBy(id="cgv")
	WebElement termCondtions;
	
	@FindBy(xpath="//button[@name=\"processCarrier\"]")
	WebElement clickonCheckoutBtn;
	
	@FindBy(xpath="//p[@class=\"fancybox-error\"]")
	WebElement alertBox;
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	public PaymentPage clickOnTermsconditons(){
		ActionClass.clickElement(driver, clickonCheckoutBtn);
		return new PaymentPage();
	}
	//without click on checkbox
	public void alertDismiss()
	{
		ActionClass.clickElement(driver, alertBox);
	}
}
