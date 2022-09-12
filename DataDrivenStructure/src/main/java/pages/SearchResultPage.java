
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class SearchResultPage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	WebElement searchresult;
	
	@FindBy(css="#center_column > ul > li > div > div.left-block > div > a.product_img_link > img")
	WebElement clickOnBtn;
	
	public SearchResultPage(){
		PageFactory.initElements(driver, this);
	}
	public boolean isSearchResultDisplay()
	{
		return ActionClass.isDisplayedElement(driver, searchresult);
	}
	public AddToCartPage clickOnProduct()
	{
		ActionClass.clickElement(driver, searchresult);
		return new AddToCartPage();
	}
	public void clickHoverBtn() {
		ActionClass.hoverElement(driver, searchresult);
	}
	public void clickBtn() {
		ActionClass.clickElement(driver, clickOnBtn);
	}

}
