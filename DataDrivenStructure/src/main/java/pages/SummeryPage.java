package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class SummeryPage extends BaseClass{
	@FindBy(xpath="//a[text()=\"Printed Dress\"]")
	WebElement productDescription;
	
	@FindBy(xpath="//span[@id=\"product_price_3_13_0\"]")
	WebElement unitPriceFinal;
	
	@FindBy(id="total_product_price_3_13_0")
	WebElement total;
	
	@FindBy(id="total_price_container")
	WebElement totalFinalPrice;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement checkoutBtn;
	
	public SummeryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean productDescriptionDisplay()
	{
		return ActionClass.isDisplayedElement(driver, productDescription);
	}
	public boolean unitPriceFinalDisplay()
	{
		return ActionClass.isDisplayedElement(driver, unitPriceFinal);
	}
	public boolean totalDisplay()
	{
		return ActionClass.isDisplayedElement(driver, total);
	}
	public boolean totalFinalPriceDisplay()
	{
		return ActionClass.isDisplayedElement(driver, totalFinalPrice);
	}
	public LoginPage clickOncheckoutButton()
	{
		ActionClass.clickElement(driver, checkoutBtn);
		return new LoginPage();
	}
	public AddressPage proceedToCheckoutBtn() {
		ActionClass.clickElement(driver, checkoutBtn);
		return new AddressPage();
	}
}
