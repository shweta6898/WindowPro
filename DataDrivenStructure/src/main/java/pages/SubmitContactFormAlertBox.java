package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class SubmitContactFormAlertBox extends BaseClass{
	@FindBy(xpath="//*[@id=\"center_column\"]/p")
	WebElement alertmsg;
	
	public SubmitContactFormAlertBox() {
		PageFactory.initElements(driver, this);
	}
	
	public void alertMsg()
	{
		ActionClass.isDisplayedElement(driver, alertmsg);
	}

}
