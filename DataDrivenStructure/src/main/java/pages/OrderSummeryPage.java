package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class OrderSummeryPage extends BaseClass{

	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
	WebElement ConformMyOrder;
	
	public OrderSummeryPage()
	{
		PageFactory.initElements(driver, this);
	}
	public OrderComformationPage clickOnMyOrderPageBtn()
	{
		ActionClass.clickElement(driver, ConformMyOrder);
		return new OrderComformationPage();
	}
}
