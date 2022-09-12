package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class AboutUsPage extends BaseClass{
	@FindBy(xpath="//*[@id=\"center_column\"]/div/h1")
	WebElement aboutus;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div/div[1]/div/h3")
	WebElement ourcom;
	
	@FindBy(css="#center_column > div > div > div:nth-child(2) > div > h3")
	WebElement ourteam;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div/div[3]/div/h3")
	WebElement testimonialtitle;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div/div[2]/div/img")
	WebElement imagedisplay;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div/div[3]/div/div/div")
	WebElement testmsg;
	
	public AboutUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean aboutUsTitle() {
		String actualtitle=aboutus.getText();
		String expectedtile="ABOUT US";
		Assert.assertEquals(actualtitle, expectedtile);
		return true;
	}
	public boolean ourCompany() {
		String actual=ourcom.getText();
		String expected="OUR COMPANY";
		Assert.assertEquals(actual, expected);
		return true;
	}
	public boolean ourTeam() {
		String actual=ourteam.getText();
		String expected="OUR TEAM";
		Assert.assertEquals(actual, expected);
		return true;
	}
	public boolean testmonialTitle() {
		String actual=testimonialtitle.getText();
		String expected="TESTIMONIALS";
		Assert.assertEquals(actual, expected);
		return true;
	}
	
	public void displayImage() {
		ActionClass.isDisplayedElement(driver, imagedisplay);
	}
	public void dislpayTestmonialMsg() {
		ActionClass.isDisplayedElement(driver, testmsg);
	}

}
