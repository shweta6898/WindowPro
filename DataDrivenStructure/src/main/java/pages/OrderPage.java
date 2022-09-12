package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class OrderPage extends BaseClass{
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/h2")
	WebElement addToCartMsg;
	
	@FindBy(id="layer_cart_product_price")
	WebElement totalPrice;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[1]/span")
	WebElement actualTotal;
	
	@FindBy(xpath="//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a/span/text()")
	WebElement proceedCheckoutBtn;
	
	public OrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean isAddToCartMsgDisplay() throws IOException
	{
		ActionClass.implicitWait(driver, 30);
		ActionClass.takeScrenshot(driver, null);
		return ActionClass.isDisplayedElement(driver, addToCartMsg);
	}
	public void CorrectTotalPrice()
	{
		String value1=totalPrice.getText();
		String value2=actualTotal.getText();
		Assert.assertEquals(value1, value2);
	}
	
	public SummeryPage clickOnCheckoutBtn()
	{
		ActionClass.clickElement(driver, proceedCheckoutBtn);
		return new SummeryPage();
	}

}
