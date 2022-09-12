package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class AddToCartPage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]")
	WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]")
	WebElement clickAddToCart;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	public void addQuantity() {
		ActionClass.clickElement(driver, quantity);
	}
	public OrderPage clickOnAddToCartBtn() {
		ActionClass.JClick(driver, clickAddToCart);
		return new OrderPage();
	}

}
