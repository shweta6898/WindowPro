package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.ActionClass;
import utilityComponents.BaseClass;

public class ContactUsPage extends BaseClass{
	@FindBy(id="id_contact")
	WebElement subject;
	
	@FindBy(xpath="//input[@name=\"from\"]")
	WebElement email;
	
	@FindBy(id="id_order")
	WebElement order;
	
	@FindBy(id="fileUpload")
	WebElement fileUpload;
	
	@FindBy(id="message")
	WebElement msgbox;
	
	@FindBy(id="submitMessage")
	WebElement submitmsg;
	
	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SubmitContactFormAlertBox formDetails(String mail,String msg) {
		ActionClass.selectByIndex(subject, 1);
		email.sendKeys(mail);
		fileUpload.sendKeys("C:\\Users\\Shweta Chauhan\\Pictures\\nj.jpg");
		msgbox.sendKeys(msg);
		ActionClass.clickElement(driver, submitmsg);
		return new SubmitContactFormAlertBox();
	}
	
}
