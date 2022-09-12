package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(id="search_query_top")
	WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"searchbox\"]/button")
	WebElement searchBtn;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
	WebElement orderhistory;
	
	@FindBy(xpath="//span[text()=\"My credit slips\"]")
	WebElement creditslip;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/a")
	WebElement backHome;
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img")
	WebElement hoverOnDress;
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[2]")
	WebElement clickDress;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean searchbtnVisibility() {
		return ActionClass.isDisplayedElement(driver, searchbox);
	}
	
	public boolean orderhisVisibility() {
		return ActionClass.isDisplayedElement(driver,orderhistory);
	}
	public boolean addressVisibility() {
		return ActionClass.isDisplayedElement(driver,address);
	}
	public boolean backHomeVisibility() {
		return ActionClass.isDisplayedElement(driver,backHome);
	}
	public void clickHomeBtn() {
		ActionClass.clickElement(driver, backHome);
	}
	
	public void hoverDress() {
		ActionClass.hoverElement(driver, hoverOnDress);
	}
	public OrderPage directAddToCart() {
		ActionClass.clickElement(driver, clickDress);
		return new OrderPage();
	}
	
	public SearchResultPage searchText(String text1)
	{
		searchbox.sendKeys(text1);
		ActionClass.clickElement(driver, searchBtn);
		return new SearchResultPage();
	}
	
	
	
	public String getUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}
}
