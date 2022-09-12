package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class IndexPage extends BaseClass{
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement SignIn;
	
	@FindBy(xpath="//img[@class=\"img-responsive\"]")
	WebElement Logo;
	
	@FindBy(id="search_query_top")
	WebElement SearchBox;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement SearchButton;
	
	@FindBy(linkText="Contact us")
	WebElement contact;
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[7]/a")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"homepage-slider\"]/div/div[2]/div/a[2]")
	WebElement slider;
	
	@FindBy(xpath="//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img")
	WebElement clickonsale;
	
	public IndexPage(){
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage SignInButton() {
		ActionClass.clickElement(driver,SignIn);
		return  new LoginPage();
	}
	
	public ContactUsPage ContactBtn() {
		ActionClass.clickElement(driver, contact);
		return new ContactUsPage();
	}
	
	public boolean LogoVisibility()
	{
		 return ActionClass.isDisplayedElement(driver, Logo);
	}
	
	public String getTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	public AboutUsPage addresspage() {
		ActionClass.clickElement(driver, address);
		return new AboutUsPage();
	}
	
	public void clickOnSale() {
		ActionClass.clickElement(driver, clickonsale);
	}
	public void clickNextSlider() throws InterruptedException  {
		ActionClass.sliderChange(driver, slider);
		Thread.sleep(4000);
	}

	
}
